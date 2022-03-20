package com.cydeo.step_definitions;

import com.cydeo.pages.SmartBear;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;

public class SmartBears_StepDefinition {
SmartBear smartBear=new SmartBear();

    @Given("User is logged into SmartBear Tester account and on Order page")
    public void user_is_logged_into_smart_bear_tester_account_and_on_order_page() {
        Driver.getDriver().get("http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx?Return\n" +
                "Url=%2fsamples%2ftestcomplete12%2fweborders%2fDefault.aspx ");
       smartBear.username.sendKeys("Tester");
       smartBear.password.sendKeys("test");
       smartBear.login_button.click();

    }
    @Then("User fills out the form as followed:")
    public void user_fills_out_the_form_as_followed() {
       smartBear.order_button.click();
    }


    @And("User selects {string} from product dropdown")
    public void userSelectsFromProductDropdown(String product) {
        smartBear.familyAlbum.click();
    }

    @Then("User enters {int} to quantity")
    public void user_enters_to_quantity(Integer int1) {
        smartBear.quantity.sendKeys(Keys.BACK_SPACE);
       smartBear.quantity.sendKeys(""+int1);
    }
    @And("User enters {string} to costumer name")
    public void userEntersToCostumerName(String string) {
smartBear.costumer_name.sendKeys(string);
    }

    @And("User enters {string} Ave to street")
    public void userEntersAveToStreet(String string2) {
        smartBear.street.sendKeys(string2);

    }

    @And("User enters {string} to city")
    public void userEntersToCity(String string3) {
        smartBear.city.sendKeys(string3);
    }


    @And("User enters {string} to state")
    public void userEntersToState(String string4) {
smartBear.state.sendKeys(string4);
    }

    @And("User selects {string} as card type")
    public void userSelectsAsCardType(String string) {
        smartBear.visa.click();
    }

    @Then("User clicks process button")
    public void user_clicks_process_button() {
        smartBear.process_button.click();
    }


    @And("User enters {string} to card number")
    public void userEntersToCardNumber(String string) {
        smartBear.cardnumber.sendKeys(string);
    }
    @And("User enters {string} to expiration date")
    public void userEntersToExpirationDate(String string) {
        smartBear.expiration.sendKeys(string);
    }

    @And("User enters {int}")
    public void userEnters(int zip) {
        smartBear.zipcode.sendKeys(""+zip);
    }


    @And("User verifies {string} is in the list")
    public void userVerifiesIsInTheList(String expectedName) {
    smartBear.allOrderBtn.click();
        Assert.assertTrue(smartBear.isInList(expectedName));
    }
}
