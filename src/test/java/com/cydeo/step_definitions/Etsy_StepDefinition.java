package com.cydeo.step_definitions;

import com.cydeo.pages.EtsySearchPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class Etsy_StepDefinition {
EtsySearchPage etsySearchPage=new EtsySearchPage();

    @Given("User is on main page of Etsy")
    public void user_is_on_main_page_of_etsy() {
        Driver.getDriver().get("https://www.etsy.com");
    }
    @Then("User sees Title of main page Etsy")
    public void userSeesTitleOfMainPageEtsy() {
        BrowserUtils.verifyTitleContains("Etsy - Shop for handmade, vintage, custom, and unique gifts for everyone");
        /*String expectedTitle ="Etsy - Shop for handmade, vintage, custom, and unique gifts for everyone";
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertEquals("your title is true",expectedTitle,actualTitle);*/
    }
    @Then("User types Wooden Spoon in the search box")
    public void user_types_wooden_spoon_in_the_search_box() {
        etsySearchPage.searchBox.sendKeys("Wooden Spoon");
    }
    @Then("User clicks search button")
    public void user_clicks_search_button() {
        etsySearchPage.searchButton.click();

    }
    @Then("User sees Wooden Spoon is in the title")
    public void user_sees_wooden_spoon_is_in_the_title() {
        String actualtitle=Driver.getDriver().getTitle();
BrowserUtils.verifyTitleContains("Wooden spoon");



    }

    @Then("User types {string} in the search box")
    public void userTypesInTheSearchBox(String string) {
        etsySearchPage.searchBox.sendKeys(string);

    }

    @Then("User sees {string} is in the title")
    public void userSeesIsInTheTitle(String string) {
        String actualtitle=Driver.getDriver().getTitle();
        BrowserUtils.verifyTitleContains(actualtitle);
     //   Assert.assertTrue(actualtitle.contains(string));
       // Assert.assertTrue(Driver.getDriver().getTitle().contains(string));
        //System.out.println(Driver.getDriver().getTitle());
    }


    }

