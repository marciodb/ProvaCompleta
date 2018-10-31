package provaautomacao.verificationpoints;

import provaautomacao.utils.BasePageObject;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PaginaAdressVerificationPoint extends BasePageObject {

    public PaginaAdressVerificationPoint(WebDriver navegador) {
        super(navegador);
    }

    public String getAdress() {

        String titulo;
        titulo = navegador.findElement(By.xpath("//ul[@id='address_delivery']//li[@class='address_address1 address_address2'][contains(text(),'Avenida Ipiranga, número 17 Próximo a PUCRS')]")).getText();
        Assert.assertEquals(titulo, "Avenida Ipiranga, número 17 Próximo a PUCRS");

        return titulo;
    }
}
