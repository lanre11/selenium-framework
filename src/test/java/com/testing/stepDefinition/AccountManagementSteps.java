package com.testing.stepDefinition;

import com.testing.cucumber.Hooks;
import com.testing.pageObject.CreateAccountPagePO;
import com.testing.pageObject.HomepagePO;
import com.testing.pageObject.SignInPagePO;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class AccountManagementSteps {
    WebDriver driver = Hooks.driver;

    @Given("User is on create an account page")
    public void userIsOnCreateAnAccountPage() {
        HomepagePO homepagePO = new HomepagePO(driver);
        homepagePO.clickCreateAccountLink();
    }

    @When("user enter {string}, {string}, {string}, {string} and {string}")
    public void userEnterAnd(String firstname, String lastname, String email, String password, String confirmpassword) {
        CreateAccountPagePO createAccountPagePO = new CreateAccountPagePO(driver);
        createAccountPagePO.enterFirstname(firstname);
        createAccountPagePO.enterLastname(lastname);
        createAccountPagePO.enterEmail(email);
        createAccountPagePO.enterPassword(password);
        createAccountPagePO.enterConfirmpassword(confirmpassword);
    }

    @And("user click on create an account")
    public void userClickOnCreateAnAccount() {
        CreateAccountPagePO createAccountPagePO = new CreateAccountPagePO(driver);
        createAccountPagePO.clickCreateAccountButton();
    }

    @Then("my account page should be displayed")
    public void myAccountPageShouldBeDisplayed() {
    }

    @Given("User is on customer login page")
    public void userIsOnCustomerLoginPage() {
        HomepagePO homepagePO = new HomepagePO(driver);
        homepagePO.clickSignInLink();
    }

    @When("user enter {string}  {string}")
    public void userEnter(String email, String password) {
        SignInPagePO signInPagePO = new SignInPagePO(driver);
        signInPagePO.enterEmail(email);
        signInPagePO.enterPassword(password);
    }

    @And("User click on sign in")
    public void userClickOnSignIn() {
        SignInPagePO signInPagePO = new SignInPagePO(driver);
        signInPagePO.clickSignInButton();
    }

    @Then("my account name should be displayed")
    public void myAccountNameShouldBeDisplayed() {
    }
}
