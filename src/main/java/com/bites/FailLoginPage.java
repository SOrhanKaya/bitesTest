package com.bites;

import static com.bites.constants.Constants.*;
import org.openqa.selenium.WebDriver;

public class FailLoginPage extends BasePage{

    private static final String EMAIL_TEXT = "orhanmdns28@gmail.com";
    private static final String PASSWORD_TEXT = "1234";

    public FailLoginPage(WebDriver driver) {
        super(driver);
    }

    public FailLoginPage clickLogIn(){
        click(LOGIN);
        return this;
    }

    public FailLoginPage setEmail(){
        sendKeys(EMAIL_AREA, EMAIL_TEXT);
        return this;
    }

    public FailLoginPage setPassword(){
        sendKeys(PASSWORD_AREA, PASSWORD_TEXT);
        return this;
    }

    public FailLoginPage submitLogIn(){
        click(SUBMIT_LOGIN);
        return this;
    }

}
