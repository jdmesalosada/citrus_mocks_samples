package com.mesaj.automation.citrus.scenarios.soap;

import com.consol.citrus.simulator.scenario.AbstractSimulatorScenario;
import com.consol.citrus.simulator.scenario.Scenario;
import com.consol.citrus.simulator.scenario.ScenarioDesigner;

@Scenario("GoodNight")
public class GoodNightScenario extends AbstractSimulatorScenario {

    @Override
    public void run(ScenarioDesigner scenario) {
        scenario
                .receive()
                .payload("<GoodNight xmlns=\"http://citrusframework.org/schemas/hello\">" +
                        "Go to sleep!" +
                        "</GoodNight>")
                .extractFromHeader("X-CorrelationId", "correlationId");

        scenario.correlation().start()
                .onHeader("X-CorrelationId", "${correlationId}");

        scenario
                .send()
                .payload("<GoodNightResponse xmlns=\"http://citrusframework.org/schemas/hello\">" +
                        "Good Night!" +
                        "</GoodNightResponse>");

        scenario
                .receive()
                .payload("<IntermediateRequest>In between!</IntermediateRequest>");

        scenario
                .send()
                .payload("<IntermediateResponse>In between!</IntermediateResponse>");
    }

}
