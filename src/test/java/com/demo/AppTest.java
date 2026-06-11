package com.demo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {

    @Test
    void testGreet() {
        assertEquals("Hello, Maven!", App.greet("Maven"));
    }

    @Test
    void testGreetWithName() {
        assertEquals("Hello, John!", App.greet("John"));
    }
}
