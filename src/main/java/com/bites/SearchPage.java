package com.bites;

import org.openqa.selenium.WebDriver;

import static com.bites.constants.Constants.*;

public class SearchPage extends BasePage{

    private static final String SEARCH_TEXT = "Dress";

    public SearchPage(WebDriver driver) {
        super(driver);
    }

    public SearchPage search(){
        sendKeys(SEARCH_BOX, SEARCH_TEXT);
        return this;
    }

    public SearchPage searchClick(){
        click(SEARCH);
        return this;
    }

    public SearchPage hoverProduct(){
        hoverElement(SELECT_PRODUCT);
        return this;
    }

    public SearchPage addToCart(){
        click(ADD_TO_CART_PRODUCT);
        return this;
    }

    public SearchPage goToCart(){
        click(GO_TO_CART);
        return this;
    }

}
