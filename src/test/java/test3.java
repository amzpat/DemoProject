import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class test3 {


    @Test
    public void google() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.findElement(By.xpath("//input[@class='gLFyf']")).sendKeys("selenium");

        List<WebElement> options = driver.findElements(By.xpath("//ul[@class='G43f7e'] /li"));
        for (WebElement op : options) {
            if (op.getText().equalsIgnoreCase("Selenium foods")) {
                op.click();
                break;
            }
        }
    }
}