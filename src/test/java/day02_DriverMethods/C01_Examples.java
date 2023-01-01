package day02_DriverMethods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_Examples {
    public static void main(String[] args) {
        /*
        Ilk once browser'i maximize yapalim ,sonra tum sayfa icin max bekleme suresi olarak 15 sn belirtelim
        Sirasiyla amazon,facebook ve youtube sayfalarina gidelim
        Amazon sayfasina tekrar donelim
        Amazon sayfasinin Url'inin https://amazon.com adresine esit oldugunu test edelim
        sayfanin konumunu ve size'ini yazdiralim
        sayfanin konumunu ve size'ini istedigimiz sekilde ayarlayalim ve istedigimiz sekilde oldugunu test edelim
        ve sayfayi kapatalim

         */

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://www.amazon.com");
        driver.get("https://www.facebook.com");
        driver.get("https://www.youtube.com");
        driver.navigate().back();
        driver.navigate().back();
        String actualUrl = driver.getCurrentUrl();
        String expectedUrl="https://www.amazon.com/";
        if (actualUrl.equals(expectedUrl)){
            System.out.println("URL Testi PASSED");

        }else System.out.println("URL Testi FAILED");

        //sayfanin konumu ve size'i
        System.out.println("Sayfa'nin size'i : "+driver.manage().window().getSize());
        System.out.println("Sayfa'nin konumu: "+driver.manage().window().getPosition());

        //sayfanin konumu ve size istedig sekilde ayarla
        driver.manage().window().setSize(new Dimension(600,600));
        driver.manage().window().setPosition(new Point(50,50));
        System.out.println("Sayfa'nin yeni size'i : "+driver.manage().window().getSize());
        System.out.println("Sayfa'nin yeni  konumu: "+driver.manage().window().getPosition());

        //istedigimiz sekilde oldugunu test edelim
        Dimension actualNewSize = driver.manage().window().getSize();
        if (actualNewSize.getWidth()==600 && actualNewSize.getHeight()==600){
            System.out.println("Size Testi PASSED");
        }else System.out.println("Size Testi FAILED");

        Point actualYeniKonum =driver.manage().window().getPosition();
        if (actualYeniKonum.getX()==50 && actualYeniKonum.getY()==50){
            System.out.println("Konum Testi PASSED");
        }else System.out.println("Konum Testi FAILED");

        //sayfayi kapatalim
       driver.close();

 

    }
}
