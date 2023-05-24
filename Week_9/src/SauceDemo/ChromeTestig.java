package SauceDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class ChromeTestig {
    static WebDriver driver;
    static String url = "https://www.saucedemo.com/";
    static String expectedTitle = "Swag Labs";

    public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();
        driver = new ChromeDriver(options);
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
        String actualTitle = driver.getTitle();
        System.out.println("Title of page is : " + actualTitle);
        driver.quit();
    }
}
