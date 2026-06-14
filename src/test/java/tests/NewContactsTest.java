package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.time.Duration;

public class NewContactsTest extends BaseTest {
    @Test
    public void checkAddNewContact() throws InterruptedException {
        driver.get("https://demo.suiteondemand.com/index.php?module=Users&action=Login");
        driver.findElement(By.id("user_name")).sendKeys("will");
        driver.findElement(By.id("username_password")).sendKeys("will");
        driver.findElement(By.name("Login")).click();
        Thread.sleep(3000);

        driver.get("https://demo.suiteondemand.com/index.php?module=Contacts&action=EditView&return_module=" +
                "Contacts&return_action=DetailView");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        Thread.sleep(2000);

        newContactsPage.addNewContact("Mr", "Iliya", "Beltyukov", "+79995554433", "+79998887766", "Ingeneer",
                "Quality Control Department", "+79998887766", "Kurganova, 55", "Kurgan", "Kurgan region",
                "640001", "Russia", "Tverskaya, 77", "Moscow", "Moscow region", "101000", "Russia",
                "If you have any questions, please call the specified phone number.", "Conference");
        Thread.sleep(3000);
        newContactsPage.clickSave();
        Thread.sleep(3000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("h2.module-title-text")));
        Thread.sleep(2000);
        Assert.assertTrue(driver.findElement(By.cssSelector("h2.module-title-text")).getText().contains("ILIYA BELTYUKOV"),
                "Ошибка: имя контакта не совпадает");
        Thread.sleep(3000);
        driver.quit();
    }
}