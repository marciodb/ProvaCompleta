package provaautomacao.verificationpoints;

import provaautomacao.utils.BasePageObject;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ConfirmacaoDoProdutoVerificationPoint extends BasePageObject {

    public ConfirmacaoDoProdutoVerificationPoint(WebDriver navegador) {
        super(navegador);
    }

    public String getTitulo() {

        String titulo;
        titulo = navegador.findElement(By.linkText("Faded Short Sleeve T-shirts")).getText();
        Assert.assertEquals(titulo, "Faded Short Sleeve T-shirts");

        return titulo;
    }
}