package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.DetailedSearchPage;
import pages.HomePage;

import java.util.concurrent.TimeUnit;

public class SearchTests {
    WebDriver driver;

    @BeforeMethod
    public void setup(){
        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @Test
    public void detailedSearch(){
        driver.get("https://www.polovniautomobili.com/");

        HomePage homePage = new HomePage(driver);
        homePage.clickDetailedSearchButton();

        DetailedSearchPage detailedSearchPage = new DetailedSearchPage(driver);
        detailedSearchPage.selectBrandByText("Alfa Romeo");
        detailedSearchPage.selectModelByText("Giulia");
        detailedSearchPage.checkOption("ABS");
        detailedSearchPage.checkOption("ASR");
    }

}
