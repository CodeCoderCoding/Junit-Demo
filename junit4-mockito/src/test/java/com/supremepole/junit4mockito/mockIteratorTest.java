package com.supremepole.junit4mockito;

import org.junit.Test;

import java.util.Iterator;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;


public class mockIteratorTest {
    @Test
    public void mockIterator(){
        Iterator i = mock(Iterator.class);
        when(i.next()).thenReturn("hello").thenReturn("world");
        String result = i.next() + " " + i.next();
        assertEquals("hello world", result);
    }

}
