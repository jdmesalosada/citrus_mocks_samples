package com.mesaj.automation.citrus.simulator;

import com.consol.citrus.simulator.scenario.AbstractSimulatorScenario;
import com.consol.citrus.simulator.scenario.Scenario;
import com.consol.citrus.simulator.scenario.ScenarioDesigner;
import org.springframework.core.io.ClassPathResource;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Scenario("GET_USER")
@RequestMapping(value = "/services/rest/v1/username/{username}", method = RequestMethod.GET)
public class GetUserScenario extends AbstractSimulatorScenario {

    @Override
    public void run(ScenarioDesigner scenario) {

        scenario
                .http()
                .receive()
                .get();

        scenario
                .http()
                .send()
                .response(HttpStatus.OK)
                .payload(new ClassPathResource("random-user.json"));
    }
}