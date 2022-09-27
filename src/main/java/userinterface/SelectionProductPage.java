package userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SelectionProductPage extends PageObject {
    public static final Target SELECTION_PRODUCT = Target.the("Select the product")
            .located(By.xpath("//*[@id=\"item_4_title_link\"]/div"));
}
