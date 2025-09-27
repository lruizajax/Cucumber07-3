package com.magento.steps;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;

public class CarStep {

    @Dado("que el usuario ha iniciado sesión con el correo y contraseña valida")
    public void que_el_usuario_ha_iniciado_sesión_con_el_correo_y_contraseña_valida() {
        
    }

    @Dado("que el carrito contiene varios productos")
    public void que_el_carrito_contiene_varios_productos() {
        
    }

    @Dado("que el carrito contiene el producto {string} con cantidad {string}")
    public void que_el_carrito_contiene_el_producto_con_cantidad(String string, String string2) {
        
    }

    @Cuando("el usuario selecciona {string}")
    public void el_usuario_selecciona(String string) {
        
    }

    @Entonces("el carrito muestra el mensaje {string}")
    public void el_carrito_muestra_el_mensaje(String string) {
        
    }

    @Cuando("el usuario añade {int} unidades del producto {string} al carrito")
    public void el_usuario_añade_unidades_del_producto_al_carrito(Integer int1, String string) {
        
    }

    @Dado("que el carrito contiene el producto {string}")
    public void que_el_carrito_contiene_el_producto(String string) {
        
    }

    @Cuando("el usuario actualiza la cantidad a {string}")
    public void el_usuario_actualiza_la_cantidad_a(String string) {
        
    }

    @Entonces("el carrito muestra el subtotal actualizado correctamente")
    public void el_carrito_muestra_el_subtotal_actualizado_correctamente() {
        
    }

    @Cuando("el usuario elimina el producto")
    public void el_usuario_elimina_el_producto() {
        
    }

    @Entonces("el carrito muestra el producto con cantidad {string} y subtotal actualizado")
    public void el_carrito_muestra_el_producto_con_cantidad_y_subtotal_actualizado(String string) {
        
    }

    @Entonces("el carrito queda vacío y muestra el mensaje {string}")
    public void el_carrito_queda_vacío_y_muestra_el_mensaje(String string) {
        
    }
}
