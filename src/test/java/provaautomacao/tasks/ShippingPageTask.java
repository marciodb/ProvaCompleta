package provaautomacao.tasks;

import provaautomacao.pageobjects.ShippingPageObject;
import org.openqa.selenium.WebDriver;


public class ShippingPageTask {

    private WebDriver navegador;
    public ShippingPageObject buttonProceedToCheckout;
    public ShippingPageObject marcarCheckBox;

    public ShippingPageTask(WebDriver navegador) {
        this.navegador = navegador;
        this.buttonProceedToCheckout = new ShippingPageObject(navegador);
        this.marcarCheckBox = new ShippingPageObject(navegador);
    }

    public void marcarCheckBox() {

        this.marcarCheckBox.getCheckBox(navegador).click();


    }

    public void clicarBotao() {
        this.buttonProceedToCheckout.getProceedToCheckout(navegador).click();
    }

}
