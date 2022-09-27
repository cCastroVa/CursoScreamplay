package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import userinterface.CheckoutPage;

public class Selection implements Task {
    public static Selection theCheckout() {
        return Tasks.instrumented(Selection.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(CheckoutPage.BUTTON_CHECKOUT));
    }
}
