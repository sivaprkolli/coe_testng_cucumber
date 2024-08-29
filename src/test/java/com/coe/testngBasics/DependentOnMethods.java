package com.coe.testngBasics;

import org.testng.annotations.Test;

public class DependentOnMethods {

    @Test
    public void loginTest(){
        System.out.println("login test");
    }

    @Test(dependsOnMethods = "loginTest")
    public void booking(){
        System.out.println("booking test");
    }

    @Test(dependsOnMethods = "booking")
    public void payment(){
        System.out.println("payment test");
    }

    @Test(dependsOnMethods = "loginTest", priority = 1)
    public void verifyUserDetails(){
        System.out.println("verifyUserDetails");
    }

    @Test
    public void contactHelpDesk(){
        System.out.println("Contact help desk test");
    }

}
