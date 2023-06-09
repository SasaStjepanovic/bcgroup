Feature: Validation of opened product 'Dronovi i kamere' page and all of products on the same page

  @bc
  Scenario Outline: Compare total number of products for 'Dronovi i kamere' on default and hover view

    Given a user reads test data from "bcgroup" "products" by id "<TC_ID>"
    And user closes popup window
    Then user should compare default and hover number of items

    Examples:
      | TC_ID  |
      | SI_014 |