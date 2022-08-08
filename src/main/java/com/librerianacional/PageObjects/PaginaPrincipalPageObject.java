package com.librerianacional.PageObjects;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import java.security.PrivateKey;

@DefaultUrl("https://librerianacional.com/")
public class PaginaPrincipalPageObject extends PageObject {

    private By btnCuenta = By.xpath("(//button[@id='dropdownMenuLogin'])[2]");
    private By btnRegistrarme = By.xpath("(//a[@href='/usuario/registrarme'])[2]");
    private By txtCorreoElectronico = By.id("email");
    private By txtNombre = By.id("nombres");
    private By txtApellido = By.id("apellidos");
    private By lstTipoDocumento = By.xpath("//select/option[@value='CC']");
    private By txtNumIdentificacion = By.id("identificacion");
    private By txtTelefono = By.id("telefono_movil");
    private By txtFijo = By.id("telefono");
    private By txtContraseña = By.id("contrasena");
    private By txtConfirmarContraseña = By.id("repeatContrasena");
    private By chkTerminosYCondiciones = By.id("terminosCondiciones");
    private By btnCompletarRegistro = By.xpath("//button[.='Registrarme']");
    private By btnIniciarSesion = By.xpath("//a[@href='/usuario/ingresar']");
    private By btnIngresarConMailContraseña = By.xpath("//a[@href='/usuario/iniciar-sesion']");
    private By txtCorreoLogueado = By.name("usuario");
    private By txtContraseñaLogueado = By.name("contrasena");
    private By btnIniciarSesionLogueado = By.xpath("//button[@type='submit']");
    private By btnInicioSesion = By.xpath("(//a[@href='/usuario/ingresar'])[2]");


    public By getBtnCuenta() {
        return btnCuenta;
    }

    public By getBtnRegistrarme() {
        return btnRegistrarme;
    }

    public By getTxtCorreoElectronico() {
        return txtCorreoElectronico;
    }

    public By getTxtNombre() {
        return txtNombre;
    }

    public By getTxtApellido() {
        return txtApellido;
    }

    public By getLstTipoDocumento() {
        return lstTipoDocumento;
    }

    public By getTxtNumIdentificacion() {
        return txtNumIdentificacion;
    }

    public By getTxtTelefono() {
        return txtTelefono;
    }

    public By getTxtFijo() {
        return txtFijo;
    }

    public By getTxtContraseña() {
        return txtContraseña;
    }

    public By getTxtConfirmarContraseña() {
        return txtConfirmarContraseña;
    }

    public By getChkTerminosYCondiciones() {
        return chkTerminosYCondiciones;
    }

    public By getBtnCompletarRegistro() {
        return btnCompletarRegistro;
    }

    public By getBtnIniciarSesion() {
        return btnIniciarSesion;
    }

    public By getBtnIngresarConMailContraseña() {
        return btnIngresarConMailContraseña;
    }

    public By getTxtCorreoLogueado() {
        return txtCorreoLogueado;
    }

    public By getTxtContraseñaLogueado() {
        return txtContraseñaLogueado;
    }

    public By getBtnIniciarSesionLogueado() {
        return btnIniciarSesionLogueado;
    }

    public By getBtnInicioSesion() {
        return btnInicioSesion;
    }
}
