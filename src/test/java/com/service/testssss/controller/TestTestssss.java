package com.service.testssss.controller;



import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestTestssss {

        TestssssDelegate testssssDelegate = new TestssssDelegate();


    @Test
    public void testhelloworld(){

        String expactReturnValue = "hello"; // You should put the expect String type value here.

        String returnValue = testssssDelegate.helloworld("hello");

        assertEquals(expactReturnValue, returnValue);
    }

}