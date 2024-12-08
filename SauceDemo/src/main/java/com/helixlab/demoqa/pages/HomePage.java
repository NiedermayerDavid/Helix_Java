package com.helixlab.demoqa.pages;

import com.helixlab.demoqa.pages.forms.FormsPage;
import com.helixlab.saucedemo.BasePage;
import org.openqa.selenium.By;
import static utilities.JavaScriptUtility.scrollToElementJS;

public class HomePage extends BasePage{
    
    private By fromsCard = By.xpath("//div[@id='app']//h5[text()='Forms']");
    
    public FormsPage goToForms(){
        scrollToElementJS(fromsCard);
        click(fromsCard);
        return new FormsPage();
    }

}
