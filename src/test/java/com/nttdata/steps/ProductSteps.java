package com.nttdata.steps;

import com.nttdata.screens.ProductoScreen;
import org.junit.Assert;

public class ProductSteps {
    ProductoScreen productoScreen;

    public void validateText() {
        Assert.assertTrue("Error: La pantalla no muestra 'Products", productoScreen.validateEnter().contains("Products"));
    }

    public void addProduct(String cant, String productName) {
        productoScreen.clickProduct();
        productoScreen.enterCant(cant);
        String displayedProduct = productoScreen.validateCatalog();
        Assert.assertEquals("Error: El producto no coincide con el catálogo",productName,displayedProduct);
    }
    public void validateShoppingCart() {
        Assert.assertTrue("Error: La validación del carrito falló", productoScreen.validateCart());
    }
}
