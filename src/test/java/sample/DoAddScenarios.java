package sample;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static tumbler.Tumbler.Given;
import static tumbler.Tumbler.Then;
import static tumbler.Tumbler.When;

import org.junit.runner.RunWith;

import tumbler.Scenario;
import tumbler.Story;
import tumbler.TumblerRunner;

@RunWith(TumblerRunner.class)
@Story("do add")
public class DoAddScenarios {

	@Scenario
	public void shouldGivePositiveNumbers() {
		double result = 0;

		Given("20 and 30");
		Calculator calc = new Calculator(20, 30);

		When("addボタンを押す");
		result = calc.add();

		Then("50を表示");
		assertThat(result, is(50.0));
	}

	@Scenario
	public void shouldGiveNegativeNumbers() {
		double result = 0;
		Given("-20 and -30");
		Calculator calc = new Calculator(-20, -30);

		When("addボタンを押す");
		result = calc.add();

		Then("-50を表示");
		assertThat(result, is(-50.0));
	}
}