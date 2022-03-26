package com.testing.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPagePO {

    //Stage 1 - Element locators
    @FindBy(id = "email")
    public static WebElement emailField;

    @FindBy(id = "pass")
    public static WebElement passwordField;

    @FindBy(css = "#send2 > span")
    public static WebElement signinButton;


    //Stage 2 - Initialise Web Elements to use Selenium WebDriver
    public SignInPagePO(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    //Write methods to describe the element action
    public void enterEmail(String emai) {
        emailField.sendKeys(emai);
    }
    public void enterPassword(String password) {
        passwordField.sendKeys(password);
    }

    public void clickSignInButton() {signinButton.click();

    }
}
