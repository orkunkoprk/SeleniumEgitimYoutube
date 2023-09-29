import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsXpath {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.trendyol.com/");
        driver.manage().window().maximize();

        /* Xpath -- //etiketAdı[@nitelik='değer'] */
        String email1="orkun.koprek2@gmail.com";
        WebElement cookie=driver.findElement(By.xpath("//button[@id='onetrust-accept-btn-handler']"));
        cookie.click();
        Thread.sleep(1000);
        WebElement girisYapButton= driver.findElement(By.xpath("(//p[@class='link-text'])[1]"));
        girisYapButton.click();
        Thread.sleep(1000);
        WebElement uyeOlButton=driver.findElement(By.xpath("//span[text()='Üye Ol']"));
        uyeOlButton.click();
        Thread.sleep(1000);
        WebElement email = driver.findElement(By.xpath("//input[@id='register-email']"));
        email.sendKeys(email1);
        WebElement password= driver.findElement(By.xpath("//input[@name='register-password']"));
        password.sendKeys("Orkun1234567.");
        WebElement sex=driver.findElement(By.xpath("//button[@class='q-gray q-fluid q-button-medium q-button male  ']"));
        sex.click();
        WebElement button1=driver.findElement(By.xpath("(//span[@class='ty-text ty-color-soft-gray ty-font-md ty-checkbox-text'])[1]"));
        button1.click();
        WebElement button2=driver.findElement(By.xpath("(//div[@class='ty-mgr-2 ty-relative ty-checkbox-container'])[2]"));
        button2.click();
        WebElement button3=driver.findElement(By.xpath("//div[@class='recaptcha-checkbox-borderAnimation']"));
        button3.click();
        WebElement uyeOlButton2=driver.findElement(By.xpath("(//span[text()='Üye Ol'])[2]"));
        uyeOlButton2.click();








    }
}
