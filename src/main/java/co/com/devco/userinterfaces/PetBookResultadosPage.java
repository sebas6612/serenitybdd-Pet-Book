package co.com.devco.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PetBookResultadosPage {
    public static final Target RESULTADOS_FILTRO =
            Target.the("resultados de bsuqueda").located(By.xpath("//div/ul/li[1]/a"));
}
