package com.magento.steps;

import com.magento.factory.RegisterPage;
import com.magento.utils.DriverManager;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;

public class RegisterStep extends DriverManager {

    RegisterPage registerPage = new RegisterPage(getDriver());

    @Dado("el visitante esta en la pagina de registro {string}")
    public void el_visitante_esta_en_la_pagina_de_registro(String url) {
        getDriver().get(url);
    }

    @Cuando("el visitante completa la informacion de registro {string} {string} {string} {string}")
    public void el_visitante_completa_la_informacion_de_registro(String firstname, String lastname, String email, String password) {
        registerPage.fillOutRegisterForm(firstname, lastname, email, password);
        registerPage.clickRegisterButton();
    }

    @Entonces("el visitante deberia tener su cuenta creada")
    public void el_visitante_deberia_tener_su_cuenta_creada() {
        // assertion
    }

    @Dado("el visitante está en la página de registro {string}")
    public void el_visitante_está_en_la_página_de_registro(String string) {
        
    }

    @Cuando("el visitante ingresa una contraseña débil {string}")
    public void el_visitante_ingresa_una_contraseña_débil(String string) {
        
    }

    @Entonces("el sistema muestra un mensaje indicando que la contraseña no cumple con los requisitos")
    public void el_sistema_muestra_un_mensaje_indicando_que_la_contraseña_no_cumple_con_los_requisitos() {
        
    }

    @Cuando("el visitante completa el formulario con un correo ya registrado {string} {string} {string} {string}")
    public void el_visitante_completa_el_formulario_con_un_correo_ya_registrado(String string, String string2, String string3, String string4) {
        
    }

    @Entonces("el sistema debe mostrar un mensaje indicando que el correo ya está registrado")
    public void el_sistema_debe_mostrar_un_mensaje_indicando_que_el_correo_ya_está_registrado() {
        
    }

    @Cuando("el visitante ingresa un email inválido {string}")
    public void el_visitante_ingresa_un_email_inválido(String string) {
        
    }

    @Entonces("el sistema muestra un mensaje de error sobre el formato del email")
    public void el_sistema_muestra_un_mensaje_de_error_sobre_el_formato_del_email() {
        
    }

    @Cuando("el visitante intenta registrar sin completar los campos obligatorios")
    public void el_visitante_intenta_registrar_sin_completar_los_campos_obligatorios() {
        
    }

    @Entonces("el sistema muestra mensajes de error indicando los campos requeridos")
    public void el_sistema_muestra_mensajes_de_error_indicando_los_campos_requeridos() {
        
    }

}
