package mobile;

import io.cucumber.java.Scenario;

import java.nio.channels.SelectionKey;

public class ManageScenario {
    private static Scenario scenario;
    public static Scenario getScenario() {
        return scenario;
    }

    public static void setScenario(Scenario scenario){
        ManageScenario.scenario=scenario;
    }
}
