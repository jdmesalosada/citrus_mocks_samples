package com.mesaj.automation.citrus.simulator;


import com.consol.citrus.simulator.scenario.AbstractSimulatorScenario;
import com.consol.citrus.simulator.scenario.Scenario;
import com.consol.citrus.simulator.scenario.ScenarioRunner;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Scenario("ExtractParameter")
@RequestMapping(value = "/services/rest/v1/extractParameter", method = RequestMethod.POST)
public class ExtractParameterScenario extends AbstractSimulatorScenario {

    @Override
    public void run(ScenarioRunner scenario) {
        scenario
                .http()
                .receive(con -> con.post().extractFromPayload("$.username", "userName"));

        scenario.http().send(builder -> builder.response()
                .statusCode(200).payload("${userName}"));

    }
}
