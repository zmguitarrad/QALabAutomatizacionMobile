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
    public void estoy_en_la_aplicación_de_sauce_labs() {

    }
    @And("valido que carguen correctamente los productos en la galeria")
    public void validoQueCarguenCorrectamenteLosProductosEnLaGaleria() {
        productSteps.validateText();
    }

    @When("agrego unidad {string} del siguiente producto {string}")
    public void agregoUnidadUNIDADESDelSiguienteProductoPRODUCTO(String cant, String productName) {
        productSteps.addProduct(cant,productName);
    }
    @Then("valido el carrito de compra actualice correctamente")
    public void valido_el_carrito_de_compra_actualice_correctamente() {
        productSteps.validateShoppingCart();

    }

}
