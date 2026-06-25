package step;

import dto.Account;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.WebDriver;
import pages.AccountPage;

@Log4j2
public class AccountStep {

    WebDriver driver;
    AccountPage accountPage;

    public AccountStep(WebDriver driver) {
        this.driver = driver;
        accountPage = new AccountPage(driver);
    }

    public  void createAccount(Account account) {
        log.info("Create account '{}'", account.getName());
        accountPage.openPage();
        accountPage.addAccount(account);
        accountPage.clickSave();
    }
}