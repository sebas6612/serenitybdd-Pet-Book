package co.com.devco.stepdefinitions;

import co.com.devco.questions.ResultadoFiltro;
import co.com.devco.tasks.FiltrarTodasLasMascotas;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class FiltrarTodoStepDefinitions {

    @Cuando("^(.*) filtra por (.*)$")
    public void FiltrarPetBookRunner(String actor, String palabra) {
        theActorCalled(actor).attemptsTo(
                FiltrarTodasLasMascotas.All(palabra)
        );
    }

    @Entonces("^debe ver el primer resultado (.*)$")
    public void debeVerElPrimerResultado(String resultado) {
        theActorInTheSpotlight().should(seeThat(
                ResultadoFiltro.es(resultado))
        );
    }
}
