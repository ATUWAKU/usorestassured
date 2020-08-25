package co.com.bancolombia.consumoServicios.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/consumoApi.feature",
        glue = "co.com.bancolombia.consumoServicios.stepDefinitions",
        snippets = SnippetType.CAMELCASE
)

public class ConsumoApiRunner {
}
