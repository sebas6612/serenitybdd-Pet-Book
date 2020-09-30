package co.com.devco.stepdefinitions;

import co.com.devco.questions.ResultadoFiltro;
import co.com.devco.tasks.FiltrarGatos;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class FiltrarGatosStepDefinitions {

    @Cuando("^(.*) filtra los (.*)$")
    public void FiltrarPetBookRunner(String actor, String palabra) {
        theActorCalled(actor).attemptsTo(
                FiltrarGatos.Gato(palabra)
        );
    }

    @Entonces("^debe ver un gato en el primer resultado (.*)$")
    public void debeVerElPrimerResultadoUnGato(String resultado) {
        theActorInTheSpotlight().should(seeThat(
                ResultadoFiltro.es(resultado))
        );
    }
}
