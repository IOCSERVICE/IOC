package com.service.aqaa.controller;



import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestAqaa {

        AqaaDelegate aqaaDelegate = new AqaaDelegate();


    @Test
    public void testhelloworld(){

        String expactReturnValue = "hello"; // You should put the expect String type value here.

        String returnValue = aqaaDelegate.helloworld("hello");

        assertEquals(expactReturnValue, returnValue);
    }

}