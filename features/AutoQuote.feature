@auto @quote
Feature: Auto Quote Validation

Scenario: Get a Auto Quote
Given user is in the homepage
When user input 11418 in zipcode
And select auto from product
And click get a quote
Then user will be in about you page

@datadriven
Scenario Outline: Get Auto Quote with different sets of data
Given user is in the homepage
When user input <zipcode> in zipcode
And select auto from product
And click get a quote
Then user will be in <about you> page
And url of the page is <url>
And subtitle of the page is "<sub-title1>"
Examples:
|zipcode|about you	|url														|sub-title1				 |
|11418	|"About You"|"https://sales.geico.com/quote"|Let’s get started.|
|11425	|"About You"|"https://sales.geico.com/quote"|Let’s get started.|
|11437	|"About You"|"https://sales.geico.com/quote"|Let’s get started.|
