Feature:  Search Flight One Way

Background:
    Given User is on home page of application

Scenario Outline: Search Flight One Way
    When User Selects OneWay Trip
        And User Enters SourceAndDestination "<SourceLocation>", "<DestinationLocation>"
        And User Selects DepartureDateAndAdultCount "<DepartureDate>" ,"<adultsCount>"
        And User Click Search Button

    Examples:
        |SourceLocation|DestinationLocation|DepartureDate|adultsCount|
        |Mumbai          |Delhi            |  10/02/2019 |5          |


    Scenario Outline: Search Flight Two Way
        When User Selects TwoWay Trip
        And User Enters SourceAndDestination "<SourceLocation>", "<DestinationLocation>"
        And User Selects DepartureDateAndReturnDateAndAdultCount "<DepartureDate>" ,"<ReturnDate>","<adultsCount>"
        And User Click Search Button

        Examples:
            |SourceLocation|DestinationLocation|DepartureDate|ReturnDate|adultsCount|
            |Mumbai          |Delhi            |  10/02/2019 |10/02/2019|5          |


#
#  Scenario Outline: Search Flight Round Trip
#    Given User is on home page of application
#    When User Selects Round Trip
#    Then User Enters "<SourceLocation>"
#    Then User Enter "<DestinationLocation>"
#    Then User Selects departure date "<DepartureDate>"
#    Then User Selects return date "<ReturnDate>"
#    Then Select adults "<adultsCount>"
#    Then User Selects Children "<childrenCount>"
#    Then User Selects infant "<infantCount>"
#    Then user Click Search Button
##    Then user close browser
#    Examples:
#      |SourceLocation|DestinationLocation|DepartureDate|ReturnDate|adultsCount|childrenCount|infantCount|
#      |Pune          |Mumbai             |  29         |29        | 5         |1            |1          |


#  Scenario: Search Flight One Way
#    Given User is on home page of application
#    When User Selects OneWay Trip
#    Then User provides Source Location and Destination Location
#    |Source|Destination|
#    |Delhi |Pune       |
#    |Mumbai|Pune       |