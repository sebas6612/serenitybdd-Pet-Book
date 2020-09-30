package co.com.devco.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

import static co.com.devco.userinterfaces.PetBookPage.PET_BOOK_HOME_PAGE;
import static co.com.devco.userinterfaces.PetBookPage.*;
import static co.com.devco.userinterfaces.PetBookResultadosPage.RESULTADOS_FILTRO;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class FiltrarTodasLasMascotas implements Task {
    private String filtro;

    public FiltrarTodasLasMascotas(String filtro) {
        this.filtro = filtro;
    }

    public static Performable All(String filtro) {
        return instrumented(FiltrarTodasLasMascotas.class, filtro);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.url(PET_BOOK_HOME_PAGE),
                Hit.the(Keys.ENTER).into(BOTON_ALL),
                WaitUntil.the(RESULTADOS_FILTRO, isVisible())
        );
    }
}
