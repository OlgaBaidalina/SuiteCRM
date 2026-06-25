package wrappers;

import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

@Log4j2
public class AddressInput {
    WebDriver driver;
    String addressLabel;
    String fieldLabel;

    public AddressInput(WebDriver driver, String addressLabel, String fieldLabel)
    {
        this.driver = driver;
        this.addressLabel = addressLabel;
        this.fieldLabel = fieldLabel;
    }
    public void write(String text) {
        log.info("write '{}' into '{}' in '{}'", text, fieldLabel, addressLabel);
        driver.findElement(By.xpath(String.format("//*[contains(text(), '%s')]/ancestor::div" +
                        "[contains(@class,'edit-view-field')]//*[contains(text(),'%s')]//ancestor::tr//input",
                addressLabel, fieldLabel))).sendKeys(text);
    }
}