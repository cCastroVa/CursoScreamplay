package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import userinterface.InputsCheckoutPage;

public class Inputs implements Task {
    public static Inputs theCheck() {
        return Tasks.instrumented(Inputs.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue("pepito").into(InputsCheckoutPage.INPUT_FIRSTNAME),
                Enter.theValue("perez").into(InputsCheckoutPage.INPUT_LASTNAME),
                Enter.theValue("123456").into(InputsCheckoutPage.INPUT_CODE_POSTAL),
                Click.on(InputsCheckoutPage.BUTTON_CONTINUE),
                Click.on(InputsCheckoutPage.BUTTON_FINISH));
    }
}
