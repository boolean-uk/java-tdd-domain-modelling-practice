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

### Domain Model

| Classes           | Methods                            | Member Variables                                   | Scenario                                               | Outputs / Throws                       |
|-------------------|------------------------------------|----------------------------------------------------|--------------------------------------------------------|----------------------------------------|
| StudentRandomizer | fetchStudentsFromFile(String file) | ArrayList\<String> students                        | Successfully fetched students from file                | void                                   |
|                   |                                    |                                                    | Could not fetch students from file (e.g. file missing) | Throws IOException                     |
|                   | getRandom()                        | ArrayList\<String> students<br/> Random randomizer | Random student chosen                                  | String student                         |
|                   | getRandomPairs()                   | ArrayList\<String> students<br/> Random randomizer | Random pairs generated                                 | ArrayList\<String[2]> pair             |
|                   | getRandomPeerGroups(int size)      | ArrayList\<String> students<br/> Random randomizer | Random peer groups generated                           | ArrayList\<String[int size]> peerGroup |