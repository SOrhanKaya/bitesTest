package com.bites;

import static com.bites.constants.Constants.*;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage{

    private static final String EMAIL_TEXT = "orhanmdns28@gmail.com";
    private static final String PASSWORD_TEXT = "12345";

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public LoginPage clickLogIn(){
        click(LOGIN);
        return this;
    }

    public LoginPage setEmail(){
        sendKeys(EMAIL_AREA, EMAIL_TEXT);
        return this;
    }

    public LoginPage setPassword(){
        sendKeys(PASSWORD_AREA, PASSWORD_TEXT);
        return this;
    }

    public LoginPage submitLogIn(){
        click(SUBMIT_LOGIN);
        return this;
    }

}
