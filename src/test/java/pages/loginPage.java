package pages;

import locator.loginSelector;
import locator.myInfoSelector;
import org.openqa.selenium.WebDriver;

public class loginPage extends base{

    WebDriver driver;
    public loginPage(WebDriver driver) {
        super(driver);
    }

    public void loinSuccessful(){
        waitForElementToAppear(loginSelector.txtUserName);
        type("Admin",loginSelector.txtUserName);
        type("admin123",loginSelector.txtUserPass);
        click(loginSelector.btnIngresar);

    }

}
