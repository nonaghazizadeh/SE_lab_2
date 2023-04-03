package calculator;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Given;
import org.junit.Assert;

public class MyStepDefs {
    @Given("^Two input values, (\\d+) and (\\d+)$")
    public void twoInputValuesAnd(int arg0, int arg1) {
    }

    @When("^I add the two values$")
    public void iAddTheTwoValues() {
    }

    @Then("^I expect the result (\\d+)$")
    public void iExpectTheResult(int arg0) {
    }
}
