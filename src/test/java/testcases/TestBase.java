package testcases;

import drivers.DriverFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import java.time.Duration;

import static drivers.DriverHolder.*;
import static pages.PageBase.quitBrowser;

public class TestBase
{
    //WebDriver driver;
    @Parameters("browsername")
    @BeforeTest

    //set up webdriver
    public void setupDriver(String browsername){

        setDriver(DriverFactory.getNewInstance(browsername)); //default=chrome
        getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        getDriver().get("https://tutorialsninja.com/demo/index.php?route=common/home");
    }



    @AfterTest
    public void teardown(){
        quitBrowser(getDriver());
    }
}
