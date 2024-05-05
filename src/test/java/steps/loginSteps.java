package steps;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.base;
import pages.loginPage;
import pages.myInfoPage;

public class loginSteps {
    WebDriver driver;
    loginPage login;
    base baseUno;

    @Before
    public void setUp(){
        baseUno = new base(driver);
        driver = baseUno.chromeDriverConnection();
        baseUno.visit("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }

    @Given("enter the login form")
    public void enter_the_login_form() throws InterruptedException {
        login = new loginPage(driver);
        login.loinSuccessful();

    }
}
