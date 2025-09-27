package com.magento.steps;

import com.magento.factory.SessionPage;
import com.magento.utils.DriverManager;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;

public class SesionStep extends DriverManager {

    SessionPage sessionPage = new SessionPage(getDriver());

    @Dado("el usuario esta en la pagina de inicio de session {string}")
    public void el_usuario_esta_en_la_pagina_de_inicio_de_session(String url) {
        getDriver().get(url);
    }

    @Cuando("el usuario ingresa su {string} y {string} validos")
    public void el_usuario_ingresa_su_y_validos(String correo, String clave) {
        sessionPage.doLogin(correo,clave);
    }

    @Entonces("el usuario deberia visualizar el panel de control")
    public void el_usuario_deberia_visualizar_el_panel_de_control() {
        //assertion
    }

    @Cuando("el usuario ingresa sus credenciales validas")
    public void el_usuario_ingresa_sus_credenciales_validas(io.cucumber.datatable.DataTable dataTable) {
        //complete
    }
    @Dado("el usuario está en la página de inicio de sesión {string}")
    public void el_usuario_está_en_la_página_de_inicio_de_sesión(String string) {
        
    }

    @Cuando("el usuario intenta iniciar sesión sin completar los campos")
    public void el_usuario_intenta_iniciar_sesión_sin_completar_los_campos() {
        
    }

    @Cuando("el usuario ingresa su correo {string} y una clave incorrecta {string}")
    public void el_usuario_ingresa_su_correo_y_una_clave_incorrecta(String string, String string2) {
        
    }

    @Entonces("el sistema muestra mensajes indicando los campos obligatorios")
    public void el_sistema_muestra_mensajes_indicando_los_campos_obligatorios() {
        
    }

    @Cuando("el usuario selecciona la opción {string}")
    public void el_usuario_selecciona_la_opción(String string) {
        
    }

    @Entonces("el sistema muestra un mensaje indicando que el usuario o contraseña son incorrectos")
    public void el_sistema_muestra_un_mensaje_indicando_que_el_usuario_o_contraseña_son_incorrectos() {
        
    }

    @Cuando("ingresa su correo {string} para restablecer")
    public void ingresa_su_correo_para_restablecer(String string) {
        
    }

    @Entonces("el sistema envía un correo para recuperación de contraseña")
    public void el_sistema_envía_un_correo_para_recuperación_de_contraseña() {
        
    }

}
