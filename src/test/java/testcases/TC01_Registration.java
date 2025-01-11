package testcases;

import com.github.javafaker.Faker;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.P01_HomePage;
import pages.P02_LoginPage;
import pages.P03_RegistrationPage;

import static drivers.DriverHolder.getDriver;
import static util.Utility.*;


public class TC01_Registration extends TestBase {

    public static String email;
    public static String password;

    @Test
    public void validRegister_p() throws InterruptedException {

        P01_HomePage homePage = new P01_HomePage(getDriver());
        P02_LoginPage loginPage = new P02_LoginPage(getDriver());
        P03_RegistrationPage registrationPage = new P03_RegistrationPage(getDriver());


        Faker faker = new Faker();

        String firstName = generateRandomFirstName();
        String lastName = generateRandomLastName();
        email = generateRandomEmail();
        String phone = generateRandomPhoneNumber(); // random phonenumber(0:8)
        password = generateRandomPassword(12);
        String confirmPassword = password; //same password


        homePage.goToregisterationPage();
        Thread.sleep(3000);

        registrationPage.registration(firstName, lastName, email, phone, password, confirmPassword);
        Thread.sleep(3000);

        Assert.assertTrue(getDriver().getPageSource().contains("Your Account Has Been Created!"));


        // Step 2: Logout
        homePage.goTologOut();
        Thread.sleep(3000);

        //assert the successful log out
        Assert.assertTrue(getDriver().getPageSource().contains("Account Logout"));


    }


}




