package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import userinterface.AddCartPage;
import userinterface.LoginPage;

public class AnswerCP2 implements Question<Boolean> {

    private String question;
    public AnswerCP2(String question) {
        this.question = question;
    }
    public static AnswerCP2 toThe(String question) {
        return new AnswerCP2(question);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;
        String Cart= Text.of(AddCartPage.NAME_PAGE).viewedBy(actor).asString().toLowerCase();
        if (question.equals(Cart)){
            result = true;
        }else {
            result = false;
        }
        return result;
    }
}
