package com.mesaj.automation.citrus.simulator;


import com.consol.citrus.message.Message;
import com.consol.citrus.message.MessageType;
import com.consol.citrus.simulator.scenario.AbstractSimulatorScenario;
import com.consol.citrus.simulator.scenario.Scenario;
import com.consol.citrus.simulator.scenario.ScenarioRunner;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;
import java.util.Map;

@Scenario("ExtractParameter")
@RequestMapping(value = "/services/rest/v1/extractParameter", method = RequestMethod.POST)
public class ExtractParameterScenario extends AbstractSimulatorScenario {

    @Override
    public void run(ScenarioRunner scenario) {
       /* scenario
                .http()
                .receive()
                .post();

        scenario
                .http()
                .send()
                .response(HttpStatus.OK)
                .extractFromPayload("$.username[0]", "username")
                //.payload("{\"username\":\"@username@\"}");
                .payload("{\"version\":\"@username@\"}");*/

        //scenario.echo("citrus:message(ExtractParameter.payload())");

        /*
        http()
    .client(wiremockClient)
    .receive()
    .response(HttpStatus.OK)
    .messageType(MessageType.JSON)
    .extractFromPayload("$.requests[0].request.body", "body")
    .payload(new ClassPathResource("output/esb/add_conf_to_cart/response2.xml"))
;
        * */

       /* scenario
                .http()

                .send((builder -> builder
                        .response(HttpStatus.OK).messageType(MessageType.JSON)
                        .extractFromPayload("$.username", "algo")));*/
        //.payload("{\"version\":\"@username@\"}")));

        scenario.http().send(builder -> builder.response().message()
                .statusCode(200));

    }
}
