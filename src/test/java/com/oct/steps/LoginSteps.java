package com.oct.steps;

import com.oct.pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {


    @Given("user is on website login page")
    public void user_is_on_website_login_page() {
        // Write code here that turns the phrase above into concrete actions
        LoginPage.initialize();

    }
    @When("user enters admin and admin")
    public void user_enters_admin_and_admin() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("user_enters_admin_and_admin");
    }
    @When("user clicks on login button")
    public void user_clicks_on_login_button() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("user_clicks_on_login_button");
    }
    @Then("user is navigated to Dashboard page")
    public void user_is_navigated_to_dashboard_page() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("user is navigated to Dashboard page");
    }
}
