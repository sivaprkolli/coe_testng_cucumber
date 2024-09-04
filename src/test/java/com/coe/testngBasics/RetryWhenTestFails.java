package com.coe.testngBasics;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RetryWhenTestFails {
    @Test
    public void payment(){
        System.out.println("payment test");
        Assert.assertTrue(true);
    }

    @Test
    public void booking(){
        System.out.println("booking test");
        Assert.assertTrue(false);
    }

    @Test
    public void loginTest(){
        System.out.println("login test");
        Assert.assertTrue(true);
    }
}
