package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewsComments {

    static WebDriver driver;

    public static void main(String[] args) { // main method
        System.setProperty("webdriver.chrome.driver", "src/test/drivers/chromedriver.exe");// System Property for Chrome Driver
        driver = new ChromeDriver(); //instantiate ChromeDriver class
        driver.manage().window().fullscreen(); // open window fullscreen
        driver.get("https://demo.nopcommerce.com/");// Launch Website
        driver.findElement(By.xpath("//li/a[@href='/news']")).click();//click on news
        driver.findElement(By.xpath("//a[@href='/nopcommerce-new-release' and @class='read-more']")).click(); //click on details
        driver.findElement(By.id("AddNewComment_CommentTitle")).sendKeys("Abcde");// click on title textbox and add value
        driver.findElement(By.id("AddNewComment_CommentText")).sendKeys("Amazing!!");// click on comment textbox and add value
        driver.findElement(By.xpath("//button[@type='submit' and @name='add-comment']")).click(); // click on new comment
    String text = driver.findElement(By.xpath("//div[@class='result']")).getText();
        System.out.println(text); // output
    }
}