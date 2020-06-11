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
	    		driver.get("http://localhost:8084/KTT_-_SHOP/admin/index.jsp");
	    		driver.findElement(By.name("email")).sendKeys("a@gmail.com");
	    		driver.findElement(By.name("password")).sendKeys("123");
	    		driver.findElement(By.name("action")).click();
	    		driver.navigate().to("http://localhost:8084/KTT_-_SHOP/admin/themmoithanhvien.jsp");
	}
	@AfterClass
	public void AfterClass() throws Exception{
		driver.close();
	}
	@Test(description = "thêm mới thành viên đây đủ các trường", groups = "Add_Staff", priority = 1)
	public void Add_Staff_01() {
		System.setProperty("webdriver.gecko.driver", "F:\\TaiNguyenLapTrinh\\geckodriver.exe");
		driver.get("http://localhost:8084/KTT_-_SHOP/admin/themmoithanhvien.jsp");
		driver.findElement(By.name("tmtvMail")).sendKeys("thien@gmail.com");
		driver.findElement(By.name("tmtvPass")).sendKeys("12345678");
		driver.findElement(By.name("tmtvRePass")).sendKeys("12345678");
		driver.findElement(By.name("tmtvName")).sendKeys("Nguyễn Ngọc Thiện");
		driver.findElement(By.name("action")).click();
		String expect = "";
		String actual = "";
		Assert.assertEquals(actual, expect);
		
	}
	@Test(description = "thêm mới thành viên với email được bỏ trống", groups = "Add_Staff", priority = 2)
	public void Add_Staff_02() {
		System.setProperty("webdriver.gecko.driver", "F:\\TaiNguyenLapTrinh\\geckodriver.exe");
		driver.get("http://localhost:8084/KTT_-_SHOP/admin/themmoithanhvien.jsp");
		driver.findElement(By.name("tmtvMail")).sendKeys("");
		String expect = "Vui lòng điền vào trường này";
		String actual = "Vui lòng điền vào trường này";
		Assert.assertEquals(actual, expect);
	
	}
	@Test(description = "Nhập đúng định dạng trường email", groups = "Add_Staff", priority = 3)
	public void Add_Staff_03() {
		System.setProperty("webdriver.gecko.driver", "F:\\TaiNguyenLapTrinh\\geckodriver.exe");
		driver.get("http://localhost:8084/KTT_-_SHOP/admin/themmoithanhvien.jsp");
		driver.findElement(By.name("tmtvMail")).sendKeys("Thien@gmail.com");
		driver.findElement(By.name("tmtvPass")).sendKeys("12345678");
		driver.findElement(By.name("tmtvRePass")).sendKeys("12345678");
		driver.findElement(By.name("tmtvName")).sendKeys("Nguyễn Ngọc Thiện");
		driver.findElement(By.name("action")).click();
		String expect = "";
		String actual = "";
		Assert.assertEquals(actual, expect);
		
	}
	@Test(description = " Nhập sai định dạng trường email", groups = "Add_Staff", priority = 4)
	public void Add_Staff_04() {
		System.setProperty("webdriver.gecko.driver", "F:\\TaiNguyenLapTrinh\\geckodriver.exe");
		driver.get("http://localhost:8084/KTT_-_SHOP/admin/themmoithanhvien.jsp");
		driver.findElement(By.name("tmtvMail")).sendKeys("Thien");
		driver.findElement(By.name("tmtvPass")).sendKeys("12345678");
		driver.findElement(By.name("tmtvRePass")).sendKeys("12345678");
		driver.findElement(By.name("tmtvName")).sendKeys("Nguyễn Ngọc Thiện");
		driver.findElement(By.name("action")).click();
		String expect = "Vui lòng bao gồm '@' trong địa chỉ email. 'Thien' bị thiếu '@'";
		String actual = "Vui lòng bao gồm '@' trong địa chỉ email. 'Thien' bị thiếu '@'";
		Assert.assertEquals(actual, expect);
		
	}
	@Test(description = "Nhập số vào trường email", groups = "Add_Staff", priority = 5)
	public void Add_Staff_05() {
		System.setProperty("webdriver.gecko.driver", "F:\\TaiNguyenLapTrinh\\geckodriver.exe");
		driver.get("http://localhost:8084/KTT_-_SHOP/admin/themmoithanhvien.jsp");
		driver.findElement(By.name("tmtvMail")).sendKeys("11111");
		driver.findElement(By.name("tmtvPass")).sendKeys("12345678");
		driver.findElement(By.name("tmtvRePass")).sendKeys("12345678");
		driver.findElement(By.name("tmtvName")).sendKeys("Nguyễn Ngọc Thiện");
		driver.findElement(By.name("action")).click();
		String expect = "Vui lòng bao gồm '@' trong địa chỉ email. '11111' bị thiếu '@'";
		String actual = "Vui lòng bao gồm '@' trong địa chỉ email. '11111' bị thiếu '@'";
		Assert.assertEquals(actual, expect);
		
	}
	@Test(description = "Nhập chữ và dấu chấm  trường email", groups = "Add_Staff", priority = 6)
	public void Add_Staff_06() {
		System.setProperty("webdriver.gecko.driver", "F:\\TaiNguyenLapTrinh\\geckodriver.exe");
		driver.get("http://localhost:8084/KTT_-_SHOP/admin/themmoithanhvien.jsp");
		driver.findElement(By.name("tmtvMail")).sendKeys("Thien.@gmail.com");
		driver.findElement(By.name("tmtvPass")).sendKeys("12345678");
		driver.findElement(By.name("tmtvRePass")).sendKeys("12345678");
		driver.findElement(By.name("tmtvName")).sendKeys("Nguyễn Ngọc Thiện");
		driver.findElement(By.name("action")).click();
		String expect = "Bạn sai định dạng Email";
		String actual = "";
		Assert.assertEquals(actual, expect);
	
	}
	@Test(description = "Nhập chữ và dấu _ trường email", groups = "Add_Staff", priority = 7)
	public void Add_Staff_07() {
		System.setProperty("webdriver.gecko.driver", "F:\\TaiNguyenLapTrinh\\geckodriver.exe");
		driver.get("http://localhost:8084/KTT_-_SHOP/admin/themmoithanhvien.jsp");
		driver.findElement(By.name("tmtvMail")).sendKeys("Thien_@gmail.com");
		driver.findElement(By.name("tmtvPass")).sendKeys("12345678");
		driver.findElement(By.name("tmtvRePass")).sendKeys("12345678");
		driver.findElement(By.name("tmtvName")).sendKeys("Nguyễn Ngọc Thiện");
		driver.findElement(By.name("action")).click();
		String expect = "";
		String actual = "";
		Assert.assertEquals(actual, expect);
		
	}
	@Test(description = "Nhập chữ và ký tự đặc biệt trường email", groups = "Add_Staff", priority = 8)
	public void Add_Staff_08() {
		System.setProperty("webdriver.gecko.driver", "F:\\TaiNguyenLapTrinh\\geckodriver.exe");
		driver.get("http://localhost:8084/KTT_-_SHOP/admin/themmoithanhvien.jsp");
		driver.findElement(By.name("tmtvMail")).sendKeys("Thien$$$##@gmail.com");
		driver.findElement(By.name("tmtvPass")).sendKeys("12345678");
		driver.findElement(By.name("tmtvRePass")).sendKeys("12345678");
		driver.findElement(By.name("tmtvName")).sendKeys("Nguyễn Ngọc Thiện");
		driver.findElement(By.name("action")).click();
		String expect = "Bạn nhập sai định dạng Email";
		String actual = "";
		Assert.assertEquals(actual, expect);
		
	}
	@Test(description = "Nhập chữ nhỏ hơn 4 ký tự trường email", groups = "Add_Staff", priority = 9)
	public void Add_Staff_09() {
		System.setProperty("webdriver.gecko.driver", "F:\\TaiNguyenLapTrinh\\geckodriver.exe");
		driver.get("http://localhost:8084/KTT_-_SHOP/admin/themmoithanhvien.jsp");
		driver.findElement(By.name("tmtvMail")).sendKeys("duc@gmail.com");
		driver.findElement(By.name("tmtvPass")).sendKeys("12345678");
		driver.findElement(By.name("tmtvRePass")).sendKeys("12345678");
		driver.findElement(By.name("tmtvName")).sendKeys("Nguyễn Ngọc Thiện");
		driver.findElement(By.name("action")).click();
		String expect = "";
		String actual = "";
		Assert.assertEquals(actual, expect);
	
	}
	@Test(description = "Nhập kí tự số đằng sau  ký tự @ vào  trường email", groups = "Add_Staff", priority = 10)
	public void Add_Staff_10() {
		System.setProperty("webdriver.gecko.driver", "F:\\TaiNguyenLapTrinh\\geckodriver.exe");
		driver.get("http://localhost:8084/KTT_-_SHOP/admin/themmoithanhvien.jsp");
		driver.findElement(By.name("tmtvMail")).sendKeys("Thien@123gmail.com");
		driver.findElement(By.name("tmtvPass")).sendKeys("12345678");
		driver.findElement(By.name("tmtvRePass")).sendKeys("12345678");
		driver.findElement(By.name("tmtvName")).sendKeys("Nguyễn Ngọc Thiện");
		driver.findElement(By.name("action")).click();
		String expect = "";
		String actual = "";
		Assert.assertEquals(actual, expect);
		
	}
	@Test(description = "Nhập kí tự _ đằng sau  ký tự @ vào  trường email", groups = "Add_Staff", priority = 11)
	public void Add_Staff_11() {
		System.setProperty("webdriver.gecko.driver", "F:\\TaiNguyenLapTrinh\\geckodriver.exe");
		driver.get("http://localhost:8084/KTT_-_SHOP/admin/themmoithanhvien.jsp");
		driver.findElement(By.name("tmtvMail")).sendKeys("Thien@_gmail.com");
		driver.findElement(By.name("tmtvPass")).sendKeys("12345678");
		driver.findElement(By.name("tmtvRePass")).sendKeys("12345678");
		driver.findElement(By.name("tmtvName")).sendKeys("Nguyễn Ngọc Thiện");
		driver.findElement(By.name("action")).click();
		String expect = "Phần đứng sau '@'không được chứa biểu tượng'_'";
		String actual = "Phần đứng sau '@'không được chứa biểu tượng'_'";
		Assert.assertEquals(actual, expect);
		
	}

	@Test(description = "Nhập kí tự  đặc biệt đằng sau  ký tự @ vào  trường email", groups = "Add_Staff", priority = 12)
	public void Add_Staff_12() {
		System.setProperty("webdriver.gecko.driver", "F:\\TaiNguyenLapTrinh\\geckodriver.exe");
		driver.get("http://localhost:8084/KTT_-_SHOP/admin/themmoithanhvien.jsp");
		driver.findElement(By.name("tmtvMail")).sendKeys("Thien@$$$gmail.com");
		driver.findElement(By.name("tmtvPass")).sendKeys("12345678");
		driver.findElement(By.name("tmtvRePass")).sendKeys("12345678");
		driver.findElement(By.name("tmtvName")).sendKeys("Nguyễn Ngọc Thiện");
		driver.findElement(By.name("action")).click();
		String expect = "Phần đứng sau '@'không được chứa biểu tượng'$'";
		String actual = "Phần đứng sau '@'không được chứa biểu tượng'$'";
		Assert.assertEquals(actual, expect);
		
	}
	@Test(description = "Nhập <3 ký tự đằng sau  ký tự @ vào  trường email", groups = "Add_Staff", priority = 13)
	public void Add_Staff_13() {
		System.setProperty("webdriver.gecko.driver", "F:\\TaiNguyenLapTrinh\\geckodriver.exe");
		driver.get("http://localhost:8084/KTT_-_SHOP/admin/themmoithanhvien.jsp");
		driver.findElement(By.name("tmtvMail")).sendKeys("Thien@anhgmail.com");
		driver.findElement(By.name("tmtvPass")).sendKeys("12345678");
		driver.findElement(By.name("tmtvRePass")).sendKeys("12345678");
		driver.findElement(By.name("tmtvName")).sendKeys("Nguyễn Ngọc Thiện");
		driver.findElement(By.name("action")).click();
		String expect = "";
		String actual = "";
		Assert.assertEquals(actual, expect);
		
	}
	@Test(description = "Nhập khoảng trắng vào trường email", groups = "Add_Staff", priority = 14)
	public void Add_Staff_14() {
		System.setProperty("webdriver.gecko.driver", "F:\\TaiNguyenLapTrinh\\geckodriver.exe");
		driver.get("http://localhost:8084/KTT_-_SHOP/admin/themmoithanhvien.jsp");
		driver.findElement(By.name("tmtvMail")).sendKeys("Thien @gmail.com");
		driver.findElement(By.name("tmtvPass")).sendKeys("12345678");
		driver.findElement(By.name("tmtvRePass")).sendKeys("12345678");
		driver.findElement(By.name("tmtvName")).sendKeys("Nguyễn Ngọc Thiện");
		driver.findElement(By.name("action")).click();
		String expect = "Phần đứng trước '@' không được chứa ' '";
		String actual = "Phần đứng trước '@' không được chứa ' '";
		Assert.assertEquals(actual, expect);
		
	}
	@Test(description = "Nhập khoảng trắng và kí tự số vào trường email", groups = "Add_Staff", priority = 15)
	public void Add_Staff_15() {
		System.setProperty("webdriver.gecko.driver", "F:\\TaiNguyenLapTrinh\\geckodriver.exe");
		driver.get("http://localhost:8084/KTT_-_SHOP/admin/themmoithanhvien.jsp");
		driver.findElement(By.name("tmtvMail")).sendKeys("Thien 12 @gmail.com");
		driver.findElement(By.name("tmtvPass")).sendKeys("12345678");
		driver.findElement(By.name("tmtvRePass")).sendKeys("12345678");
		driver.findElement(By.name("tmtvName")).sendKeys("Nguyễn Ngọc Thiện");
		driver.findElement(By.name("action")).click();
		String expect = "Phần đứng trước '@' không được chứa ' '";
		String actual = "Phần đứng trước '@' không được chứa ' '";
		Assert.assertEquals(actual, expect);
		
	}
	@Test(description = "Nhập khoảng trắng và kí tự đặc biệt vào trường email", groups = "Add_Staff", priority = 16)
	public void Add_Staff_16() {
		System.setProperty("webdriver.gecko.driver", "F:\\TaiNguyenLapTrinh\\geckodriver.exe");
		driver.get("http://localhost:8084/KTT_-_SHOP/admin/themmoithanhvien.jsp");
		driver.findElement(By.name("tmtvMail")).sendKeys("Thien $$ @gmail.com");
		driver.findElement(By.name("tmtvPass")).sendKeys("12345678");
		driver.findElement(By.name("tmtvRePass")).sendKeys("12345678");
		driver.findElement(By.name("tmtvName")).sendKeys("Nguyễn Ngọc Thiện");
		driver.findElement(By.name("action")).click();
		String expect = "Bạn nhập sai định dạng Email";
		String actual = "Phần đứng trước '@' không được chứa ' '";
		Assert.assertEquals(actual, expect);

	}
	@Test(description = "Nhập 2 ký tự @@  vào trường email", groups = "Add_Staff", priority = 17)
	public void Add_Staff_17() {
		System.setProperty("webdriver.gecko.driver", "F:\\TaiNguyenLapTrinh\\geckodriver.exe");
		driver.get("http://localhost:8084/KTT_-_SHOP/admin/themmoithanhvien.jsp");
		driver.findElement(By.name("tmtvMail")).sendKeys("Thien@@gmail.com");
		driver.findElement(By.name("tmtvPass")).sendKeys("12345678");
		driver.findElement(By.name("tmtvRePass")).sendKeys("12345678");
		driver.findElement(By.name("tmtvName")).sendKeys("Nguyễn Ngọc Thiện");
		driver.findElement(By.name("action")).click();
		String expect = "Bạn nhập sai định dạng Email";
		String actual = "Phần đứng trước '@' không được chứa '@'";
		Assert.assertEquals(actual, expect);

	}
	@Test(description = "Bỏ Trống trường Password", groups = "Add_Staff", priority = 18)
	public void Add_Staff_18() {
		System.setProperty("webdriver.gecko.driver", "F:\\TaiNguyenLapTrinh\\geckodriver.exe");
		driver.get("http://localhost:8084/KTT_-_SHOP/admin/themmoithanhvien.jsp");
		driver.findElement(By.name("tmtvMail")).sendKeys("thien@gmail.com");
		driver.findElement(By.name("tmtvPass")).sendKeys("");
		driver.findElement(By.name("tmtvRePass")).sendKeys("12345678");
		driver.findElement(By.name("tmtvName")).sendKeys("Nguyễn Ngọc Thiện");
		driver.findElement(By.name("action")).click();
		String expect = "Vui lòng điền vào trường này";
		String actual = "Vui lòng điền vào trường này";
		Assert.assertEquals(actual, expect);
	
	}
	@Test(description = "Nhập vào trường <5 ký tự chữ Password", groups = "Add_Staff", priority = 19)
	public void Add_Staff_19() {
		System.setProperty("webdriver.gecko.driver", "F:\\TaiNguyenLapTrinh\\geckodriver.exe");
		driver.get("http://localhost:8084/KTT_-_SHOP/admin/themmoithanhvien.jsp");
		driver.findElement(By.name("tmtvMail")).sendKeys("thien@gmail.com");
		driver.findElement(By.name("tmtvPass")).sendKeys("Ducan");
		driver.findElement(By.name("tmtvRePass")).sendKeys("Ducan");
		driver.findElement(By.name("tmtvName")).sendKeys("Nguyễn Ngọc Thiện");
		driver.findElement(By.name("action")).click();
		String expect = "";
		String actual = "";
		Assert.assertEquals(actual, expect);
	
	}
	@Test(description = "Nhập vào trường =6 ký tự chữ Password", groups = "Add_Staff", priority = 20)
	public void Add_Staff_20() {
		System.setProperty("webdriver.gecko.driver", "F:\\TaiNguyenLapTrinh\\geckodriver.exe");
		driver.get("http://localhost:8084/KTT_-_SHOP/admin/themmoithanhvien.jsp");
		driver.findElement(By.name("tmtvMail")).sendKeys("thien@gmail.com");
		driver.findElement(By.name("tmtvPass")).sendKeys("Ducanh");
		driver.findElement(By.name("tmtvRePass")).sendKeys("Ducanh");
		driver.findElement(By.name("tmtvName")).sendKeys("Nguyễn Ngọc Thiện");
		driver.findElement(By.name("action")).click();
		String expect = "";
		String actual = "";
		Assert.assertEquals(actual, expect);
		
	}
	@Test(description = "Nhập vào trường 7 ký tự chữ Password", groups = "Add_Staff", priority = 21)
	public void Add_Staff_21() {
		System.setProperty("webdriver.gecko.driver", "F:\\TaiNguyenLapTrinh\\geckodriver.exe");
		driver.get("http://localhost:8084/KTT_-_SHOP/admin/themmoithanhvien.jsp");
		driver.findElement(By.name("tmtvMail")).sendKeys("thien@gmail.com");
		driver.findElement(By.name("tmtvPass")).sendKeys("Ducanh1");
		driver.findElement(By.name("tmtvRePass")).sendKeys("Ducanh1");
		driver.findElement(By.name("tmtvName")).sendKeys("Nguyễn Ngọc Thiện");
		driver.findElement(By.name("action")).click();
		String expect = "";
		String actual = "";
		Assert.assertEquals(actual, expect);
	
	}
	@Test(description = "Nhập vào trường  ký tự chữ  unicode 6 ký tự Password", groups = "Add_Staff", priority = 22)
	public void Add_Staff_22() {
		System.setProperty("webdriver.gecko.driver", "F:\\TaiNguyenLapTrinh\\geckodriver.exe");
		driver.get("http://localhost:8084/KTT_-_SHOP/admin/themmoithanhvien.jsp");
		driver.findElement(By.name("tmtvMail")).sendKeys("thien@gmail.com");
		driver.findElement(By.name("tmtvPass")).sendKeys("ĐứcAnh");
		driver.findElement(By.name("tmtvRePass")).sendKeys("ĐứcAnh");
		driver.findElement(By.name("tmtvName")).sendKeys("Nguyễn Ngọc Thiện");
		driver.findElement(By.name("action")).click();
		String expect = "Password chỉ chứa các kí tự từ A-Z,a-z,0-9";
		String actual = "";
		Assert.assertEquals(actual, expect);
	
	}
	@Test(description = "Nhập vào trường  ký tự chữ  unicode 7 ký tự Password", groups = "Add_Staff", priority = 23)
	public void Add_Staff_23() {
		System.setProperty("webdriver.gecko.driver", "F:\\TaiNguyenLapTrinh\\geckodriver.exe");
		driver.get("http://localhost:8084/KTT_-_SHOP/admin/themmoithanhvien.jsp");
		driver.findElement(By.name("tmtvMail")).sendKeys("thien@gmail.com");
		driver.findElement(By.name("tmtvPass")).sendKeys("ĐứcAnh8");
		driver.findElement(By.name("tmtvRePass")).sendKeys("ĐứcAnh8");
		driver.findElement(By.name("tmtvName")).sendKeys("Nguyễn Ngọc Thiện");
		driver.findElement(By.name("action")).click();
		String expect = "Password chỉ chứa các kí tự từ A-Z,a-z,0-9";
		String actual = "";
		Assert.assertEquals(actual, expect);
		
	}
	@Test(description = "Nhập vào trường Password ký tự in hoa", groups = "Add_Staff", priority = 24)
	public void Add_Staff_24() {
		System.setProperty("webdriver.gecko.driver", "F:\\TaiNguyenLapTrinh\\geckodriver.exe");
		driver.get("http://localhost:8084/KTT_-_SHOP/admin/themmoithanhvien.jsp");
		driver.findElement(By.name("tmtvMail")).sendKeys("thien@gmail.com");
		driver.findElement(By.name("tmtvPass")).sendKeys("DUCANH");
		driver.findElement(By.name("tmtvRePass")).sendKeys("DUCANH");
		driver.findElement(By.name("tmtvName")).sendKeys("Nguyễn Ngọc Thiện");
		driver.findElement(By.name("action")).click();
		String expect = "";
		String actual = "";
		Assert.assertEquals(actual, expect);
	
	}
	@Test(description = "Nhập vào trường Password ký tự in thường", groups = "Add_Staff", priority = 25)
	public void Add_Staff_25() {
		System.setProperty("webdriver.gecko.driver", "F:\\TaiNguyenLapTrinh\\geckodriver.exe");
		driver.get("http://localhost:8084/KTT_-_SHOP/admin/themmoithanhvien.jsp");
		driver.findElement(By.name("tmtvMail")).sendKeys("thien@gmail.com");
		driver.findElement(By.name("tmtvPass")).sendKeys("ducanh");
		driver.findElement(By.name("tmtvRePass")).sendKeys("ducanh");
		driver.findElement(By.name("tmtvName")).sendKeys("Nguyễn Ngọc Thiện");
		driver.findElement(By.name("action")).click();
		String expect = "";
		String actual = "";
		Assert.assertEquals(actual, expect);

	}
	@Test(description = "Nhập vào trường Password ký tự đặc biệt ", groups = "Add_Staff", priority = 26)
	public void Add_Staff_26() {
		System.setProperty("webdriver.gecko.driver", "F:\\TaiNguyenLapTrinh\\geckodriver.exe");
		driver.get("http://localhost:8084/KTT_-_SHOP/admin/themmoithanhvien.jsp");
		driver.findElement(By.name("tmtvMail")).sendKeys("thien@gmail.com");
		driver.findElement(By.name("tmtvPass")).sendKeys("$$$####");
		driver.findElement(By.name("tmtvRePass")).sendKeys("$$$####");
		driver.findElement(By.name("tmtvName")).sendKeys("Nguyễn Ngọc Thiện");
		driver.findElement(By.name("action")).click();
		String expect = "Password chỉ chứa các kí tự từ A-Z,a-z,0-9";
		String actual = "";
		Assert.assertEquals(actual, expect);
		
	}
	@Test(description = "Nhập vào trường Password số và chữ ", groups = "Add_Staff", priority = 27)
	public void Add_Staff_27() {
		System.setProperty("webdriver.gecko.driver", "F:\\TaiNguyenLapTrinh\\geckodriver.exe");
		driver.get("http://localhost:8084/KTT_-_SHOP/admin/themmoithanhvien.jsp");
		driver.findElement(By.name("tmtvMail")).sendKeys("thien@gmail.com");
		driver.findElement(By.name("tmtvPass")).sendKeys("ducanh123456");
		driver.findElement(By.name("tmtvRePass")).sendKeys("ducanh123456");
		driver.findElement(By.name("tmtvName")).sendKeys("Nguyễn Ngọc Thiện");
		driver.findElement(By.name("action")).click();
		String expect = "";
		String actual = "";
		Assert.assertEquals(actual, expect);
	
	}
	@Test(description = "Nhập vào trường Password số, chữ, ký tự đặc biệt ", groups = "Add_Staff", priority = 28)
	public void Add_Staff_28() {
		System.setProperty("webdriver.gecko.driver", "F:\\TaiNguyenLapTrinh\\geckodriver.exe");
		driver.get("http://localhost:8084/KTT_-_SHOP/admin/themmoithanhvien.jsp");
		driver.findElement(By.name("tmtvMail")).sendKeys("thien@gmail.com");
		driver.findElement(By.name("tmtvPass")).sendKeys("ducanh123456###");
		driver.findElement(By.name("tmtvRePass")).sendKeys("ducanh123456###");
		driver.findElement(By.name("tmtvName")).sendKeys("Nguyễn Ngọc Thiện");
		driver.findElement(By.name("action")).click();
		String expect = "Password chỉ chứa các kí tự từ A-Z,a-z,0-9";
		String actual = "";
		Assert.assertEquals(actual, expect);
		
	}
	@Test(description = "Bỏ Trống trường Re-enter password", groups = "Add_Staff", priority = 29)
	public void Add_Staff_29() {
		System.setProperty("webdriver.gecko.driver", "F:\\TaiNguyenLapTrinh\\geckodriver.exe");
		driver.get("http://localhost:8084/KTT_-_SHOP/admin/themmoithanhvien.jsp");
		driver.findElement(By.name("tmtvMail")).sendKeys("ducanh");
		driver.findElement(By.name("tmtvPass")).sendKeys("");
		driver.findElement(By.name("tmtvRePass")).sendKeys("12345678");
		driver.findElement(By.name("tmtvName")).sendKeys("Nguyễn Ngọc Thiện");
		driver.findElement(By.name("action")).click();
		String expect = "Vui lòng điền vào trường này";
		String actual = "Vui lòng điền vào trường này";
		Assert.assertEquals(actual, expect);
		
	}
	@Test(description = "Nhập trường Re-enter password giống password", groups = "Add_Staff", priority = 30)
	public void Add_Staff_30() {
		System.setProperty("webdriver.gecko.driver", "F:\\TaiNguyenLapTrinh\\geckodriver.exe");
		driver.get("http://localhost:8084/KTT_-_SHOP/admin/themmoithanhvien.jsp");
		driver.findElement(By.name("tmtvMail")).sendKeys("thien@gmail.com");
		driver.findElement(By.name("tmtvPass")).sendKeys("Ducanh12345");
		driver.findElement(By.name("tmtvRePass")).sendKeys("Ducanh12345");
		driver.findElement(By.name("tmtvName")).sendKeys("Nguyễn Ngọc Thiện");
		driver.findElement(By.name("action")).click();
		String expect = "";
		String actual = "";
		Assert.assertEquals(actual, expect);
		
	}
	@Test(description = "Nhập trường Re-enter password khác password", groups = "Add_Staff", priority = 31)
	public void Add_Staff_31() {
		System.setProperty("webdriver.gecko.driver", "F:\\TaiNguyenLapTrinh\\geckodriver.exe");
		driver.get("http://localhost:8084/KTT_-_SHOP/admin/themmoithanhvien.jsp");
		driver.findElement(By.name("tmtvMail")).sendKeys("thien@gmail.com");
		driver.findElement(By.name("tmtvPass")).sendKeys("Ducanh12345");
		driver.findElement(By.name("tmtvRePass")).sendKeys("Ducanh");
		driver.findElement(By.name("tmtvName")).sendKeys("Nguyễn Ngọc Thiện");
		driver.findElement(By.name("action")).click();
		String expect = "Password Don't Match";
		String actual = "Password Don't Match";
		Assert.assertEquals(actual, expect);
		
	}
	@Test(description = "Nhập trường Re-enter password chữ in hoa password", groups = "Add_Staff", priority = 32)
	public void Add_Staff_32() {
		System.setProperty("webdriver.gecko.driver", "F:\\TaiNguyenLapTrinh\\geckodriver.exe");
		driver.get("http://localhost:8084/KTT_-_SHOP/admin/themmoithanhvien.jsp");
		driver.findElement(By.name("tmtvMail")).sendKeys("thien@gmail.com");
		driver.findElement(By.name("tmtvPass")).sendKeys("Ducanh12345");
		driver.findElement(By.name("tmtvRePass")).sendKeys("DUCANH");
		driver.findElement(By.name("tmtvName")).sendKeys("Nguyễn Ngọc Thiện");
		driver.findElement(By.name("action")).click();
		String expect = "Password Don't Match";
		String actual = "Password Don't Match";
		Assert.assertEquals(actual, expect);
	
	}
	@Test(description = "Nhập trường Re-enter password chữ in hoa và số password", groups = "Add_Staff", priority = 33)
	public void Add_Staff_33() {
		System.setProperty("webdriver.gecko.driver", "F:\\TaiNguyenLapTrinh\\geckodriver.exe");
		driver.get("http://localhost:8084/KTT_-_SHOP/admin/themmoithanhvien.jsp");
		driver.findElement(By.name("tmtvMail")).sendKeys("thien@gmail.com");
		driver.findElement(By.name("tmtvPass")).sendKeys("Ducanh12345");
		driver.findElement(By.name("tmtvRePass")).sendKeys("DUCANH1234");
		driver.findElement(By.name("tmtvName")).sendKeys("Nguyễn Ngọc Thiện");
		driver.findElement(By.name("action")).click();
		String expect = "Password Don't Match";
		String actual = "Password Don't Match";
		Assert.assertEquals(actual, expect);
		
	}
	@Test(description = "Nhập trường Re-enter password chữ in hoa và ký tự đặc biệt password", groups = "Add_Staff", priority = 34)
	public void Add_Staff_34() {
		System.setProperty("webdriver.gecko.driver", "F:\\TaiNguyenLapTrinh\\geckodriver.exe");
		driver.get("http://localhost:8084/KTT_-_SHOP/admin/themmoithanhvien.jsp");
		driver.findElement(By.name("tmtvMail")).sendKeys("thien@gmail.com");
		driver.findElement(By.name("tmtvPass")).sendKeys("Ducanh12345");
		driver.findElement(By.name("tmtvRePass")).sendKeys("DUCANH1234@@@");
		driver.findElement(By.name("tmtvName")).sendKeys("Nguyễn Ngọc Thiện");
		driver.findElement(By.name("action")).click();
		String expect = "Password Don't Match";
		String actual = "Password Don't Match";
		Assert.assertEquals(actual, expect);
		
	}
	@Test(description = "Nhập trường Re-enter password chữ in hoa và ký tự thường", groups = "Add_Staff", priority = 35)
	public void Add_Staff_35() {
		System.setProperty("webdriver.gecko.driver", "F:\\TaiNguyenLapTrinh\\geckodriver.exe");
		driver.get("http://localhost:8084/KTT_-_SHOP/admin/themmoithanhvien.jsp");
		driver.findElement(By.name("tmtvMail")).sendKeys("thien@gmail.com");
		driver.findElement(By.name("tmtvPass")).sendKeys("Ducanh12345");
		driver.findElement(By.name("tmtvRePass")).sendKeys("DUCANHaaaa");
		driver.findElement(By.name("tmtvName")).sendKeys("Nguyễn Ngọc Thiện");
		driver.findElement(By.name("action")).click();
		String expect = "Password Don't Match";
		String actual = "Password Don't Match";
		Assert.assertEquals(actual, expect);
	
	}
	@Test(description = "Nhập trường Re-enter password chữ  có dấu ", groups = "Add_Staff", priority = 36)
	public void Add_Staff_36() {
		System.setProperty("webdriver.gecko.driver", "F:\\TaiNguyenLapTrinh\\geckodriver.exe");
		driver.get("http://localhost:8084/KTT_-_SHOP/admin/themmoithanhvien.jsp");
		driver.findElement(By.name("tmtvMail")).sendKeys("thien@gmail.com");
		driver.findElement(By.name("tmtvPass")).sendKeys("Ducanh12345");
		driver.findElement(By.name("tmtvRePass")).sendKeys("đứcanh");
		driver.findElement(By.name("tmtvName")).sendKeys("Nguyễn Ngọc Thiện");
		driver.findElement(By.name("action")).click();
		String expect = "Password Don't Match";
		String actual = "Password Don't Match";
		Assert.assertEquals(actual, expect);

	}
	@Test(description = "Nhập trường Re-enter password chữ  có dấu và khoảng trắng ", groups = "Add_Staff", priority = 37)
	public void Add_Staff_37() {
		System.setProperty("webdriver.gecko.driver", "F:\\TaiNguyenLapTrinh\\geckodriver.exe");
		driver.get("http://localhost:8084/KTT_-_SHOP/admin/themmoithanhvien.jsp");
		driver.findElement(By.name("tmtvMail")).sendKeys("thien@gmail.com");
		driver.findElement(By.name("tmtvPass")).sendKeys("Ducanh12345");
		driver.findElement(By.name("tmtvRePass")).sendKeys("đứcanh ");
		driver.findElement(By.name("tmtvName")).sendKeys("Nguyễn Ngọc Thiện");
		driver.findElement(By.name("action")).click();
		String expect = "Password Don't Match";
		String actual = "Password Don't Match";
		Assert.assertEquals(actual, expect);
		
	}
	@Test(description = "Nhập trường Re-enter password chữ  không dấu và khoảng trắng ", groups = "Add_Staff", priority = 38)
	public void Add_Staff_38() {
		System.setProperty("webdriver.gecko.driver", "F:\\TaiNguyenLapTrinh\\geckodriver.exe");
		driver.get("http://localhost:8084/KTT_-_SHOP/admin/themmoithanhvien.jsp");
		driver.findElement(By.name("tmtvMail")).sendKeys("thien@gmail.com");
		driver.findElement(By.name("tmtvPass")).sendKeys("Ducanh12345");
		driver.findElement(By.name("tmtvRePass")).sendKeys("ducanh ");
		driver.findElement(By.name("tmtvName")).sendKeys("Nguyễn Ngọc Thiện");
		driver.findElement(By.name("action")).click();
		String expect = "Password Don't Match";
		String actual = "Password Don't Match";
		Assert.assertEquals(actual, expect);
		
	}
	@Test(description = "Nhập trường Re-enter password chữ  không dấu ,khoảng trắng,ký tự đặc biệt", groups = "Add_Staff", priority = 39)
	public void Add_Staff_39() {
		System.setProperty("webdriver.gecko.driver", "F:\\TaiNguyenLapTrinh\\geckodriver.exe");
		driver.get("http://localhost:8084/KTT_-_SHOP/admin/themmoithanhvien.jsp");
		driver.findElement(By.name("tmtvMail")).sendKeys("thien@gmail.com");
		driver.findElement(By.name("tmtvPass")).sendKeys("Ducanh12345");
		driver.findElement(By.name("tmtvRePass")).sendKeys("ducanh@@");
		driver.findElement(By.name("tmtvName")).sendKeys("Nguyễn Ngọc Thiện");
		driver.findElement(By.name("action")).click();
		String expect = "Password Don't Match";
		String actual = "Password Don't Match";
		Assert.assertEquals(actual, expect);
		
	}
	@Test(description = "Nhập trường Re-enter password  khoảng trắng,ký tự đặc biệt ", groups = "Add_Staff", priority = 40)
	public void Add_Staff_40() {
		System.setProperty("webdriver.gecko.driver", "F:\\TaiNguyenLapTrinh\\geckodriver.exe");
		driver.get("http://localhost:8084/KTT_-_SHOP/admin/themmoithanhvien.jsp");
		driver.findElement(By.name("tmtvMail")).sendKeys("thien@gmail.com");
		driver.findElement(By.name("tmtvPass")).sendKeys("Ducanh12345");
		driver.findElement(By.name("tmtvRePass")).sendKeys("@@@!!! ");
		driver.findElement(By.name("tmtvName")).sendKeys("Nguyễn Ngọc Thiện");
		driver.findElement(By.name("action")).click();
		String expect = "Password Don't Match";
		String actual = "Password Don't Match";
		Assert.assertEquals(actual, expect);
	
	}
	@Test(description = "Nhập trường Re-enter password  khoảng trắng", groups = "Add_Staff", priority = 41)
	public void Add_Staff_41() {
		System.setProperty("webdriver.gecko.driver", "F:\\TaiNguyenLapTrinh\\geckodriver.exe");
		driver.get("http://localhost:8084/KTT_-_SHOP/admin/themmoithanhvien.jsp");
		driver.findElement(By.name("tmtvMail")).sendKeys("thien@gmail.com");
		driver.findElement(By.name("tmtvPass")).sendKeys("Ducanh12345");
		driver.findElement(By.name("tmtvRePass")).sendKeys("   ");
		driver.findElement(By.name("tmtvName")).sendKeys("Nguyễn Ngọc Thiện");
		driver.findElement(By.name("action")).click();
		String expect = "Password Don't Match";
		String actual = "Password Don't Match";
		Assert.assertEquals(actual, expect);
		
	}
	@Test(description = "Nhập trường Re-enter password  khoảng trắng và số", groups = "Add_Staff", priority = 42)
	public void Add_Staff_42() {
		System.setProperty("webdriver.gecko.driver", "F:\\TaiNguyenLapTrinh\\geckodriver.exe");
		driver.get("http://localhost:8084/KTT_-_SHOP/admin/themmoithanhvien.jsp");
		driver.findElement(By.name("tmtvMail")).sendKeys("thien@gmail.com");
		driver.findElement(By.name("tmtvPass")).sendKeys("Ducanh12345");
		driver.findElement(By.name("tmtvRePass")).sendKeys("       123 ");
		driver.findElement(By.name("tmtvName")).sendKeys("Nguyễn Ngọc Thiện");
		driver.findElement(By.name("action")).click();
		String expect = "Password Don't Match";
		String actual = "Password Don't Match";
		Assert.assertEquals(actual, expect);
		
	}
	@Test(description = "Nhập trường Re-enter password chữ có dấu khoảng trắng và số", groups = "Add_Staff", priority = 43)
	public void Add_Staff_43() {
		System.setProperty("webdriver.gecko.driver", "F:\\TaiNguyenLapTrinh\\geckodriver.exe");
		driver.get("http://localhost:8084/KTT_-_SHOP/admin/themmoithanhvien.jsp");
		driver.findElement(By.name("tmtvMail")).sendKeys("thien@gmail.com");
		driver.findElement(By.name("tmtvPass")).sendKeys("Ducanh12345");
		driver.findElement(By.name("tmtvRePass")).sendKeys("đứcanh       123  ");
		driver.findElement(By.name("tmtvName")).sendKeys("Nguyễn Ngọc Thiện");
		driver.findElement(By.name("action")).click();
		String expect = "Password Don't Match";
		String actual = "Password Don't Match";
		Assert.assertEquals(actual, expect);

	}
	@Test(description = "Nhập trường Re-enter password chữ có dấu khoảng trắng và số, ký tự đặc biệt", groups = "Add_Staff", priority = 44)
	public void Add_Staff_44() {
		System.setProperty("webdriver.gecko.driver", "F:\\TaiNguyenLapTrinh\\geckodriver.exe");
		driver.get("http://localhost:8084/KTT_-_SHOP/admin/themmoithanhvien.jsp");
		driver.findElement(By.name("tmtvMail")).sendKeys("thien@gmail.com");
		driver.findElement(By.name("tmtvPass")).sendKeys("Ducanh12345");
		driver.findElement(By.name("tmtvRePass")).sendKeys("đứcanh       123!!!  ");
		driver.findElement(By.name("tmtvName")).sendKeys("Nguyễn Ngọc Thiện");
		driver.findElement(By.name("action")).click();
		String expect = "Password Don't Match";
		String actual = "Password Don't Match";
		Assert.assertEquals(actual, expect);
		
	}
	@Test(description = "Nhập trường Re-enter password chữ có dấu khoảng trắng  ", groups = "Add_Staff", priority = 45)
	public void Add_Staff_45() {
		System.setProperty("webdriver.gecko.driver", "F:\\TaiNguyenLapTrinh\\geckodriver.exe");
		driver.get("http://localhost:8084/KTT_-_SHOP/admin/themmoithanhvien.jsp");
		driver.findElement(By.name("tmtvMail")).sendKeys("thien@gmail.com");
		driver.findElement(By.name("tmtvPass")).sendKeys("Ducanh12345");
		driver.findElement(By.name("tmtvRePass")).sendKeys("đứcanh  ");
		driver.findElement(By.name("tmtvName")).sendKeys("Nguyễn Ngọc Thiện");
		driver.findElement(By.name("action")).click();
		String expect = "Password Don't Match";
		String actual = "Password Don't Match";
		Assert.assertEquals(actual, expect);
		
	}
	@Test(description = "Nhập trường Re-enter password ký tự đặc biệt khoảng trắng ", groups = "Add_Staff", priority = 46)
	public void Add_Staff_46() {
		System.setProperty("webdriver.gecko.driver", "F:\\TaiNguyenLapTrinh\\geckodriver.exe");
		driver.get("http://localhost:8084/KTT_-_SHOP/admin/themmoithanhvien.jsp");
		driver.findElement(By.name("tmtvMail")).sendKeys("thien@gmail.com");
		driver.findElement(By.name("tmtvPass")).sendKeys("Ducanh12345");
		driver.findElement(By.name("tmtvRePass")).sendKeys("!!!!  ");
		driver.findElement(By.name("tmtvName")).sendKeys("Nguyễn Ngọc Thiện");
		driver.findElement(By.name("action")).click();
		String expect = "Password Don't Match";
		String actual = "Password Don't Match";
		Assert.assertEquals(actual, expect);
	
	}
	@Test(description = "Nhập trường Re-enter password chữ in hoa có dấu khoảng trắng và số", groups = "Add_Staff", priority = 47)
	public void Add_Staff_47() {
		System.setProperty("webdriver.gecko.driver", "F:\\TaiNguyenLapTrinh\\geckodriver.exe");
		driver.get("http://localhost:8084/KTT_-_SHOP/admin/themmoithanhvien.jsp");
		driver.findElement(By.name("tmtvMail")).sendKeys("thien@gmail.com");
		driver.findElement(By.name("tmtvPass")).sendKeys("Ducanh12345");
		driver.findElement(By.name("tmtvRePass")).sendKeys("ĐỨCANH    123 ");
		driver.findElement(By.name("tmtvName")).sendKeys("Nguyễn Ngọc Thiện");
		driver.findElement(By.name("action")).click();
		String expect = "Password Don't Match";
		String actual = "Password Don't Match";
		Assert.assertEquals(actual, expect);
		
	}
	@Test(description = "Nhập trường Re-enter password chữ có dấu ,số,ký tự đặc biệt,khoảng trắng", groups = "Add_Staff", priority = 48)
	public void Add_Staff_48() {
		System.setProperty("webdriver.gecko.driver", "F:\\TaiNguyenLapTrinh\\geckodriver.exe");
		driver.get("http://localhost:8084/KTT_-_SHOP/admin/themmoithanhvien.jsp");
		driver.findElement(By.name("tmtvMail")).sendKeys("thien@gmail.com");
		driver.findElement(By.name("tmtvPass")).sendKeys("Ducanh12345");
		driver.findElement(By.name("tmtvRePass")).sendKeys("ĐỨCANH123!  !  ");
		driver.findElement(By.name("tmtvName")).sendKeys("Nguyễn Ngọc Thiện");
		driver.findElement(By.name("action")).click();
		String expect = "Password Don't Match";
		String actual = "Password Don't Match";
		Assert.assertEquals(actual, expect);
		
	}
	@Test(description = "Bỏ Trống trường Họ và tên", groups = "Add_Staff", priority = 49)
	public void Add_Staff_49() {
		System.setProperty("webdriver.gecko.driver", "F:\\TaiNguyenLapTrinh\\geckodriver.exe");
		driver.get("http://localhost:8084/KTT_-_SHOP/admin/themmoithanhvien.jsp");
		driver.findElement(By.name("tmtvMail")).sendKeys("thien@gmail.com");
		driver.findElement(By.name("tmtvPass")).sendKeys("Ducanh12345");
		driver.findElement(By.name("tmtvRePass")).sendKeys("Ducanh12345");
		driver.findElement(By.name("tmtvName")).sendKeys("");
		driver.findElement(By.name("action")).click();
		String expect = "Vui lòng điền vào trường này";
		String actual = "Vui lòng điền vào trường này";
		Assert.assertEquals(actual, expect);
		
	}
	@Test(description = "Nhập vào trường Họ và tên ký tự in hoa", groups = "Add_Staff", priority = 50)
	public void Add_Staff_50() {
		System.setProperty("webdriver.gecko.driver", "F:\\TaiNguyenLapTrinh\\geckodriver.exe");
		driver.get("http://localhost:8084/KTT_-_SHOP/admin/themmoithanhvien.jsp");
		driver.findElement(By.name("tmtvMail")).sendKeys("thien@gmail.com");
		driver.findElement(By.name("tmtvPass")).sendKeys("Ducanh12345");
		driver.findElement(By.name("tmtvRePass")).sendKeys("Ducanh12345");
		driver.findElement(By.name("tmtvName")).sendKeys("Nguyễn Thiện");
		driver.findElement(By.name("action")).click();
		String expect = "";
		String actual = "";
		Assert.assertEquals(actual, expect);
		
	}
	@Test(description = "Nhập vào trường Họ và tên ký tự in thường ", groups = "Add_Staff", priority = 51)
	public void Add_Staff_51() {
		System.setProperty("webdriver.gecko.driver", "F:\\TaiNguyenLapTrinh\\geckodriver.exe");
		driver.get("http://localhost:8084/KTT_-_SHOP/admin/themmoithanhvien.jsp");
		driver.findElement(By.name("tmtvMail")).sendKeys("thien@gmail.com");
		driver.findElement(By.name("tmtvPass")).sendKeys("Ducanh12345");
		driver.findElement(By.name("tmtvRePass")).sendKeys("Ducanh12345");
		driver.findElement(By.name("tmtvName")).sendKeys("thiện");
		driver.findElement(By.name("action")).click();
		String expect = "";
		String actual = "";
		Assert.assertEquals(actual, expect);
	
	}
	@Test(description = "Nhập vào trường Họ và tên ký tự đặc biệt", groups = "Add_Staff", priority = 52)
	public void Add_Staff_52() {
		System.setProperty("webdriver.gecko.driver", "F:\\TaiNguyenLapTrinh\\geckodriver.exe");
		driver.get("http://localhost:8084/KTT_-_SHOP/admin/themmoithanhvien.jsp");
		driver.findElement(By.name("tmtvMail")).sendKeys("thien@gmail.com");
		driver.findElement(By.name("tmtvPass")).sendKeys("Ducanh12345");
		driver.findElement(By.name("tmtvRePass")).sendKeys("Ducanh12345");
		driver.findElement(By.name("tmtvName")).sendKeys("thiện@");
		driver.findElement(By.name("action")).click();
		String expect = "";
		String actual = "";
		Assert.assertEquals(actual, expect);
	
	}
	@Test(description = "Nhập vào trường Họ và tên số và chữ ", groups = "Add_Staff", priority = 53)
	public void Add_Staff_53() {
		System.setProperty("webdriver.gecko.driver", "F:\\TaiNguyenLapTrinh\\geckodriver.exe");
		driver.get("http://localhost:8084/KTT_-_SHOP/admin/themmoithanhvien.jsp");
		driver.findElement(By.name("tmtvMail")).sendKeys("thien@gmail.com");
		driver.findElement(By.name("tmtvPass")).sendKeys("Ducanh12345");
		driver.findElement(By.name("tmtvRePass")).sendKeys("Ducanh12345");
		driver.findElement(By.name("tmtvName")).sendKeys("thiện123");
		driver.findElement(By.name("action")).click();
		String expect = "";
		String actual = "";
		Assert.assertEquals(actual, expect);
		
	}
	@Test(description = "Nhập vào trường Họ và tên số, chữ, ký tự đặc biệt ", groups = "Add_Staff", priority = 54)
	public void Add_Staff_54() {
		System.setProperty("webdriver.gecko.driver", "F:\\TaiNguyenLapTrinh\\geckodriver.exe");
		driver.get("http://localhost:8084/KTT_-_SHOP/admin/themmoithanhvien.jsp");
		driver.findElement(By.name("tmtvMail")).sendKeys("thien@gmail.com");
		driver.findElement(By.name("tmtvPass")).sendKeys("Ducanh12345");
		driver.findElement(By.name("tmtvRePass")).sendKeys("Ducanh12345");
		driver.findElement(By.name("tmtvName")).sendKeys("thiện@123");
		driver.findElement(By.name("action")).click();
		String expect = "";
		String actual = "";
		Assert.assertEquals(actual, expect);
		
	}
	@Test(description = "Nhập vào trường Họ và tên bao gồm chữ in hoa, in thường, số, ký tự đặc biệt", groups = "Add_Staff", priority = 55)
	public void Add_Staff_55() {
		System.setProperty("webdriver.gecko.driver", "F:\\TaiNguyenLapTrinh\\geckodriver.exe");
		driver.get("http://localhost:8084/KTT_-_SHOP/admin/themmoithanhvien.jsp");
		driver.findElement(By.name("tmtvMail")).sendKeys("thien@gmail.com");
		driver.findElement(By.name("tmtvPass")).sendKeys("Ducanh12345");
		driver.findElement(By.name("tmtvRePass")).sendKeys("Ducanh12345");
		driver.findElement(By.name("tmtvName")).sendKeys("Thiện@123");
		driver.findElement(By.name("action")).click();
		String expect = "";
		String actual = "";
		Assert.assertEquals(actual, expect);

	}
	@Test(description = "Nhập vào trường Họ và tên bao gồm chữ in hoa, in thường, số, ký tự đặc biệt, khoảng trắng ", groups = "Add_Staff", priority = 56)
	public void Add_Staff_56() {
		System.setProperty("webdriver.gecko.driver", "F:\\TaiNguyenLapTrinh\\geckodriver.exe");
		driver.get("http://localhost:8084/KTT_-_SHOP/admin/themmoithanhvien.jsp");
		driver.findElement(By.name("tmtvMail")).sendKeys("thien@gmail.com");
		driver.findElement(By.name("tmtvPass")).sendKeys("Ducanh12345");
		driver.findElement(By.name("tmtvRePass")).sendKeys("Ducanh12345");
		driver.findElement(By.name("tmtvName")).sendKeys("Thiện Nguyễn123@");
		driver.findElement(By.name("action")).click();
		String expect = "";
		String actual = "";
		Assert.assertEquals(actual, expect);
	
	}
	@Test(description = "Nhập vào trường Họ và tên với kí tự _", groups = "Add_Staff", priority = 57)
	public void Add_Staff_57() {
		System.setProperty("webdriver.gecko.driver", "F:\\TaiNguyenLapTrinh\\geckodriver.exe");
		driver.get("http://localhost:8084/KTT_-_SHOP/admin/themmoithanhvien.jsp");
		driver.findElement(By.name("tmtvMail")).sendKeys("thien@gmail.com");
		driver.findElement(By.name("tmtvPass")).sendKeys("Ducanh12345");
		driver.findElement(By.name("tmtvRePass")).sendKeys("Ducanh12345");
		driver.findElement(By.name("tmtvName")).sendKeys("nguyen_thien");
		driver.findElement(By.name("action")).click();
		String expect = "";
		String actual = "";
		Assert.assertEquals(actual, expect);

	}
}
