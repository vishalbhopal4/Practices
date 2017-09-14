Feature: GMAIL LOGIN Working OK


  Scenario: Successful Login
    Given enter gmail url
    When enter credentials
    And Press submit
    Then gmail successfully login
