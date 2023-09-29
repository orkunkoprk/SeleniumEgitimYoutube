import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SelectClass {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.n11.com/");
        driver.manage().window().maximize();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));


        WebElement uyeOlButton=driver.findElement(By.xpath("//a[@class='btnSignUp']"));
        wait.until(ExpectedConditions.elementToBeClickable(uyeOlButton));
        uyeOlButton.click();

        WebElement cookie = driver.findElement(By.xpath("//span[text()='Tamam']"));
        wait.until(ExpectedConditions.elementToBeClickable(cookie));
        cookie.click();

        WebElement ad=driver.findElement(By.cssSelector("#firstName"));
        wait.until(ExpectedConditions.visibilityOf(ad));
        ad.sendKeys("Orkun");


        WebElement soyAd=driver.findElement(By.cssSelector("#lastName"));
        soyAd.sendKeys("Köprek");


        WebElement mail=driver.findElement(By.cssSelector("#registrationEmail"));
        mail.sendKeys("orkun.koprek2@gmail.com");


        WebElement password1=driver.findElement(By.cssSelector("#registrationPassword"));
        password1.sendKeys("12345678910");

        WebElement password2=driver.findElement(By.cssSelector("#passwordAgain"));
        password2.sendKeys("12345678910");


        WebElement tel=driver.findElement(By.cssSelector("#phoneNumber"));
        tel.sendKeys("5309125398");

        WebElement gender=driver.findElement(By.xpath("//label[text()='Erkek']"));
        gender.click();

        WebElement gun = driver.findElement(By.cssSelector("#birthDay"));
        Select select = new Select(gun);
        select.selectByVisibleText("10");


        WebElement ay = driver.findElement(By.cssSelector("#birthMonth"));
        select=new Select(ay);
        select.selectByVisibleText("Ocak");

        WebElement yil = driver.findElement(By.cssSelector("#birthYear"));
        select=new Select(yil);
        select.selectByVisibleText("2004");
    }
}
