package provaautomacao.tasks;

import org.openqa.selenium.WebDriver;
import provaautomacao.pageobjects.AdicionaNoCarrinhoObject;

public class AdicionaNoCarrinhoTask {
    private WebDriver navegador;
    public AdicionaNoCarrinhoObject buttonAddToCart;

    public AdicionaNoCarrinhoTask(WebDriver navegador) {
        this.navegador = navegador;
        this.buttonAddToCart = new AdicionaNoCarrinhoObject(navegador);
    }

    public void clicarBotao() {
        this.buttonAddToCart.getAddToCartButton(navegador).click();
    }
}