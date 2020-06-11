/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

/**
 *
 * @author Nguyen Thien
 */
public class NewMain {

    private static WebDriver driver = null;

    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver", "F:\\TaiNguyenLapTrinh\\geckodriver.exe");
        driver.get("http://localhost:8084/KTT_-_SHOP/admin/index.jsp");
        driver.findElement(By.name("email")).sendKeys("a@gmail.com");
        driver.findElement(By.name("password")).sendKeys("123");
        driver.findElement(By.name("action")).click();
        String expect = "";
        String actual = "";
        Assert.assertEquals(actual, expect);
        driver.close();
        // TODO code application logic here
    }

}
