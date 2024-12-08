package com.helixlab.saucedemo.tests.login.products;

import com.helixlab.saucedemo.ProductsPage;
import com.helixlab.saucedemo.base.BaseTest;
import static org.testng.Assert.*;
import org.testng.annotations.Test;


public class ProductsTest extends BaseTest{
    
    
    @Test
    public void testProductsHeaderIsDisplayed(){
        ProductsPage productsPage = loginPage.
                logIntoApplication("standard_user" , "secret_sauce"); 
        assertTrue(productsPage.isProductsHeaderDisplay(), "\n Products Header Is Not Displayed \n");
    }

}
