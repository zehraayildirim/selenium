package day01_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ClassWork2 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));//Bu method sayfadaki her bir webelement icin max bekleme suresini belirler.
        //Facebook sayfasina gidin ve sayfa basliginin"title" "facebook" oldugunu dogrulayin
        //degilse dogru basligi yazdirin
        driver.get("https://www.facebook.com");
        String actualTitle = driver.getTitle();
        if(actualTitle.contains("facebook")){
            System.out.println("Passed");
        }else{
            System.out.println("Failed");
            System.out.println("Actual Title: "+ actualTitle);
        }

        //Sayfa URL'inin "facebook" kelimesi icerdigini dogrulayin,icermiyorsa "actual" url'i yazdirin
        String url = driver.getCurrentUrl();
        if (url.contains("actual")){
            System.out.println("Passed");
        }else{
            System.out.println(" actual url : " +url);
        }

        //https://www.walmart.com sayfasina gidin
        driver.get("https://www.walmart.com");


        //Sayfa basliginin "Walmart.com" icerdigini dogrulayin
        String actualWalmartTitle = driver.getTitle();
        String expectedWalmartTitle = "Walmart.com";
        if(actualWalmartTitle.contains(expectedWalmartTitle)){
            System.out.println("Title testi PASSED");
        }else System.out.println("Title testi FAILED");

        //Tekrar Facebook sayfasina donun
        driver.navigate().back();

        //Sayfayi yenileyin
        driver.navigate().refresh();

        //Browser'i kapatin
        driver.close();









    }
}
