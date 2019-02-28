Feature: User roles
    # in the given you need to figure out a way to find out if there are any available spots

  # ctrl+shift+f   ---> search in project

  # ctrl+shift+r   ---> search in project

@wip
  Scenario Outline: login as <user> type
    Given the user logs in as a light-side <user>
    And there are available spots for scheduling
    When the user hunts for a spot
    Then book button <expected> be displayed

    Examples:
      | user        | expected   |
      | team member | should not |
      | team lead   | should     |
      | teacher     | should     |
