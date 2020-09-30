package co.com.devco.stepdefinitions;

import co.com.devco.questions.ResultadoFiltro;
import co.com.devco.tasks.FiltrarPerros;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class FiltrarPerrosStepDefinitions {

    @Cuando("^(.*) filtra todos los (.*)$")
    public void FiltrarPetBookRunner(String actor, String palabra) {
        theActorCalled(actor).attemptsTo(
                FiltrarPerros.Perro(palabra)
        );
    }

    @Entonces("^debe ver un Perro el primer resultado (.*)$")
    public void debeVerElPrimerResultadoUnPerro(String resultado) {
        theActorInTheSpotlight().should(seeThat(
                ResultadoFiltro.es(resultado))
        );
    }
}
