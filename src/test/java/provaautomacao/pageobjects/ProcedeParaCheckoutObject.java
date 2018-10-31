package provaautomacao.pageobjects;

import provaautomacao.utils.BasePageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import provaautomacao.utils.BasePageObject;

public class ProcedeParaCheckoutObject extends BasePageObject {

    public ProcedeParaCheckoutObject(WebDriver navegador) {
        super(navegador);
    }

    public WebElement getProceedToCheckout(WebDriver navegador) {

        return navegador.findElement(By.linkText("Proceed to checkout"));
    }
}