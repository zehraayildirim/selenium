package day01_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ManageMethods {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver =new ChromeDriver();

        //Amazon sayfasina gidelim
        driver.get("https://www.amazon.com");
        //sayfanin konumunu ve boyutlarini yazdirin
        System.out.println("Sayfanin konumu ="+ driver.manage().window().getPosition());
        System.out.println(" Sayfanin boyutlari =" +driver.manage().window().getSize());
        //sayfayi simge durumuna getirin
        driver.manage().window().minimize();
        //simge durumunda 3 saniye bekleyip sayfayi maximize yapin
        Thread.sleep(3000);
        driver.manage().window().maximize();
        //sayfanin konumunu ve boyutlarini maximize durumunda yazdirin
        System.out.println("Sayfanin konumu ="+ driver.manage().window().getPosition());
        System.out.println(" Sayfanin boyutlari =" +driver.manage().window().getSize());
        //sayfayi fullscreen yapin
        Thread.sleep(3000);
        driver.manage().window().fullscreen();
        //sayfanin konumunu ve boyutlarini fullscreen durumunda yazdirin
        System.out.println("Sayfanin konumu ="+ driver.manage().window().getPosition());
        System.out.println(" Sayfanin boyutlari =" +driver.manage().window().getSize());

        //sayfayi kapatin
        Thread.sleep(2000);
        driver.close();
















    }
}
