package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {

    App app = new App();

    @Test
    public void testAddMarks() {
        assertEquals(175, app.addMarks(85, 90));
    }

    @Test
    public void testStudentDetails() {
        assertTrue(app.getStudentDetails().contains("Lohitha"));
    }
}