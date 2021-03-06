package project4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class MultiBrowserTest {

    static String Url = "https://www.saucedemo.com";
    static String browser = "Chrome";
    static WebDriver driver;

    public static void main(String[] args) {

        if(browser.equalsIgnoreCase("Chrome")){

            System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
            driver = new ChromeDriver();


        } else if (browser.equalsIgnoreCase("Firefox")) {

            System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
            driver= new FirefoxDriver();

        }else if (browser.equalsIgnoreCase("Edge")){
            System.setProperty("webdriver.edge.driver", "drivers/msedgedriver.exe");
            driver = new EdgeDriver();

        } else {


            System.out.println("Wrong browser name");
        }

        driver.get(Url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        WebElement usernamefield = driver.findElement(By.id("user-name"));
        usernamefield.sendKeys("rlobo@gmail.com");

        WebElement passwordfield = driver.findElement(By.id("password"));
        passwordfield.sendKeys("Pass123?");

        driver.close();



    }


}
