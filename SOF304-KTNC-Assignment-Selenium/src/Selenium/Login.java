package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Login {

      public static WebDriver driver;

   
   
//@BeforeClass
//    public static void setUpClass() throws Exception {
//    }
//
//    @AfterClass
//    public static void tearDownClass() throws Exception {
//    }
//
//    @BeforeMethod
//    public void setUpMethod() throws Exception {
//        String Url = "http://localhost:8084/AssignmentFinal1/UsersServlet";
//        driver.get(Url);
//
//    }
//
//    @AfterMethod
//    public void tearDownMethod() throws Exception {
//
//    }
//
//    @BeforeTest
//    public void setup() throws InterruptedException {
//        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\Desktop\\kiem thu nang cao\\chromedriver.exe"
//               );
//        driver = new FirefoxDriver();
//        String url = "http://localhost:8084/AssignmentFinal1/login1.jsp";
//        driver.get(url);
//        WebElement email = driver.findElement(By.id("emaill"));
//        email.sendKeys("VuTieuNhi");
//        WebElement pass = driver.findElement(By.id("pass"));
//        pass.sendKeys("123");
//        WebElement buttonlogin = driver.findElement(By.id("login"));
//        buttonlogin.click();
//        Thread.sleep(3000);
//    }
      @Test(description = "nhập email,pass với tài khoản mặc định", groups = "Login", priority = 1)
	public void Login1() {
		System.setProperty("webdriver.gecko.driver", "F:\\TaiNguyenLapTrinh\\geckodriver.exe");
		driver.get("http://localhost:8084/KTT_-_SHOP/admin/index.jsp");
		driver.findElement(By.name("email")).sendKeys("a@gmail.com");
		driver.findElement(By.name("password")).sendKeys("123");
		driver.findElement(By.name("action")).click();
		String expect = "";
		String actual = "";
		Assert.assertEquals(actual, expect);
		driver.close();
	}

    @Test(priority = 1)
    public void setup1() throws InterruptedException {
        String url = "http://localhost:8084/AssignmentFinal1/login1.jsp";
        driver.get(url);
        WebElement email = driver.findElement(By.id("emaill"));
        email.sendKeys("VuTieuNh33i");
        WebElement pass = driver.findElement(By.id("pass"));
        pass.sendKeys("nhilaso1");
        WebElement buttonlogin = driver.findElement(By.id("login"));
        buttonlogin.click();
        Thread.sleep(3000);
    }

    @Test(priority = 2)
    public void setup2() throws InterruptedException {
        String url = "http://localhost:8084/AssignmentFinal1/login1.jsp";
        driver.get(url);
        WebElement email = driver.findElement(By.id("emaill"));
        email.sendKeys("VuTieuNhi");
        WebElement pass = driver.findElement(By.id("pass"));
        pass.sendKeys("nhilaso13");
        WebElement buttonlogin = driver.findElement(By.id("login"));
        buttonlogin.click();
        Thread.sleep(3000);
    }

    @Test(priority = 3)
    public void setup3() throws InterruptedException {
        String url = "http://localhost:8084/AssignmentFinal1/login1.jsp";
        driver.get(url);
        WebElement email = driver.findElement(By.id("emaill"));
        email.sendKeys("");
        WebElement pass = driver.findElement(By.id("pass"));
        pass.sendKeys("nhilaso1");
        WebElement buttonlogin = driver.findElement(By.id("login"));
        buttonlogin.click();
        Thread.sleep(3000);
    }

    @Test(priority = 4)
    public void setup4() throws InterruptedException {
        String url = "http://localhost:8084/AssignmentFinal1/login1.jsp";
        driver.get(url);
        WebElement email = driver.findElement(By.id("emaill"));
        email.sendKeys("VuTieuNhi");
        WebElement pass = driver.findElement(By.id("pass"));
        pass.sendKeys("");
        WebElement buttonlogin = driver.findElement(By.id("login"));
        buttonlogin.click();
        Thread.sleep(3000);
    }
}
