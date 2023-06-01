Feature: Login scenarios include valid and invalid logins with combination of wrong credentials and Logout scenario

  @bc
  Scenario Outline: Login valid user

    Given a user reads test data from "bcgroup" "general" by id "<TC_ID>"
    And users clicks login button
    And user enters email and password for login
    Then user should be verified login action

    Examples:
      | TC_ID  |
      | SI_001 |

  @bc
  Scenario Outline: Login invalid user (empty email)

    Given a user reads test data from "bcgroup" "general" by id "<TC_ID>"
    And users clicks login button
    And user enters email and password for login
    Then user should be verified login action

    Examples:
      | TC_ID  |
      | SI_002 |

  @bc
  Scenario Outline: Login invalid user (empty password)

    Given a user reads test data from "bcgroup" "general" by id "<TC_ID>"
    And users clicks login button
    And user enters email and password for login
    Then user should be verified login action

    Examples:
      | TC_ID  |
      | SI_003 |

  @bc
  Scenario Outline: Login invalid user (empty email&password)

    Given a user reads test data from "bcgroup" "general" by id "<TC_ID>"
    And users clicks login button
    And user enters email and password for login
    Then user should be verified login action

    Examples:
      | TC_ID  |
      | SI_004 |

  @bc
  Scenario Outline: Login invalid user (invalid email/password)

    Given a user reads test data from "bcgroup" "general" by id "<TC_ID>"
    And users clicks login button
    And user enters email and password for login
    Then user should be verified login action

    Examples:
      | TC_ID  |
      | SI_005 |

  @bc
  Scenario Outline: Login invalid user (invalid password)

    Given a user reads test data from "bcgroup" "general" by id "<TC_ID>"
    And users clicks login button
    And user enters email and password for login
    Then user should be verified login action

    Examples:
      | TC_ID  |
      | SI_006 |

  @bc
  Scenario Outline: Login invalid user (invalid email)

    Given a user reads test data from "bcgroup" "general" by id "<TC_ID>"
    And users clicks login button
    And user enters email and password for login
    Then user should be verified login action

    Examples:
      | TC_ID  |
      | SI_007 |

  @bc
  Scenario Outline: Logout user

    Given a user reads test data from "bcgroup" "general" by id "<TC_ID>"
    And users clicks login button
    And user enters email and password for login
    Then user should be verified login action
    And user clicks logout button
    Then user should be verified logout action

    Examples:
      | TC_ID  |
      | SI_001 |