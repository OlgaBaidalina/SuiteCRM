package step;

import dto.Contacts;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.WebDriver;
import pages.ContactsPage;

@Log4j2
public class ContactsStep {

    WebDriver driver;
    ContactsPage contactsPage;

    public ContactsStep(WebDriver driver) {
        this.driver = driver;
        contactsPage = new ContactsPage(driver);
    }

    public  void createContacts(Contacts contacts) {
        log.info("Create contact '{}' {}", contacts.getFirstName(), contacts.getLastName());
        contactsPage.openPage();
        contactsPage.addContacts(contacts);
        contactsPage.clickSave();
    }
}
