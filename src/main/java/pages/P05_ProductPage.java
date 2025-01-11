package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class P05_ProductPage  {
    WebDriver driver;

    public P05_ProductPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }


    @FindBy(xpath = "(//button[@id='button-cart'])[1]")
    WebElement addToCartButton;


    public void clickAddToCartButtonFromProductPage(){
        addToCartButton.click();
    }


}
