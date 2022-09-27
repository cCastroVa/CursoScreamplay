package stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import questions.Answer;
import tasks.Login;
import tasks.OpenUp;

public class CPStepDefinitions {
    @Before
    public void setState(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^than carlos wants login at the Swaglabs page$")
    public void thanCarlosWantsLoginAtTheSwaglabsPage() {
        OnStage.theActorCalled("Carlos").wasAbleTo(OpenUp.thePage());
    }
    @When("^he login on the store platform$")
    public void heLoginOnTheStorePlatform() {
        OnStage.theActorInTheSpotlight().attemptsTo(Login.OnThePage());
    }
    @Then("^he access at the (.*) page$")
    public void heAccessAtTheProductsPage(String question) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(question)));
    }

}
