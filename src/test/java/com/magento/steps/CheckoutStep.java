package com.magento.steps;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;

public class CheckoutStep {

    @Cuando("el usuario intenta pagar con una tarjeta sin fondos")
    public void el_usuario_intenta_pagar_con_una_tarjeta_sin_fondos() {
        
    }

    @Cuando("el usuario indica una dirección de facturación diferente a la de envío")
    public void el_usuario_indica_una_dirección_de_facturación_diferente_a_la_de_envío() {
        
    }

    @Cuando("el usuario aplica el cupón {string}")
    public void el_usuario_aplica_el_cupón(String string) {
        
    }

    @Cuando("el usuario elige el envío {string}")
    public void el_usuario_elige_el_envío(String string) {
        
    }

    @Entonces("el sistema muestra un mensaje de error de pago")
    public void el_sistema_muestra_un_mensaje_de_error_de_pago() {
        
    }

    @Entonces("el total del pedido refleja un {int}% de descuento")
    public void el_total_del_pedido_refleja_un_de_descuento(Integer int1) {
        
    }

    @Cuando("completa el checkout")
    public void completa_el_checkout() {
        
    }

    @Entonces("el usuario puede reintentar con otra tarjeta exitosa")
    public void el_usuario_puede_reintentar_con_otra_tarjeta_exitosa() {
        
    }

    @Entonces("el total del pedido incluye el costo del envío express")
    public void el_total_del_pedido_incluye_el_costo_del_envío_express() {
        
    }

    @Entonces("el sistema confirma el pedido con las direcciones registradas correctamente")
    public void el_sistema_confirma_el_pedido_con_las_direcciones_registradas_correctamente() {
        
    }
}
