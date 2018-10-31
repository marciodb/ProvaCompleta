package provaautomacao.pageobjects;

import provaautomacao.utils.BasePageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class ShippingPageObject extends BasePageObject {

    public ShippingPageObject(WebDriver navegador) {
        super(navegador);
    }


    public WebElement getCheckBox(WebDriver navegador) {

        return navegador.findElement(By.id("uniform-cgv"));


    }

    public WebElement getProceedToCheckout(WebDriver navegador) {

        return navegador.findElement(By.name("processCarrier"));
    }
}