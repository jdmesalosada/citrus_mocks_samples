package com.mesaj.automation.citrus.simulator;

import com.consol.citrus.container.Template;
import com.consol.citrus.simulator.scenario.AbstractSimulatorScenario;
import com.consol.citrus.simulator.scenario.Scenario;
import com.consol.citrus.simulator.scenario.ScenarioRunner;
import org.springframework.core.io.ClassPathResource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Scenario("ExtractParameter2")
@RequestMapping(value = "/services/rest/v1/extractParameter2", method = RequestMethod.POST)
public class ExtractParameterPassToTemplate extends AbstractSimulatorScenario {

    @Override
    public void run(ScenarioRunner scenario) {
        scenario
                .http()
                .receive(con -> con.post().contentType("application/json;charset=UTF-8")
                        .extractFromPayload("$.id", "id")
                );

        String message = scenario.getTestContext().getVariable("id");
        System.out.println("variable capturada printed:  " + message);

        scenario.http().send(builder -> builder.response()
                .statusCode(200).payload(new ClassPathResource("templates/customerAuthenticationGet.xml")));

    }
}
