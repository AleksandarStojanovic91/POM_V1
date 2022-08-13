package pages.component;

import helpers.CommonActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VodicComponent extends CommonActions {
    WebDriver driver;

    public VodicComponent(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//a[contains(text(),'PRELISTAJ VODIČ')]")
    WebElement prelistajVodic;

    public void prelistajVodic(){
        clickElement(prelistajVodic,"Prelistaj vodic button");
    }
}
