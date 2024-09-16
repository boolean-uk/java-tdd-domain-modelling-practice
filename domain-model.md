# Domain models

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


| Classes                | Methods            | Members           | Scenario                         | Outputs/Results                      |
|------------------------|--------------------|-------------------|----------------------------------|--------------------------------------|
| RandomStudentSelector  | showMenu()         |                   | {1}When starting the program     | Nicely formatted string of options.  |
|                        |                    |                   | the menu of options should       |                                      |      
|                        |                    |                   | be displayed to the user.        |                                      |
| RandomStudentSelector  | getRandomStudent() | String[] students | {2}Option for random student     | String name of a random student.     |
|                        |                    |                   | is selected.                     |                                      |
| RandomStudentSelector  | getPairs()         | String[] students | {3}Option for random pairs       | ArrayList<String[]> pairs.           |
|                        |                    |                   | is selected.                     |                                      |
| RandomStudentSelector  | getGroups()        | String[] students | {4}Option for random peer groups | ArrayList<String[]> groups.          |
|                        |                    | int groupSize     | is selected.                     |                                      |
| RandomStudentSelector  | loadStudents()     | text file with    | {5}Starting the program student  | boolean couldLoad. String[] students |
|                        |                    | students names    | names are loaded from text file. | saved in the class.                  |
