package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.P01_HomePage;
import pages.P02_LoginPage;
import pages.P04_ForgetPasswordPage;

import static drivers.DriverHolder.getDriver;

public class TC03_ResetPassword extends TestBase {

    @Test
    public void resetPassword_p() throws InterruptedException {
        P01_HomePage homePage = new P01_HomePage(getDriver());
        P02_LoginPage loginPage = new P02_LoginPage(getDriver());
        P04_ForgetPasswordPage forgetPasswordPage=new P04_ForgetPasswordPage((getDriver()));

        //perform test steps
        homePage.goToLoginPage();
        loginPage.goToForgottenPassword();
        Thread.sleep(2000);
        forgetPasswordPage.resetEmail(TC01_Registration.email);
        Thread.sleep(2000);
        SoftAssert soft = new SoftAssert();
        soft.assertTrue(getDriver().getPageSource().contains("An email with a confirmation link has been sent your email address."));
        soft.assertAll();

    }

}
