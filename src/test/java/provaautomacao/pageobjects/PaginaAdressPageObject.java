package provaautomacao.pageobjects;

import provaautomacao.utils.BasePageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class PaginaAdressPageObject extends BasePageObject {

    public PaginaAdressPageObject(WebDriver navegador) {
        super(navegador);
    }

    public WebElement getProceedToCheckout(WebDriver navegador) {

        return this.navegador.findElement(By.name("processAddress"));

    }


}