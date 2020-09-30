package co.com.devco.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PetBookPage {
	public static final String PET_BOOK_HOME_PAGE = "http://localhost:4200/";
	public static final Target BOTON_ALL = Target.the("All").located(By.id("btnAll"));
	public static final Target BOTON_PERROS = Target.the("Perro").located(By.id("btnPerros"));
	public static final Target BOTON_GATOS = Target.the("Gato").located(By.id("btnGatos"));
}
