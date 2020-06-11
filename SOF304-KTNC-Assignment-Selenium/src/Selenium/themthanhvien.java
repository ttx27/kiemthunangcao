package Selenium;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class themthanhvien {
	WebDriver driver = new FirefoxDriver();
	
	@BeforeClass
	public void BeforeClass() throws Exception{
	    		System.setProperty("webdriver.gecko.driver", "F:\\TaiNguyenLapTrinh\\geckodriver.exe");
	    		WebDriver driver = new FirefoxDriver();
	    		driver.get("http://localhost:8084/KTT_-_SHOP/admin/index.jsp");
	    		driver.findElement(By.name("email")).sendKeys("a@gmail.com");
	    		driver.findElement(By.name("password")).sendKeys("123");
	    		driver.findElement(By.name("action")).click();
//	    		String expect = "";
//	    		String actual = "";
//	    		Assert.assertEquals(actual, expect);
	    		
	}
	@AfterClass
	public void AfterClass() throws Exception{
		driver.close();
	}

	

	@Test(description = "nhập email,pass là abc", groups = "Add_Staff", priority = 1)
	public void Add_Staff_01() {
		System.setProperty("webdriver.gecko.driver", "F:\\TaiNguyenLapTrinh\\geckodriver.exe");
		driver.get("http://localhost:8084/KTT_-_SHOP/admin/themmoithanhvien.jsp");
		driver.findElement(By.name("tmtvMail")).sendKeys("");
		driver.findElement(By.name("tmtvPass")).sendKeys("");
		driver.findElement(By.name("tmtvRePass")).sendKeys("");
		driver.findElement(By.name("tmtvName")).sendKeys("");
		driver.findElement(By.name("tmtvRole")).sendKeys("");
		driver.findElement(By.name("action")).click();
		String expect = "";
		String actual = "cda";
		Assert.assertEquals(actual, expect);
		driver.close();
	}

}
