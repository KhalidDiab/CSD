package test.java;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Steps{

@Given("^user \"([^\"]*)\" has entered login ID \"([^\"]*)\" and password \"([^\"]*)\"$")
public void user_has_entered_login_ID_and_password(String arg1, String arg2, String arg3) throws Throwable {
    // Express the Regexp above with the code you wish you had
    throw new PendingException();
}

@When("^click on button \"([^\"]*)\"$")
public void click_on_button(String arg1) throws Throwable {
    // Express the Regexp above with the code you wish you had
    throw new PendingException();
}

@Then("^user is forwarded to home Page$")
public void user_is_forwarded_to_home_Page() throws Throwable {
    // Express the Regexp above with the code you wish you had
    throw new PendingException();
}

@Then("^system displays the message user id is not correct$")
public void system_displays_the_message_user_id_is_not_correct() throws Throwable {
    // Express the Regexp above with the code you wish you had
    throw new PendingException();
}

@Then("^system displays the message password is not correct$")
public void system_displays_the_message_password_is_not_correct() throws Throwable {
    // Express the Regexp above with the code you wish you had
    throw new PendingException();
}
}