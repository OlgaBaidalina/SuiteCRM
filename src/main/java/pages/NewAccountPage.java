package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import wrappers.*;

public class NewAccountPage {
    WebDriver driver;

    public NewAccountPage(WebDriver driver) {
        this.driver = driver;
    }

    public void addNewAccount(String name, String phone, String website, String fax,
                              String billingStreet, String billingCity, String billingState, String billingPostalCode,
                              String billingCountry, String shippingStreet, String shippingCity,
                              String shippingState, String shippingPostalCode,
                              String shippingCountry, String description, String type, String annualRevenue,
                              String employees, String industry)  {

        new Input(driver, "Name").write(name);
        new Input(driver, "Office Phone").write(phone);
        new Input(driver, "Website").write(website);
        new Input(driver, "Fax").write(fax);
        new Checkbox(driver, "Opted Out").check();
        new Checkbox(driver, "Invalid").check();
        new AddressTextarea(driver, "Billing Address", "Street").write(billingStreet);
        new AddressInput(driver, "Billing Address", "City").write(billingCity);
        new AddressInput(driver, "Billing Address", "State/Region").write(billingState);
        new AddressInput(driver, "Billing Address", "Postal Code").write(billingPostalCode);
        new AddressInput(driver, "Billing Address", "Country").write(billingCountry);
        new AddressTextarea(driver, "Shipping Address", "Street").write(shippingStreet);
        new AddressInput(driver, "Shipping Address", "City").write(shippingCity);
        new AddressInput(driver, "Shipping Address", "State/Region").write(shippingState);
        new AddressInput(driver, "Shipping Address", "Postal Code").write(shippingPostalCode);
        new AddressInput(driver, "Shipping Address", "Country").write(shippingCountry);
        new Textarea(driver, "Description").write(description);
        new Select(driver, "Type").select(type);
        new Input(driver, "Annual Revenue").write(annualRevenue);
        new Select(driver, "Industry").select(industry);
        new Input(driver, "Employees").write(employees);
    }

    public void clickSave() {
        driver.findElement(By.xpath("//textarea[@id='description']/following::input[@id='SAVE']")).click();
    }
}