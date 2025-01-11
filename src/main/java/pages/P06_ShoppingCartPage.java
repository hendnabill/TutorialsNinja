package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class P06_ShoppingCartPage{

    public P06_ShoppingCartPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(linkText = "Checkout")
    WebElement checkoutButton;


    public void goTocheckOutPage(){
        checkoutButton.click();
    }


}
