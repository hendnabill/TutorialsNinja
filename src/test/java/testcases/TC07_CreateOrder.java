package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;

//import static drivers.DriverHolder.driver;
import static drivers.DriverHolder.getDriver;
import static util.Utility.*;

public class TC07_CreateOrder extends TestBase {
    @Test
    public void createOrder_p() throws InterruptedException {

        //create pages object
        P01_HomePage homePage= new P01_HomePage(getDriver());
        P02_LoginPage loginPage=new P02_LoginPage((getDriver()));
        P06_ShoppingCartPage shoppingCartPage=new P06_ShoppingCartPage(getDriver());
        P07_CheckoutPage checkoutPage=new P07_CheckoutPage(getDriver());

        String firstName = generateRandomFirstName();
        String lastName = generateRandomLastName();
        String address1=  generateFullAddress();
        String city= generateCity();
        String postcode= generatePostalCode();

        homePage.goToLoginPage();
        loginPage.login (TC01_Registration.email, TC01_Registration.password);
        Thread.sleep(3000);

        homePage.goToSearch("ipod touch");
        homePage.addProductToCartAfterSearch();
        homePage.goToShoppingCartPage();
        shoppingCartPage.goTocheckOutPage();
        checkoutPage.addBillingDetails(firstName,lastName,address1,city,postcode);
        checkoutPage.openCountryDropdown();
        Thread.sleep(2000);
        checkoutPage.selectCountry("United Kingdom");
        checkoutPage.openregionDropdown();
        checkoutPage.selectRegion("Cardiff");;
        checkoutPage.clickContinueBillingButton();
        Thread.sleep(3000);
        checkoutPage.clickContinueDeliveryButton();
        checkoutPage.addCommentInTextArea();
        checkoutPage.clickContinueShippingMethodButton();
        checkoutPage.checkOnAgreeCheckbox();
        Thread.sleep(3000);
        checkoutPage.clickOnPaymentMethodButton();
        Thread.sleep(3000);
        checkoutPage.clickOnConfirmButton();
        Thread.sleep(3000);


        Assert.assertTrue(getDriver().getPageSource().contains("Your order has been placed!"));
        Assert.assertEquals(getDriver().getCurrentUrl(),"https://tutorialsninja.com/demo/index.php?route=checkout/success");




    }
}
