package provaautomacao.tasks;

import provaautomacao.pageobjects.ProcedeParaCheckoutObject;
import org.openqa.selenium.WebDriver;

public class ProcedeParaCheckoutTask {

    private WebDriver navegador;
    public ProcedeParaCheckoutObject buttonAddToCart;

    public ProcedeParaCheckoutTask(WebDriver navegador) {
        this.navegador = navegador;
        this.buttonAddToCart = new ProcedeParaCheckoutObject(navegador);
    }

    public void clicarBotao() {
        this.buttonAddToCart.getProceedToCheckout(navegador).click();
    }
}