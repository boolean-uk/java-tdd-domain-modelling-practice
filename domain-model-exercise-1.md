## Domain Model Exercise 1

```
1. When I run the program I see a menu giving me options to use each of the functions of the program.
```

| Classes        | Methods                                          | Scenario       | Returns                                                        |
|----------------|--------------------------------------------------|----------------|----------------------------------------------------------------|
| RandomStudents | void displayOptions()<br/>String displayString() | Start program  | Menu containing strings showcasing options 1-4 and description |

```
2. When I select the option it will output a randomly chosen student from the list.
```

| Classes        | Methods                                             | Scenario                  | Returns                                    |
|----------------|-----------------------------------------------------|---------------------------|--------------------------------------------|
| RandomStudents | void displayOptions()<br/>String getRandomStudent() | Input '1' on the keyboard | String with random selected name from list |

```
3. When I select the option it will output a list of all of the students as randomly chosen pairs.
```

| Classes        | Methods                                                             | Scenario                  | Returns                               |
|----------------|---------------------------------------------------------------------|---------------------------|---------------------------------------|
| RandomStudents | void displayOptions()<br/>ArrayList<String> getRandomStudentPairs() | Input '2' on the keyboard | ArrayList with random pairs from list |

```
4. When I select the option it will output a random list of Peer Groups for all of the students (groups of 4 students).
```

| Classes        | Methods                                                              | Scenario                  | Returns                                |
|----------------|----------------------------------------------------------------------|---------------------------|----------------------------------------|
| RandomStudents | void displayOptions()<br/>ArrayList<String> getRandomStudentGroups() | Input '3' on the keyboard | ArrayList with random groups from list |

```
5. When I run the program it should load the list of current students from a text file.
```

| Classes        | Methods           | Scenario    | Returns                                |
|----------------|-------------------|-------------|----------------------------------------|
| RandomStudents | String loadList() | Run program | ArrayList containing names of students |
|                |                   |             |                                        |
