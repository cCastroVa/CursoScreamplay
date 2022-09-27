package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import userinterface.InputsCheckoutPage;

public class AnswerCP3 implements Question<Boolean> {
    private String question;
    public AnswerCP3(String question) {
        this.question = question;
    }
    public static AnswerCP3 toThe(String question) {
        return new AnswerCP3(question);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;
        String Purchase= Text.of(InputsCheckoutPage.NAME_PAGE).viewedBy(actor).asString().toLowerCase();
        if (question.equals(Purchase)){
            result = true;
        }else {
            result = false;
        }
        return result;
    }
}
