Feature: Editing user data scenario includes change name, surname, street, city, mobile number and verification entered data

  @bc
  Scenario Outline: Editing all user data (random data)

    Given a user reads test data from "bcgroup" "profile" by id "<TC_ID>"
    And user closes popup window
    And users clicks login button
    When user enters email and password for login
    And users  clicks user edit button
    When users enters name
    When users enters last name
    When users enters address
    When users enters zip code
    When users enters city
    When users enters phone number
    And users clicks save changes button
    Then user should verify successful message after changes
    And users  clicks user edit button
    Then user should verify all edited changes

    Examples:
      | TC_ID  |
      | SI_001 |

  @bc
  Scenario Outline: Invalid name (empty)

    Given a user reads test data from "bcgroup" "profile" by id "<TC_ID>"
    And user closes popup window
    And users clicks login button
    When user enters email and password for login
    And users  clicks user edit button
    When users enters name
    When users enters last name
    When users enters address
    When users enters zip code
    When users enters city
    When users enters phone number
    And users clicks save changes button
    Then user should verify unsuccessful message after changes

    Examples:
      | TC_ID  |
      | SI_002 |

  @bc
  Scenario Outline: Invalid name (mix letters & numbers)

    Given a user reads test data from "bcgroup" "profile" by id "<TC_ID>"
    And user closes popup window
    And users clicks login button
    When user enters email and password for login
    And users  clicks user edit button
    When users enters name
    When users enters last name
    When users enters address
    When users enters zip code
    When users enters city
    When users enters phone number
    And users clicks save changes button
    Then user should verify unsuccessful message after changes

    Examples:
      | TC_ID  |
      | SI_003 |

  @bc
  Scenario Outline: Invalid name (only numbers)

    Given a user reads test data from "bcgroup" "profile" by id "<TC_ID>"
    And user closes popup window
    And users clicks login button
    When user enters email and password for login
    And users  clicks user edit button
    When users enters name
    When users enters last name
    When users enters address
    When users enters zip code
    When users enters city
    When users enters phone number
    And users clicks save changes button
    Then user should verify unsuccessful message after changes

    Examples:
      | TC_ID  |
      | SI_004 |

  @bc
  Scenario Outline: Invalid name (only two letters)

    Given a user reads test data from "bcgroup" "profile" by id "<TC_ID>"
    And user closes popup window
    And users clicks login button
    When user enters email and password for login
    And users  clicks user edit button
    When users enters name
    When users enters last name
    When users enters address
    When users enters zip code
    When users enters city
    When users enters phone number
    And users clicks save changes button
    Then user should verify unsuccessful message after changes

    Examples:
      | TC_ID  |
      | SI_005 |

  @bc
  Scenario Outline: Valid name (Threshold value, 3 letters)

    Given a user reads test data from "bcgroup" "profile" by id "<TC_ID>"
    And user closes popup window
    And users clicks login button
    When user enters email and password for login
    And users  clicks user edit button
    When users enters name
    When users enters last name
    When users enters address
    When users enters zip code
    When users enters city
    When users enters phone number
    And users clicks save changes button
    Then user should verify successful message after changes

    Examples:
      | TC_ID  |
      | SI_006 |

  @bc
  Scenario Outline: Invalid lastname (empty)

    Given a user reads test data from "bcgroup" "profile" by id "<TC_ID>"
    And user closes popup window
    And users clicks login button
    When user enters email and password for login
    And users  clicks user edit button
    When users enters name
    When users enters last name
    When users enters address
    When users enters zip code
    When users enters city
    When users enters phone number
    And users clicks save changes button
    Then user should verify unsuccessful message after changes

    Examples:
      | TC_ID  |
      | SI_007 |

  @bc
  Scenario Outline: Invalid lastname (mix letters & numbers)

    Given a user reads test data from "bcgroup" "profile" by id "<TC_ID>"
    And user closes popup window
    And users clicks login button
    When user enters email and password for login
    And users  clicks user edit button
    When users enters name
    When users enters last name
    When users enters address
    When users enters zip code
    When users enters city
    When users enters phone number
    And users clicks save changes button
    Then user should verify unsuccessful message after changes

    Examples:
      | TC_ID  |
      | SI_008 |

  @bc
  Scenario Outline: Invalid name (only numbers)

    Given a user reads test data from "bcgroup" "profile" by id "<TC_ID>"
    And user closes popup window
    And users clicks login button
    When user enters email and password for login
    And users  clicks user edit button
    When users enters name
    When users enters last name
    When users enters address
    When users enters zip code
    When users enters city
    When users enters phone number
    And users clicks save changes button
    Then user should verify unsuccessful message after changes

    Examples:
      | TC_ID  |
      | SI_009 |

  @bc
  Scenario Outline: Invalid lastname (only two letters)

    Given a user reads test data from "bcgroup" "profile" by id "<TC_ID>"
    And user closes popup window
    And users clicks login button
    When user enters email and password for login
    And users  clicks user edit button
    When users enters name
    When users enters last name
    When users enters address
    When users enters zip code
    When users enters city
    When users enters phone number
    And users clicks save changes button
    Then user should verify unsuccessful message after changes

    Examples:
      | TC_ID  |
      | SI_010 |

  @bc
  Scenario Outline: Valid lastname (Threshold value, 3 letters)

    Given a user reads test data from "bcgroup" "profile" by id "<TC_ID>"
    And user closes popup window
    And users clicks login button
    When user enters email and password for login
    And users  clicks user edit button
    When users enters name
    When users enters last name
    When users enters address
    When users enters zip code
    When users enters city
    When users enters phone number
    And users clicks save changes button
    Then user should verify successful message after changes

    Examples:
      | TC_ID  |
      | SI_011 |

  @bc
  Scenario Outline: Invalid address (empty)

    Given a user reads test data from "bcgroup" "profile" by id "<TC_ID>"
    And user closes popup window
    And users clicks login button
    When user enters email and password for login
    And users  clicks user edit button
    When users enters name
    When users enters last name
    When users enters address
    When users enters zip code
    When users enters city
    When users enters phone number
    And users clicks save changes button
    Then user should verify unsuccessful message after changes

    Examples:
      | TC_ID  |
      | SI_012 |

  @bc
  Scenario Outline: Invalid address (special characters)

    Given a user reads test data from "bcgroup" "profile" by id "<TC_ID>"
    And user closes popup window
    And users clicks login button
    When user enters email and password for login
    And users  clicks user edit button
    When users enters name
    When users enters last name
    When users enters address
    When users enters zip code
    When users enters city
    When users enters phone number
    And users clicks save changes button
    Then user should verify unsuccessful message after changes

    Examples:
      | TC_ID  |
      | SI_013 |

  @bc
  Scenario Outline: Invalid address (only number)

    Given a user reads test data from "bcgroup" "profile" by id "<TC_ID>"
    And user closes popup window
    And users clicks login button
    When user enters email and password for login
    And users  clicks user edit button
    When users enters name
    When users enters last name
    When users enters address
    When users enters zip code
    When users enters city
    When users enters phone number
    And users clicks save changes button
    Then user should verify unsuccessful message after changes

    Examples:
      | TC_ID  |
      | SI_014 |

  @bc
  Scenario Outline: Invalid address (only letters)

    Given a user reads test data from "bcgroup" "profile" by id "<TC_ID>"
    And user closes popup window
    And users clicks login button
    When user enters email and password for login
    And users  clicks user edit button
    When users enters name
    When users enters last name
    When users enters address
    When users enters zip code
    When users enters city
    When users enters phone number
    And users clicks save changes button
    Then user should verify unsuccessful message after changes

    Examples:
      | TC_ID  |
      | SI_015 |

  @bc
  Scenario Outline: Valid zip (empty)

    Given a user reads test data from "bcgroup" "profile" by id "<TC_ID>"
    And user closes popup window
    And users clicks login button
    When user enters email and password for login
    And users  clicks user edit button
    When users enters name
    When users enters last name
    When users enters address
    When users enters zip code
    When users enters city
    When users enters phone number
    And users clicks save changes button
    Then user should verify successful message after changes

    Examples:
      | TC_ID  |
      | SI_016 |

  @bc
  Scenario Outline: Invalid zip (special characters)

    Given a user reads test data from "bcgroup" "profile" by id "<TC_ID>"
    And user closes popup window
    And users clicks login button
    When user enters email and password for login
    And users  clicks user edit button
    When users enters name
    When users enters last name
    When users enters address
    When users enters zip code
    When users enters city
    When users enters phone number
    And users clicks save changes button
    Then user should verify unsuccessful message after changes

    Examples:
      | TC_ID  |
      | SI_017 |

  @bc
  Scenario Outline: Invalid zip (letters only)

    Given a user reads test data from "bcgroup" "profile" by id "<TC_ID>"
    And user closes popup window
    And users clicks login button
    When user enters email and password for login
    And users  clicks user edit button
    When users enters name
    When users enters last name
    When users enters address
    When users enters zip code
    When users enters city
    When users enters phone number
    And users clicks save changes button
    Then user should verify unsuccessful message after changes

    Examples:
      | TC_ID  |
      | SI_018 |

  @bc
  Scenario Outline: Valid city (empty)

    Given a user reads test data from "bcgroup" "profile" by id "<TC_ID>"
    And user closes popup window
    And users clicks login button
    When user enters email and password for login
    And users  clicks user edit button
    When users enters name
    When users enters last name
    When users enters address
    When users enters zip code
    When users enters city
    When users enters phone number
    And users clicks save changes button
    Then user should verify successful message after changes

    Examples:
      | TC_ID  |
      | SI_019 |

  @bc
  Scenario Outline: Invalid city (special characters)

    Given a user reads test data from "bcgroup" "profile" by id "<TC_ID>"
    And user closes popup window
    And users clicks login button
    When user enters email and password for login
    And users  clicks user edit button
    When users enters name
    When users enters last name
    When users enters address
    When users enters zip code
    When users enters city
    When users enters phone number
    And users clicks save changes button
    Then user should verify unsuccessful message after changes

    Examples:
      | TC_ID  |
      | SI_020 |

  @bc
  Scenario Outline: Invalid city (numbers only)

    Given a user reads test data from "bcgroup" "profile" by id "<TC_ID>"
    And user closes popup window
    And users clicks login button
    When user enters email and password for login
    And users  clicks user edit button
    When users enters name
    When users enters last name
    When users enters address
    When users enters zip code
    When users enters city
    When users enters phone number
    And users clicks save changes button
    Then user should verify unsuccessful message after changes

    Examples:
      | TC_ID  |
      | SI_021 |

  @bc
  Scenario Outline: Invalid phone number (empty)

    Given a user reads test data from "bcgroup" "profile" by id "<TC_ID>"
    And user closes popup window
    And users clicks login button
    When user enters email and password for login
    And users  clicks user edit button
    When users enters name
    When users enters last name
    When users enters address
    When users enters zip code
    When users enters city
    When users enters phone number
    And users clicks save changes button
    Then user should verify unsuccessful message after changes

    Examples:
      | TC_ID  |
      | SI_022 |

  @bc
  Scenario Outline: Invalid phone number (letters only)

    Given a user reads test data from "bcgroup" "profile" by id "<TC_ID>"
    And user closes popup window
    And users clicks login button
    When user enters email and password for login
    And users  clicks user edit button
    When users enters name
    When users enters last name
    When users enters address
    When users enters zip code
    When users enters city
    When users enters phone number
    And users clicks save changes button
    Then user should verify unsuccessful message after changes

    Examples:
      | TC_ID  |
      | SI_023 |

  @bc
  Scenario Outline: Successful message appears and disappears after 10 seconds

    Given a user reads test data from "bcgroup" "profile" by id "<TC_ID>"
    And user closes popup window
    And users clicks login button
    When user enters email and password for login
    And users  clicks user edit button
    And users clicks save changes button
    Then user should verify successful message after changes
    Then user should be verify lasting time of successful message

    Examples:
      | TC_ID  |
      | SI_001 |

