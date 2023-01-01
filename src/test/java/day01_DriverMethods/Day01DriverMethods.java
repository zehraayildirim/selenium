package day01_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day01DriverMethods {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com");
        System.out.println(driver.getTitle());
        System.out.println(" Current Url ; " + driver.getCurrentUrl());
       // System.out.println(driver.getPageSource());
        System.out.println(driver.getWindowHandle());//bize o window'a ait hasd degerlerini verir,biz bu hash degerlerini bir
                                                     //string'e atayip pencereler arasi gecis yapabiliriz.
    }
}
