package day03_Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_Xpath {
    /*
   https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
   Add Element butonuna basin
   Delete butonunun gorunur oldugunu test edin
   Delete tusuna basin
   "Add/Remove Elements" yazisinin gorunur oldugunu test edin
     */

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");
        //Add Element butonuna basin
        Thread.sleep(3000);
        //driver.findElement(By.xpath("//*[@onclick='addElement()']")).click();
        driver.findElement(By.xpath("//*[text()='Add Element']")).click();
        //note:XPath kullaniminda locate edecegimiz WebElement text'e sahipse yukardaki sekilde kullanabiliriz
        //Delete butonunun gorunur oldugunu test edin
        //note:Bir WebElementin gorunur olup olmadigini isDisplayed() methodu ile bakariz.
        WebElement deleteButton=driver.findElement(By.xpath("//*[@onclick='deleteElement()']"));
        if (deleteButton.isDisplayed()){
            System.out.println("Test Passed");

        }else System.out.println("Test Failed");

        //Delete tusuna basin
        Thread.sleep(3000);
        deleteButton.click();
        //"Add/Remove Elements" yazisinin gorunur oldugunu test edin
        WebElement addRemove = driver.findElement(By.xpath("//h3"));
        if (addRemove.isDisplayed()){
            System.out.println("Test Passed");
        }else System.out.println("Test Passed");













    }
}
