package tests;

import dto.Contacts;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;

import java.time.Duration;

public class ContactsTest extends BaseTest {

    @Test
    public void checkAddContact() {
        Contacts contacts = new Contacts("Mr.", "Marik", "Beltyukov", "+79995554433", "+79998887766", "Ingeneer",
                "Quality Control Department", "+79998887766", "Kurganova, 55", "Kurgan", "Kurgan region",
                "640001", "Russia", "Tverskaya, 77", "Moscow", "Moscow region", "101000", "Russia",
                "If you have any questions, please call the specified phone number.", "Conference");
        new LoginPage(driver)
                .openPage()
                        .login("will", "will")
                                .openContactsPage()
                                        .addContacts(contacts)
                                                .clickSave();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("h2.module-title-text")));

        String actualTitle = driver.findElement(By.cssSelector("h2.module-title-text")).getText();
        Assert.assertTrue(actualTitle.contains("MARIK BELTYUKOV"), "Ошибка: имя контакта не совпадает");

        driver.quit();
    }
}