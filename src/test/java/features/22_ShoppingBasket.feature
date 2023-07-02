Feature: Add products to the basket, verification amount of products into the basket, delete all of them and verify that all are successfully deleted

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
  Scenario Outline: Buy more products from 'Televizori,Projektori,Audio i Video' page and than verify products into the basket on the main screen

    Given a user reads test data from "bcgroup" "products" by id "<TC_ID>"
    And user closes popup window
    And user add products to basket
    Then user should verify number of items from basket on the main page

    Examples:
      | TC_ID  |
      | SI_001 |

  @bc
  Scenario Outline: Buy more products from 'Laptopovi i tableti' page and than verify products into the basket on the main screen

    Given a user reads test data from "bcgroup" "products" by id "<TC_ID>"
    And user closes popup window
    And user add products to basket
    Then user should verify number of items from basket on the main page

    Examples:
      | TC_ID  |
      | SI_002 |

  @bc
  Scenario Outline: Buy more products from 'Bela tehnika' page and than verify products into the basket on the main screen

    Given a user reads test data from "bcgroup" "products" by id "<TC_ID>"
    And user closes popup window
    And user add products to basket
    Then user should verify number of items from basket on the main page

    Examples:
      | TC_ID  |
      | SI_003 |

  @bc
  Scenario Outline: Buy more products from 'Telefoni' page and than verify products into the basket on the main screen

    Given a user reads test data from "bcgroup" "products" by id "<TC_ID>"
    And user closes popup window
    And user add products to basket
    Then user should verify number of items from basket on the main page

    Examples:
      | TC_ID  |
      | SI_005 |

  @bc
  Scenario Outline: Buy more products from 'Klimatizacija i grejanje' page and than verify products into the basket on the main screen

    Given a user reads test data from "bcgroup" "products" by id "<TC_ID>"
    And user closes popup window
    And user add products to basket
    Then user should verify number of items from basket on the main page

    Examples:
      | TC_ID  |
      | SI_007 |

  @bc
  Scenario Outline: Buy more products from 'Stampaci' page and than verify products into the basket on the main screen

    Given a user reads test data from "bcgroup" "products" by id "<TC_ID>"
    And user closes popup window
    And user add products to basket
    Then user should verify number of items from basket on the main page

    Examples:
      | TC_ID  |
      | SI_008 |

  @bc
  Scenario Outline: Buy more products from 'Mali kucni aparati' page and than verify products into the basket on the main screen

    Given a user reads test data from "bcgroup" "products" by id "<TC_ID>"
    And user closes popup window
    And user add products to basket
    Then user should verify number of items from basket on the main page

    Examples:
      | TC_ID  |
      | SI_009 |

  @bc
  Scenario Outline: Buy more products from 'Lepota i zdravlje' page and than verify products into the basket on the main screen

    Given a user reads test data from "bcgroup" "products" by id "<TC_ID>"
    And user closes popup window
    And user add products to basket
    Then user should verify number of items from basket on the main page

    Examples:
      | TC_ID  |
      | SI_010 |

  @bc
  Scenario Outline: Buy more products from 'Igracke' page and than verify products into the basket on the main screen

    Given a user reads test data from "bcgroup" "products" by id "<TC_ID>"
    And user closes popup window
    And user add products to basket
    Then user should verify number of items from basket on the main page

    Examples:
      | TC_ID  |
      | SI_011 |

  @bc
  Scenario Outline: Buy more products from 'Baby oprema' page and than verify products into the basket on the main screen

    Given a user reads test data from "bcgroup" "products" by id "<TC_ID>"
    And user closes popup window
    And user add products to basket
    Then user should verify number of items from basket on the main page

    Examples:
      | TC_ID  |
      | SI_012 |

  @bc
  Scenario Outline: Buy more products from 'Periferija' page and than verify products into the basket on the main screen

    Given a user reads test data from "bcgroup" "products" by id "<TC_ID>"
    And user closes popup window
    And user add products to basket
    Then user should verify number of items from basket on the main page

    Examples:
      | TC_ID  |
      | SI_013 |

  @bc
  Scenario Outline: Buy more products from 'Dronovi i kamere' page and than verify products into the basket on the main screen

    Given a user reads test data from "bcgroup" "products" by id "<TC_ID>"
    And user closes popup window
    And user add products to basket
    Then user should verify number of items from basket on the main page

    Examples:
      | TC_ID  |
      | SI_014 |

  @bc
  Scenario Outline: Buy more products from 'Sve za kancelariju' page and than verify products into the basket on the main screen

    Given a user reads test data from "bcgroup" "products" by id "<TC_ID>"
    And user closes popup window
    And user add products to basket
    Then user should verify number of items from basket on the main page

    Examples:
      | TC_ID  |
      | SI_015 |

  @bc
  Scenario Outline: Buy more products from 'Sve za bastu' page and than verify products into the basket on the main screen

    Given a user reads test data from "bcgroup" "products" by id "<TC_ID>"
    And user closes popup window
    And user add products to basket
    Then user should verify number of items from basket on the main page

    Examples:
      | TC_ID  |
      | SI_016 |

  @bc
  Scenario Outline: Buy more products from 'Alati i pribro' page and than verify products into the basket on the main screen

    Given a user reads test data from "bcgroup" "products" by id "<TC_ID>"
    And user closes popup window
    And user add products to basket
    Then user should verify number of items from basket on the main page

    Examples:
      | TC_ID  |
      | SI_017 |

  @bc
  Scenario Outline: Buy more products from 'Sport i rekreacija' page and than verify products into the basket on the main screen

    Given a user reads test data from "bcgroup" "products" by id "<TC_ID>"
    And user closes popup window
    And user add products to basket
    Then user should verify number of items from basket on the main page

    Examples:
      | TC_ID  |
      | SI_018 |

  @bc
  Scenario Outline: Buy more products from 'Auto moto' page and than verify products into the basket on the main screen

    Given a user reads test data from "bcgroup" "products" by id "<TC_ID>"
    And user closes popup window
    And user add products to basket
    Then user should verify number of items from basket on the main page


    Examples:
      | TC_ID  |
      | SI_019 |

  @bc
  Scenario Outline: Buy more products from 'Televizori,Projektori,Audio i Video' page and than verify products into the basket on the main screen and delete and verify that all of them are deleted

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

  @bc
  Scenario Outline: Buy more products, click 'Poruci' button, choose method payment and filled random own data

    Given a user reads test data from "bcgroup" "products" by id "<TC_ID>"
    And user closes popup window
    And user add products to basket
    And user chooses payment method
    And user clicks poruci button
    When users enters name
    When users enters last name
    When users enters email
    When users enters address
    When users enters zip code
    When users enters city
    When users enters phone number

    Examples:
      | TC_ID  |
      | SI_005 |

  @bc
  Scenario Outline: Invalid name [empty] on korpa page

    Given a user reads test data from "bcgroup" "products" by id "<TC_ID>"
    And user closes popup window
    And user add products to basket
    And user chooses payment method
    And user clicks poruci button
    When users enters name
    When users enters last name
    When users enters email
    When users enters address
    When users enters zip code
    When users enters city
    When users enters phone number
    Then user should be verified verification message on korpa page

    Examples:
      | TC_ID  |
      | SI_002 |

  @bc
  Scenario Outline: Invalid name [combination with numbers] on korpa page

    Given a user reads test data from "bcgroup" "products" by id "<TC_ID>"
    And user closes popup window
    And user add products to basket
    And user chooses payment method
    And user clicks poruci button
    When users enters name
    When users enters last name
    When users enters email
    When users enters address
    When users enters zip code
    When users enters city
    When users enters phone number
    Then user should be verified verification message on korpa page

    Examples:
      | TC_ID  |
      | SI_003 |

  @bc
  Scenario Outline: Invalid name [only numbers] on korpa page

    Given a user reads test data from "bcgroup" "products" by id "<TC_ID>"
    And user closes popup window
    And user add products to basket
    And user chooses payment method
    And user clicks poruci button
    When users enters name
    When users enters last name
    When users enters email
    When users enters address
    When users enters zip code
    When users enters city
    When users enters phone number
    Then user should be verified verification message on korpa page

    Examples:
      | TC_ID  |
      | SI_004 |

  @bc
  Scenario Outline: Invalid name [short name] on korpa page

    Given a user reads test data from "bcgroup" "products" by id "<TC_ID>"
    And user closes popup window
    And user add products to basket
    And user chooses payment method
    And user clicks poruci button
    When users enters name
    When users enters last name
    When users enters email
    When users enters address
    When users enters zip code
    When users enters city
    When users enters phone number
    Then user should be verified verification message on korpa page

    Examples:
      | TC_ID  |
      | SI_005 |

  @bc
  Scenario Outline: Invalid prezime [empty] on korpa page

    Given a user reads test data from "bcgroup" "products" by id "<TC_ID>"
    And user closes popup window
    And user add products to basket
    And user chooses payment method
    And user clicks poruci button
    When users enters name
    When users enters last name
    When users enters email
    When users enters address
    When users enters zip code
    When users enters city
    When users enters phone number
    Then user should be verified verification message on korpa page

    Examples:
      | TC_ID  |
      | SI_007 |

  @bc
  Scenario Outline: Invalid prezime [combination with numbers] on korpa page

    Given a user reads test data from "bcgroup" "products" by id "<TC_ID>"
    And user closes popup window
    And user add products to basket
    And user chooses payment method
    And user clicks poruci button
    When users enters name
    When users enters last name
    When users enters email
    When users enters address
    When users enters zip code
    When users enters city
    When users enters phone number
    Then user should be verified verification message on korpa page

    Examples:
      | TC_ID  |
      | SI_008 |

  @hold
  Scenario Outline: Invalid prezime [only numbers] on korpa page

    Given a user reads test data from "bcgroup" "products" by id "<TC_ID>"
    And user closes popup window
    And user add products to basket
    And user chooses payment method
    And user clicks poruci button
    When users enters name
    When users enters last name
    When users enters email
    When users enters address
    When users enters zip code
    When users enters city
    When users enters phone number
    Then user should be verified verification message on korpa page

    Examples:
      | TC_ID  |
      | SI_009 |

  @hold
  Scenario Outline: Invalid prezime [only one character] on korpa page

    Given a user reads test data from "bcgroup" "products" by id "<TC_ID>"
    And user closes popup window
    And user add products to basket
    And user chooses payment method
    And user clicks poruci button
    When users enters name
    When users enters last name
    When users enters email
    When users enters address
    When users enters zip code
    When users enters city
    When users enters phone number
    Then user should be verified verification message on korpa page

    Examples:
      | TC_ID  |
      | SI_010 |

  @bc
  Scenario Outline: Invalid prezime [only two characters] on korpa page

    Given a user reads test data from "bcgroup" "products" by id "<TC_ID>"
    And user closes popup window
    And user add products to basket
    And user chooses payment method
    And user clicks poruci button
    When users enters name
    When users enters last name
    When users enters email
    When users enters address
    When users enters zip code
    When users enters city
    When users enters phone number
    Then user should be verified verification message on korpa page

    Examples:
      | TC_ID  |
      | SI_011 |

  @bc
  Scenario Outline: Invalid adresa [empty] on korpa page

    Given a user reads test data from "bcgroup" "products" by id "<TC_ID>"
    And user closes popup window
    And user add products to basket
    And user chooses payment method
    And user clicks poruci button
    When users enters name
    When users enters last name
    When users enters email
    When users enters address
    When users enters zip code
    When users enters city
    When users enters phone number
    Then user should be verified verification message on korpa page

    Examples:
      | TC_ID  |
      | SI_012 |

  @bc
  Scenario Outline: Invalid adresa [only special characters] on korpa page

    Given a user reads test data from "bcgroup" "products" by id "<TC_ID>"
    And user closes popup window
    And user add products to basket
    And user chooses payment method
    And user clicks poruci button
    When users enters name
    When users enters last name
    When users enters email
    When users enters address
    When users enters zip code
    When users enters city
    When users enters phone number
    Then user should be verified verification message on korpa page

    Examples:
      | TC_ID  |
      | SI_013 |

  @bc
  Scenario Outline: Invalid adresa [only numbers] on korpa page

    Given a user reads test data from "bcgroup" "products" by id "<TC_ID>"
    And user closes popup window
    And user add products to basket
    And user chooses payment method
    And user clicks poruci button
    When users enters name
    When users enters last name
    When users enters email
    When users enters address
    When users enters zip code
    When users enters city
    When users enters phone number
    Then user should be verified verification message on korpa page

    Examples:
      | TC_ID  |
      | SI_014 |

  @bc
  Scenario Outline: Invalid adresa [only letters] on korpa page

    Given a user reads test data from "bcgroup" "products" by id "<TC_ID>"
    And user closes popup window
    And user add products to basket
    And user chooses payment method
    And user clicks poruci button
    When users enters name
    When users enters last name
    When users enters email
    When users enters address
    When users enters zip code
    When users enters city
    When users enters phone number
    Then user should be verified verification message on korpa page

    Examples:
      | TC_ID  |
      | SI_015 |

  @bc
  Scenario Outline: Invalid zip [empty] on korpa page

    Given a user reads test data from "bcgroup" "products" by id "<TC_ID>"
    And user closes popup window
    And user add products to basket
    And user chooses payment method
    And user clicks poruci button
    When users enters name
    When users enters last name
    When users enters email
    When users enters address
    When users enters zip code
    When users enters city
    When users enters phone number
    Then user should be verified verification message on korpa page

    Examples:
      | TC_ID  |
      | SI_016 |

  @bc
  Scenario Outline: Invalid zip [only special characters] on korpa page

    Given a user reads test data from "bcgroup" "products" by id "<TC_ID>"
    And user closes popup window
    And user add products to basket
    And user chooses payment method
    And user clicks poruci button
    When users enters name
    When users enters last name
    When users enters email
    When users enters address
    When users enters zip code
    When users enters city
    When users enters phone number
    Then user should be verified verification message on korpa page

    Examples:
      | TC_ID  |
      | SI_017 |

  @bc
  Scenario Outline: Invalid zip [only letters] on korpa page

    Given a user reads test data from "bcgroup" "products" by id "<TC_ID>"
    And user closes popup window
    And user add products to basket
    And user chooses payment method
    And user clicks poruci button
    When users enters name
    When users enters last name
    When users enters email
    When users enters address
    When users enters zip code
    When users enters city
    When users enters phone number
    Then user should be verified verification message on korpa page

    Examples:
      | TC_ID  |
      | SI_018 |

  @bc
  Scenario Outline: Invalid zip [4 numbers] on korpa page

    Given a user reads test data from "bcgroup" "products" by id "<TC_ID>"
    And user closes popup window
    And user add products to basket
    And user chooses payment method
    And user clicks poruci button
    When users enters name
    When users enters last name
    When users enters email
    When users enters address
    When users enters zip code
    When users enters city
    When users enters phone number
    Then user should be verified verification message on korpa page

    Examples:
      | TC_ID  |
      | SI_019 |

  @bc
  Scenario Outline: Invalid zip [7 numbers] on korpa page

    Given a user reads test data from "bcgroup" "products" by id "<TC_ID>"
    And user closes popup window
    And user add products to basket
    And user chooses payment method
    And user clicks poruci button
    When users enters name
    When users enters last name
    When users enters email
    When users enters address
    When users enters zip code
    When users enters city
    When users enters phone number
    Then user should be verified verification message on korpa page

    Examples:
      | TC_ID  |
      | SI_020 |

  @bc
  Scenario Outline: Invalid grad [empty] on korpa page

    Given a user reads test data from "bcgroup" "products" by id "<TC_ID>"
    And user closes popup window
    And user add products to basket
    And user chooses payment method
    And user clicks poruci button
    When users enters name
    When users enters last name
    When users enters email
    When users enters address
    When users enters zip code
    When users enters city
    When users enters phone number
    Then user should be verified verification message on korpa page

    Examples:
      | TC_ID  |
      | SI_021 |

  @bc
  Scenario Outline: Invalid grad [special characters] on korpa page

    Given a user reads test data from "bcgroup" "products" by id "<TC_ID>"
    And user closes popup window
    And user add products to basket
    And user chooses payment method
    And user clicks poruci button
    When users enters name
    When users enters last name
    When users enters email
    When users enters address
    When users enters zip code
    When users enters city
    When users enters phone number
    Then user should be verified verification message on korpa page

    Examples:
      | TC_ID  |
      | SI_022 |

  @bc
  Scenario Outline: Invalid grad [only numbers] on korpa page

    Given a user reads test data from "bcgroup" "products" by id "<TC_ID>"
    And user closes popup window
    And user add products to basket
    And user chooses payment method
    And user clicks poruci button
    When users enters name
    When users enters last name
    When users enters email
    When users enters address
    When users enters zip code
    When users enters city
    When users enters phone number
    Then user should be verified verification message on korpa page

    Examples:
      | TC_ID  |
      | SI_023 |

  @bc
  Scenario Outline: Invalid telefon [empty] on korpa page

    Given a user reads test data from "bcgroup" "products" by id "<TC_ID>"
    And user closes popup window
    And user add products to basket
    And user chooses payment method
    And user clicks poruci button
    When users enters name
    When users enters last name
    When users enters email
    When users enters address
    When users enters zip code
    When users enters phone number
    When users enters city
    Then user should be verified verification message on korpa page

    Examples:
      | TC_ID  |
      | SI_024 |


  @bc
  Scenario Outline: Invalid telefon [7 numbers] on korpa page

    Given a user reads test data from "bcgroup" "products" by id "<TC_ID>"
    And user closes popup window
    And user add products to basket
    And user chooses payment method
    And user clicks poruci button
    When users enters name
    When users enters last name
    When users enters email
    When users enters address
    When users enters zip code
    When users enters phone number
    When users enters city
    Then user should be verified verification message on korpa page

    Examples:
      | TC_ID  |
      | SI_028 |

  @bc
  Scenario Outline: Invalid telefon [15 numbers] on korpa page

    Given a user reads test data from "bcgroup" "products" by id "<TC_ID>"
    And user closes popup window
    And user add products to basket
    And user chooses payment method
    And user clicks poruci button
    When users enters name
    When users enters last name
    When users enters email
    When users enters address
    When users enters zip code
    When users enters phone number
    When users enters city
    Then user should be verified verification message on korpa page

    Examples:
      | TC_ID  |
      | SI_029 |

  @bc
  Scenario Outline: Invalid email [empty] on korpa page

    Given a user reads test data from "bcgroup" "products" by id "<TC_ID>"
    And user closes popup window
    And user add products to basket
    And user chooses payment method
    And user clicks poruci button
    When users enters name
    When users enters last name
    When users enters email
    When users enters address
    When users enters zip code
    When users enters city
    When users enters phone number
    Then user should be verified verification message on korpa page

    Examples:
      | TC_ID  |
      | SI_026 |

  @bc
  Scenario Outline: Invalid telefon [without monkey @] on korpa page

    Given a user reads test data from "bcgroup" "products" by id "<TC_ID>"
    And user closes popup window
    And user add products to basket
    And user chooses payment method
    And user clicks poruci button
    When users enters name
    When users enters last name
    When users enters email
    When users enters address
    When users enters zip code
    When users enters city
    When users enters phone number
    Then user should be verified verification message on korpa page

    Examples:
      | TC_ID  |
      | SI_027 |

  @bc
  Scenario Outline: Login, Buy products,Check number of product in the basket, Logout, Check basket again and delete all products from basket

    Given a user reads test data from "bcgroup" "products" by id "<TC_ID>"
    And user closes popup window
    And users clicks login button
    And user enters email and password for login
    Then user should be verified login action
    And user add products to basket
    Then user should verify number of items from basket on the main page
    And user clicks logout main button
    Then user should be verified logout action
    And users clicks login button
    And user enters email and password for login
    Then user should be verified login action
    Then user should verify number of items from basket on the main page
    And user deletes all products from basket
    Then user should verify that basket is empty

    Examples:
      | TC_ID  |
      | SI_031 |

  @bc
  Scenario Outline: Buy more products, click 'Poruci' button, choose method payment, filled random own data, press 'Posalji porudzbinu' button and verify that basket is empty

    Given a user reads test data from "bcgroup" "products" by id "<TC_ID>"
    And user closes popup window
    And users clicks login button
    And user enters email and password for login
    And user add products to basket
    Then user should verify number of items from basket on the main page
    And user chooses payment method
    And user clicks poruci button
    When users enters name
    When users enters last name
    When users enters email
    When users enters address
    When users enters zip code
    When users enters city
    When users enters phone number
    And user clicks posalji porudzbinu button
    Then user should verify that basket is empty

    Examples:
      | TC_ID |
      | SI_032|