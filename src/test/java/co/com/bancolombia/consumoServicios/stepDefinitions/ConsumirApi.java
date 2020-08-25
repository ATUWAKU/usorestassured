package co.com.bancolombia.consumoServicios.stepDefinitions;

import co.com.bancolombia.consumoServicios.tasks.Consultar;
import cucumber.api.java.Before;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;

import static net.serenitybdd.screenplay.actors.OnStage.aNewActor;

public class ConsumirApi {

    Actor chami;

    @Before
    public void setUp(){
        OnStage.setTheStage(OnlineCast.whereEveryoneCan(CallAnApi.at("http://sonar.bancolombia.corp/sonarbc/")));

    }

    @When("^Consulto API sonar$")
    public void consulto_API_sonar() {

        aNewActor().attemptsTo(
                Consultar.proyectosSonar()
        );

    }
}
