package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.component.VodicComponent;

public class HomePage extends BasePage{

    WebDriver driver;
    public VodicComponent vodicComponent;

    public HomePage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        vodicComponent = new VodicComponent(driver);
        PageFactory.initElements(driver,this);
    }

    @FindBy(css = "[name='isDetailed']")
    WebElement detailedSearchButton;

    public void clickDetailedSearchButton(){
        clickElement(detailedSearchButton,"Detailed search button");
    }

}