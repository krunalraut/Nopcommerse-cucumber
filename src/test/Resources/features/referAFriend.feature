Feature: user should able to refer to friend
@trial
Scenario: User should able to send message to friend successfully.
Given user is already on Email a friend page.
When user is already registered
And user enter valid friend’s email’ in ‘friend’s email’ textbox
And enter message in ‘message’ textbox
And click on send button
Then user should send message successfully
And see message ‘your message sent’.
