package provaautomacao.utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class TestBase {

    public static WebDriver createChrome() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\marciod\\drivers\\chromedriver.exe");
        WebDriverManager.chromedriver().setup();
        WebDriver navegador = new ChromeDriver();
        navegador.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        navegador.manage().window().maximize();
        navegador.get("http://www.automationpractice.com");

        return navegador;
    }

    public static WebDriver createFirefox() {
        //System.setProperty("webdriver.chrome.driver", "C:\Users\marciod\drivers\chromedriver.exe");
        WebDriverManager.firefoxdriver().setup();
        ;
        WebDriver navegador = new FirefoxDriver();
        navegador.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        navegador.manage().window().maximize();
        navegador.get("http://www.automationpractice.com");

        return navegador;
    }
}