package com.mesaj.automation.citrus.simulator;

import com.consol.citrus.simulator.scenario.AbstractSimulatorScenario;
import com.consol.citrus.simulator.scenario.Scenario;
import com.consol.citrus.simulator.scenario.ScenarioDesigner;
import com.consol.citrus.simulator.scenario.ScenarioRunner;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Scenario("GoodBye")
@RequestMapping(value = "/services/rest/v1/goodbye", method = RequestMethod.POST)
public class GoodByeScenario extends AbstractSimulatorScenario {

    @Override
    public void run(ScenarioRunner scenario) {

        scenario
                .http()
                .receive((builder -> builder
                        .post()
                        .payload("<GoodBye xmlns=\"http://citrusframework.org/schemas/hello\">" +
                                "Say GoodBye!" +
                                "</GoodBye>"))
                );

        scenario
                .http()
                .send((builder -> builder
                        .response(HttpStatus.OK)
                        .payload("<GoodByeResponse xmlns=\"http://citrusframework.org/schemas/hello\">" +
                                "Bye bye!" +
                                "</GoodByeResponse>"))
                );
    }
}
