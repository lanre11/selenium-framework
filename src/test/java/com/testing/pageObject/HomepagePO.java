package com.testing.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomepagePO {

    //Stage 1 - Element locators
    @FindBy(linkText = "Create an Account")
    public static WebElement CreateAccountLink;

    @FindBy(linkText = "Sign In")
    public static WebElement SignInLink;


    //Stage 2 - Initialise Web Elements to use Selenium WebDriver
    public HomepagePO(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    //Write methods to describe the element action
    public void clickCreateAccountLink() {
        CreateAccountLink.click();
    }

    public void clickSignInLink() {
        SignInLink.click();
    }
}
