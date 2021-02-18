package com.example.testingweb;

import org.junit.jupiter.api.Test;

import java.util.Iterator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

// https://java2blog.com/mockito-example/

public class TestWithMockito  {

    @Test
    public void testQuery()  {

        //arrange
        Iterator iterator = mock(Iterator.class);
        when(iterator.next()).thenReturn("Hello").thenReturn("World");

        //act
        String result =iterator.next() + " " +iterator.next();

        //assert
        assertEquals("Hello World", result);
    }
}