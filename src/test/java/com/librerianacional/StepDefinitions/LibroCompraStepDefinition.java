package com.librerianacional.StepDefinitions;

import com.librerianacional.Steps.PaginaPrincipalStep;
import com.librerianacional.Steps.PaginaUsuarioStep;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.thucydides.core.annotations.Steps;

public class LibroCompraStepDefinition {

    @Steps
    PaginaPrincipalStep paginaPrincipalStep;
    @Steps
    PaginaUsuarioStep paginaUsuarioStep;

    @Dado("^el usuario tenga la sesion iniciada$")
    public void elUsuarioTengaLaSesionIniciada() {
        paginaPrincipalStep.abrirNavegador();
        paginaPrincipalStep.ingresoPagina();
    }

    @Cuando("^busque el libro requerido para agregarlo al carro de compras$")
    public void busqueElLibroRequeridoParaAgregarloAlCarroDeCompras() {
        paginaUsuarioStep.buscarLibro();
        paginaUsuarioStep.seleccionarLibro();
    }

    @Entonces("^visualizara el producto en el carro de compras$")
    public void visualizaraElProductoEnElCarroDeCompras() {
        paginaUsuarioStep.añadirCarrito();
    }

}
