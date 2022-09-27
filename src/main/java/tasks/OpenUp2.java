package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;
import userinterface.ProductPage;

public class OpenUp2 implements Task {
    private ProductPage productPage;
    public static OpenUp2 thePage2() {
        return Tasks.instrumented(OpenUp2.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(productPage));
    }
}
