package MyStepdefs;

import Pages.Dashboard;
import Pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class MyStepdefs {

    @Steps
    HomePage home;
    @Steps
    Dashboard dash;

        @Given("user is on home page")
         public void user_is_on_home_page() {
            home.openApp();
        }
        @When("user enter {string} as username")
         public void user_enter_admin_as_username (String Log) {
            home.enterUsername();
        }
        @And("user enter {string} as password")
        public void user_enter_admin123_as_password ( String pass){
            home.enterPassword();
        }
        @And("user click button LogIn")
        public void userClickButtonLogIn() {
            home.clickOnLoginButton();
        }
        @Then("user should ba able to login")
        public void user_should_ba_able_to_login () {
            dash.verifyAdmin();
        }



}
