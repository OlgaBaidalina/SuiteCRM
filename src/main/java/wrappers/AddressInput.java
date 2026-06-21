package wrappers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddressInput {
    WebDriver driver;
    String addressLabel;
    String Label;

    public AddressInput(WebDriver driver, String addressLabel, String fieldLabel)
    {
        this.driver = driver;
        this.addressLabel = addressLabel;
        this.Label = fieldLabel;
    }
    public void write(String text) {

        driver.findElement(By.xpath(String.format("//*[contains(text(), '%s')]/ancestor::div" +
                        "[contains(@class,'edit-view-field')]//*[contains(text(),'%s')]//ancestor::tr//input",
                addressLabel, Label))).sendKeys(text);
    }
}