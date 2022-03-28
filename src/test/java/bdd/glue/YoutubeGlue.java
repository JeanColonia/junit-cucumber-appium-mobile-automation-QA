package bdd.glue;

import bdd.step.YoutubeStep;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import mobile.ManageScenario;
import mobile.MobileDriverManager;
import mobile.Util;
import org.junit.jupiter.api.Assertions;

public class YoutubeGlue {

    private YoutubeStep youtubeStep;
    private Scenario scenario;
    @Before
    public void beforeScenario(Scenario scenario) {
        this.scenario = scenario;
        ManageScenario.setScenario(this.scenario);
        youtubeStep = new YoutubeStep();
    }

    @After
    public void afterScenario() {
        if(this.scenario.isFailed())
            Util.takeScreeShot();
        MobileDriverManager.quitDriver();
    }

    @Dado("que me encuentro en la aplicacion de youtube")
    public void que_me_encuentro_en_la_aplicacion_de_youtube(){
    MobileDriverManager.setMobileDriver();
    }

    @Cuando("busco el video {string}")
    public void busco_el_video(String video) {
        youtubeStep.searchVideo(video);
        Util.takeScreeShot();
    }
    @Entonces("deberia obtener mas de un resultado")
    public void deberia_obtener_mas_de_un_resultado(){
        Assertions.assertTrue(youtubeStep.getSizeResult() > 0, "El tamaño de la lista es igual a 0.");

    }



}
