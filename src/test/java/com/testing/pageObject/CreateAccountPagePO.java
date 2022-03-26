package com.testing.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateAccountPagePO {

    //Stage 1 - Element locators
    @FindBy(id = "firstname")
    public static WebElement firstnameField;

    @FindBy(name = "lastname")
    public static WebElement lastnameField;

    @FindBy(name = "email")
    public static WebElement emailField;

    @FindBy(name = "password")
    public static WebElement passwordField;

    @FindBy(name = "password_confirmation")
    public static WebElement confirmpasswordField;

    @FindBy(css = "#form-validate > div > div.primary > button > span")
    public static WebElement createanaccountButton;




    //Stage 2 - Initialise Web Elements to use Selenium WebDriver
    public  CreateAccountPagePO(WebDriver driver){
        PageFactory.initElements(driver, this);
    }



    //Write methods to describe the element action
    public void enterFirstname(String firstname){
        firstnameField.sendKeys(firstname);
    }

    public void enterLastname(String lastname){
        lastnameField.sendKeys(lastname);
    }

    public void enterEmail(String email){
        emailField.sendKeys(email);
    }

    public void enterPassword(String password){
        passwordField.sendKeys(password);
    }

    public void enterConfirmpassword(String confirmpassword){
        confirmpasswordField.sendKeys(confirmpassword);
    }

    public void clickCreateAccountButton(){
        createanaccountButton.click();
    }









}
