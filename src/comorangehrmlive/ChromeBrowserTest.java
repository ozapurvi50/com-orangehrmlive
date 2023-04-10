package comorangehrmlive;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ChromeBrowserTest {

    public static void main(String[] args) {
        String url = "https://opensource-demo.orangehrmlive.com/ ";

        //1. launch the Chrome browser
        WebDriver driver = new ChromeDriver();

        //2. open the URL into browser
        driver.get(url);

        //Maximise the browser
        driver.manage().window().fullscreen();

        //3. Print the Title in console
        System.out.println(driver.getTitle());

        //4. Print current Url in console
        System.out.println("Current Url: " + driver.getCurrentUrl());

        //5. Print Page Source
        System.out.println("Page Source: " + driver.getPageSource());

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        //6. Get Username element from webpage
        WebElement userName;
        userName = driver.findElement(By.name("username"));
        //Enter the User name in webpage
        userName.sendKeys("Admin");

        //7. Get Password element from webpage
        WebElement password = driver.findElement(By.name("password"));
        //Enter the password in webpage
        password.sendKeys("admin123");

        //8. close browser
        driver.close();


    }
}
