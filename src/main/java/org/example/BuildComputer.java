package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Locale;

public class BuildComputer {
    static WebDriver driver;
    public static void main(String[] args) { //main method

        System.setProperty("webdriver.chrome.driver","src/test/drivers/chromedriver.exe");// System Property for Chrome Driver
        driver = new ChromeDriver(); //instantiate ChromeDriver class
        driver.manage().window().fullscreen(); // open window fullscreen
        driver.get("https://demo.nopcommerce.com/");// launch website
        driver.findElement(By.xpath("//div/div/h2/a[@href='/build-your-own-computer']")).click();// click on build your own computer
        String text = driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[2]/div/div/form/div[2]/div[1]/div[2]/div[1]/h1")).getText();
        System.out.println("The final message is displayed as : " +text.toUpperCase(Locale.ROOT));//output



    }
}
