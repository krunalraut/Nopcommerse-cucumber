$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/Resources/features/registration.feature");
formatter.feature({
  "line": 1,
  "name": "Registration feature",
  "description": "",
  "id": "registration-feature",
  "keyword": "Feature"
});
formatter.before({
  "duration": 9073197400,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "user should able to register successfully,",
  "description": "so that user can use all user functionality on my website",
  "id": "registration-feature;user-should-able-to-register-successfully,",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 2,
      "name": "@trial"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "user is on homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "user clicks on register button",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "user enter all required required details",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "user clicks on register-submit button",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "user should able to register successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "MyStepDef.user_is_on_homepage()"
});
formatter.result({
  "duration": 1175627900,
  "status": "passed"
});
formatter.match({
  "location": "MyStepDef.user_clicks_on_register_button()"
});
formatter.result({
  "duration": 5083618000,
  "status": "passed"
});
formatter.match({
  "location": "MyStepDef.user_enter_all_required_required_details()"
});
formatter.result({
  "duration": 12711467900,
  "status": "passed"
});
formatter.match({
  "location": "MyStepDef.user_clicks_on_register_submit_button()"
});
formatter.result({
  "duration": 6484558900,
  "status": "passed"
});
formatter.match({
  "location": "MyStepDef.user_should_able_to_register_successfully()"
});
formatter.result({
  "duration": 655304900,
  "status": "passed"
});
formatter.after({
  "duration": 22625600,
  "status": "passed"
});
});