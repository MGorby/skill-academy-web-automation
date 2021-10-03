Feature: User Search

  Scenario: User search Basic Program courses at prices 150.000 - 200.000
    Given user open URL "https://skillacademy.com/"
    When user clicks on Search button
    And user search for "Basic Program"
    And user set price filter
    Then should display the result list of keyword "Basic Program"
    And user choose the result
    Then user redirect to "/program-detail" page