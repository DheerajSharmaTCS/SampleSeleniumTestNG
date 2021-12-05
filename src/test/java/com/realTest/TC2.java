package com.realTest;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TC2 {

    @Test
    void test3() {
        System.out.print("inside test 3");
    }
    @Test
    void test4() {
        System.out.print("inside test 4");
    }
    @BeforeTest
    void beforeTest(){
        System.out.println("This will run before Test");
    }
    @AfterTest
    void afterTest(){
        System.out.println("This will run after Test");
    }
}
