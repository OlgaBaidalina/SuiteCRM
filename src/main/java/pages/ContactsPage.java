package pages;

import dto.Contacts;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import wrappers.*;

public class ContactsPage extends BasePage {

    private final By FIRST_NAME_FIELD = By.id("first_name");

    public ContactsPage(WebDriver driver) {
        super (driver);
    }

    @Override
    public  ContactsPage isPageOpened() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(FIRST_NAME_FIELD));
        return this;
    }

    @Override
    public ContactsPage openPage() {
        driver.get("https://demo.suiteondemand.com/index.php?module=Contacts&action=EditView&return_module=Contacts&return_action=DetailView");
        isPageOpened();
        return this;
    }

    public ContactsPage addContacts (Contacts contacts) {
        new Select(driver, "First Name").select(contacts.getSalutation());
        new Input(driver, "First Name").write(contacts.getFirstName());
        new Input(driver, "Last Name").write(contacts.getLastName());
        new Input(driver, "Office Phone").write(contacts.getOfficePhone());
        new Input(driver, "Mobile").write(contacts.getMobilePhone());
        new Input(driver, "Job Title").write(contacts.getJobTitle());
        new Input(driver, "Department").write(contacts.getDepartment());
        new Input(driver, "Fax").write(contacts.getFax());
        new Checkbox(driver, "Opted Out").check();
        new Checkbox(driver, "Invalid").check();
        new AddressTextarea(driver, "Primary Address", "Address").write(contacts.getPrimaryStreet());
        new AddressInput(driver, "Primary Address", "City").write(contacts.getPrimaryCity());
        new AddressInput(driver, "Primary Address", "State/Region").write(contacts.getPrimaryState());
        new AddressInput(driver, "Primary Address", "Postal Code").write(contacts.getPrimaryPostalCode());
        new AddressInput(driver, "Primary Address", "Country").write(contacts.getPrimaryCountry());
        new AddressTextarea(driver, "Other Address", "Other Address").write(contacts.getOtherStreet());
        new AddressInput(driver, "Other Address", "City").write(contacts.getOtherCity());
        new AddressInput(driver, "Other Address", "State/Region").write(contacts.getOtherState());
        new AddressInput(driver, "Other Address", "Postal Code").write(contacts.getOtherPostalCode());
        new AddressInput(driver, "Other Address", "Country").write(contacts.getOtherCountry());
        new Textarea(driver, "Description").write(contacts.getDescription());
        new Select(driver, "Lead Source").select(contacts.getLeadSource());
        return this;
    }

    public ContactsPage clickSave() {
        driver.findElement(By.xpath("//textarea[@id='description']/following::input[@id='SAVE']")).click();
        return this;
    }
}