package co.com.devco.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Attribute;

import static co.com.devco.userinterfaces.PetBookResultadosPage.RESULTADOS_FILTRO;

public class ResultadoFiltro implements Question<Boolean> {
    private String resultado;

    public ResultadoFiltro(String resultado){
        this.resultado = resultado;
    }

    public static ResultadoFiltro es(String resultado){
        return new ResultadoFiltro(resultado);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        String resultadoEncontrado = Attribute.of(RESULTADOS_FILTRO).named("href").viewedBy(actor).asString();
        return resultadoEncontrado.contains(resultado);
    }
}
