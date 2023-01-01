package day01_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethods {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        //Amazon sayfasina gidelim
        driver.navigate().to("https://amazon.com");
        //TechPro  sayfasina gidelim
        Thread.sleep(5000);
        driver.navigate().to("https://techproeducation.com");

        //Tekrar amazon sayfasina gidelim
        Thread.sleep(5000);
        driver.navigate().back(); //amazon sayfasina geri doner
        //Tekrar Techpro sayfasina gidelim
        Thread.sleep(5000);
        driver.navigate().forward();//techpro sayfasina gider
        //Son sayfada sayfayi yenileyelim
        Thread.sleep(5000);
        driver.navigate().refresh();
        //Ve sayfayi kapatalim













    }
}
