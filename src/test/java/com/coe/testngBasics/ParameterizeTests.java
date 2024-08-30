package com.coe.testngBasics;

import org.testng.annotations.*;

public class ParameterizeTests {

    @Parameters({"browser", "version"})
    @BeforeSuite
    public void initializeBrowser(@Optional("128")String browser, @Optional("120") String version){
        System.out.println("browser :: " + browser);
        System.out.println("version :: " + version);
    }

    @Parameters("url")
    @BeforeTest
    public void launchApplication(String url){
        System.out.println("url :: " + url);
    }

    @AfterTest
    public void killSession(){
        //driver.quit();
        System.out.println("Kill Session");
    }

    @Parameters({"username", "password"})
    @Test
    public void verifyLogin(String un, String pwd){
        System.out.println("username :: " + un);
        System.out.println("password :: " + pwd);
    }
}
