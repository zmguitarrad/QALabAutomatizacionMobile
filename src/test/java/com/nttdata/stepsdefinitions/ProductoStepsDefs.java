package com.nttdata.stepsdefinitions;

import com.nttdata.steps.ProductSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;

public class ProductoStepsDefs {
    @Steps
    ProductSteps productSteps;

    @Given("estoy en la aplicación de SauceLabs")
    public void estoyEnLaAplicacionDeSauceLabs() {
    }

    @And("valido que carguen correctamente los productos en la galería")
    public void validoQueCarguenCorrectamenteLosProductosEnLaGaleria() {
        productSteps.verificateApp();
    }

    @When("agrego {} del siguiente producto {string}")
    public void agregoDelSiguienteProducto(String cant, String prod) {
        productSteps.addBuy(cant,prod);
    }
    @Then("valido que el carrito de compras actualice correctamente")
    public void validoQueElCarritoDeComprasActualiceCorrectamente() {
        productSteps.clickProductAdd();
    }


}
