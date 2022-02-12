package com.bites;

import org.openqa.selenium.WebDriver;

import static com.bites.constants.Constants.*;

public class CheckoutPage extends BasePage{

    public CheckoutPage(WebDriver driver) {
        super(driver);
    }

    public CheckoutPage nextStep(){
        click(NEXT_STEP);
        return this;
    }

    public CheckoutPage addressStep(){
        click(ADDRESS_STEP_NEXT);
        return this;
    }

    public CheckoutPage privacyCheck(){
        click(PRIVACY_POLICY_CHECK);
        return this;
    }

    public CheckoutPage paymentType(){
        click(PAYMENT_TYPE_SELECT);
        return this;
    }

    public CheckoutPage paymentSuccess(){
        click(PAYMENT_SUCCESS);
        return this;
    }

}
