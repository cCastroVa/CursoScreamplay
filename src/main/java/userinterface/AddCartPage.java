package userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AddCartPage extends PageObject {
    public static final Target BUTTON_ADDCART = Target.the("Button for add product in the cart")
            .located(By.xpath("//*[@id=\"add-to-cart-sauce-labs-backpack\"]"));
    public static final Target SELECT_CAR_PURCHASE = Target.the("Select the cart of shopping")
            .located(By.xpath("//*[@id=\"shopping_cart_container\"]/a"));
    public static final Target NAME_PAGE = Target.the("Extract the name of the cart page")
            .located(By.xpath("//*[@id=\"header_container\"]/div[2]/span"));
}
