import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.awt.*;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class test2 {

    @Test
    public void tc0() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();

      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

     WebElement wb = driver.findElement(By.xpath("//input[@class='gLFyf']"));
     wb.sendKeys("Selenium");

     }



    }


