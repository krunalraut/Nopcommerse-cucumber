package org.example;

import org.example.BaseProject;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Util extends BaseProject {
    //for waiting until element is clickable
    public void waitUntilElementIsClickAble(By by, int time)
    {
        WebDriverWait wait =new WebDriverWait(driver,time);
        wait.until(ExpectedConditions.elementToBeClickable(by));
    }
    //for waiting until element is visible
    public void waitUntilElementVisible(By by,int time)
    {
        WebDriverWait wait= new WebDriverWait(driver,time);
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }
    //for click on link
    public void clickOnElement(By by,int time)
    {
        waitUntilElementIsClickAble(by,time);
        driver.findElement(by).click();
    }
    //for getting text from page
    public String getTextFromElement(By by, int time) {
        waitUntilElementVisible(by,time);
        return driver.findElement(by).getText();
    }
    //for enter text to textbox
    public void typeText(By by, String text, int time)
    {
        waitUntilElementIsClickAble(by,time);
        driver.findElement(by).sendKeys(text);
    }
    //for selecting opton from list dropdown by index
    public void selectFromListByIndex(By by,int index, int time)
    {
        waitUntilElementIsClickAble(by,time);
        Select select=new Select(driver.findElement(by));
        select.selectByIndex(index);
    }

    public void selectFromListByText(By by,String text,int time)
    {
        waitUntilElementIsClickAble(by,time);
        Select select=new Select(driver.findElement(by));
        select.selectByVisibleText(text);
    }
    public void selectFromListByValue(By by,String value, int time)
    {
        waitUntilElementIsClickAble(by,time);
        Select select=new Select(driver.findElement(by));
        select.selectByValue(value);
    }

    //for pring current time
    public static long timestamp() {
        return (System.currentTimeMillis());
    }

    //for getting text from alert popup
    public String getTextFromAlert()
    {
        return driver.switchTo().alert().getText();
    }

    //for clicking ok on alert popup
    public void clickOnOkOfAlert()
    {
        driver.switchTo().alert().accept();
    }

    //method for taking screenshot
//    public void takeScreenShot(String screenShotName) {
//        File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//        try {
//            FileUtils.copyFile(srcFile, new File("src\\test\\Sreenshot" +screenShotName+" .jpeg"));
//        }
//        catch (IOException e) {
//            e.printStackTrace();
//        }}


}