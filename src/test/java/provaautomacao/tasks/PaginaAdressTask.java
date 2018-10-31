package provaautomacao.tasks;

import provaautomacao.pageobjects.PaginaAdressPageObject;
import org.openqa.selenium.WebDriver;

public class PaginaAdressTask {

    private WebDriver navegador;
    public PaginaAdressPageObject buttonProceedToCheckout;

    public PaginaAdressTask(WebDriver navegador) {
        this.navegador = navegador;
        this.buttonProceedToCheckout = new PaginaAdressPageObject(navegador);
    }

    public void clicarBotao() {
        this.buttonProceedToCheckout.getProceedToCheckout(navegador).click();
    }
}