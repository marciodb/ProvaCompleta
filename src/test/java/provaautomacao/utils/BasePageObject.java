package provaautomacao.utils;

import org.openqa.selenium.WebDriver;

public class BasePageObject {
    //protected para que as classes filhas possam utilizar esse atributo, matando o problema de repetição.
    protected WebDriver navegador;

    public BasePageObject(WebDriver navegador) {
        this.navegador = navegador;
    }
}