Feature: Dropdown check

  Scenario: User should be able to see all 12 months in months
  dropdown
    Given User is on the dropdowns page of practice tool
    Then User should see below info in month dropdown
@dropdown
 Scenario Outline: User should be able to see all 12 months in months
  dropdown
    Given User is on the dropdowns page of practice tool
    Then User should see "<expected month>" in month dropdown

   Examples:
     | expected month |
     | January   |
     | February  |
     | March     |
     | April     |
     | May       |
     | June      |
     | July      |
     | August    |
     | September |
     | October   |
     | November  |
     | December  |