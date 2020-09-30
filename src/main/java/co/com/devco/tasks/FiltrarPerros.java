package co.com.devco.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

import static co.com.devco.userinterfaces.PetBookPage.BOTON_PERROS;
import static co.com.devco.userinterfaces.PetBookPage.PET_BOOK_HOME_PAGE;
import static co.com.devco.userinterfaces.PetBookResultadosPage.RESULTADOS_FILTRO;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class FiltrarPerros implements Task {
    private String filtro;

    public FiltrarPerros(String filtro) {
        this.filtro = filtro;
    }

    public static Performable Perro(String filtro) {
        return instrumented(FiltrarPerros.class, filtro);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.url(PET_BOOK_HOME_PAGE),
                Hit.the(Keys.ENTER).into(BOTON_PERROS),
                WaitUntil.the(RESULTADOS_FILTRO, isVisible())
        );
    }
}
