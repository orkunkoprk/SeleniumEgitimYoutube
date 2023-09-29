import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.Set;

public class WindowHandling {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.vbt.com.tr/");
        driver.manage().window().maximize();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        WebElement referans = driver.findElement(By.xpath("//a[@href=\"/referanslar\"]"));
        referans.click();
        WebElement garantiBank=driver.findElement(By.xpath("(//span[@class='thumb-info-wrapper'])[3]"));
        wait.until(ExpectedConditions.elementToBeClickable(garantiBank));
        garantiBank.click();
        String firstWindow = driver.getWindowHandle();
        String firstWindowURL = driver.getCurrentUrl();
        System.out.println("İlk pencerem: "+firstWindowURL);

        Set<String> windowAllWindows = driver.getWindowHandles();
        for (String win:windowAllWindows) {
            driver.switchTo().window(win);
        }
        String secondWindowURL = driver.getCurrentUrl();
        System.out.println("İkinci pencerem: "+secondWindowURL);
        driver.close();
        driver.switchTo().window(firstWindow);
        String suankiWindowURL = driver.getCurrentUrl();
        System.out.println("Şu anki pencerem: "+suankiWindowURL);
        Thread.sleep(1000);
        driver.quit();




    }
}
