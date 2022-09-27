package userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class InputsCheckoutPage extends PageObject {
    public static final Target INPUT_FIRSTNAME = Target.the("Where do we write the first name")
            .located(By.xpath("//*[@id=\"first-name\"]"));
    public static final Target INPUT_LASTNAME = Target.the("Where do we write the last name")
            .located(By.xpath("//*[@id=\"last-name\"]"));
    public static final Target INPUT_CODE_POSTAL = Target.the("Where do we write the code postal")
            .located(By.xpath("//*[@id=\"postal-code\"]"));
    public static final Target BUTTON_CONTINUE = Target.the("Button for continue with the purchase")
            .located(By.xpath("//*[@id=\"continue\"]"));
    public static final Target BUTTON_FINISH = Target.the("Button for finish with the purchase")
            .located(By.xpath("//*[@id=\"finish\"]"));
    public static final Target NAME_PAGE = Target.the("Extract the name of the cart page")
            .located(By.xpath("//*[@id=\"checkout_complete_container\"]/h2"));
}