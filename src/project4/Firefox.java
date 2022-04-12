package project4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class Firefox {
    public static void main(String[] args) {


        String Url = "https://www.saucedemo.com";
        System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get(Url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        String title = driver.getTitle();
        System.out.println(title);
        System.out.println("Current Url" + driver.getCurrentUrl());

        System.out.println("Page Resource: "+driver.getPageSource());

        WebElement usernamefield = driver.findElement(By.id("user-name"));
        usernamefield.sendKeys("rlobo@gmail.com");

        WebElement passwordfield = driver.findElement(By.id("password"));
        passwordfield.sendKeys("Pass123?");

        driver.close();

    }

}
