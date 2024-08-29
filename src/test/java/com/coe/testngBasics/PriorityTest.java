package com.coe.testngBasics;

import org.testng.annotations.Test;

public class PriorityTest {

    @Test(priority = 3)
    public void payment(){
        System.out.println("payment test");
    }

    @Test(priority = 2)
    public void booking(){
        System.out.println("booking test");
    }

    @Test(priority = 1)
    public void loginTest(){
        System.out.println("login test");
    }

}
