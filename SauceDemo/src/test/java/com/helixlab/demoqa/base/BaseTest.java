    package com.helixlab.demoqa.base;

import com.helixlab.demoqa.pages.HomePage;
import com.helixlab.saucedemo.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import static utilities.Utility.setUtilityDriver;


public class BaseTest {

    private WebDriver driver;
    protected BasePage basePage;
    protected HomePage homePage;
    private String DEMOQA_URL = "https://demoqa.com/";
    
    @BeforeClass
    public void setUp(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }
    
    @BeforeMethod
    public void loadApplication(){
        driver.get(DEMOQA_URL);
        basePage = new BasePage();
        basePage.setDriver(driver);
        setUtilityDriver();
        homePage = new HomePage(); 
    }
    
    @AfterClass
    public void tearDown(){
        driver.quit();
    }
}
