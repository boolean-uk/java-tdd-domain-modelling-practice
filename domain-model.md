## Domain Model for Student Selector

### User Stories

```
1. When I run the program I see a menu giving me options to use each of the functions of the program.

2. When I select the option it will output a randomly chosen student from the list.

3. When I select the option it will output a list of all of the students as randomly chosen pairs.

4. When I select the option it will output a random list of Peer Groups for all of the students (groups of 4 students).

5. When I run the program it should load the list of current students from a text file.
```

### Domain Model

Student Selector 

| Member Variables   | Methods           | Scenario                                                   | Output                                        |
|--------------------|-------------------|------------------------------------------------------------|-----------------------------------------------|
| Random randomiser  | menu()            | menu of options over functions of program.                 | a simple dropdown menu with function options. |
| ArrayList<String\> | randomStudent()   | when selected from menu chooses a student randomly.        | one student from student list.                |
|                    | randomPairs()     | when selected from menu displays students in random pairs. | all students divided into pairs.              |
|                    | randomGroups()    | when selected from menu divides into random peer groups.   | all students divided into groups of 4.        |
|                    | loadStudentFile() | loads list of students when program runs                   | -                                             |


## Domain Model for Poker Challenge

### User Stories

```
1. When I run the program a new deck of cards should be created and then they should be shuffled.

2. I should be able to select an option to display the current state of the deck.

3. I should be able to select an option to shuffle the deck.

4. I should be able to select an option to create a hand of cards dealt from the top of the deck, I can specify how many cards should be in it.

5. I should be able to deal out 4 hands of 5 cards each and see the dealt hands.

6. I should be able to view the top card of the deck.

7. I should be able to cut the cards and see a card from an arbitrary point in the deck.
```

### Domain Model

| Member Variables      | Methods              | Scenario                                                                | Output                                  |
|-----------------------|----------------------|-------------------------------------------------------------------------|-----------------------------------------|
| Random randomiser     | shuffle()            | shuffles deck. runs once when deck of cards is created, then on demand. | a deck of cards in random order         |
| ArrayList<Card> cards | showDeck()           | displays the current state of the deck.                                 | the order of the cards in the deck.     |
|                       | dealHand(int cards)  | deals a hand of specified amount of cards from the top of the deck.     | the first N cards of the shuffled deck. |
|                       | deal4HandsOf5Cards() | deals out 4 hands of 5 cards and shows the dealt hands.                 | 4 hands of 5 cards.                     |
|                       | viewTopCard()        | displays the top card of the deck.                                      | one card, the first card of the deck.   |
|                       | seeCard(int card)    | shows the card from an arbitrary point in the deck (1-52).              | one card, the i-th card in the deck.    |



