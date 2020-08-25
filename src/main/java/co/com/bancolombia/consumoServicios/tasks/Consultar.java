package co.com.bancolombia.consumoServicios.tasks;

import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.rest.interactions.Get;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Consultar implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Get.resource("api/projects/search?q=AW0998001_BIZTRACK_TEST")
                .with(request -> request.header("Authorization","Basic ZGJhNDk2NjgxN2UzYzhjZDY2NjIxNzUzMWJjNDRhNDVkYWUzMjUwYjo=")
                        .header("Content-Type","application/json")
                )
        );
        SerenityRest.lastResponse().prettyPrint();
    }


    public static Consultar proyectosSonar() {
        return instrumented(Consultar.class);
    }
}
