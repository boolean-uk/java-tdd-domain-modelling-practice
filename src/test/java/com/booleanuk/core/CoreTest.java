package com.booleanuk.core;

import com.booleanuk.StudentRandomizer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CoreTest {

    public ArrayList<String> getTestList() {
        return new ArrayList<>(List.of(
                "Zehanpuryu", "Arariel", "Theo",
                "Zambrim", "Camiel", "Rahatiel",
                "Salathiel", "Nanael", "Sabrathan", "Gibborim"));
    }

    @Test
    public void canFetchStudentsFromFile() throws FileNotFoundException {
        StudentRandomizer studentRandomizer = new StudentRandomizer("students");
        Assertions.assertEquals(getTestList(), studentRandomizer.getStudents());
    }

    @Test
    public void throwsErrorIfFileDoesNotExist() {
        Assertions.assertThrows(FileNotFoundException.class, () -> new StudentRandomizer("not-students"));}

    @Test
    public void getsRandomStudent_SameSeed() throws FileNotFoundException {
        int seed = 70999;
        ArrayList<String> testStudents = getTestList();
        StudentRandomizer studentRandomizer = new StudentRandomizer("students", seed);
        Random random = new Random(seed);
        int bound = testStudents.size();

        Assertions.assertEquals(getTestList().get(random.nextInt(bound)), studentRandomizer.getRandomStudent());
    }

    @Test
    public void getsRandomStudent_DifferentSeed() throws FileNotFoundException {
        int seed = 70999;
        int otherSeed = 54322;
        ArrayList<String> testStudents = getTestList();
        StudentRandomizer studentRandomizer = new StudentRandomizer("students", otherSeed);
        Random random = new Random(seed);
        int bound = testStudents.size();

        Assertions.assertNotEquals(getTestList().get(random.nextInt(bound)), studentRandomizer.getRandomStudent());
    }

    @Test
    public void getsRandomPairsGetsTheCorrectAmountOfPairs() throws FileNotFoundException {
        int seed = 70999;
        StudentRandomizer studentRandomizer = new StudentRandomizer("students", seed);

        int studentCount = studentRandomizer.getStudents().size();
        if (studentCount % 2 == 0) {
            Assertions.assertEquals(studentCount / 2, studentRandomizer.getRandomPairs().size());
        } else {
            Assertions.assertEquals((studentCount / 2) + 1, studentRandomizer.getRandomPairs().size());
        }
    }
}
