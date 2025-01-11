package testcases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.P01_HomePage;
import pages.P02_LoginPage;
import pages.P05_ProductPage;

import static drivers.DriverHolder.getDriver;

public class TC05_AddProductToCart extends TestBase {

    @Test

    //todo: add to cart
    public void addToCart_p() throws InterruptedException {
        P01_HomePage homePage = new P01_HomePage(getDriver());
        P02_LoginPage loginPage = new P02_LoginPage((getDriver()));
        P05_ProductPage productPage = new P05_ProductPage(getDriver());

         homePage.goToLoginPage();
        loginPage.login(TC01_Registration.email, TC01_Registration.password);

        homePage.goToSearch("ipod touch");
        homePage.goToProductPage();
        Thread.sleep(3000);
        productPage.clickAddToCartButtonFromProductPage();
        Thread.sleep(3000);
        Assert.assertTrue(getDriver().getPageSource().contains("Success"));
    }
}
