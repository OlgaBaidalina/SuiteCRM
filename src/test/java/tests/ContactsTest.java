package tests;

import com.github.javafaker.Faker;
import dto.Contacts;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.Locale;

public class ContactsTest extends BaseTest {

    Faker faker = new Faker(new Locale("en"));

    Contacts contacts = Contacts.builder()
            .salutation("Mr.")
            .firstName("Mark")
            .lastName("Beltyukov")
            .officePhone(faker.phoneNumber().phoneNumber())
            .mobilePhone(faker.phoneNumber().phoneNumber())
            .jobTitle(faker.job().title())
            .department(faker.company().name())
            .fax(faker.phoneNumber().phoneNumber())
            .primaryStreet(faker.address().streetAddress())
            .primaryCity(faker.address().city())
            .primaryState(faker.address().state())
            .primaryPostalCode(faker.address().zipCode())
            .primaryCountry(faker.address().country())
            .otherStreet(faker.address().streetAddress())
            .otherCity(faker.address().city())
            .otherState(faker.address().state())
            .otherPostalCode(faker.address().zipCode())
            .otherCountry(faker.address().country())
            .description(faker.lorem().sentence())
            .leadSource("Conference")
            .build();

    @Test
    public void checkAddContact() {
        loginStep.auth("will", "will");
        contactsStep.createContacts(contacts);

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("h2.module-title-text")));

        String actualTitle = driver.findElement(By.cssSelector("h2.module-title-text")).getText();
        Assert.assertTrue(actualTitle.contains("MARK BELTYUKOV"), "Ошибка: имя контакта не совпадает");

        driver.quit();
    }
}