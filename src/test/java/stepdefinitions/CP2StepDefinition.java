package stepdefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import questions.AnswerCP2;
import tasks.AddCart;
import tasks.Login;
import tasks.OpenUp2;
import tasks.SelectionOf;

public class CP2StepDefinition {

    @Given("^than carlos wants to buy on the Swaglabs page$")
    public void thanCarlosWantsToBuyOnTheSwaglabsPage() {
        OnStage.theActorCalled("Carlos").wasAbleTo(OpenUp2.thePage2(),(Login.OnThePage()));
    }
    @When("^he select a product (.*) on the store platform$")
    public void heSelectAProductSauceLabsBackpackOnTheStorePlatform(String product) {
        OnStage.theActorInTheSpotlight().attemptsTo(SelectionOf.the(product));
    }
    @When("^he add the product to the shopping cart, he select the cart$")
    public void heAddTheProductToTheShoppingCartHeSelectTheCart() {
        OnStage.theActorInTheSpotlight().attemptsTo(AddCart.theProduct());
    }
    @Then("^he accesses the shopping page of (.*)$")
    public void heAccessesTheShoppingPageOfYourCart(String question) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(AnswerCP2.toThe(question)));
    }
}
