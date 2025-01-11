package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.util.List;
import java.util.Random;
import static pages.PageBase.hoverWebElement;
public class P01_HomePage extends PageBase {
    WebDriver driver;
    Actions actions;

    public P01_HomePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
        this.actions = new Actions(driver);


    }


    @FindBy(xpath = "//span[contains(text(),'My Account')]")
    WebElement myaccount;

    @FindBy(linkText = "Login")
    WebElement login;

    @FindBy(xpath = "//a[contains(text(),'Register')]")
    WebElement register;

    @FindBy(xpath = "(//ul/li/a)[7]")
    WebElement logout;

    @FindBy(linkText = "Forgotten Password")
    WebElement forgottenPasswordButton;

    @FindBy(xpath = "//input[@placeholder='Search']")
    WebElement search;

    @FindBy(xpath = "(//i)[7]")
    WebElement submitSearch;

    @FindBy(xpath = "(//i)[1]")
    WebElement currencyDropdown;

    @FindBy(xpath = "//button[contains(text(),'€Euro')]")
    WebElement selectEuroOption;

    @FindBy(xpath = "(//i)[14]")
    WebElement wishlistButton;

    @FindBy(linkText = "Shopping Cart")
    WebElement shoppingCart;

    @FindBy(xpath = "(//i[@class='fa fa-exchange'])[2]")
    WebElement compareButton;

    @FindBy(xpath = "//div[@class='caption']//a[contains(text(),'iPod Touch')]")
    WebElement productName;

    @FindBy(xpath = "(//span[normalize-space()='Add to Cart'])[1]")
    WebElement addToCartButtonAfterSearch;


    public void goToLoginPage() {
        myaccount.click();
        login.click();
    }

    public void goToregisterationPage() {
        myaccount.click();
        register.click();
    }

    public void goTologOut() {
        myaccount.click();
        logout.click();
    }


    public void goToSearch(String searchInput) {
        search.sendKeys(searchInput);
        submitSearch.click();
    }

    public void switchCurrencyButton() {
        currencyDropdown.click();
        selectEuroOption.click();
    }


    public void addProductTowishlist() {
        wishlistButton.click();
    }


    public void addToCompare() {
        compareButton.click();
    }

    //todo: hover random category

    public void hoverOnRandomCategory(int index) throws InterruptedException {
        WebElement category = driver.findElement(By.xpath("//div/ul[@class=\"nav navbar-nav\"]/li[" + index + "]"));
        hoverWebElement(driver, category);
        Thread.sleep(4000);

    }

    public void goToProductPage() {
        productName.click();
    }


    public void addProductToCartAfterSearch() { // when create order tc full scenario
        addToCartButtonAfterSearch.click();
    }

    public void goToShoppingCartPage() {
        shoppingCart.click();
    }


}

