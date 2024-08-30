package com.coe.testngBasics;

import org.testng.annotations.Test;

public class GroupsTests {

    @Test(groups = "smoke")
    public void payment(){
        System.out.println("payment test");
        System.out.println(Thread.currentThread().getId());
        System.out.println(Thread.currentThread().getName());
    }

    @Test(groups = {"regression"})
    public void booking(){
        System.out.println("booking test");
        System.out.println(Thread.currentThread().getId());
        System.out.println(Thread.currentThread().getName());
    }

    @Test(groups = {"smoke","regression","validation"})
    public void loginTest(){
        System.out.println("login test");
        System.out.println(Thread.currentThread().getId());
        System.out.println(Thread.currentThread().getName());
    }

    @Test(groups = "validation")
    public void confirmation(){
        System.out.println("confirmation test");
        System.out.println(Thread.currentThread().getId());
        System.out.println(Thread.currentThread().getName());
    }

    @Test(groups = {"validation", "smoke"})
    public void smsConfirmation(){
        System.out.println("smsConfirmation test");
        System.out.println(Thread.currentThread().getId());
        System.out.println(Thread.currentThread().getName());
    }

    @Test(groups = {"validation", "regression"})
    public void emailConfirmation(){
        System.out.println("emailConfirmation test");
        System.out.println(Thread.currentThread().getId());
        System.out.println(Thread.currentThread().getName());
    }
}
