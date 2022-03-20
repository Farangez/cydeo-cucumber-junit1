package com.cydeo.step_definitions;

import com.cydeo.pages.DropDown;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class DropDownStepDefinition {
DropDown dropDown=new DropDown();
    @Given("User is on the dropdowns page of practice tool")
    public void user_is_on_the_dropdowns_page_of_practice_tool() {
        Driver.getDriver().get("https://practice.cydeo.com/dropdown ");

    }
    @Then("User should see below info in month dropdown")
    public void user_should_see_below_info_in_month_dropdown() {
dropDown.monthDropdown.click();
        for (WebElement eachMonth : dropDown.monthOptions) {
            if (eachMonth.isDisplayed()){
                Assert.assertTrue("each month is displayed", eachMonth.isDisplayed());
            }

        }

    }


    @Then("User should see {string} in month dropdown")
    public void userShouldSeeInMonthDropdown(String eachMonth1) {
        dropDown.monthDropdown.click();

        for (WebElement eachMonth : dropDown.monthOptions) {
            if (eachMonth.isDisplayed()) {
                Assert.assertTrue("each month is displayed", eachMonth.isDisplayed());
            }
        }
    }}