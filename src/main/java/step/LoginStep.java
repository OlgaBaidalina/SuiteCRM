package step;

import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.WebDriver;
import pages.LoginPage;

@Log4j2
public class LoginStep {

    WebDriver driver;
    LoginPage loginPage;
    public LoginStep(WebDriver driver) {
        this.driver = driver;
        this.loginPage = new LoginPage(driver);
    }

    public void auth(String user, String password) {
        log.info("login as '{}'", user);
        loginPage.openPage();
        loginPage.login(user, password);
    }
}