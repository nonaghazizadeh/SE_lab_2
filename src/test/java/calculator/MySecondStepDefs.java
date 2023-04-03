package calculator;

import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Given;
import org.junit.Assert;

public class MySecondStepDefs {
    private Calculator calculator;
    private int input;
    private String opt;
    private double result;
    @Before
    public void before(){
        calculator = new Calculator();
    }

    @Given("^integer (-?\\d+) as input$")
    public void integerAsInput(int arg0) {
        input = arg0;
    }

    @When("^the operator is (rvs|sqr)$")
    public void theOperatorIs(String arg0) {
        try{
            opt = arg0;
            result = calculator.operate(input, arg0);
            System.out.print(result);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    @Then("^I expect the result ((?:NaN|-?Infinity|[-?\\d.]+))")
    public void iExpectTheResult(String arg0) {
        double expected = Double.parseDouble(arg0);
        if (opt.equals("rvs")){
            Assert.assertEquals(result, expected, 0.0001);
        } else if (opt.equals("sqr")) {
            Assert.assertEquals(result, expected, 0.0001);
        }
    }
}
