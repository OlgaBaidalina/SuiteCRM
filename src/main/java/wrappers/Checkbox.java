package wrappers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Checkbox {

    WebDriver driver;
    String label;

    public Checkbox(WebDriver driver, String label) {
        this.driver = driver;
        this.label = label;
    }

    private WebElement getCheckbox() {
        return driver.findElement(By.xpath(String.format("//div[contains(@class,'email-address-line-container')]" +
                        "[last()]//label[.='%s']/following::input[@type='checkbox'][1]", label)));
    }

    public void check() {
        WebElement checkbox = getCheckbox();
        if (checkbox.isSelected()) {
                checkbox.click();
        }
    }

    public void uncheck() {
        WebElement checkbox = getCheckbox();
        if (checkbox.isSelected()) {
                checkbox.click();
        }
    }
    public boolean isChecked() {
        return getCheckbox().isSelected();
    }
}