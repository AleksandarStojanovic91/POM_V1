package pages.component;

import helpers.CommonActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class VodicComponent extends CommonActions {
    WebDriver driver;

    public VodicComponent(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    By prelistajVodic = By.xpath("//a[contains(text(),'PRELISTAJ VODIČ')]");

    public void prelistajVodic(){
        clickElement(driver.findElement(prelistajVodic),"Prelistaj vodic button");
    }
}
