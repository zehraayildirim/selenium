package day02_DriverMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C02_WebElements {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //Amazon sayfasina gidelim
        driver.get("https://amazon.com");
        //Search bolumunu locate edelim
        //WebElement aramakutusu= driver.findElement(By.id("twotabsearchtextbox"));
        WebElement aramakutusu= driver.findElement(By.name("field-keywords"));

        //Search bolumunde iphone aratalim
        aramakutusu.sendKeys("iphone", Keys.ENTER);
        /*
        Eger bir webelementi(web sayfasindaki herbir buton ya da text) locate (konumu belirle)etmek istersek
        once manuel olarak web sayfasini acip sayfa uzerinde sag click yapip incele'ye tiklariz.
        Karsimiza cikan HTML kodlarindan locator(konum belirleyiciler)lardan essiz olani seceriz,genellikle
        id attribute'u kullanilir.Sectigimiz attribute degerini findElement() methodu icine findElement(By.id("attribute degeri"))
        seklinde yazariz.
         */
        //Amazon sayfasindaki <input> ve <a> tag'lerinin sayisini yazdirin
        List<WebElement> inputTags =driver.findElements(By.tagName("input"));
        System.out.println("Input Tag Sayisi : "+ inputTags.size());

        List<WebElement> linkList = driver.findElements(By.tagName("a"));
        System.out.println("Link Sayisi: "+ linkList.size());

        //linklerin adini yazdir;
        // for (WebElement w:linkList) {
        //    System.out.println(w.getText());

        // }




    }
}
