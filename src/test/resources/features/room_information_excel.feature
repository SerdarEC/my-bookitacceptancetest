Feature: room information functionality


  Scenario: Room details
    Given user on the login page
    When user logs in using "daldie7l@seattletimes.com" and "ruthannjohnes"
    Then correct room information should be displayed for light side
#    And room information should be displayed as given in "file_path" "sheetname"


  Scenario Outline: my information data driven test with excel <user_name>
    Given user on the login page
    And user logs in using "<user_email>" and "<user_password>"
    When my self page should display personal information for that user

    Examples:
      | user_email                    | user_password     |
      | lruffli93@dailymail.co.uk     | menardnewbatt     |
      | elaye8m@wikipedia.org         | tabordullingham   |
      | sweeklybh@spotify.com         | bartletcarlin     |
      | ucarlislebv@gizmodo.com       | herbyedwicke      |
      | strayford84@e-recht24.de      | carlosmichie      |
      | jrowesby8h@google.co.uk       | aldridgegrimsdith |
      | mnewbatt8o@utexas.edu         | opalcave          |
      | teachervamikemarcus@gmail.com | mikemarcus        |
      | kpenvarne87@w3.org            | marianspinley     |
      | vwincklec5@latimes.com        | standfordboase    |
      | rkernocke7m@cnet.com          | merrileeambler    |
      | bcircuit81@whitehouse.gov     | heinriksummersett |
      | fbawmeb7@studiopress.com      | sherilyngohn      |
      | bczadla7p@uol.com.br          | humphreyalsop     |
      | kodonnelly7t@bigcartel.com    | robertamurrison   |
      | nshearsby7w@uiuc.edu          | lorettebradnum    |
      | sbirdbj@fc2.com               | asenorval         |
      | efieldenba@cbslocal.com       | claudinebarnsley  |
      | kcotterelbq@homestead.com     | hannierrington    |
      | alanneybc@booking.com         | randenemacgown    |
      | aneagle7h@miibeian.gov.cn     | bennetttomanek    |
      | iclementet8y@bluehost.com     | ursalaklimes      |
      | mstacey8r@imdb.com            | skylargiblin      |