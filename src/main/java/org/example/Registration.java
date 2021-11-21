package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Registration {
    static WebDriver driver;
    public static void main(String[] args) { //main method

        System.setProperty("webdriver.chrome.driver","src/test/drivers/chromedriver.exe"); // System Property for Chrome Driver
        driver = new ChromeDriver(); //instantiate ChromeDriver class
        driver.manage().window().fullscreen(); // // open window fullscreen
        driver.get("https://demo.nopcommerce.com/"); // Launch Website
        driver.findElement(By.xpath("//a[@class='ico-register']")).click(); // click on register button
        driver.findElement(By.id("gender-female")).click();
        driver.findElement(By.id("FirstName")).sendKeys("Bhawana"); //click on FirstName textbox and add value
        driver.findElement(By.id("LastName")).sendKeys("Satyal");
        driver.findElement(By.id("Email")).sendKeys("ABC@hotmail3.com"); ////click on LastName textbox and add value
        driver.findElement(By.id("Company")).sendKeys("ABC"); //click on Company textbox and add value
        driver.findElement(By.id("Password")).sendKeys("123456"); ////click on Password textbox and add value
        driver.findElement(By.xpath("//input[@name='ConfirmPassword']")).sendKeys("123456"); ////click on ConfirmPassword textbox and add value
        driver.findElement(By.id("register-button")).click(); //click on register button

        String text = driver.findElement(By.xpath("//div[@class='result']")).getText();
        System.out.println(text); //output



    }
}
