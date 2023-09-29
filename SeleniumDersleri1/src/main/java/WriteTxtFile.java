import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.Duration;
import java.util.List;

public class WriteTxtFile {
    public static void main(String[] args) throws InterruptedException {
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
        List<WebElement> futbolcular = driver.findElements(By.xpath("//span[@class='lrvl-pnc']"));
        try {
            FileWriter fw = new FileWriter("blog.txt");
            PrintWriter pw = new PrintWriter(fw);
            pw.println("Adana Demirspor'un ilk 11:");
            pw.println("-------------------------------------");
            for (int i = 0; i < 11; i++) {
                pw.println(futbolcular.get(i).getText());
            }
            pw.println("Beşiktaş'ın ilk 11:");
            pw.println("-------------------------------------");
            for (int j = 11; j < 22; j++) {
                pw.println(futbolcular.get(j).getText());
            }
            pw.close();
            
        } catch (IOException e) {
            System.out.println("HATA!");
        }
    }
}
