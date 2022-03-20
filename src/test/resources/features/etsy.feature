@etsy
Feature: Etsy Search Functionality Title Verification
  Scenario:Etsy Title verification
Given User is on main page of Etsy
  Given User is on main page of Etsy
  Then User sees Title of main page Etsy


Scenario: Etsy Search Functionality Title Verification (without parameterization)
Given User is on main page of Etsy
Then User types Wooden Spoon in the search box
And  User clicks search button
Then User sees Wooden Spoon is in the title


  Scenario: Etsy Search Functionality Title Verification
    Given User is on main page of Etsy
    Then User types "Wooden Spoon" in the search box
    And  User clicks search button
    Then User sees "Wooden Spoon" is in the title

  Scenario Outline: Etsy Search Functionality Title Verification
    Given User is on main page of Etsy
    Then User types "<word>" in the search box
    And  User clicks search button
    Then User sees "<expected title>" is in the title
    Examples:
      | word         | expected title |
      | Wooden spoon | Wooden spoon   |
      | mug          | mug            |
      | scarf        | scarf          |









#Expected: Etsy - Shop for handmade, vintage, custom, and unique gifts for
#everyone
#
#Note: Follow POM
#
#TC#52:
#
#Note: Follow POM
#TC#53: Etsy Search Functionality Title Verification (with parameterization)
#1. User is on https://www.etsy.com
#2. User types Wooden Spoon in the search box
#3. User clicks search button
#4. User sees Wooden Spoon is in the title
#
#Note: Follow POM
