import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class Alerts {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.demo.guru99.com/test/delete_customer.php");
        driver.manage().window().maximize();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        WebElement input = driver.findElement(By.xpath("//input[@name='cusid']"));
        input.sendKeys("Orkun");
        WebElement button = driver.findElement(By.xpath("//input[@type='submit']"));
        button.click();
        Thread.sleep(1000);
        driver.switchTo().alert().dismiss();
        button.click();
        Thread.sleep(1000);
        driver.switchTo().alert().accept();
        Thread.sleep(2000);
        Assert.assertEquals("Customer Successfully Delete!",driver.switchTo().alert().getText());
        System.out.println("Alert'teki text değeriyle aynı!");
        Thread.sleep(1000);
        driver.switchTo().alert().accept();
        Thread.sleep(1000);
        driver.quit();








        /*
        //https://www.demo.guru99.com/test/delete_customer.php
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        */

    }
}
