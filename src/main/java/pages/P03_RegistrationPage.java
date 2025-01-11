package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class P03_RegistrationPage
{
    public P03_RegistrationPage(WebDriver driver)

    {
        PageFactory.initElements(driver,this);
    }

    @FindBy(id ="input-firstname")
    WebElement firstname;

    @FindBy(id = "input-lastname")
    WebElement lastname;

    @FindBy(id = "input-email")
    WebElement email;

    @FindBy(id = "input-telephone")
    WebElement telephone;

    @FindBy(id = "input-password")
    WebElement password;

    @FindBy(id = "input-confirm")
    WebElement confirmPassword;

    @FindBy(xpath = "//input[@name='agree']")
    WebElement agreePolicy;

    @FindBy(xpath = "//input[@value='Continue']")
    WebElement continueButton;

    @FindBy(xpath = "//h1[contains(text(),'Your Account Has Been Created!')]")
    WebElement successMessage;

    @FindBy(xpath = "//a[contains(text(),'Logout')]")
    WebElement logout;


    public void registration (String firstname,String lastname, String email,String telephone, String password,String confirmPassword){
        this.firstname.sendKeys(firstname);
        this.lastname.sendKeys(lastname);
        this.email.sendKeys(email);
        this.telephone.sendKeys(telephone);
        this.password.sendKeys(password);
        this.confirmPassword.sendKeys(confirmPassword);
        agreePolicy.click();
        continueButton.click();



    }


}

