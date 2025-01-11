package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.P01_HomePage;
import pages.P02_LoginPage;

import static drivers.DriverHolder.getDriver;


public class TC02_Login extends TestBase {

    @Test(priority = 1,description = "verify valid login")

    public void validLogin_p() throws InterruptedException
    {
        //create pages object
        P01_HomePage homePage= new P01_HomePage(getDriver());
        P02_LoginPage loginPage=new P02_LoginPage(getDriver());

        //perform test steps
        homePage.goToLoginPage();
        loginPage.login (TC01_Registration.email, TC01_Registration.password);
        Thread.sleep(3000);
        loginPage.goToHomepage();
        Thread.sleep(3000);
        Assert.assertEquals(getDriver().getCurrentUrl(),"https://tutorialsninja.com/demo/index.php?route=common/home");
    }


}