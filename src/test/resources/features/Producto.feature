
@validar_producto
Feature: Agregar Producto en SauceLabs

  Scenario Outline: Validar funcionalidad del carrito de compra

    Given estoy en la aplicación de SauceLabs
    And valido que carguen correctamente los productos en la galeria
    When agrego unidad <UNIDADES> del siguiente producto <PRODUCTO>
    Then valido el carrito de compra actualice correctamente

    Examples:
      | UNIDADES |  PRODUCTO               |
      |   1      |Sauce Labs Backpack       |
      |   1      |Sauce Labs Bolt - T-Shirt |
      |   2      |Sauce Labs Bike Light     |

