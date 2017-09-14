#Background:
#Common Steps that needs to be run before every scenario.

@featureTest
Feature: GMAIL LOGIN Working OK



  # @Scenario1
  # Scenario: Successful Login
  #  Given enter gmail url
  #   When enter credentials
  #    | Fields   | values                     |
  #   | username | vishhal.bhopal22@gmail.com |
  #  And Press submit
  #  Then gmail successfully login
  #  @Scenario2
  #Scenario: Successful Login
  # Given enter gmail url
  # When enter credentials
  #   | Fields   | values                     |
  #   | username | vishhal.bhopal22@gmail.com |
  # And Press submit
  # Then gmail successfully login
  #   @Scenario3
  #Scenario: Successful Login
  #  Given enter gmail url
  # When enter credentials
  #   | Fields   | values                     |
  #   | username | vishhal.bhopal22@gmail.com |
  #  And Press submit
  #  Then gmail successfully login
  
  
  #@Feature1
  @Hooks
  Scenario Outline: Successful Login
    Given enter gmail url
    When enter "<credentials>"
    And Press submit
    Then gmail successfully login

    Examples: 
      | credentials |
      | vishal.bh@gmail.com  |

    
