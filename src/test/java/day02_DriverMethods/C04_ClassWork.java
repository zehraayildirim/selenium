package day02_DriverMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

public class C04_ClassWork {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        /*
        https://www.amazon.com web sayfasina gidin
        Search "city bike"
        Amazonda goruntulenen ilgili sonuclarin sayisini yazdirin
        Sonra karsiniza cikan ilk sonucun resmine tiklayin.
         */


        driver.get(" https://www.amazon.com");
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("city bike", Keys.ENTER);

       //Amazonda goruntulenen ilgili sonuclarin sayisini yazdirin
         List<WebElement> aramaSonucYazisi = driver.findElements(By.className("sg-col-inner"));
        System.out.println("Arama Sonuc Yazisi: "+aramaSonucYazisi.get(0).getText());

        //Arama sonuc sayisini konsola yazdirin?
        String [] sonucSayisi =aramaSonucYazisi.get(0).getText().split(" ");
        System.out.println("Sonuc Sayisi:" + sonucSayisi[2]);

        //Sonuc sayisini LAMBDA ile yazdirin?
        Arrays.stream(aramaSonucYazisi.get(0).getText().split(" ")).limit(3).skip(2).forEach(System.out::println);



        //Sonra karsiniza cikan ilk sonucun resmine tiklayin.

        List<WebElement> firstpic= driver.findElements(By.className("s-image"));
        firstpic.get(0).click();




    }
}
