package com.supremepole.junit4mockito;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.*;

public class ThrowExceptionTest {

    @InjectMocks
    private ThrowException throwException;

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
    }

    /**
     * 测试失败，因为catch中没有throw
     */
    @Test(expected = Exception.class)
    public void throwExceptionWithoutThrow(){
        throwException.throwExceptionWithoutThrow();
    }

    @Test
    public void throwExceptionWithoutThrowWithoutExpected(){
        throwException.throwExceptionWithoutThrow();
    }

    /**
     * 测试通过
     */
    @Test(expected = Exception.class)
    public void throwExceptionWithThrow(){
        throwException.throwExceptionWithThrow();
    }

    /**
     * 测试不通过，因为没有expected
     */
    @Test
    public void throwExceptionWithThrowWithoutExpected(){
        throwException.throwExceptionWithThrow();
    }

}