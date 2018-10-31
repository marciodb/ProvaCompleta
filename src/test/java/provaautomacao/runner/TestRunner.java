package provaautomacao.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(format = {"json:target/REPORT_NAME.json", "pretty",
        "html:target/HTML_REPORT_NAME", "json:json_output/cucumber.json", "junit:junit_xml/cucumber.xml"},
        features = "src/test/java/provaautomacao/features/ComprarProduto.feature/",
        glue = {""}
)

public class TestRunner {
//Aqui vai meus reports! / @Before @After etc
}