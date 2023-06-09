Feature: Add products to the basket, verificatio amoun of products into the basket, delete all of them and verify that all are successfully deleted

#  @bctttttttttttttttttttttttttttttttttttt
#  Scenario Outline: Assert all products from 'Televizori,Projektori,Audio i Video' page
#
#    Given a user reads test data from "bcgroup" "products" by id "<TC_ID>"
#    And user closes popup window
#    And user clicks product type
#    And user clicks sub product type
#    And user clicks sub product type from slider page
#    And user clicks add to cart button
#    And user add products to basket
#    Then user should verify number of items from basket on the main page
#    Then user should verify all sub products
#
#    Examples:
#      | TC_ID  |
#      | SI_001 |

  @bc
  Scenario Outline: By more products from 'Televizori,Projektori,Audio i Video' page and than verify products into the basket on the main screen

    Given a user reads test data from "bcgroup" "products" by id "<TC_ID>"
    And user closes popup window
    And user add products to basket
    Then user should verify number of items from basket on the main page

    Examples:
      | TC_ID  |
      | SI_001 |

  @bc
  Scenario Outline: By more products from 'Laptopovi i tableti' page and than verify products into the basket on the main screen

    Given a user reads test data from "bcgroup" "products" by id "<TC_ID>"
    And user closes popup window
    And user add products to basket
    Then user should verify number of items from basket on the main page

    Examples:
      | TC_ID  |
      | SI_002 |

  @bc
  Scenario Outline: By more products from 'Bela tehnika' page and than verify products into the basket on the main screen

    Given a user reads test data from "bcgroup" "products" by id "<TC_ID>"
    And user closes popup window
    And user add products to basket
    Then user should verify number of items from basket on the main page

    Examples:
      | TC_ID  |
      | SI_003 |

  @bc
  Scenario Outline: By more products from 'Telefoni' page and than verify products into the basket on the main screen

    Given a user reads test data from "bcgroup" "products" by id "<TC_ID>"
    And user closes popup window
    And user add products to basket
    Then user should verify number of items from basket on the main page

    Examples:
      | TC_ID  |
      | SI_005 |

  @bc
  Scenario Outline: By more products from 'Klimatizacija i grejanje' page and than verify products into the basket on the main screen

    Given a user reads test data from "bcgroup" "products" by id "<TC_ID>"
    And user closes popup window
    And user add products to basket
    Then user should verify number of items from basket on the main page

    Examples:
      | TC_ID  |
      | SI_007 |

  @bc
  Scenario Outline: By more products from 'Stampaci' page and than verify products into the basket on the main screen

    Given a user reads test data from "bcgroup" "products" by id "<TC_ID>"
    And user closes popup window
    And user add products to basket
    Then user should verify number of items from basket on the main page

    Examples:
      | TC_ID  |
      | SI_008 |

  @bc
  Scenario Outline: By more products from 'Mali kucni aparati' page and than verify products into the basket on the main screen

    Given a user reads test data from "bcgroup" "products" by id "<TC_ID>"
    And user closes popup window
    And user add products to basket
    Then user should verify number of items from basket on the main page

    Examples:
      | TC_ID  |
      | SI_009 |

  @bc
  Scenario Outline: By more products from 'Lepota i zdravlje' page and than verify products into the basket on the main screen

    Given a user reads test data from "bcgroup" "products" by id "<TC_ID>"
    And user closes popup window
    And user add products to basket
    Then user should verify number of items from basket on the main page

    Examples:
      | TC_ID  |
      | SI_010 |

  @bc
  Scenario Outline: By more products from 'Igracke' page and than verify products into the basket on the main screen

    Given a user reads test data from "bcgroup" "products" by id "<TC_ID>"
    And user closes popup window
    And user add products to basket
    Then user should verify number of items from basket on the main page

    Examples:
      | TC_ID  |
      | SI_011 |

  @bc
  Scenario Outline: By more products from 'Baby oprema' page and than verify products into the basket on the main screen

    Given a user reads test data from "bcgroup" "products" by id "<TC_ID>"
    And user closes popup window
    And user add products to basket
    Then user should verify number of items from basket on the main page

    Examples:
      | TC_ID  |
      | SI_012 |

  @bc
  Scenario Outline: By more products from 'Periferija' page and than verify products into the basket on the main screen

    Given a user reads test data from "bcgroup" "products" by id "<TC_ID>"
    And user closes popup window
    And user add products to basket
    Then user should verify number of items from basket on the main page

    Examples:
      | TC_ID  |
      | SI_013 |

  @bc
  Scenario Outline: By more products from 'Dronovi i kamere' page and than verify products into the basket on the main screen

    Given a user reads test data from "bcgroup" "products" by id "<TC_ID>"
    And user closes popup window
    And user add products to basket
    Then user should verify number of items from basket on the main page

    Examples:
      | TC_ID  |
      | SI_014 |

  @bc
  Scenario Outline: By more products from 'Sve za kancelariju' page and than verify products into the basket on the main screen

    Given a user reads test data from "bcgroup" "products" by id "<TC_ID>"
    And user closes popup window
    And user add products to basket
    Then user should verify number of items from basket on the main page

    Examples:
      | TC_ID  |
      | SI_015 |

  @bc
  Scenario Outline: By more products from 'Sve za bastu' page and than verify products into the basket on the main screen

    Given a user reads test data from "bcgroup" "products" by id "<TC_ID>"
    And user closes popup window
    And user add products to basket
    Then user should verify number of items from basket on the main page

    Examples:
      | TC_ID  |
      | SI_016 |

  @bc
  Scenario Outline: By more products from 'Alati i pribro' page and than verify products into the basket on the main screen

    Given a user reads test data from "bcgroup" "products" by id "<TC_ID>"
    And user closes popup window
    And user add products to basket
    Then user should verify number of items from basket on the main page

    Examples:
      | TC_ID  |
      | SI_017 |

  @bc
  Scenario Outline: By more products from 'Sport i rekreacija' page and than verify products into the basket on the main screen

    Given a user reads test data from "bcgroup" "products" by id "<TC_ID>"
    And user closes popup window
    And user add products to basket
    Then user should verify number of items from basket on the main page

    Examples:
      | TC_ID  |
      | SI_018 |

  @bc
  Scenario Outline: By more products from 'Auto moto' page and than verify products into the basket on the main screen

    Given a user reads test data from "bcgroup" "products" by id "<TC_ID>"
    And user closes popup window
    And user add products to basket
    Then user should verify number of items from basket on the main page


    Examples:
      | TC_ID  |
      | SI_019 |

  @bc
  Scenario Outline: By more products from 'Televizori,Projektori,Audio i Video' page and than verify products into the basket on the main screen and delete and verify that all of them are deleted

    Given a user reads test data from "bcgroup" "products" by id "<TC_ID>"
    And user closes popup window
    And user add products to basket
    Then user should verify number of items from basket on the main page
    Then user should delete and verify that all products are deleted

    Examples:
      | TC_ID  |
      | SI_001 |

  @bc
  Scenario Outline: Verification invisibility of 'Nastavi kupovinu' button

    Given a user reads test data from "bcgroup" "products" by id "<TC_ID>"
    And user closes popup window
    And user clicks on korpa button
    Then user should verify invisibility of nastavi kupovinu button

    Examples:
      | TC_ID  |
      | SI_004 |

  @bc
  Scenario Outline: Verification invisibility of 'Poruci' button

    Given a user reads test data from "bcgroup" "products" by id "<TC_ID>"
    And user closes popup window
    And user add products to basket
    Then user should verify invisibility of poruci button

    Examples:
      | TC_ID  |
      | SI_004 |
