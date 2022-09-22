package com.supremepole.junit4mockito;

/**
 * @ClassName ThrowException
 * @Description
 * @Date 2022/9/22 14:25
 * @Version 1.0.0
 **/
public class ThrowException {

    public void throwExceptionWithoutThrow(){
        try{
            throw new NumberFormatException();
        }catch(Exception exception){
        }
    }

    public void throwExceptionWithThrow(){
        try{
            throw new NumberFormatException();
        }catch(Exception exception){
            throw exception;
        }
    }

}
