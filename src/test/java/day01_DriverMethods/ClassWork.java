package day01_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassWork {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com");
        System.out.println("Title; "+driver.getTitle());
        System.out.println(" Current Url ; " + driver.getCurrentUrl());
        // System.out.println(driver.getPageSource());
        //sayfa handle degerini yazdir?
        System.out.println(driver.getWindowHandle());
        //sayfa basliginin "Amazon" icerdigini test edin?
        String actualTitle = driver.getTitle();
        if (actualTitle.contains("Amazon")){
            System.out.println("Test Passed");
        }else{
            System.out.println("Test Failed");
        }

        //Sayfa Url'inin "amazon" icerdigini test edin?

        String actualUrl= driver.getCurrentUrl();
        if(actualUrl.contains("amazon")){
            System.out.println("PASSED");
        }else{
            System.out.println("FAIL");
        }

        //Sayfa HTML kodlarinda "Gateway" kelimesinin gectigini test edin?
        String pageCodes = driver.getPageSource();
        if (pageCodes.contains("Gateway")){
            System.out.println("Source Test Passed");
        }else{
            System.out.println("Source Test Failed");
        }

        //Sayfayi kapatin
        driver.close();


    }
}
