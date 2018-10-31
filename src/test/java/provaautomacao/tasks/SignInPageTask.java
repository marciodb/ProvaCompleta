package provaautomacao.tasks;

import provaautomacao.pageobjects.SignInPageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class SignInPageTask {

    private WebDriver navegador;
    public SignInPageObject campoCadastrarEmail, buttonCreateAccount, radioButton, campoCustomerFirstName, campoCustomerLastName, campoPassword,
            comboDay, comboMonth, comboYear, campoFirstName, campoLastName, campoCompany, campoAdress, campoAdress2, campoCity, comboState, campoPostalCode, comboCountry,
            campoAdditionalInformation, campoHomePhone, campoMobilePhone, campoAdressAlias, registerButton;

    public SignInPageTask(WebDriver navegador) {
        this.navegador = navegador;
        this.campoCadastrarEmail = new SignInPageObject(navegador);
        this.buttonCreateAccount = new SignInPageObject(navegador);
        this.radioButton = new SignInPageObject(navegador);
        this.campoCustomerFirstName = new SignInPageObject(navegador);
        this.campoCustomerLastName = new SignInPageObject(navegador);
        this.campoPassword = new SignInPageObject(navegador);
        this.comboDay = new SignInPageObject(navegador);
        this.comboMonth = new SignInPageObject(navegador);
        this.comboYear = new SignInPageObject(navegador);
        this.campoFirstName = new SignInPageObject(navegador);
        this.campoLastName = new SignInPageObject(navegador);
        this.campoCompany = new SignInPageObject(navegador);
        this.campoAdress = new SignInPageObject(navegador);
        this.campoAdress2 = new SignInPageObject(navegador);
        this.campoCity = new SignInPageObject(navegador);
        this.comboState = new SignInPageObject(navegador);
        this.campoPostalCode = new SignInPageObject(navegador);
        this.comboCountry = new SignInPageObject(navegador);
        this.campoAdditionalInformation = new SignInPageObject(navegador);
        this.campoHomePhone = new SignInPageObject(navegador);
        this.campoMobilePhone = new SignInPageObject(navegador);
        this.campoAdressAlias = new SignInPageObject(navegador);
        this.registerButton = new SignInPageObject(navegador);

    }

    public void cadastrarEmail() {

        String SALTCHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        StringBuilder salt = new StringBuilder();
        Random rnd = new Random();

        while (salt.length() < 10) { // length of the random string.
            int index = (int) (rnd.nextFloat() * SALTCHARS.length());
            salt.append(SALTCHARS.charAt(index));
        }
        String saltStr = salt.toString();

        this.campoCadastrarEmail.setEmailAdress(this.navegador).sendKeys(saltStr + "@gmail.com");

    }

    public void clicarBotao() {
        this.buttonCreateAccount.getSubmitCreateButton(navegador).click();
    }

    public void preencherFormulario() {
        this.radioButton.getRadioButton(navegador).click();
        this.campoCustomerFirstName.setFirstCustomerName(navegador).sendKeys("Marcio");
        this.campoCustomerLastName.setLastCustomerName(navegador).sendKeys("Dutra");
        this.campoPassword.setPasswd(navegador).sendKeys("051080");
        this.comboDay.comboDay(navegador).click();
        new Select(comboDay.comboDay(navegador)).selectByValue("5");
        navegador.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        this.comboMonth.comboMonth(navegador).click();
        new Select(comboMonth.comboMonth(navegador)).selectByVisibleText("October ");
        navegador.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        this.comboYear.comboYear(navegador).click();
        new Select(comboYear.comboYear(navegador)).selectByVisibleText("1980  ");
        this.campoCompany.setCompany(navegador).sendKeys("DbServer");
        this.campoAdress.setAdress(navegador).sendKeys("Avenida Ipiranga, número 17");
        this.campoAdress2.setAdress2(navegador).sendKeys("Próximo a PUCRS");
        this.campoCity.setCity(navegador).sendKeys("Porto Alegre");
        this.comboState.comboState(navegador).click();
        new Select(comboState.comboState(navegador)).selectByVisibleText("Alabama");
        this.campoPostalCode.setPostalCode(navegador).sendKeys("29150");
        this.comboCountry.setComboCountry(navegador).click();
        new Select(comboCountry.setComboCountry(navegador)).selectByVisibleText("United States");
        this.campoAdditionalInformation.setAdditionalInformation(navegador).sendKeys("Testando caixa de informação adicional.");
        this.campoHomePhone.setHomePhone(navegador).sendKeys("+555133652487");
        this.campoMobilePhone.setMobilePhone(navegador).sendKeys("+5551995874587");
        this.campoAdressAlias.setAdressAlias(navegador).sendKeys("marciod@dbserver.com.br");
        this.registerButton.getRegisterButton(navegador).click();


    }
}