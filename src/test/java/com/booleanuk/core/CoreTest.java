package com.booleanuk.core;

import com.booleanuk.StudentRandomizer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

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
}
