Run:
./gradlew build bootRun

Get to: http://localhost:8080/services/rest/

Make post to :
http://localhost:8080/services/rest/v1/extractParameter2
with body:
{
	"id": "90000"
}

Reference:
http://citrusframework.org/citrus-simulator/
https://citrusframework.org/samples/
https://www.joecolantonio.com/api-integration-automation-testing-citrus-framework/

https://citrusframework.org/citrus/reference/2.7.4/html/index.html#actions-send

Cucumber:
https://citrusframework.org/samples/cucumber/

Simulator docs:
https://citrusframework.org/news/2017/09/21/introducing-citrus-simulator/
https://github.com/citrusframework/citrus-simulator-demo

    <!-- <cus:idNumber>${idNumber}</cus:idNumber>-->
    
    
   /*
    @Override
       public void run(ScenarioDesigner scenario) {
           scenario
               .receive()
               .payload("<Hello xmlns=\"http://citrusframework.org/schemas/hello\">" +
                           "<user>@ignore@</user>" +
                        "</Hello>")
               .extractFromPayload("/Hello/user", "userName");
   
           scenario
               .send()
               .payload("<HelloResponse xmlns=\"http://citrusframework.org/schemas/hello\">" +
                           "<text>Hi there ${userName}!</text>" +
                        "</HelloResponse>");
       }
   */
   
   Peticion desde postman: <Hello>
                                 <user>juliancho</user>
                           </Hello>
    
 
