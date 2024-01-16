## Domain Model Exercise 1

```
1. When I run the program a new deck of cards should be created and then they should be shuffled.

2. I should be able to select an option to display the current state of the deck.

3. I should be able to select an option to shuffle the deck.
```

| Classes | Methods                       | Scenario    | Returns                               |
|---------|-------------------------------|-------------|---------------------------------------|
| Deck    | void ShuffleDeck()            | Call method | Shuffles the deck but returns nothing |
|         | ArrayList<String> getDeckInfo | Call method | ArrayList<String> with deck info      |


```
4. I should be able to select an option to create a hand of cards dealt from the top of the deck, I can specify how many cards should be in it.

```

| Classes | Methods                      | Scenario      | Returns         |
|---------|------------------------------|---------------|-----------------|
| Hand    | ArrayList<Card> createHand() | Method called | ArrayList<Card> |
|         |                              |               |                 |


```
5. I should be able to deal out 4 hands of 5 cards each and see the dealt hands.
```

| Classes | Methods                          | Scenario      | Returns         |
|---------|----------------------------------|---------------|-----------------|
| Deck    | ArrayList<Hand>getHands(int num) | Method called | ArrayList<Hand> |


```
6. I should be able to view the top card of the deck.
```

| Classes | Methods           | Scenario      | Returns |
|---------|-------------------|---------------|---------|
| Deck    | Card seeTopCard() | Method called | Card    |
|         |                   |               |         |


```
7. I should be able to cut the cards and see a card from an arbitrary point in the deck.
```

| Classes | Methods                                     | Scenario      | Returns |
|---------|---------------------------------------------|---------------|---------|
| Deck    | Card cutDeck(int point, String topOrBottom) | Method called | Card    |
|         |                                             |               |         |
