package com.bites.constants;

import org.openqa.selenium.By;

public class Constants {
    public static final By LOGIN = By.className("login");
    public static final By EMAIL_AREA = By.id("email");
    public static final By PASSWORD_AREA = By.id("passwd");
    public static final By SUBMIT_LOGIN = By.id("SubmitLogin");
    public static final By SEARCH_BOX = By.id("search_query_top");
    public static final By SEARCH = By.cssSelector("button.button-search");
    public static final By SELECT_PRODUCT = By.cssSelector("li.ajax_block_product:nth-child(1)");
    public static final By ADD_TO_CART_PRODUCT = By.cssSelector("a.ajax_add_to_cart_button");
    public static final By GO_TO_CART = By.cssSelector("#layer_cart > div.clearfix > div.layer_cart_cart.col-xs-12.col-md-6 > div.button-container > a");
    public static final By NEXT_STEP = By.cssSelector(".standard-checkout");
    public static final By ADDRESS_STEP_NEXT = By.cssSelector("#center_column > form > p > button");
    public static final By PRIVACY_POLICY_CHECK = By.id("uniform-cgv");
    public static final By PAYMENT_TYPE_SELECT = By.className("bankwire");
    public static final By PAYMENT_SUCCESS = By.cssSelector("#cart_navigation > button");
}
