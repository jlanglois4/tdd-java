Yahtzee
=================
Yahtzee is a dice game in which players take turns rolling five six-sided dice. At the end of a player's turn, 
the dice are ranked similar to poker hands (minus the faces of the poker cards): three of a kind, full house, etc.

Using test-driven development, create an application that will rank a "hand" of dice in Yahtzee 
and tell you what type it is. It should be able to distinguish:

## TDD Test Lists

* Five of a kind (Yahtzee) = Five of the same dice
* Four of a kind (Large Straight) = Four of the same dice
* Three of a kind = Three of the same dice
* Full house = Three of the same dice, plus two dice of the same value
* Two pair = Two sets of the same dice
* One pair = One set of the same dice
* One of a kind = One dice