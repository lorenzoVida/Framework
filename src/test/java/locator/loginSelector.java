package locator;

import org.openqa.selenium.By;

public class loginSelector {
    public static By txtUserName = By.cssSelector("input[placeholder='Username']");
    public static By txtUserPass = By.cssSelector("input[placeholder='Password']");
    public static By btnIngresar = By.cssSelector("button[type='submit']");
}
