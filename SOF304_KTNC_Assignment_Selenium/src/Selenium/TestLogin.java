package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestLogin {


	@Test(description = "nhập email,pass với tài khoản mặc định", groups = "Login", priority = 1)
	public void Login1() {
		System.setProperty("webdriver.chrome.driver", "F:\\TaiNguyenLapTrinh\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:8084/KTT_-_SHOP/admin/index.jsp");
		driver.findElement(By.name("email")).sendKeys("a@gmail.com");
		driver.findElement(By.name("password")).sendKeys("123");
		driver.findElement(By.name("action")).click();
		String expect = "";
		String actual = "";
		Assert.assertEquals(actual, expect);
		driver.close();
	}
	@Test(description = "nhập email,pass là abc", groups = "Login", priority = 2)
	public void Login2() {
		System.setProperty("webdriver.chrome.driver", "F:\\TaiNguyenLapTrinh\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:8084/KTT_-_SHOP/admin/index.jsp");
		driver.findElement(By.name("email")).sendKeys("abc");
		driver.findElement(By.name("password")).sendKeys("abc");
		driver.findElement(By.name("action")).click();
		String expect = "Vui lòng bao gồm '@' trong địa chỉ email. 'a'bị thiếu '@'";
		String actual = "Vui lòng bao gồm '@' trong địa chỉ email. 'a'bị thiếu '@'";
		Assert.assertEquals(actual, expect);
		driver.close();
	}
	@Test(description = "nhập email là a@gmail.com,pass là abc", groups = "Login", priority = 3)
	public void Login3() {
		System.setProperty("webdriver.chrome.driver", "F:\\TaiNguyenLapTrinh\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:8084/KTT_-_SHOP/admin/index.jsp");
		driver.findElement(By.name("email")).sendKeys("a@gmail.com");
		driver.findElement(By.name("password")).sendKeys("abc");
		driver.findElement(By.name("action")).click();
		String expect = "Password bạn nhập không đúng";
		String actual = driver.findElement(By.name("email")).getText();
		Assert.assertEquals(actual, expect);
		driver.close();
	}

	@Test(description = "nhập email là abc,pass 123", groups = "Login", priority = 4)
	public void Login4() {
		System.setProperty("webdriver.chrome.driver", "F:\\TaiNguyenLapTrinh\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:8084/KTT_-_SHOP/admin/index.jsp");
		driver.findElement(By.name("email")).sendKeys("abc");
		driver.findElement(By.name("password")).sendKeys("123");
		driver.findElement(By.name("action")).click();
		String expect = "Vui lòng bao gồm '@' trong địa chỉ email. 'a'bị thiếu '@'";
		String actual = "Vui lòng bao gồm '@' trong địa chỉ email. 'a'bị thiếu '@'";
		Assert.assertEquals(actual, expect);
		driver.close();
	}

	@Test(description = "bỏ trống email. pass", groups = "Login", priority = 5)
	public void Login5() {
		System.setProperty("webdriver.chrome.driver", "F:\\TaiNguyenLapTrinh\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:8084/KTT_-_SHOP/admin/index.jsp");
		driver.findElement(By.name("email")).sendKeys("");
		driver.findElement(By.name("password")).sendKeys("");
		driver.findElement(By.name("action")).click();
		String expect = "Vui lòng bao gồm '@' trong địa chỉ email. 'a'bị thiếu '@'";
		String actual = "Vui lòng bao gồm '@' trong địa chỉ email. 'a'bị thiếu '@'";
		Assert.assertEquals(actual, expect);
		driver.close();
	}

	@Test(description = "nhập email là a@gmail.com và bỏ pass", groups = "Login", priority = 6)
	public void Login6() {
		System.setProperty("webdriver.chrome.driver", "F:\\TaiNguyenLapTrinh\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:8084/KTT_-_SHOP/admin/index.jsp");
		driver.findElement(By.name("email")).sendKeys("a@gmail.com");
		driver.findElement(By.name("password")).sendKeys("");
		driver.findElement(By.name("action")).click();
		String expect = "Vui lòng bao gồm '@' trong địa chỉ email. 'a'bị thiếu '@'";
		String actual = "Vui lòng bao gồm '@' trong địa chỉ email. 'a'bị thiếu '@'";
		Assert.assertEquals(actual, expect);
		driver.close();
	}

	@Test(description = "nhập email chỉ chứa chữ và bỏ pass", groups = "Login", priority = 7)
	public void Login7() {
		System.setProperty("webdriver.chrome.driver", "F:\\TaiNguyenLapTrinh\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:8084/KTT_-_SHOP/admin/index.jsp");
		driver.findElement(By.name("email")).sendKeys("abc");
		driver.findElement(By.name("password")).sendKeys("");
		driver.findElement(By.name("action")).click();
		String expect = "Vui lòng bao gồm '@' trong địa chỉ email. 'a'bị thiếu '@'";
		String actual = "Vui lòng bao gồm '@' trong địa chỉ email. 'a'bị thiếu '@'";
		Assert.assertEquals(actual, expect);
		driver.close();
	}

	@Test(description = "nhập email là @gmail.com vả bỏ trống pass", groups = "Login", priority = 8)
	public void Login8() {
		System.setProperty("webdriver.chrome.driver", "F:\\TaiNguyenLapTrinh\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:8084/KTT_-_SHOP/admin/index.jsp");
		driver.findElement(By.name("email")).sendKeys("@gmail.com");
		driver.findElement(By.name("password")).sendKeys("");
		driver.findElement(By.name("action")).click();
		String expect = "Vui lòng nhập phần đứng trước '@'.'@gmail.com'không được hoàn chỉnh";
		String actual = "Vui lòng nhập phần đứng trước '@'.'@gmail.com'không được hoàn chỉnh";
		Assert.assertEquals(actual, expect);
		driver.close();
	}

	@Test(description = "bỏ trống email và pass là 123", groups = "Login", priority = 9)
	public void Login9() {
		System.setProperty("webdriver.chrome.driver", "F:\\TaiNguyenLapTrinh\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:8084/KTT_-_SHOP/admin/index.jsp");
		driver.findElement(By.name("email")).sendKeys("");
		driver.findElement(By.name("password")).sendKeys("123");
		driver.findElement(By.name("action")).click();
		String expect = "Vui lòng điền vào trường này";
		String actual = "Vui lòng điền vào trường này";
		Assert.assertEquals(actual, expect);
		driver.close();
	}

	@Test(description = "bỏ trống email và pass là abc", groups = "Login", priority = 10)
	public void Login10() {
		System.setProperty("webdriver.chrome.driver", "F:\\TaiNguyenLapTrinh\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:8084/KTT_-_SHOP/admin/index.jsp");
		driver.findElement(By.name("email")).sendKeys("");
		driver.findElement(By.name("password")).sendKeys("abc");
		driver.findElement(By.name("action")).click();
		String expect = "Vui lòng điền vào trường này";
		String actual = "Vui lòng điền vào trường này";
		Assert.assertEquals(actual, expect);
		driver.close();
	}

	@Test(description = "nhập email là @gmail.com vả pass là 123", groups = "Login", priority = 11)
	public void Login11() {
		System.setProperty("webdriver.chrome.driver", "F:\\TaiNguyenLapTrinh\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:8084/KTT_-_SHOP/admin/index.jsp");
		driver.findElement(By.name("email")).sendKeys("@gmail.com");
		driver.findElement(By.name("password")).sendKeys("123");
		driver.findElement(By.name("action")).click();
		String expect = "Vui lòng hập phần đứng trước '@'. '@gmail.com' không hoàn chỉnh";
		String actual = "Vui lòng hập phần đứng trước '@'. '@gmail.com' không hoàn chỉnh";
		Assert.assertEquals(actual, expect);
		driver.close();
	}

	@Test(description = "emai có chưa khoảng trắng", groups = "Login", priority = 12)
	public void Login12() {
		System.setProperty("webdriver.chrome.driver", "F:\\TaiNguyenLapTrinh\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:8084/KTT_-_SHOP/admin/index.jsp");
		driver.findElement(By.name("email")).sendKeys("a @gmail.com");
		driver.findElement(By.name("password")).sendKeys("123");
		driver.findElement(By.name("action")).click();
		String expect = "Phần đứng trước '@' không được chưa biểu tượng' '.";
		String actual = "Phần đứng trước '@' không được chưa biểu tượng' '.";
		Assert.assertEquals(actual, expect);
		driver.close();
	}

	@Test(description = "Nhập ký tự đặc biệt vào trường Email", groups = "Login", priority = 13)
	public void Login13() {
		System.setProperty("webdriver.chrome.driver", "F:\\TaiNguyenLapTrinh\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:8084/KTT_-_SHOP/admin/index.jsp");
		driver.findElement(By.name("email")).sendKeys("@@@@####");
		driver.findElement(By.name("password")).sendKeys("123");
		driver.findElement(By.name("action")).click();
		String expect = "Email không chưa các kí tự đặc biệt";
		String actual = "Vui lòng nhập phần đứng trước '@'.'@@@@####' không được hoàn chỉnh";
		Assert.assertEquals(actual, expect);
		driver.close();
	}

	@Test(description = "Nhập chữ và dấu _ trường email", groups = "Login", priority = 14)
	public void Login14() {
		System.setProperty("webdriver.chrome.driver", "F:\\TaiNguyenLapTrinh\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:8084/KTT_-_SHOP/admin/index.jsp");
		driver.findElement(By.name("email")).sendKeys("Thiện_Nguyễn@gmail.com");
		driver.findElement(By.name("password")).sendKeys("123");
		driver.findElement(By.name("action")).click();
		String expect = "Email không chưa các kí tự đặc biệt";
		String actual = "Phần đứng trước '@' không được chưa biểu tượng 'ệ'";
		Assert.assertEquals(actual, expect);
		driver.close();
	}
}
