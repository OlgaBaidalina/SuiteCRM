package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.time.Duration;
import static java.lang.Thread.sleep;

public class NewAccountTest extends BaseTest {
    @Test
    public void checkAddNewAccount() throws InterruptedException {
        driver.get("https://demo.suiteondemand.com/index.php?module=Users&action=Login");
        driver.findElement(By.id("user_name")).sendKeys("will");
        driver.findElement(By.id("username_password")).sendKeys("will");
        driver.findElement(By.name("Login")).click();
        Thread.sleep(3000);
        driver.get("https://demo.suiteondemand.com/index.php?module=Accounts&action=EditView&return_module=" +
                "Accounts&return_action=DetailView");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        sleep(2000);
        newAccountPage.addNewAccount("Iliya", "+79998887766", "mark.ru", "+79998887766","Kurganova, 55", "Kurgan",
                "Kurgan region", "640001", "Russia", "Tverskaya, 77", "Moscow", "Moscow region", "101000", "Russia",
                "If you have any questions, please call the specified phone number.","Investor", "1000000", "Vladislav",
                "Energy");

        Thread.sleep(2000);
        newAccountPage.clickSave();
        Thread.sleep(2000);

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("h2.module-title-text")));
        sleep(2000);

        Assert.assertTrue(driver.findElement(By.cssSelector("h2.module-title-text")).getText().contains("ILIYA"),
                "Ошибка: имя контакта не совпадает");

        driver.quit();
    }
}