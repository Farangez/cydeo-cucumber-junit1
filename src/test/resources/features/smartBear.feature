Feature: Smart Bear order process

  @bears
  Scenario:User fill out order form

    Given User is logged into SmartBear Tester account and on Order page
    Then User fills out the form as followed:
    And User selects "FamilyAlbum" from product dropdown
    And User enters 4 to quantity
    And User enters "John Wick" to costumer name
    And User enters "Kinzie" Ave to street
    And User enters "Chicago" to city
    And User enters "IL" to state
    And User enters 60056
    And User selects "Visa" as card type
    And User enters "1111222233334444" to card number
    And User enters "12/22" to expiration date
    And User clicks process button
    And User verifies "John Wick" is in the list

  @scenarioOutline
  Scenario Outline:User fills out the form
    Given User is logged into SmartBear Tester account and on Order page
    When User fills out the form as followed:
    And User selects "<product>" from product dropdown
    And User enters <quantity> to quantity
    And User enters "<customer name>" to costumer name
    And User enters "<street>" Ave to street
    And User enters "<city>" to city
    And User enters "<state>" to state
    And User enters <zip>
    And User selects "<cardType>" as card type
    And User enters "<card number>" to card number
    And User enters "<expiration date>" to expiration date
    And User clicks process button
    And User verifies "<expected name>" is in the list
    Examples:
      | product      | quantity | customer name | street    | city     | state | zip   | cardType         | card number  | expiration date | expected name |
      | Family Album | 5        | Fara          | hux       | NY       | NY    | 10471 | Visa             | 555664268456 | 03/26           | Fara          |
      | MyMoney      | 1        | Ken Adams     | Kinzie st | Chicago  | IL    | 60004 | Visa             | 313313133315 | 12/22           | Ken Adams     |
      | ScreenSaver  | 5        | Magda         | Red st    | Bluffton | SC    | 41233 | Visa             | 555313133315 | 09/22           | Magda         |
      | ScreenSaver  | 5        | John Smith    | Red st    | Bluffton | SC    | 41233 | American Express | 555313133315 | 09/22           | John Smith    |
      | MyMoney      | 10       | Sophie Lex    | Brown st  | Boston   | MA    | 54622 | Visa             | 667313133315 | 03/22           | Sophie Lex    |