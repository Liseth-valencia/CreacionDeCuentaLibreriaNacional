package com.librerianacional.StepDefinitions;

import com.librerianacional.Steps.PaginaPrincipalStep;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.thucydides.core.annotations.Steps;

public class LoginStepDefinition {
    @Steps
    PaginaPrincipalStep paginaPrincipalStep;

    @Dado("^el usuario se encuentre en la pagina$")
    public void elUsuarioSeEncuentreEnLaPagina() {
        paginaPrincipalStep.abrirNavegador();
    }

    @Cuando("^el presione el boton mi cuenta y luego da a registrarse$")
    public void elPresioneElBotonMiCuentaYLuegoDaARegistrarse() {
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
