package stepdefinitions;

import di.ContextClass;
import io.cucumber.java.en.Then;

public class Second {
	private ContextClass context;

	public Second(ContextClass context) {
		this.context = context;
	}
	

	@Then("display username")
	public void display_username() {
		System.out.println(context.getName());
	}

	@Then("user age")
	public void user_age() {
		System.out.println(context.getAge());
	}
}
