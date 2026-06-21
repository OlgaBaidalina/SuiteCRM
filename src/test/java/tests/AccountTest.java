package tests;

import dto.Account;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;

import java.time.Duration;

public class AccountTest extends BaseTest {

    @Test
    public void checkAddAccount() {
        Account account = new Account("Marik", "+79998887766", "mark.ru", "+79998887766","Kurganova, 55",
                "Kurgan", "Kurgan region", "640001", "Russia", "Tverskaya, 77", "Moscow", "Moscow region",
                "101000", "Russia", "If you have any questions, please call the specified phone number.",
                "Investor", "1000000", "Energy", "Vladislav");
        new LoginPage(driver)
                .openPage()
                        .login("will", "will")
                                .openAccountPage()
                                        .addAccount(account)
                                                .clickSave();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("h2.module-title-text")));

        String actualTitle = driver.findElement(By.cssSelector("h2.module-title-text")).getText();
        Assert.assertTrue(actualTitle.contains("MARIK"), "Ошибка: имя аккаунта не совпадает");

        driver.quit();
    }
}