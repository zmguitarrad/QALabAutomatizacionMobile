package com.nttdata.screens;

import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ProductoScreen extends PageObject {
    @AndroidFindBy(xpath="//android.widget.TextView[@resource-id=\"com.saucelabs.mydemoapp.android:id/productTV\"]")
    private WebElement title;

    @AndroidFindBy(xpath="//android.widget.Button[@content-desc=\"Tap to add product to cart\"]")
    private WebElement btnAdd;

    public boolean isProductsDisplayed(){
        waitFor(ExpectedConditions.visibilityOf(title));
        return title.isDisplayed();
    }
    public boolean isAddDisplayed(){
        waitFor(ExpectedConditions.visibilityOf(btnAdd));
        return btnAdd.isDisplayed();
    }


}
