package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class P04_ForgetPasswordPage {
    WebDriver driver;

    public P04_ForgetPasswordPage(WebDriver driver)
    {
        PageFactory.initElements(driver,this);
    }

    @FindBy(id ="input-email")
    WebElement emailInput;

    @FindBy(xpath = "//input[@value='Continue']")
    WebElement continueReset;


    public void resetEmail(String email){
        this.emailInput.sendKeys(email);
        continueReset.click();
    }
}
