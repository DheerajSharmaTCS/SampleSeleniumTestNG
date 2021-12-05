package com.realTest;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SecondTestCaseProgram {

    @Test
    public void setUp(){
        System.out.print("inside SetUp");
    }
    @Test
    public void fun(){
        System.out.print("aBCd");
        Assert.assertEquals(1,1);
    }
    @Test
    public void fun2(){
        System.out.print("aBCd123");
    }
    @Test
    public void tearDown(){
        System.out.print("inside Tear Down");

    }
}
