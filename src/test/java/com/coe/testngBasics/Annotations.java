package com.coe.testngBasics;

import org.testng.Assert;
import org.testng.annotations.*;

public class Annotations {
    @BeforeMethod
    public void beforeMethod(){
        System.out.println("beforeMethod");
    }

    @BeforeTest
    public void beforeTest(){
        System.out.println("beforeTest");
    }

    @BeforeClass
    public void beforeClass(){
        System.out.println("beforeClass");
    }

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("beforeSuite");
    }



    @Test
    public void verifyLoginSuccess(){
        System.out.println("verifyLoginSuccess");
        Assert.assertTrue(true);
    }

    @Test
    public void verifyRegistrationSuccess(){
        System.out.println("verifyRegistrationSuccess");
        Assert.assertTrue(true);
    }
}
