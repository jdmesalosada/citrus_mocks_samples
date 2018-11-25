package com.mesaj.automation.citrus.starter;

import com.consol.citrus.simulator.model.ScenarioParameter;
import com.consol.citrus.simulator.model.ScenarioParameterBuilder;
import com.consol.citrus.simulator.scenario.AbstractScenarioStarter;
import com.consol.citrus.simulator.scenario.ScenarioDesigner;
import com.consol.citrus.simulator.scenario.Starter;
import org.springframework.beans.factory.annotation.Autowired;
import com.consol.citrus.simulator.service.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Starter("GoodByeStarter")
public class GoodByeStarter extends AbstractScenarioStarter {

   /* @Autowired
    private TemplateService templateService;

    @Override
    public void run(ScenarioDesigner scenario) {
        scenario.echo("GoodBye starter was executed!");
        scenario.echo("${payload}");
    }

    @Override
    public Collection<ScenarioParameter> getScenarioParameters() {
        List<ScenarioParameter> scenarioParameter = new ArrayList<>();

        // greeting (text area)
        scenarioParameter.add(new ScenarioParameterBuilder()
                .name("payload")
                .label("Payload")
                .required()
                .textarea()
                .value(templateService.getXmlMessageTemplate("Goodbye"))
                .build());

        return scenarioParameter;
    }*/

}