package com.example.testingweb;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class TestWithMockAnnotation  {

    @Mock
    private List list;

    @Test
    public void testQuery()  {

        //arrange
        when(list.get(1)).thenReturn("Second element");
//        when(list.get(2)).thenReturn("Third element");

        String secondElementFromList=(String)list.get(1);

        //assert
        assertEquals("Second element", secondElementFromList);
    }
}
