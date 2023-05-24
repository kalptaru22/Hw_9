package nopcommerce;

import graphql.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class ChromeTest {
    static WebDriver driver;
    static String url = "https://demo.nopcommerce.com/";
    static String expectedTitle = "nopCommerce demo store";

    public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();// setting webdriver
        driver = new ChromeDriver(options);
        driver.get(url);// launch url
        driver.manage().window().maximize();//maximising screen
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));// giving wait
        String actualTitle = driver.getTitle();//getting title of page
        System.out.println("Title of page is : " +actualTitle);// printing title of page
        Assert.assertTrue(expectedTitle.equals(actualTitle));
        driver.quit();//closing driver


    }


}
