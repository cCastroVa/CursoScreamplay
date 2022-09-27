package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import userinterface.AddCartPage;

public class AddCart implements Task {
    public static AddCart theProduct() {
        return Tasks.instrumented(AddCart.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(AddCartPage.BUTTON_ADDCART),
                Click.on(AddCartPage.SELECT_CAR_PURCHASE));
    }
}
