package day03_Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C02_CssSelector {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //https://www.amazon.com/ adresine gidin
        driver.get("https://www.amazon.com/");
        //Browseri tam sayfa yapin
        driver.manage().window().maximize();
        //Sayfayi refresh yapin
        driver.navigate().refresh();
        //Sayfa basliginin "Spend less" ifadesi icerdigini test edin
        String actualTitle =driver.getTitle();
        String expectedTitle="Spend less";
        if (actualTitle.contains(expectedTitle)){
            System.out.println("Title Testi PASSED");
        }else System.out.println("Title Testi FAILED");

        //Gift Cards sekmesine basin
        driver.findElement(By.cssSelector("a[href='/gift-cards/b/?ie=UTF8&node=2238192011&ref_=nav_cs_gc']")).click();
        //Birthday butonuna basin
        driver.findElement(By.cssSelector("img[src='https://images-na.ssl-images-amazon.com/images/G/01/gift-certificates/consumer/2021/GCLP/Support/2x/Occ_Birthday_346x130.png']")).click();
        //Best Seller bolumunden ilk urunu tiklayin
        List<WebElement> firtItem =driver.findElements(By.cssSelector("img[alt='Amazon.com eGift Card']"));
        firtItem.get(0).click();
        //Gift Card details'den 25$'i secin
        driver.findElement(By.cssSelector("span[id='a-autoid-28']")).click();
        //urun ucretinin 25$ oldugunu test edin
        WebElement itemCost= driver.findElement(By.cssSelector("span[id='gc-live-preview-amount']"));
        if (itemCost.getText().equals("$25.00")){
            System.out.println("Test Passed");
        }else System.out.println("Test Failed");
        //Sayfayi kapatin
        driver.close();
    }
}
