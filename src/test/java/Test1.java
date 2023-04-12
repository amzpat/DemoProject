import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test1 {
    @Test
    public void web() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.youtube.com/");
        driver.manage().window().maximize();

        driver.navigate().to("https://www.google.com/");
        String a = driver.getCurrentUrl();
        System.out.println(a);
     String b = driver.getTitle();
        System.out.println(b);
        String expectedtitle ="Google";
//        if(b.equals(driver.getTitle())){
//            System.out.println("is correct");
//        }else {


//            System.out.println("is not corrcet");
//        }



        if(b.equalsIgnoreCase(expectedtitle)){
            System.out.println("title is same");
        }else{
            System.out.println("title is not same");
        }
        driver.close();
    }
}