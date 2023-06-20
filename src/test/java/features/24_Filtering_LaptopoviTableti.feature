Feature:Different kind filtering of Laptopovi with positive and negative response

  @bc
  Scenario Outline: Apply filter for not available Laptop

    Given a user reads test data from "bcgroup" "TvProjektoriVideoAudio" by id "<TC_ID>"
    And user closes popup window
    And user clicks product type
    And user clicks sub product type
    And user should apply general filter
    And user should apply extend filter
    Then user should be verified negative filtered action

    Examples:
      | TC_ID  |
      | SI_004 |

  @bc
  Scenario Outline: Apply filter for available Laptop

    Given a user reads test data from "bcgroup" "TvProjektoriVideoAudio" by id "<TC_ID>"
    And user closes popup window
    And user clicks product type
    And user clicks sub product type
    And user should apply general filter
    And user should apply extend filter
    And user clicks on the first filtered element
    Then user should be verified positive filtered action

    Examples:
      | TC_ID  |
      | SI_005 |