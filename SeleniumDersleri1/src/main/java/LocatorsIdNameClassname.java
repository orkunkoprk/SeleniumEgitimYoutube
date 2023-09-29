import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsIdNameClassname {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();

        /*
        name, className, id, cssSelector, xpath
         */
        driver.findElement(By.id("APjFqb")).sendKeys("facebook");
        Thread.sleep(1000);
        driver.findElement(By.className("gNO89b")).click();
        Thread.sleep(1000);
        driver.findElement(By.className("l")).click();
        Thread.sleep(1000);
        driver.findElement(By.name("email")).sendKeys("orkun.koprek2@gmail.com");
        driver.findElement(By.id("pass")).sendKeys("12345678910");
        driver.findElement(By.name("login")).click();

    }
}
