package com.briteERP.utilities;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BrowserUtils {


    public static void clickWithJS(WebElement element) {
        ((JavascriptExecutor) Driver.getDriver()).executeScript("arguments[0].scrollIntoView(true);", element);
        ((JavascriptExecutor) Driver.getDriver()).executeScript("arguments[0].click();", element);
    }

    public  static WebElement waitClicable(WebElement element){
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),20);
         return  wait.until(ExpectedConditions.elementToBeClickable(element));
    }
    public  static WebElement waitVisiblity(WebElement element){
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),20);
        return  wait.until(ExpectedConditions.visibilityOf(element));
    }
}
