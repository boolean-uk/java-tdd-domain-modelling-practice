# Java Domain Modelling Practice Exercises

## Learning Objectives
- Create domain models for various exercises
- Implement tests for the exercises
- Write the code that meets the criteria detailed in the tests using the Red-Green-Refactor methodology
 
## Exercise 1

Implement a random student selector similar to the one used during lessons.

### User Stories

```
1. When I run the program I see a menu giving me options to use each of the functions of the program.

2. When I select the option it will output a randomly chosen student from the list.

3. When I select the option it will output a list of all of the students as randomly chosen pairs.

4. When I select the option it will output a random list of Peer Groups for all of the students (groups of 4 students).

5. When I run the program it should load the list of current students from a text file.
```

## 1

Class Main

| Class Variables | Methods   | Scenarios                                | Output/Return |
|-----------------|-----------|------------------------------------------|---------------|
|                 | menu()    | Menu shows the different functionalities | void          |
|                 |           | of the program in terminal               |               |
|                 | program() |                                          | void          |



## 2

Class Main

| Class Variables                  | Methods         | Scenarios                 | Output/Return           |
|----------------------------------|-----------------|---------------------------|-------------------------|
| ArrayList<String> listOfStudents | randomStudent() | Calculates random student | String getRandomStudent |
| Random rand                      |                 |                           |                         |
|                                  |                 |                           |                         |


## 5

Class Main

| Class Variables                  | Methods            | Scenarios                | Output/Return |
|----------------------------------|--------------------|--------------------------|---------------|
| ArrayList<String> listOfStudents | makeListFromFile() | Makes a list of students | void          |
|                                  |                    | from file and sets class |               |
|                                  |                    | variable list to this    |               |




## Exercise 2

Thinking about the Poker Challenge implement a deck of cards (52 cards - 4 suits - 13 cards per suit)

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

