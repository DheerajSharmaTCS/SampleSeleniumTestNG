package com.realTest;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependencyExample {

    @Test
    void startCar(){
        System.out.println("Start Car");
      //  Assert.assertEquals(1,2);
    }
    @Test(dependsOnMethods = {"startCar"}, groups = {"sanity"})
    void driveCar(){
        System.out.println("Drive Car");
    }
    @Test(groups = {"reression"})
    void stopCar(){
        System.out.println("Stop Car");
    }
    @Test(dependsOnMethods = {"startCar"},alwaysRun = true)
    void parkCar(){
        System.out.println("Park Car");
    }
    @Test(groups = {"sanity", "regression"})
    void washCar(){
        System.out.println("Wash Car");
    }
}
