package io.cucumber.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class GoogleHomePage extends BasePage {

    public GoogleHomePage(WebDriver driver){
        super(driver);
    }


    By inputElement = By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input");
    By searchButton = By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[3]/center/input[1]");


    public GoogleResultsPage searchSecurePay() {
        driver.get("https://www.google.com.au");
        driver.findElement(inputElement).sendKeys("secure pay");
        driver.findElement(searchButton).click();
        return new GoogleResultsPage(driver);
    }
}
