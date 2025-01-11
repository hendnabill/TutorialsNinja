package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class P02_LoginPage {
    WebDriver driver;

    public P02_LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "input-email")
    WebElement email;

    @FindBy(id = "input-password")
    WebElement password;

    @FindBy(xpath = "//input[@value='Login']")
    WebElement loginButton;

    @FindBy(linkText = "Forgotten Password")
    WebElement forgottenPasswordButton;

    @FindBy(xpath = "//a[contains(text(),'Qafox.com')]")
    WebElement homepagelink;



    public void login(String email, String password) {
        this.email.sendKeys(email);
        this.password.sendKeys(password);
        loginButton.click();
        homepagelink.click();

    }

    public void goToForgottenPassword() {
        forgottenPasswordButton.click();
    }

    public void goToHomepage(){
        homepagelink.click();
    }
}
