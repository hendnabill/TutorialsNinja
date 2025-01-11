package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class P07_CheckoutPage {

    public P07_CheckoutPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    //locators
    @FindBy(id = "input-payment-firstname")
    WebElement firstname;

    @FindBy(id = "input-payment-lastname")
    WebElement lastname;

    @FindBy(id = "input-payment-company")
    WebElement company;

    @FindBy(id = "input-payment-address-1")
    WebElement address1;

    @FindBy(id = "input-payment-address-2")
    WebElement address2;

    @FindBy(id = "input-payment-city")
    WebElement city;

    @FindBy(id = "input-payment-postcode")
    WebElement postcode;

    @FindBy(id = "input-payment-country")
    WebElement countryDropdown;

    @FindBy(id = "input-payment-zone")
    WebElement regionDropdown;

    @FindBy(id = "button-payment-address")
    WebElement continueBillingButton;

    @FindBy(xpath = "(//input[@id='button-shipping-address'])[1]")
    WebElement continueDeliveryDetailsButton;

    @FindBy(xpath = "//textarea[@name='comment']")
    WebElement addComment;

    @FindBy(id = "button-shipping-method")
    WebElement continueShippingMethodButton;

    @FindBy(xpath = "(//input[@name='agree'])[1]")
    WebElement agreeButton;

    @FindBy(xpath = "//input[@id='button-payment-method']")
    WebElement continuePaymentMethodButton;

    @FindBy(id = "button-confirm")
    WebElement confirmOrderButton;


    public void addBillingDetails(String firstname, String lastname, String address1, String city, String postcode) {
        this.firstname.sendKeys(firstname);
        this.lastname.sendKeys(lastname);
        this.address1.sendKeys(address1);
        this.city.sendKeys(city);
        this.postcode.sendKeys(postcode);

    }

    public void openCountryDropdown() {
        countryDropdown.click();
    }


    public void selectCountry(String city) {
        Select select = new Select(countryDropdown);
        select.selectByVisibleText(city);

    }


    public void openregionDropdown() {
        regionDropdown.click();
    }

    public void selectRegion(String city) {
        Select select = new Select(regionDropdown);
        select.selectByVisibleText(city);

    }


    public void clickContinueBillingButton() {
        continueBillingButton.click();
    }

    public void clickContinueDeliveryButton() {
        continueDeliveryDetailsButton.click();
    }

    public void addCommentInTextArea() {
        addComment.sendKeys("hello, iam a test comment");
    }

    public void clickContinueShippingMethodButton() {
        continueShippingMethodButton.click();
    }

    public void checkOnAgreeCheckbox() {
        agreeButton.click();
    }

    public void clickOnPaymentMethodButton() {
        continuePaymentMethodButton.click();
    }

    public void clickOnConfirmButton() {
        confirmOrderButton.click();
    }
}

