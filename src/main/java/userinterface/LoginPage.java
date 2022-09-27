package userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginPage extends PageObject {
    public static final Target INPUT_USER = Target.the("Where do we write the user")
            .located(By.xpath("//*[@id=\"user-name\"]"));
    public static final Target INPUT_PASSWORD = Target.the("Where do we write the password")
            .located(By.xpath("//*[@id=\"password\"]"));
    public static final Target BUTTON_LOGIN = Target.the("Button to confirm Login")
            .located(By.xpath("//*[@id=\"login-button\"]"));
    public static final Target NAME_PAGE = Target.the("Extract the name of the products page")
            .located(By.xpath("//*[@id=\"header_container\"]/div[2]/span"));
}
