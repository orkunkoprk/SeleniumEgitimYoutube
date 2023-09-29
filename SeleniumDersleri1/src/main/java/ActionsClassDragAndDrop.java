import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ActionsClassDragAndDrop {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://demo.guru99.com/test/drag_drop.html");
        driver.manage().window().maximize();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        Actions actions = new Actions(driver);

        WebElement besBin1 = driver.findElement(By.xpath("(//a[@class='button button-orange'])[2]"));

        WebElement besBin2 = driver.findElement(By.xpath("(//a[@class='button button-orange'])[4]"));

        WebElement bank = driver.findElement(By.xpath("(//a[@class='button button-orange'])[5]"));

        WebElement sales = driver.findElement(By.xpath("(//a[@class='button button-orange'])[6]"));

        // bank sürüklenecek
        WebElement ilkYer = driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));

        // 5000 1. sürüklenecek
        WebElement ikinciYer = driver.findElement(By.xpath("(//li[@class='placeholder'])[2]"));

        //sales sürüklenecek
        WebElement ucuncuYer = driver.findElement(By.xpath("(//li[@class='placeholder'])[3]"));

        //5000 2. sürüklecek
        WebElement dorduncuYer = driver.findElement(By.xpath("(//li[@class='placeholder'])[4]"));

        actions.dragAndDrop(bank,ilkYer).build().perform();
        Thread.sleep(1000);
        actions.dragAndDrop(besBin1,ikinciYer).build().perform();
        Thread.sleep(1000);
        actions.dragAndDrop(sales,ucuncuYer).build().perform();
        Thread.sleep(1000);
        actions.dragAndDrop(besBin2,dorduncuYer).build().perform();
        Thread.sleep(4500);
        driver.quit();


    }
}
