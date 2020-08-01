package org.example;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MyStepDef {
    Homepage homepage = new Homepage();
    ComputerPage computerPage = new ComputerPage();
    DesktopPage desktopPage = new DesktopPage();
    DigitalStormPage digitalStormPage = new DigitalStormPage();
    EmailAFriendPage emailAFriendPage = new EmailAFriendPage();
    EmailSendSuccessfulpage emailSendSuccessfulpage = new EmailSendSuccessfulpage();
    RegisterPage registerPage = new RegisterPage();
    RegistrationConfirmPage registrationConfirmPage = new RegistrationConfirmPage();
    @Given("^user is on homepage$")
    public void user_is_on_homepage() {
       homepage.CheckForHomepage();
    }

    @When("^user clicks on register button$")
    public void user_clicks_on_register_button()  {
        homepage.clickOnRegisterLink();
    }

    @When("^user enter all required required details$")
    public void user_enter_all_required_required_details()  {
        registerPage.checkRegistrationPage();
        registerPage.enterRegisterPageDetais();
    }

    @When("^user clicks on register-submit button$")
    public void user_clicks_on_register_submit_button()
    {
        registerPage.clickOnButton();
    }

    @Then("^user should able to register successfully$")
    public void user_should_able_to_register_successfully()
    {
        registrationConfirmPage.registrationConfirmation();
    }

    @Given("^user is already on Email a friend page\\.$")
    public void user_is_already_on_Email_a_friend_page()
    {
        homepage.CheckForHomepage();
        homepage.clickOnRegisterLink();
        registerPage.checkRegistrationPage();
        registerPage.enterRegisterPageDetais();
        registerPage.clickOnButton();
        registrationConfirmPage.registrationConfirmation();
        registrationConfirmPage.NavigateToHomepage();
        homepage.CheckForHomepage();
        homepage.clickOnComputerLink();
        computerPage.checkForComputerPage();
        computerPage.clickOnDesktopLink();
        desktopPage.checkForDesktopPage();
        desktopPage.clickOnDigitalStormAddToCartButton();
        digitalStormPage.checkForDigitalStormPage();
        digitalStormPage.clickOnEmailAFriend();
        emailAFriendPage.checkForEmailaFriendPage();
        emailAFriendPage.fillEmailaFriendPage();
        emailSendSuccessfulpage.checkEmailSendSuccessfully();
    }

    @When("^user is already registered$")
    public void user_is_already_registered()
    {

    }

    @When("^user enter valid friend’s email’ in ‘friend’s email’ textbox$")
    public void user_enter_valid_friend_s_email_in_friend_s_email_textbox() throws Throwable {

    }

    @When("^enter message in ‘message’ textbox$")
    public void enter_message_in_message_textbox()  {

    }

    @When("^click on send button$")
    public void click_on_send_button() {

    }

    @Then("^user should send message successfully$")
    public void user_should_send_message_successfully()  {

    }

    @Then("^see message ‘your message sent’\\.$")
    public void see_message_your_message_sent() throws Throwable {

    }

}
