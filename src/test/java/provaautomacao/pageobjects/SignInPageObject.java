package provaautomacao.pageobjects;

import provaautomacao.utils.BasePageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignInPageObject extends BasePageObject {

    public SignInPageObject(WebDriver navegador) {
        super(navegador);
    }

    public WebElement setEmailAdress(WebDriver navegador) {
        navegador.findElement(By.id("email_create")).clear();
        return navegador.findElement(By.id("email_create"));
    }

    public WebElement getSubmitCreateButton(WebDriver navegador) {

        return navegador.findElement(By.id("SubmitCreate"));
    }

    public WebElement getRadioButton(WebDriver navegador) {

        return navegador.findElement(By.id("id_gender1"));
    }

    public WebElement setFirstCustomerName(WebDriver navegador) {

        return navegador.findElement(By.id("customer_firstname"));
    }

    public WebElement setLastCustomerName(WebDriver navegador) {

        return navegador.findElement(By.id("customer_lastname"));
    }

    public WebElement setEmail(WebDriver navegador) {
        navegador.findElement(By.id("email")).clear();
        return navegador.findElement(By.id("email"));
    }

    public WebElement setPasswd(WebDriver navegador) {

        return navegador.findElement(By.id("passwd"));
    }

    public WebElement comboDay(WebDriver navegador) {

        return navegador.findElement(By.id("days"));
    }

    public WebElement comboMonth(WebDriver navegador) {

        return navegador.findElement(By.id("months"));
    }

    public WebElement comboYear(WebDriver navegador) {

        return navegador.findElement(By.id("years"));
    }

    public WebElement setFirstName(WebDriver navegador) {

        return navegador.findElement(By.id("firstname"));
    }

    public WebElement setLastName(WebDriver navegador) {

        return navegador.findElement(By.id("lastname"));
    }

    public WebElement setCompany(WebDriver navegador) {

        return navegador.findElement(By.id("company"));
    }

    public WebElement setAdress(WebDriver navegador) {

        return navegador.findElement(By.id("address1"));
    }

    public WebElement setAdress2(WebDriver navegador) {

        return navegador.findElement(By.id("address2"));
    }

    public WebElement setCity(WebDriver navegador) {

        return navegador.findElement(By.id("city"));
    }

    public WebElement comboState(WebDriver navegador) {

        return navegador.findElement(By.id("id_state"));
    }

    public WebElement setPostalCode(WebDriver navegador) {

        return navegador.findElement(By.id("postcode"));
    }

    public WebElement setComboCountry(WebDriver navegador) {

        return navegador.findElement(By.id("id_country"));
    }

    public WebElement setAdditionalInformation(WebDriver navegador) {

        return navegador.findElement(By.id("other"));
    }

    public WebElement setHomePhone(WebDriver navegador) {

        return navegador.findElement(By.id("phone"));
    }

    public WebElement setMobilePhone(WebDriver navegador) {

        return navegador.findElement(By.id("phone_mobile"));
    }

    public WebElement setAdressAlias(WebDriver navegador) {
        navegador.findElement(By.id("alias")).clear();
        return navegador.findElement(By.id("alias"));
    }

    public WebElement getRegisterButton(WebDriver navegador) {

        return navegador.findElement(By.id("submitAccount"));
    }

}