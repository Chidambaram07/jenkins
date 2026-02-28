package com.iaf;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {

    @Test
    public void testMotto() {
        assertEquals("Touch The Sky With Glory", App.getMotto());
    }
}