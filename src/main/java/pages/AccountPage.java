package pages;

import dto.Account;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import wrappers.*;

@Log4j2
public class AccountPage extends BasePage {

    private final By NAME_FIELD = By.id("name");

    public AccountPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public AccountPage isPageOpened() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(NAME_FIELD));
        return this;
    }

    @Override
    public AccountPage openPage() {
        driver.get("https://demo.suiteondemand.com/index.php?module=Accounts&action=EditView&return_module=Accounts" +
                "&return_action=DetailView");
        isPageOpened();
        return this;
    }

    public AccountPage addAccount (Account account) {
        log.info("Adding new account with name: '{}'", account.getName());
        new Input(driver, "Name").write(account.getName());
        new Input(driver, "Office Phone").write(account.getPhone());
        new Input(driver, "Website").write(account.getWebsite());
        new Input(driver, "Fax").write(account.getFax());
        new Checkbox(driver, "Opted Out").check();
        new Checkbox(driver, "Invalid").check();
        new AddressTextarea(driver, "Billing Address", "Street").write(account.getBillingStreet());
        new AddressInput(driver, "Billing Address", "City").write(account.getBillingCity());
        new AddressInput(driver, "Billing Address", "State/Region").write(account.getBillingState());
        new AddressInput(driver, "Billing Address", "Postal Code").write(account.getBillingPostalCode());
        new AddressInput(driver, "Billing Address", "Country").write(account.getBillingCountry());
        new AddressTextarea(driver, "Shipping Address", "Street").write(account.getShippingStreet());
        new AddressInput(driver, "Shipping Address", "City").write(account.getShippingCity());
        new AddressInput(driver, "Shipping Address", "State/Region").write(account.getShippingState());
        new AddressInput(driver, "Shipping Address", "Postal Code").write(account.getShippingPostalCode());
        new AddressInput(driver, "Shipping Address", "Country").write(account.getShippingCountry());
        new Textarea(driver, "Description").write(account.getDescription());
        new Select(driver, "Type").select(account.getType());
        new Input(driver, "Annual Revenue").write(account.getAnnualRevenue());
        new Select(driver, "Industry").select(account.getIndustry());
        new Input(driver, "Employees").write(account.getEmployees());
        return this;
    }

    public AccountPage clickSave() {
        driver.findElement(By.xpath("//textarea[@id='description']/following::input[@id='SAVE']")).click();
        return this;
    }
}