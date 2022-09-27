package stepdefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import questions.AnswerCP2;
import questions.AnswerCP3;
import tasks.*;

public class CP3StepDefinitions {

    @Given("^than carlos is on the cart shopping page$")
    public void thanCarlosIsOnTheCartShoppingPage() {
        OnStage.theActorCalled("Carlos").wasAbleTo(OpenUp3.thePage3(),(Login.OnThePage()),
                (AddCart.theProduct()));
    }
    @When("^he checkout his purchase$")
    public void heCheckoutHisPurchase() {
        OnStage.theActorInTheSpotlight().attemptsTo(Selection.theCheckout());
    }
    @When("^he enters his information to finalize the purchase$")
    public void heEntersHisInformationToFinalizeThePurchase() {
        OnStage.theActorInTheSpotlight().attemptsTo(Inputs.theCheck());
    }
    @Then("^he visualizes that his (.*)$")
    public void heVisualizesThatHisThankYouForYourOrder(String question) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(AnswerCP3.toThe(question)));
    }

}
