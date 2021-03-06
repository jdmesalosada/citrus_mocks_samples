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
        scenario.http()
                .receive(con -> con.post().contentType("application/xml;charset=UTF-8")
                .extractFromPayload("/Hello/user", "userName"));


        scenario.http()
                .send( builder -> builder.response()
                        .statusCode(200)
                        .payload("<HelloResponse xmlns=\"http://citrusframework.org/schemas/hello\">" +
                                "<text>Hi there ${userName}!</text>" +
                                "</HelloResponse>"));

    }
}

