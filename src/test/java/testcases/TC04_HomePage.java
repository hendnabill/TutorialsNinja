package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.P01_HomePage;
import pages.P02_LoginPage;
import pages.P03_RegistrationPage;
import static drivers.DriverHolder.getDriver;
import static util.Utility.generateRandomNumber;
public class TC04_HomePage extends TestBase {

    @Test(priority =1,description = "logged user can search for product")
    //todo: search for product
    public void searchForProduct_p() throws InterruptedException {
        P01_HomePage homePage = new P01_HomePage(getDriver());
        P03_RegistrationPage registrationPage = new P03_RegistrationPage(getDriver());
        P02_LoginPage loginPage = new P02_LoginPage((getDriver()));

        homePage.goToLoginPage();
        loginPage.login(TC01_Registration.email, TC01_Registration.password);
        homePage.goToSearch("ipod touch");
        Thread.sleep(3000);
        Assert.assertTrue(getDriver().getPageSource().contains("Add to Cart"));

    }

    @Test(priority =1,description = "logged user can change currency")
    //todo: switch currency
    public void switchCurrency_p() throws InterruptedException {
        P01_HomePage homePage = new P01_HomePage(getDriver());
        P02_LoginPage loginPage = new P02_LoginPage((getDriver()));

        homePage.goToLoginPage();
        loginPage.login(TC01_Registration.email, TC01_Registration.password);
        homePage.switchCurrencyButton();
        Thread.sleep(4000);
        Assert.assertTrue(getDriver().getPageSource().contains("472.33€"));
    }


    @Test(priority =1,description = "logged user can add product to wishlist")
    //todo: add product to wish list
    public void addToWishlist_p() throws InterruptedException {
        P01_HomePage homePage = new P01_HomePage(getDriver());
        P02_LoginPage loginPage = new P02_LoginPage((getDriver()));

        homePage.goToLoginPage();
        loginPage.login(TC01_Registration.email, TC01_Registration.password);
        homePage.addProductTowishlist();
        Thread.sleep(3000);
        Assert.assertTrue(getDriver().getPageSource().contains(" Success"));


    }

    @Test(priority =1,description = "logged user can add product to comparison")
    //todo: add product ToCompare
    public void addToCompare_p() throws InterruptedException {
        P01_HomePage homePage = new P01_HomePage(getDriver());
        P02_LoginPage loginPage = new P02_LoginPage((getDriver()));

        homePage.goToLoginPage();
        loginPage.login(TC01_Registration.email, TC01_Registration.password);
        homePage.addToCompare();
        Thread.sleep(3000);
        Assert.assertTrue(getDriver().getPageSource().contains(" Success"));

    }


    @Test(priority = 1, description = "Logged User Can Hover Random Category")
    public void hoverRandomCategory_p() throws InterruptedException {
        P01_HomePage homePage;
        int index = generateRandomNumber();

        homePage = new P01_HomePage(getDriver());
        homePage.hoverOnRandomCategory(index);
        Thread.sleep(4000);
    }



}
