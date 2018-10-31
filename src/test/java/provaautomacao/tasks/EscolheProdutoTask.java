package provaautomacao.tasks;

import org.openqa.selenium.WebDriver;
import provaautomacao.pageobjects.EscolheProdutoObject;

public class EscolheProdutoTask {

    private WebDriver navegador;
    public EscolheProdutoObject produtoPageObject;

    public EscolheProdutoTask(WebDriver navegador) {
        this.navegador = navegador;
        this.produtoPageObject = new EscolheProdutoObject(this.navegador);
    }

    public void clicarImagem() {
        this.produtoPageObject.imagemDoProduto(navegador).click();
        //navegador.findElement(By.linkText("Faded Short Sleeve T-shirts")).click();
    }
}