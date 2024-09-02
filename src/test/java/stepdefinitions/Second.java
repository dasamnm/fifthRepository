package stepdefinitions;

import io.cucumber.java.en.Given;

public class Second {
	@Given("user is on login page")
	public void user_is_on_login_page() {
	    System.out.println("user is on login page");
	}

	@Given("user is on login web page")
	public void user_is_on_login_web_page() {
		System.out.println("user is on login web page");
	}

}
