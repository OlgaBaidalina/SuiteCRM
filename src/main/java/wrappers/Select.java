package wrappers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Select {
    WebDriver driver;
    String label;

    public Select(WebDriver driver, String label) {
        this.driver = driver;
        this.label = label;
    }
    public void select(String option) {
        String SELECT_PATTERN = "//*[contains(text(), '%s')]/following-sibling::div//";

        driver.findElement(By.xpath(String.format(SELECT_PATTERN + "select", label))).click();
        driver.findElement(By.xpath(String.format(SELECT_PATTERN + "option[contains(text(), '%s')]", label, option)))
                .click();
    }
}