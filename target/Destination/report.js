$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/Resources/features/referAFriend.feature");
formatter.feature({
  "line": 1,
  "name": "user should able to refer to friend",
  "description": "",
  "id": "user-should-able-to-refer-to-friend",
  "keyword": "Feature"
});
formatter.before({
  "duration": 11053844600,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "User should able to send message to friend successfully.",
  "description": "",
  "id": "user-should-able-to-refer-to-friend;user-should-able-to-send-message-to-friend-successfully.",
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
  "line": 4,
  "name": "user is already on Email a friend page.",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user is already registered",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user enter valid friend’s email’ in ‘friend’s email’ textbox",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "enter message in ‘message’ textbox",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "click on send button",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "user should send message successfully",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "see message ‘your message sent’.",
  "keyword": "And "
});
formatter.match({
  "location": "MyStepDef.user_is_already_on_Email_a_friend_page()"
});
formatter.result({
  "duration": 21300190500,
  "status": "passed"
});
formatter.match({
  "location": "MyStepDef.user_is_already_registered()"
});
formatter.result({
  "duration": 101100,
  "status": "passed"
});
formatter.match({
  "location": "MyStepDef.user_enter_valid_friend_s_email_in_friend_s_email_textbox()"
});
formatter.result({
  "duration": 92000,
  "status": "passed"
});
formatter.match({
  "location": "MyStepDef.enter_message_in_message_textbox()"
});
formatter.result({
  "duration": 83900,
  "status": "passed"
});
formatter.match({
  "location": "MyStepDef.click_on_send_button()"
});
formatter.result({
  "duration": 155000,
  "status": "passed"
});
formatter.match({
  "location": "MyStepDef.user_should_send_message_successfully()"
});
formatter.result({
  "duration": 140100,
  "status": "passed"
});
formatter.match({
  "location": "MyStepDef.see_message_your_message_sent()"
});
formatter.result({
  "duration": 68800,
  "status": "passed"
});
formatter.after({
  "duration": 389308300,
  "status": "passed"
});
formatter.uri("src/test/Resources/features/registration.feature");
formatter.feature({
  "line": 1,
  "name": "Registration feature",
  "description": "",
  "id": "registration-feature",
  "keyword": "Feature"
});
formatter.before({
  "duration": 8593891200,
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
  "duration": 119768400,
  "status": "passed"
});
formatter.match({
  "location": "MyStepDef.user_clicks_on_register_button()"
});
formatter.result({
  "duration": 1100358800,
  "status": "passed"
});
formatter.match({
  "location": "MyStepDef.user_enter_all_required_required_details()"
});
formatter.result({
  "duration": 3088930000,
  "status": "passed"
});
formatter.match({
  "location": "MyStepDef.user_clicks_on_register_submit_button()"
});
formatter.result({
  "duration": 2873519600,
  "status": "passed"
});
formatter.match({
  "location": "MyStepDef.user_should_able_to_register_successfully()"
});
formatter.result({
  "duration": 146516000,
  "status": "passed"
});
formatter.after({
  "duration": 242018100,
  "status": "passed"
});
});