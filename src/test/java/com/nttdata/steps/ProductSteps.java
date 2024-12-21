package com.nttdata.steps;

import com.nttdata.screens.LoginScreen;
import com.nttdata.screens.ProductoScreen;
import io.appium.java_client.android.AndroidDriver;
import org.junit.Assert;

public class ProductSteps {
    ProductoScreen productoScreen;
    LoginScreen loginScreen;

    public void verificateApp(){

        Assert.assertTrue("Login incorrecto!!", productoScreen.isProductsDisplayed());
    }
    public void clicBack(){
        loginScreen.clickProductBackpack();
        productoScreen.isAddDisplayed();
    }

/////////////////////////////////////////////////////////
    private AndroidDriver driver;
    public void addBuy(String cant,String product){

        if(product.equals("Sauce Labs Backpack" )) {
            loginScreen.clickProductBackpack();

        }

        if(product.equals("Sauce Labs Bolt T-Shirt" ))
        {
            loginScreen.clickProductPolo();

        }
        if(product.equals("Sauce Labs Bike Light" ))
        {
            loginScreen.clickProductLamp();
        }

        int n=Integer.parseInt(cant);

        for(int i=1;i<n;i++)
        {
            loginScreen.clickMoreProduct();
        }
        loginScreen.clickProductAdd();

    }

    public void clickProductAdd(){
        loginScreen.clickProductView();
    }
}
