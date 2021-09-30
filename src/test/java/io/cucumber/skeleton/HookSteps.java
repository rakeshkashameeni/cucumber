package io.cucumber.skeleton;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class HookSteps {
    public TestContext context;

    public HookSteps(TestContext context){
        this.context = context;
    }

    @Before
    public void startBrowser(){
        System.setProperty("webdriver.chrome.driver",
                "target/test-classes/chromedriver94");
        context.driver = new ChromeDriver();
        context.driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
    }

    @After
    public void closeBrowser(){
        WebDriver driver = context.driver;
        Set<String> allWindowHandles = driver.getWindowHandles();
        Iterator<String> iterator = allWindowHandles.iterator();

        while (iterator.hasNext()) {
            String ChildWindow = iterator.next();
            driver.switchTo().window(ChildWindow);
            driver.close();
        }

        try{
            driver.quit();
        }catch (Exception ex){
            System.out.println("Exception occurred" + ex.getMessage());
        }

    }



}