package com.helixlab.saucedemo.tests.login;

import com.helixlab.saucedemo.base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;


public class LoginTests extends BaseTest{
    
    @Test
    public void testLoginErrorMessage(){
        loginPage.setUsername("standard_user");
        loginPage.setPassword("12346z7u8i9");
        loginPage.clickLoginButton();
        
        String actualMessage = loginPage.getErrorMessage();
        
        Assert.assertTrue(actualMessage.contains("Epic sadface"));
    }
}
