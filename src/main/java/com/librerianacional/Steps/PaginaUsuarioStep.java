package com.librerianacional.Steps;


import com.librerianacional.Models.Scroll;
import com.librerianacional.PageObjects.PaginaUsuarioPageObject;
import net.thucydides.core.annotations.Step;

public class PaginaUsuarioStep {
    PaginaUsuarioPageObject paginaUsuarioPageObject = new PaginaUsuarioPageObject();
    Scroll scroll = new Scroll();

    @Step
    public void buscarLibro(){
        paginaUsuarioPageObject.getDriver().findElement(paginaUsuarioPageObject.getTxtBarraDeBusqueda()).sendKeys("Android Manual Práctico para todos los Niveles");
        paginaUsuarioPageObject.getDriver().findElement(paginaUsuarioPageObject.getTxtBarraDeBusqueda()).submit();
    }
    @Step
    public void seleccionarLibro(){
        scroll.scrollElemento(paginaUsuarioPageObject.getDriver(), paginaUsuarioPageObject.getBtnSeleccionarLibro());
        paginaUsuarioPageObject.getDriver().findElement(paginaUsuarioPageObject.getBtnSeleccionarLibro()).click();
    }
    @Step
    public void añadirCarrito(){
        paginaUsuarioPageObject.getDriver().findElement(paginaUsuarioPageObject.getBtnAñadirCarrito()).click();
        paginaUsuarioPageObject.getDriver().findElement(paginaUsuarioPageObject.getBtnVerCarrito()).click();
        paginaUsuarioPageObject.getDriver().findElement(paginaUsuarioPageObject.getBtnSumarlibro()).click();

    }
}
