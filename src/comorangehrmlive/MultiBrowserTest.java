package comorangehrmlive;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.time.Duration;


public class MultiBrowserTest {

    static String browser = "Chrome";
    static WebDriver driver;
    static String baseUrl = "https://opensource-demo.orangehrmlive.com/ ";

    public static void main(String[] args) {
        if (browser.equalsIgnoreCase("Chrome")) {
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("Edge")) {
            driver = new EdgeDriver();
        } else if (browser.equalsIgnoreCase("Firefox")) {
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("Safari")) {
            driver = new SafariDriver();
        } else {
            System.out.println("This is wrong browser");
        }

        //1. open the URL into browser
        driver.get(baseUrl);

        //Maximise the browser
        driver.manage().window().fullscreen();

        //2. Print the Title in console
        System.out.println("Title is : " + driver.getTitle());

        //3. Print current Url in console
        System.out.println("Current Url: " + driver.getCurrentUrl());

        //4. Print Page Source
        System.out.println("Page Source: " + driver.getPageSource());

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        //5. Get Username element from webpage
        WebElement userName;
        userName = driver.findElement(By.name("username"));

        //Enter the User name in webpage
       userName.sendKeys("Admin");

        //6. Get Password element from webpage
        WebElement password = driver.findElement(By.name("password"));

        //Enter the password in webpage
        password.sendKeys("admin123");

        //7. Driver close
        driver.close();
    }
}
