@Login
Feature: As a user I should be able to loginto with username and password

  Scenario: Lagin as a librarian

    Given user is on the Home Page
    When user logs in as a librarian
    Then user should be able to see dashboard page


  #Verify that the user can edit a book after it was created
#@student
#  Scenario: Login as a student
#    Given I am on the login page
#    When I login as a student
#    Then dashboard should be displayed
