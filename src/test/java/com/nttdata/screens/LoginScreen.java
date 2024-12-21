package com.nttdata.screens;
import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginScreen extends PageObject{

    @AndroidFindBy(xpath="//android.widget.Button[@content-desc=\"Tap to add product to cart\"]")
    private WebElement btnAdd;
    @AndroidFindBy(xpath="//android.widget.ImageView[@content-desc=\"Increase item quantity\"]")
    private WebElement btnMore;
    @AndroidFindBy(xpath="//android.widget.ImageView[@content-desc=\"Displays number of items in your cart\"]")
    private WebElement btnView;
    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"Sauce Labs Bike Light\"]")
    private WebElement btnLamp;
    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"Sauce Labs Bolt T-Shirt\"]")
    private WebElement btnPol;
    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"Sauce Labs Backpack\"]")
    private WebElement btnBackpack;
    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"test-Error message\"]/android.widget.TextView")
    private WebElement lblErrorMessage;

    public void clickProductBackpack(){
        waitFor(ExpectedConditions.visibilityOf(btnBackpack));
        btnBackpack.click();
    }
    public void clickProductPolo(){
        waitFor(ExpectedConditions.visibilityOf(btnPol));
        btnPol.click();
    }
    public void clickProductLamp(){
        waitFor(ExpectedConditions.visibilityOf(btnLamp));
        btnLamp.click();
    }
    public void clickProductAdd(){
        btnAdd.click();
    }
    public void clickMoreProduct(){
        btnMore.click();
    }
    public void clickProductView(){
        waitFor(ExpectedConditions.visibilityOf(btnView));
        btnView.click();
    }
}
