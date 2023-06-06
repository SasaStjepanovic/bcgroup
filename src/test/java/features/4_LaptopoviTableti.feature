Feature: Login scenarios include valid and invalid logins with combination of wrong credentials and Logout scenario

  @bcr
  Scenario Outline: Assert all products from Televizori,Projektori,Audio and Video page

    Given a user reads test data from "bcgroup" "products" by id "<TC_ID>"
    And user closes popup window
    And user clicks product type

    Examples:
      | TC_ID  |
      | SI_001 |