package com.librerianacional.PageObjects;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://librerianacional.com/")
public class PaginaUsuarioPageObject extends PageObject {

    By txtBarraDeBusqueda = By.xpath("(//input[@formcontrolname='buscar'])[2]");
    By btnSeleccionarLibro = By.xpath("//a[@class='d-block w-100 h-100']");
    By btnAñadirCarrito = By.xpath("//button[text()='Añadir al carrito']");
    By btnVerCarrito = By.xpath("//button[text()='Ver Carrito de Compras']");
    By btnSumarlibro = By.xpath("//button[@data-dir='up']");

    public By getTxtBarraDeBusqueda() {
        return txtBarraDeBusqueda;
    }

    public By getBtnSeleccionarLibro() {
        return btnSeleccionarLibro;
    }

    public By getBtnAñadirCarrito() {
        return btnAñadirCarrito;
    }

    public By getBtnVerCarrito() {
        return btnVerCarrito;
    }

    public By getBtnSumarlibro() {
        return btnSumarlibro;
    }

}
