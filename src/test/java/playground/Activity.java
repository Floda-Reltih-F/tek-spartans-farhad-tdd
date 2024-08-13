package playground;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.security.PrivateKey;
import java.security.PublicKey;

public class Activity {

    private WebDriver driver;

    @BeforeMethod
    public void setupTest(){
        driver = new ChromeDriver();
        driver.get("https://www.facebook.com");
    }
    @Test
    public void testFacebook(){
        String pageTitle = driver.getTitle();
        Assert.assertEquals(pageTitle, "Facebook - log in or sign up");
    }

    @AfterMethod
    public void quiting(){
        driver.quit();
    }






}
