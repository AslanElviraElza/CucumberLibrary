@editBook
  Feature: Edit Book
    Agile Story: As a Librarian I should be able to edit books

  # Verify that the user can edit a book after it was created
    Scenario: Librarian should be able to edit on book info
      Given user is on the Home Page
      When user logs in as a librarian

      Given user is on the dashboard page
      When user clicks the Books module
      And user tries to make edits
      Then user should be able to see info edited