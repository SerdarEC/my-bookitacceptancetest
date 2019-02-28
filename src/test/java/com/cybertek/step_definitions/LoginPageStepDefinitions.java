package com.cybertek.step_definitions;

import com.cybertek.pages.MapPage;
import com.cybertek.pages.SignInPage;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class LoginPageStepDefinitions {


    @When("user logs in using {string} and {string}")
    public void user_logs_in_using_and(String email, String password) {

        System.out.println("Email: "+ email);
        System.out.println("Password: "+ password);

        SignInPage signInPage = new SignInPage();
        signInPage.login(email, password);


    }

    @When("title should be {string}")
    public void title_should_be(String title) {
        System.out.println("title : "+ title);
    }

    @When("there should be {int} menu options")
    public void there_should_be_menu_options(Integer count) {
        System.out.println("count :"+ count);
    }


    @Then("location should be {string}")
    public void location_should_be(String expectedLocation) {
        MapPage mapPage = new MapPage();

        String actualLocation = mapPage.title.getText();
        Assert.assertEquals(expectedLocation, actualLocation);

    }


}
