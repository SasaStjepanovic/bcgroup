Feature: Validation of opened product 'Klimatizacija and grejanje' page and all of products on the same page

  @bc
  Scenario Outline: Assert all products from 'Klimatizacija i grejanje' page

    Given a user reads test data from "bcgroup" "products" by id "<TC_ID>"
    And user closes popup window
    And user clicks product type
    Then user should verify current opened page
    Then user should verify all sub products

    Examples:
      | TC_ID  |
      | SI_007 |