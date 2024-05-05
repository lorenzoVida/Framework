package pages;

import locator.loginSelector;
import locator.myInfoSelector;
import org.openqa.selenium.WebDriver;

public class myInfoPage extends base{

    public myInfoPage(WebDriver driver) {super(driver);}

    public void enterMyInfo() throws InterruptedException {
        waitForElementToAppear(myInfoSelector.btnMyInfo);
        type("Admin", myInfoSelector.btnMyInfo);
        System.out.println("exit method");
    }

}
