package sample;
import org.junit.*;
import org.junit.runner.*;
import static org.junit.Assert.*;
import junitparams.*;
import tumbler.*;
import static tumbler.Tumbler.*;

@RunWith(TumblerRunner.class)
@Story("do add")
public class DoAddScenarios {

	@Scenario(pending = true)
	public void shouldGivePositiveNumbers() {
		Given("20 and 30");

		When("addボタンを押す");

		Then("50を表示");
	}

	@Scenario(pending = true)
	public void shouldGiveNegativeNumbers() {
		Given("-20 and -30");

		When("addボタンを押す");

		Then("-50を表示");
	}
}