package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import userinterface.SelectionProductPage;

public class SelectionOf implements Task{
    private String product;
    public SelectionOf(String product) {
        this.product = product;
    }
    public static SelectionOf the(String product) {
        return Tasks.instrumented(SelectionOf.class, product);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(SelectionProductPage.SELECTION_PRODUCT));
    }
}
