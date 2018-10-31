package provaautomacao.verificationpoints;

import provaautomacao.utils.BasePageObject;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PaginaDescricaoVerificationPoint extends BasePageObject {

    public PaginaDescricaoVerificationPoint(WebDriver navegador) {
        super(navegador);
    }

    public String getTitulo() {

        String titulo;
        titulo = navegador.findElement(By.xpath("//h3[contains(text(),'More info')]")).getText();
        Assert.assertEquals(titulo, "MORE INFO");

        return titulo;
    }
}