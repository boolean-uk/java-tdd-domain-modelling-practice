## Random student selector

### User Stories
```
1. 
When I run the program 
I see a menu giving me options to use each of the functions of the program.
```
```
2. 
When I select the option 
it will output a randomly chosen student from the list.
```
```
3. 
When I select the option 
it will output a list of all of the students as randomly chosen pairs.
```
```
4. 
When I select the option 
it will output a random list of Peer Groups for all of the students (groups of 4 students).
```
```
5. 
When I run the program 
it should load the list of current students from a text file.
```
Random Student Selector Class

| Methods                 | Member Variables     |
|-------------------------|----------------------|
| printRandomStudent()    | String[] listOfNames |
| printRandomPairs()      | Random randomiser    |
| printRandomFourGroups() |                      |
| loadTextFile()          |                      |
| startProgram()          |                      |

| Scenario                                                    | Return Value/Output/Result                                                                                |
|-------------------------------------------------------------|-----------------------------------------------------------------------------------------------------------|
| Chooses option for random student.                          | Outputs name of a random student.                                                                         |
| Chooses option for random student twice.                    | With the right seed, outputs name of two different students.                                              |
| Chooses option for random pairs. Even number of students.   | Outputs randomly chosen pairs of students.                                                                |
| Chooses option for random pairs. Uneven number of students. | Outputs randomly chosen pairs of students. Last student will be printed alone on the last row.            |
| Chooses option for random groups. Divisible by 4.           | Outputs randomly chosen groups of students.                                                               |
| Chooses option for random groups. Not divisible by 4.       | Outputs randomly chosen groups of students. Last group will be printed on the last row with < 4 students. |
| Loads a text file in to the program with student names.     | Saves the student names to listOfNames for later use.                                                     |


