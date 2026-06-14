package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import wrappers.*;

public class NewContactsPage {
    WebDriver driver;

    public NewContactsPage(WebDriver driver) {
        this.driver = driver;
    }

    public void addNewContact(String firstName1, String firstName, String lastName, String officePhone, String mobilePhone,
                              String jobTitle, String department, String fax,
                              String primaryStreet, String primaryCity, String primaryState,
                              String primaryPostalCode, String primaryCountry,
                              String otherStreet, String otherCity, String otherState,
                              String otherPostalCode, String otherCountry,
                              String description, String leadSource) {

        new Select(driver, "First Name").select(firstName1);
        new Input(driver, "First Name").write(firstName);
        new Input(driver, "Last Name").write(lastName);
        new Input(driver, "Office Phone").write(officePhone);
        new Input(driver, "Mobile").write(mobilePhone);
        new Input(driver, "Job Title").write(jobTitle);
        new Input(driver, "Department").write(department);
        new Input(driver, "Fax").write(fax);
        new Checkbox(driver, "Opted Out").check();
        new Checkbox(driver, "Invalid").check();
        new AddressTextarea(driver, "Primary Address", "Address").write(primaryStreet);
        new AddressInput(driver, "Primary Address", "City").write(primaryCity);
        new AddressInput(driver, "Primary Address", "State/Region").write(primaryState);
        new AddressInput(driver, "Primary Address", "Postal Code").write(primaryPostalCode);
        new AddressInput(driver, "Primary Address", "Country").write(primaryCountry);
        new AddressTextarea(driver, "Other Address", "Other Address").write(otherStreet);
        new AddressInput(driver, "Other Address", "City").write(otherCity);
        new AddressInput(driver, "Other Address", "State/Region").write(otherState);
        new AddressInput(driver, "Other Address", "Postal Code").write(otherPostalCode);
        new AddressInput(driver, "Other Address", "Country").write(otherCountry);
        new Textarea(driver, "Description").write(description);
        new Select(driver, "Lead Source").select(leadSource);
    }

    public void clickSave() {
        driver.findElement(By.xpath("//textarea[@id='description']/following::input[@id='SAVE']")).click();
    }
}