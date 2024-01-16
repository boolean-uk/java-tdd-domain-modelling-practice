
RandomStudentSelector

| Methods               | Member variables           | Scenario                                             | Output                                                     |
|-----------------------|----------------------------|------------------------------------------------------|------------------------------------------------------------|
| showMenu()            |                            | When user runs program                               | The menu presented as a string                             |
| getRandomStudent()    | ArrayList<String> students | When user selects the option to get a random student | A random student name from the students list               |
| getRandomPairs()      | Random randomiser          | If the number of students is even                    | A list of the pairs                                        |
|                       |                            | If the number of students is odd                     | A list of the pairs and one student without a partner      |
| getRandomGroups()     |                            | If the number of students is divisible by 4          | A list of the groups                                       |
|                       |                            |                                                      | A list of the groups and one group with 1-3 students in it |
| loadFile(String file) |                            | When user runs program                               | Void                                                       |




Deck

| Methods                            | Member variables      | Scenario                                                | Output                                                  |
|------------------------------------|-----------------------|---------------------------------------------------------|---------------------------------------------------------|
| create()                           | ArrayList<Card> cards | User runs program                                       | void                                                    |
| shuffle()                          |                       | User runs program or when they choose to shuffle        | void                                                    |
| createHand(int noOfCards)          |                       | User chooses to create a hand                           | List of specified no of cards                           |
| deal(int noOfHands, int noOfCards) |                       | User chooses to deal                                    | A list of hands consisting of the specified no of cards |
| viewTopCard()                      |                       | User chooses to view top card                           | The card first in the cards list                        |
| cut()                              |                       | User wants to see card from arbitrary point in the deck | void                                                    |




Card

| Member variable |
|-----------------|
| int value       |
| String suite    |
