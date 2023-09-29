import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.*;
import java.time.Duration;
import java.util.List;

public class AssertionClass {
    public static void main(String[] args) throws InterruptedException, IOException {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        WebElement searchInput = driver.findElement(By.xpath("//textarea[@class='gLFyf']"));
        searchInput.sendKeys("Adana Demirspor-Beşiktaş");
        WebElement searchButton = driver.findElement(By.xpath("(//input[@class='gNO89b'])[1]"));
        searchButton.click();
        WebElement adanaDemirsporBesikta = driver.findElement(By.xpath("(//div[text()='Adana Demirspor - Beşiktaş'])[1]"));
        wait.until(ExpectedConditions.elementToBeClickable(adanaDemirsporBesikta));
        adanaDemirsporBesikta.click();
        Thread.sleep(4000);
        WebElement adanaDemirsporBesitas2 =driver.findElement(By.xpath("(//div[text()='Adana Demirspor - Beşiktaş'])[1]"));
        Assert.assertEquals(adanaDemirsporBesitas2.getText(),"Adana Demirspor - Beşiktaş");
        System.out.println("Tebrikler! Doğru maçın analizini inceliyorsunuz!");
        WebElement macKadrosu = driver.findElement(By.xpath("(//li[@class='imso-hide-overflow tb_l GSkImd'])[5]"));
        macKadrosu.click();
        Thread.sleep(4000);
        WebElement adanaDemirsporKelecisi = driver.findElement(By.xpath("//span[text()='V. Karakuş']"));
        Assert.assertEquals(adanaDemirsporKelecisi.getText(),"V. Karakuş");
        System.out.println("Adana Demirspor'un Beşiktaş karşısındaki kalecisi: "+adanaDemirsporKelecisi.getText());
        Thread.sleep(3000);
        driver.quit();




    }
}
