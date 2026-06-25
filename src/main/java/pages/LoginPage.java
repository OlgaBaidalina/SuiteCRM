package pages;

import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

@Log4j2
public class LoginPage extends BasePage {

    private final By USERNAME_FIELD = By.id("user_name");
    private final By PASSWORD_FIELD = By.id("username_password");
    private final By LOGIN_BUTTON = By.name("Login");

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public LoginPage isPageOpened() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(LOGIN_BUTTON));
        return this;
    }

    @Override
    public LoginPage openPage() {
        driver.get("https://demo.suiteondemand.com/index.php?module=Users&action=Login");
        isPageOpened();
        return this;
    }
    public LoginPage login(String user, String password) {
        log.info("Logging in as '{}'", user);
        wait.until(ExpectedConditions.visibilityOfElementLocated(USERNAME_FIELD));
        driver.findElement(USERNAME_FIELD).sendKeys(user);
        wait.until(ExpectedConditions.visibilityOfElementLocated(PASSWORD_FIELD));
        driver.findElement(PASSWORD_FIELD).sendKeys(password);
        driver.findElement(LOGIN_BUTTON).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("logout_link")));
        log.info("Login successful, current URL: {}", driver.getCurrentUrl());
        return  this;
    }
}