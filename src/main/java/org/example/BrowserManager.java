package org.example;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.concurrent.TimeUnit;

public class BrowserManager extends Util {
    LoadProp loadProp = new LoadProp();
    public void setBrowser()
    {
        String browser = loadProp.getProperty("driver") ;
        if (browser.equalsIgnoreCase("chrome"))
        {
            //seting up chromedriver path
            System.setProperty("webdriver.chrome.driver", "src\\test\\Resources\\Drivers\\Chromedriver\\chromedriver.exe");
            //creating chrome driver object to open chrome browser
            driver = new ChromeDriver();
        }
        else if (browser.equalsIgnoreCase("firefox"))
        {
            //seting up firfoxedriver path
            System.setProperty("webdriver.gecko.driver", "src\\test\\Resources\\Drivers\\Geckodriver\\geckodriver.exe");
            //creating chrome driver object to open chrome browser
            driver = new FirefoxDriver();
        }
        else if (browser.equalsIgnoreCase("IE"))
        {
            //seting up IEdriver path
            System.setProperty("webdriver.ie.driver", "src\\test\\Resources\\Drivers\\IEdriver\\IEDriverServer1.exe");
            //creating chrome driver object to open chrome browser
            driver = new InternetExplorerDriver();
            DesiredCapabilities ieCapabilities = DesiredCapabilities.internetExplorer();

            ieCapabilities.setCapability("nativeEvents", false);
            ieCapabilities.setCapability("unexpectedAlertBehaviour", "accept");
            ieCapabilities.setCapability("ignoreProtectedModeSettings", true);
            ieCapabilities.setCapability("disable-popup-blocking", true);
            ieCapabilities.setCapability("enablePersistentHover", true);

            driver = new InternetExplorerDriver(ieCapabilities);
        }
        //maximise screen
        driver.manage().window().maximize();
        //applying implicitly wait of 30 sec to driver instance
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        //open Url
        driver.get("https://demo.nopcommerce.com/");
    }
    public void closeBrowser()
    {
        driver.close();
    }
}
