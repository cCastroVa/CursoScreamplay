package userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CheckoutPage extends PageObject {
    public static final Target BUTTON_CHECKOUT = Target.the("Button of checkout purchase")
            .located(By.xpath("//*[@id=\"checkout\"]"));
}
