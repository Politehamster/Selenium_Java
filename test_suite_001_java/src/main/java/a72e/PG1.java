package a72e;

import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
//import java.net.MalformedURLException;
import java.net.URL;

//import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
//import org.openqa.selenium.remote.DesiredCapabilities;

public class PG1 {

    // static Capabilities chromeCapabilities = DesiredCapabilities.chrome();
    // static Capabilities firefoxCapabilities = DesiredCapabilities.firefox();

    public static void main(String[] args) throws MalformedURLException  {
            ChromeOptions chromeOptions = new ChromeOptions();
            chromeOptions.setCapability("browserVersion", "67");
            chromeOptions.setCapability("platformName", "Windows XP");
            FirefoxOptions firefoxOptions = new FirefoxOptions();
            //final String SHUB = "http://selenium-hub:4444/wd/hub";
            RemoteWebDriver chrome = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), chromeOptions);
            RemoteWebDriver firefox = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), firefoxOptions);
    
        // run against chrome
        String baseUrl = "http://demo.guru99.com/test/newtours/";
        String expectedTitle = "Welcome: Mercury Tours";
        String actualTitle = "";

        chrome.get(baseUrl);
        actualTitle = chrome.getTitle();

        if (actualTitle.contentEquals(expectedTitle)){
            System.out.println("Test Passed!");
        } else {
            System.out.println("Test Failed");
        }   
        // run against firefox
        firefox.get("https://www.google.com");
        System.out.println(firefox.getTitle());
      
        chrome.quit();
        firefox.quit();
      }
    

    }