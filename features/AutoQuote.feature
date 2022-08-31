@auto @quote
Feature: Auto Quote Validation

Scenario: Get a Auto Quote
Given user is in the homepage
When user input 11418 in zipcode
And select auto from product
And click get a quote
Then user will be in about you page