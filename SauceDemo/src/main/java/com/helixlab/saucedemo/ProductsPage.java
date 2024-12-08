package com.helixlab.saucedemo;

import org.openqa.selenium.By;


public class ProductsPage extends BasePage{
    
    private By productsHeader = By.xpath("//span[text()='Products']");
    
    public boolean isProductsHeaderDisplay() {
        return find(productsHeader).isDisplayed();
    }
}
