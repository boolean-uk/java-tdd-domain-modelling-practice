### User Stories

```
1. When I run the program I see a menu giving me options to use each of the functions of the program.

2. When I select the option it will output a randomly chosen student from the list.

3. When I select the option it will output a list of all of the students as randomly chosen pairs.

4. When I select the option it will output a random list of Peer Groups for all of the students (groups of 4 students).

5. When I run the program it should load the list of current students from a text file.
```

| Classes | Methods         | Scenarios             | Outputs         |
|---------|-----------------|-----------------------|-----------------|
| Main    | showMenue()     | User starts program   | String menue    |
|         | randomStudent() | User selects option 1 | String student  |
|         | pairStudents()  | User selects option 2 | String pairs    |
|         | peerStudents()  | User selects option 3 | String peers    |
|         | showStudents()  | User selects option 4 | String students |


```
1. When I run the program a new deck of cards should be created and then they should be shuffled.

2. I should be able to select an option to display the current state of the deck.

3. I should be able to select an option to shuffle the deck.

4. I should be able to select an option to create a hand of cards dealt from the top of the deck, I can specify how many cards should be in it.

5. I should be able to deal out 4 hands of 5 cards each and see the dealt hands.

6. I should be able to view the top card of the deck.

7. I should be able to cut the cards and see a card from an arbitrary point in the deck.

```

| Classes | Methods           | Scenarios                         | Outputs                                       |
|---------|-------------------|-----------------------------------|-----------------------------------------------|
| Poker   | createDeck()      | creates a deck with 52 cards      | create an array of Cards                      |
|         | shuffleDeck()     | randomly shuffles deck            | Randomly swap places for cards in the array   |
|         | displayDeck()     | displays the deck                 | Print the current array                       |
|         | createHand()      | Create a hand from top five cards | print 5 consecutive cards from starting point |
|         | createFourHands() | Create 4 hands                    | print 4 hands                                 |
|         | topCard()         |                                   | print index 0 in array                        |
|         | cutDeck(int cut)  |                                   | print card at index cut                       |
| Card    | getHand           | get the cards in the hand         | String cards in hand                          |
|         |                   |                                   |                                               |
