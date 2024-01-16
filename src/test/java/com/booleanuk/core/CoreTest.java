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
    public void canFetchStudentsFromFile() {
        StudentRandomizer studentRandomizer = new StudentRandomizer("students");
        Assertions.assertDoesNotThrow(studentRandomizer::fetchStudentsFromFile);
        Assertions.assertEquals(getTestList(), studentRandomizer.getStudents());
    }

    @Test
    public void throwsErrorIfFileDoesNotExist() {
        StudentRandomizer studentRandomizer = new StudentRandomizer("not-students");
        Assertions.assertThrows(FileNotFoundException.class, studentRandomizer::fetchStudentsFromFile);
    }

    @Test
    public void getsRandomStudent_SameSeed() {
        int seed = 70999;
        ArrayList<String> testStudents = getTestList();
        StudentRandomizer studentRandomizer = new StudentRandomizer("students");
        Random random = new Random(seed);
        int bound = testStudents.size();

        Assertions.assertEquals(getTestList().get(random.nextInt(bound)), studentRandomizer.getRandomStudent(seed));
    }

    @Test
    public void getsRandomStudent_DifferentSeed() {
        int seed = 70999;
        int otherSeed = 54322;
        ArrayList<String> testStudents = getTestList();
        StudentRandomizer studentRandomizer = new StudentRandomizer("students");
        Random random = new Random(seed);
        int bound = testStudents.size();

        Assertions.assertNotEquals(getTestList().get(random.nextInt(bound)), studentRandomizer.getRandomStudent(otherSeed));
    }
}
