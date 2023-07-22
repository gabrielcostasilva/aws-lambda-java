package com.example.sblambda;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

public class SimpleHandlerTest {

    @Test
    public void test() {

        var handler = new SimpleHandler();
        assertNotNull(handler);

        assertEquals(
            "HELLO WORLD", 
            handler
                .handleRequest(new Input("hello world"))
                .getMessage());

    }
}
