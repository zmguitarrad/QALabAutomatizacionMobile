package com.nttdata.screens;

import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.pages.PageObject;
import org.apache.groovy.json.internal.Exceptions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ProductoScreen extends PageObject {
    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"com.saucelabs.mydemoapp.android:id/productTV\"]")
    private WebElement lblProducto;

    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"Sauce Labs Backpack\"]")
    private WebElement btnProduct;

    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"com.saucelabs.mydemoapp.android:id/noTV\"]")
    private WebElement txtCant;

    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"com.saucelabs.mydemoapp.android:id/productTV\"]")
    private WebElement txtName;

    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"Displays number of items in your cart\"]")
    private WebElement cartBadge;

    public String validateEnter(){
        waitFor(ExpectedConditions.visibilityOf(lblProducto));
        return lblProducto.getText();

    }
    public void clickProduct(){
        waitFor(ExpectedConditions.visibilityOf(btnProduct));
        btnProduct.click();
    }

    public void enterCant(String cant){
        txtCant.sendKeys(cant);
    }
    public String validateCatalog(){
        waitFor(ExpectedConditions.visibilityOf(txtName));
        return txtName.getText();
    }
    public boolean validateCart() {
        cartBadge.click();
        waitFor(ExpectedConditions.visibilityOf(cartBadge));
        return Integer.parseInt(txtCant.getText()) > 0;
    }

}
