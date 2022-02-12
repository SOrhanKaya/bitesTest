package com.bites;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Date;

public class BitesTest extends BaseTest{

    FailLoginPage failLoginPage;
    LoginPage loginPage;
    SearchPage searchPage;
    CheckoutPage checkoutPage;

    @Before
    public void before(){
        failLoginPage = new FailLoginPage(getWebDriver());
        loginPage = new LoginPage(getWebDriver());
        searchPage = new SearchPage(getWebDriver());
        checkoutPage = new CheckoutPage(getWebDriver());
    }

    @Test
    public void test() throws Exception {
        failLoginPage.clickLogIn().setEmail().setPassword().submitLogIn();
        takeSnapshot(getWebDriver(),"screenshots/fail/" + new Date() + ".png");
        loginPage.clickLogIn().setEmail().setPassword().submitLogIn();
        searchPage.search().searchClick().hoverProduct().addToCart().goToCart();
        checkoutPage.nextStep().addressStep().privacyCheck().nextStep().paymentType().paymentSuccess();
        takeSnapshot(getWebDriver(),"screenshots/success/" + new Date() + ".png");
    }

    @After
    public void after(){
        tearDown();
    }
}
