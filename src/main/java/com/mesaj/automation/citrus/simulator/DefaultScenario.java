package com.mesaj.automation.citrus.simulator;

import com.consol.citrus.http.message.HttpMessage;
import com.consol.citrus.simulator.scenario.*;
import org.springframework.http.HttpStatus;

/*@Scenario("DEFAULT_SCENARIO")
public class DefaultScenario extends AbstractSimulatorScenario {

    @Override
    public void run(ScenarioDesigner designer) {
        designer.echo("Default scenario executed!");

        designer.send()
                .message(new HttpMessage("Welcome to the Citrus simulator")
                        .status(HttpStatus.OK));
    }
}*/

//citrus.simulator.defaultScenario=Default -> application.properties
@Scenario("Default")
public class DefaultScenario extends AbstractSimulatorScenario {

    @Override
    public void run(ScenarioRunner scenario) {
        scenario
                .http()
                .receive((builder -> builder.post()));

        scenario
                .http()
                .send((builder -> builder
                        .response(HttpStatus.OK)
                        .payload("<DefaultResponse>This is a default response Julian!</DefaultResponse>"))
                );
    }
}