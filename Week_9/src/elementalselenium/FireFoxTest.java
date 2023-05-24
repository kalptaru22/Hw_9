package elementalselenium;

import graphql.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.time.Duration;

public class FireFoxTest {
    static WebDriver driver;
    static String url = "http://elementalselenium.com/";
    static String expectedTitle = "Elemental Selenium: Receive a Free, Weekly Tip on Using Selenium like a Pro";

    public static void main(String[] args) {
        FirefoxOptions options = new FirefoxOptions();
        driver = new FirefoxDriver(options);
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6000));
        String actualTitle = driver.getTitle();
        System.out.println("Tile of page is : " + actualTitle);
        Assert.assertTrue(expectedTitle.equals(actualTitle));
        driver.quit();
    }

}
