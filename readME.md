# selenium-cucumber-java

selenium-cucumber : Automation Testing Using Java

selenium-cucumber is a behavior driven development (BDD) approach to write automation test script to test Web.
It enables you to write and execute automated acceptance/unit tests.
It is cross-platform, open source and free.
Automate your test cases with minimal coding.
[More Details](http://seleniumcucumber.info/)

## Steps to execute the Test

1. Using an IDE (Eclipse or Intellij ) : Run from the Junit TestRunner or from feature file, execution can be triggered as Cucumber feature.

## Configuration related to automation design

This is a hybrid framework buit using different component - Selenium with Serenity-Cucumber , Junit , Cucumber , Page Object Model with Cucumber HTML report

1. Properities file used to define the browser and test url details.

2. Cucumber framework related components (Feature , Stepdefinition, runner files) maintained in package src\test\java

3. WebDriverManager Used for picking the driver file automatically

4. Page actions, web elements are maintained in individual packages for easy maintanance.
