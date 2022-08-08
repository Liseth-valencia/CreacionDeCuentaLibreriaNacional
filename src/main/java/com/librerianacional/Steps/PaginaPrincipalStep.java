package com.librerianacional.Steps;

import com.librerianacional.Models.Scroll;
import com.librerianacional.PageObjects.PaginaPrincipalPageObject;
import net.thucydides.core.annotations.Step;

public class PaginaPrincipalStep {

    PaginaPrincipalPageObject paginaPrincipalPageObject = new PaginaPrincipalPageObject();
    Scroll scroll = new Scroll();

    @Step
    public void abrirNavegador(){
        paginaPrincipalPageObject.open();
    }
    @Step
    public void clicMiCuenta(){
        paginaPrincipalPageObject.getDriver().findElement(paginaPrincipalPageObject.getBtnCuenta()).click();
        paginaPrincipalPageObject.getDriver().findElement(paginaPrincipalPageObject.getBtnRegistrarme()).click();
    }
    @Step
    public void llenarFormulario(){
        paginaPrincipalPageObject.getDriver().findElement(paginaPrincipalPageObject.getTxtCorreoElectronico()).sendKeys("madnesalio@gmail.com");
        paginaPrincipalPageObject.getDriver().findElement(paginaPrincipalPageObject.getTxtNombre()).sendKeys("Liseth Tatiana");
        paginaPrincipalPageObject.getDriver().findElement(paginaPrincipalPageObject.getTxtApellido()).sendKeys("Valencia Pelaez");
        paginaPrincipalPageObject.getDriver().findElement(paginaPrincipalPageObject.getLstTipoDocumento()).click();
        paginaPrincipalPageObject.getDriver().findElement(paginaPrincipalPageObject.getTxtNumIdentificacion()).sendKeys("27374878847");
        paginaPrincipalPageObject.getDriver().findElement(paginaPrincipalPageObject.getTxtTelefono()).sendKeys("3224802250");
        paginaPrincipalPageObject.getDriver().findElement(paginaPrincipalPageObject.getTxtFijo()).sendKeys("5441008");
        paginaPrincipalPageObject.getDriver().findElement(paginaPrincipalPageObject.getTxtContraseña()).sendKeys("t647737P.");
        paginaPrincipalPageObject.getDriver().findElement(paginaPrincipalPageObject.getTxtConfirmarContraseña()).sendKeys("t647737P.");
        paginaPrincipalPageObject.getDriver().findElement(paginaPrincipalPageObject.getChkTerminosYCondiciones()).click();
        paginaPrincipalPageObject.getDriver().findElement(paginaPrincipalPageObject.getBtnCompletarRegistro()).click();
    }
    @Step
    public void registroExitoso(){
        scroll.scrollElemento(paginaPrincipalPageObject.getDriver(), paginaPrincipalPageObject.getBtnIniciarSesion());
        paginaPrincipalPageObject.getDriver().findElement(paginaPrincipalPageObject.getBtnIniciarSesion()).click();
        paginaPrincipalPageObject.getDriver().findElement(paginaPrincipalPageObject.getBtnIngresarConMailContraseña()).click();
        paginaPrincipalPageObject.getDriver().findElement(paginaPrincipalPageObject.getTxtCorreoLogueado()).sendKeys("madnesalio@gmail.com");
        paginaPrincipalPageObject.getDriver().findElement(paginaPrincipalPageObject.getTxtContraseñaLogueado()).sendKeys("t647737P.");
        paginaPrincipalPageObject.getDriver().findElement(paginaPrincipalPageObject.getBtnIniciarSesionLogueado()).click();
    }
    @Step
    public void ingresoPagina(){
        paginaPrincipalPageObject.getDriver().findElement(paginaPrincipalPageObject.getBtnCuenta()).click();
        paginaPrincipalPageObject.getDriver().findElement(paginaPrincipalPageObject.getBtnInicioSesion()).click();
        paginaPrincipalPageObject.getDriver().findElement(paginaPrincipalPageObject.getBtnIngresarConMailContraseña()).click();
        paginaPrincipalPageObject.getDriver().findElement(paginaPrincipalPageObject.getTxtCorreoLogueado()).sendKeys("madnesalio@gmail.com");
        paginaPrincipalPageObject.getDriver().findElement(paginaPrincipalPageObject.getTxtContraseñaLogueado()).sendKeys("t647737P.");
        paginaPrincipalPageObject.getDriver().findElement(paginaPrincipalPageObject.getBtnIniciarSesionLogueado()).click();
    }
}
