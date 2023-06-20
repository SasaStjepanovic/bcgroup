Feature:Different kind filtering of 'Televizori,Projektori,Video,Audio' ptoducts with positive and negative response

  @bc
  Scenario Outline: Apply filter for not available Televizori

    Given a user reads test data from "bcgroup" "TvProjektoriVideoAudio" by id "<TC_ID>"
    And user closes popup window
    And user clicks product type
    And user clicks sub product type
    And user should apply general filter
    And user should apply extend filter
    Then user should be verified negative filtered action

    Examples:
      | TC_ID  |
      | SI_001 |

  @bc
  Scenario Outline: Apply filter for available Televizori

    Given a user reads test data from "bcgroup" "TvProjektoriVideoAudio" by id "<TC_ID>"
    And user closes popup window
    And user clicks product type
    And user clicks sub product type
    And user should apply general filter
    And user should apply extend filter
#    And user clicks on the first filtered element
#    Then user should be verified positive filtered action

    Examples:
      | TC_ID  |
      | SI_002 |

  @bc
  Scenario Outline: Apply filter for not available Projektori

    Given a user reads test data from "bcgroup" "TvProjektoriVideoAudio" by id "<TC_ID>"
    And user closes popup window
    And user clicks product type
    And user clicks sub product type
    And user should apply general filter
    And user should apply extend filter
    Then user should be verified negative filtered action

    Examples:
      | TC_ID  |
      | SI_003 |

  @bc
  Scenario Outline: Apply filter for available Projektori

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
      | SI_004 |