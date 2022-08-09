package com.librerianacional.StepDefinitions;

import com.librerianacional.Steps.PaginaPrincipalStep;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.thucydides.core.annotations.Steps;

public class LoginStepDefinition {
    @Steps
    PaginaPrincipalStep paginaPrincipalStep;

    @Dado("^el usuario se encuentre en la pagina web$")
    public void el_usuario_se_encuentre_en_la_pagina_web() {
        paginaPrincipalStep.abrirNavegador();
    }

    @Cuando("^el presione el boton mi cuenta para registrarse$")
    public void el_presione_el_boton_mi_cuenta_para_registrarse() {
        paginaPrincipalStep.clicMiCuenta();
    }
    @Cuando("^debera llenar un formulario de datos personales$")
    public void deberaLlenarUnFormularioDeDatosPersonales() {
        paginaPrincipalStep.llenarFormulario();
    }

    @Entonces("^el registro sera exitoso$")
    public void elRegistroSeraExitoso() {
        paginaPrincipalStep.registroExitoso();
    }
}
