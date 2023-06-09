Feature:Validation of opened product 'Laptopovi i Tableti' page

  @bc
  Scenario Outline: Assert all products from 'Laptopovi i tableti' page and all of products on the same page

    Given a user reads test data from "bcgroup" "products" by id "<TC_ID>"
    And user closes popup window
    And user clicks product type
    Then user should verify current opened page
    Then user should verify all sub products

    Examples:
      | TC_ID  |
      | SI_002 |

  @bc
  Scenario Outline: Compare total number of products for 'Laptopovi i tableti' on default and hover view

    Given a user reads test data from "bcgroup" "products" by id "<TC_ID>"
    And user closes popup window
    Then user should compare default and hover number of items

    Examples:
      | TC_ID  |
      | SI_002 |