package com.mesaj.automation.citrus.simulator;

import com.consol.citrus.simulator.scenario.AbstractSimulatorScenario;
import com.consol.citrus.simulator.scenario.Scenario;
import com.consol.citrus.simulator.scenario.ScenarioDesigner;
import com.consol.citrus.simulator.scenario.ScenarioRunner;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Scenario("Hello")
    @RequestMapping(value = "/services/rest/v1/hello", method = RequestMethod.POST)
public class HelloScenario extends AbstractSimulatorScenario {

    @Override
    public void run(ScenarioRunner scenario) {
       // scenario.echo("Simulator: ${simulator.name}");

        scenario
                .http()
                .receive(builder -> builder
                        .post()
                        .payload("<Hello xmlns=\"http://citrusframework.org/schemas/hello\">" +
                                "Say Hello!" +
                                "</Hello>")
                        //.extractFromPayload("//hello:Hello", "greeting")
                );

       // scenario.echo("Received greeting: ${greeting}");

        scenario
                .http()
                .send((builder -> builder
                        .response(HttpStatus.OK)
                        .payload("<HelloResponse xmlns=\"http://citrusframework.org/schemas/hello\">" +
                                "Hi there!" +
                                "</HelloResponse>"))
                );
    }
}

