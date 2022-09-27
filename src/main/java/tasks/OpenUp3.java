package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;
import userinterface.CartPage;

public class OpenUp3 implements Task {
    private CartPage cartPage;
    public static OpenUp3 thePage3() {
        return Tasks.instrumented(OpenUp3.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(cartPage));
    }
}
