package com.realTest;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC1 {
    @BeforeMethod
    void beforeMethod() {
        System.out.println("This will execute BEFORE each method");
    }
    @Test
    void test1() {
        System.out.print("inside test1");
    }
    @Test(priority = 0, enabled = false)
    void test2() {
        System.out.print("inside test 2");
    }

    @AfterMethod(enabled = false)
    void afterMethod() {
        System.out.println("This will execute AFTER each method");
    }
}
