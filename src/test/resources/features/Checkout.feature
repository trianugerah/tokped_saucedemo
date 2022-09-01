Feature: Checkout items

  @test_01
  Scenario: Checkout Items
    Given user go to login page
    And User login with username "standard_user" and password "secret_sauce" on login page
    And User navigate to Product page
    And User click sort the product from the highest priced
    And User verify product display
    And User click first product
    And User verify the PDP display
    When User click add to cart button
    And User verify the chart number added and click the chart icon
    And User navigate to Your Chart Page
    Then user validate the product in your chart page
    And user click checkout button in your chart page
    And User input first name "Tri" and last name "Anugrah"
    And User input postal code "16135"
    And User click continue button
    And User navigate to checkout overview page
    And User verify product order status
    And User verify total price display on checkout overview page
