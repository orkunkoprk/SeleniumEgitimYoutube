import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class LocatorsCssSelector {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/webhp?hl=tr&sa=X&ved=0ahUKEwjSpY3Hs8OBAxUKRfEDHc_1Ae0QPAgJ");
        driver.manage().window().maximize();

     /* CssSelector
        etiketAdı[nitelik=değer]
        #id
        .class  */

        WebElement searchInput=driver.findElement(By.cssSelector("#APjFqb"));
        searchInput.sendKeys("Adana Demirspor");
        List<WebElement> searchButton = driver.findElements(By.cssSelector(".gNO89b"));
        searchButton.get(0).click();
        Thread.sleep(500);
        WebElement adanaDemirspor=driver.findElement(By.xpath("(//span[text()='Adana Demirspor'])[1]"));
        adanaDemirspor.click();
        Thread.sleep(500);
        List<WebElement> hangiKanalda=driver.findElements(By.cssSelector("div.OUtt3c"));
        hangiKanalda.get(0).click();
        Thread.sleep(500);
        List<WebElement> kapat=driver.findElements(By.cssSelector(".J5Va4.z1asCe.wuXmqc"));
        kapat.get(0).click();
        Thread.sleep(500);
        List<WebElement> macKadrosu=driver.findElements(By.cssSelector("li.imso-hide-overflow.tb_l.GSkImd"));
        macKadrosu.get(10).click();
        Thread.sleep(5000);
        List<WebElement> puanDurumu=driver.findElements(By.cssSelector("li.imso-hide-overflow.tb_l.GSkImd"));
        macKadrosu.get(11).click();
        Thread.sleep(5000);
        driver.quit();

















    }
}
