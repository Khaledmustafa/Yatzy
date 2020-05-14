Feature: Yatzy Game
  As a player i would like to play Yazy
  
Scenario: The Dice
Given Create a dice 
When Throw one dice, save and show the score point
And Throw more than one dice, save and show the score point for each dice
Then Calculate the number of points in different ways according to rules



