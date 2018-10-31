package provaautomacao.tasks;

import provaautomacao.pageobjects.ProcedeParaCadastroObject;
import org.openqa.selenium.WebDriver;

public class ProcedeParaCadastroTask {
    private WebDriver navegador;
    public ProcedeParaCadastroObject buttonProceedToCheckout;

    public ProcedeParaCadastroTask(WebDriver navegador) {
        this.navegador = navegador;
        this.buttonProceedToCheckout = new ProcedeParaCadastroObject(navegador);
    }

    public void clicarBotao() {
        this.buttonProceedToCheckout.getProceedToCheckout(navegador).click();
    }
}