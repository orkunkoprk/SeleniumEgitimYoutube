import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class ActionsClass {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.trendyol.com/");
        driver.manage().window().maximize();

        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));

        WebElement cookie=driver.findElement(By.xpath("//button[@id='onetrust-accept-btn-handler']"));
        cookie.click();
        WebElement elektronik = driver.findElement(By.xpath("(//li[@class='tab-link'])[8]"));
        Actions actions = new Actions(driver);
        actions.moveToElement(elektronik).perform();
        WebElement tv = driver.findElement(By.xpath("(//a[text()='Televizyon'])[1]"));
        wait.until(ExpectedConditions.elementToBeClickable(tv));
        tv.click();


      /*  WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
        WebElement cookie=driver.findElement(By.xpath("//button[@id='onetrust-accept-btn-handler']"));
        cookie.click();

        List<WebElement> menuElememnts = driver.findElements(By.xpath("//li[@class='tab-link']"));

        Actions actions = new Actions(driver);
        for (WebElement menuElement : menuElememnts){
            actions.moveToElement(menuElement).perform();
            Thread.sleep(1500);
        }
        Thread.sleep(1000);
        driver.quit(); */





     }
}
