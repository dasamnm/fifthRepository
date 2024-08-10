package stepdefinitions;

import java.util.Collection;

import di.ContextClass;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;

public class FirstStepDefinitions {

	private ContextClass context;

	public FirstStepDefinitions(ContextClass context) {
		this.context = context;
	}

	@Given("user name is {string}")
	public void user_name_is(String name) {
		context.setName(name);
		System.out.println(context.getName());
	}

	@Given("user age is {int}")
	public void user_age_is(Integer age) {

		context.setAge(age);
		System.out.println(context.getAge());
	}

	@AfterStep
	public void after(Scenario sc) {
		Collection<String> tags = sc.getSourceTagNames();
		System.out.println(tags);
		System.out.println(sc.getStatus());

	}
}
