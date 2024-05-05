package steps;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import org.openqa.selenium.WebDriver;
import pages.loginPage;
import pages.myInfoPage;

public class myInfoSteps {
    WebDriver driver;
    myInfoPage info;


    @Given("enter my info form")
    public void enter_my_info_form() throws InterruptedException {
    //    System.out.println("enter my info");
        info = new myInfoPage(driver);
        info.enterMyInfo();
    }
}
