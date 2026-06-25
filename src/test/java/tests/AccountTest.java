package tests;

import com.github.javafaker.Faker;
import dto.Account;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.Locale;

public class AccountTest extends BaseTest {

    Faker faker = new Faker(new Locale("en"));

    Account account = Account.builder()
            .name("Mark")
            .phone(faker.phoneNumber().phoneNumber())
            .website(faker.internet().url())
            .fax(faker.phoneNumber().phoneNumber())
            .billingStreet(faker.address().streetAddress())
            .billingCity(faker.address().city())
            .billingState(faker.address().state())
            .billingPostalCode(faker.address().zipCode())
            .billingCountry(faker.address().country())
            .shippingStreet(faker.address().streetAddress())
            .shippingCity(faker.address().city())
            .shippingState(faker.address().state())
            .shippingPostalCode(faker.address().zipCode())
            .shippingCountry(faker.address().country())
            .description(faker.lorem().sentence())
            .type("Investor")
            .annualRevenue(faker.number().digits(6))
            .industry("Energy")
            .employees(faker.number().digits(2))
            .build();

    @Test
    public void checkAddAccount() {
        loginStep.auth("will","will");
        accountStep.createAccount(account);

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("h2.module-title-text")));

        String actualTitle = driver.findElement(By.cssSelector("h2.module-title-text")).getText();
        Assert.assertTrue(actualTitle.contains("MARK"), "Ошибка: имя аккаунта не совпадает");

        driver.quit();
    }
}