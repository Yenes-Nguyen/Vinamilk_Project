package webdriver;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class Check_URL_Corpweb {
	WebDriver driver;
	Actions action;
	WebDriverWait expliciWait;
	JavascriptExecutor jsExecutor;
	String projectPath = System.getProperty("user.dir");
	
 
	@BeforeClass
	public void beforeClass() {
		//driver = new FirefoxDriver();
		System.setProperty("webdriver.chrome.driver", projectPath + "\\browserDriver\\chromedriver.exe");
		driver = new ChromeDriver();
		
		action = new Actions(driver);
		
		jsExecutor = (JavascriptExecutor) driver;
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	
// TOP MENU		
		public void TC_topmenu() throws InterruptedException {
			driver.get("https://www.vinamilk.com.vn/"); 
			    
			  // Mua hàng trực tuyến
			    driver.findElement(By.xpath("//div[@class='container']//a[contains(text(),'Mua hàng trực tuyến')]")).click();
			    sleepInSecond(2);
				Assert.assertEquals(driver.getCurrentUrl(),"https://giacmosuaviet.com.vn/");
				
				driver.navigate().back();
				Assert.assertEquals(driver.getCurrentUrl(),"https://www.vinamilk.com.vn/");

			//phòng khám an khang
//				String parentID = driver.getWindowHandle();
//				
//				driver.findElement(By.xpath("//div[@class='container']//a[contains(text(),'Phòng Khám An Khang')]")).click();
//				switchToWindowByTitle("");
//			    sleepInSecond(3);
//			    	//verify
//			    Assert.assertEquals(driver.getTitle(), "");
//				Assert.assertEquals(driver.getCurrentUrl(), "");
				
				
			// Khách hàng
				driver.findElement(By.xpath("//nav[@class='corp-header__top-menu']//a[contains(text(),'Khách hàng')]")).click();
				sleepInSecond(2);

				Assert.assertEquals(driver.getTitle(),"Khách hàng Vinamilk | Vinamilk Việt Nam - Vinamilk");
				Assert.assertEquals(driver.getCurrentUrl(),"https://www.vinamilk.com.vn/vi/goc-khach-hang");
				
				driver.navigate().back();
				
			// Cổ đông
				driver.findElement(By.xpath("//nav[@class='corp-header__top-menu']//a[contains(text(),'Cổ đông')]")).click();
				sleepInSecond(2);

				Assert.assertEquals(driver.getTitle(),"Vinamilk");
				Assert.assertEquals(driver.getCurrentUrl(),"https://www.vinamilk.com.vn/vi/quan-he-co-dong");
				
				driver.navigate().back();
				
			// Tuyển dụng
				driver.findElement(By.xpath("//nav[@class='corp-header__top-menu']//a[contains(text(),'Tuyển dụng')]")).click();
				sleepInSecond(2);

				Assert.assertEquals(driver.getTitle(),"Vì sao chọn Vinamilk? | Vinamilk Việt Nam - Vinamilk");
				Assert.assertEquals(driver.getCurrentUrl(),"https://www.vinamilk.com.vn/vi/tuyen-dung/vi-sao-chon-vinamilk");
				
				driver.navigate().back();
				
			// Phân phối
				driver.findElement(By.xpath("//nav[@class='corp-header__top-menu']//a[contains(text(),'Phân phối')]")).click();
				sleepInSecond(2);

				Assert.assertEquals(driver.getTitle(),"Thị trường nội địa Vinamilk | Vinamilk Việt Nam - Vinamilk");
				Assert.assertEquals(driver.getCurrentUrl(),"https://www.vinamilk.com.vn/vi/phan-phoi/thi-truong-noi-dia");
				
				driver.navigate().back();
				
			// Đối tác
				driver.findElement(By.xpath("//nav[@class='corp-header__top-menu']//a[contains(text(),'Đối tác')]")).click();
				sleepInSecond(2);

				Assert.assertEquals(driver.getTitle(),"Nhà cung cấp của Vinamilk | Vinamilk Việt Nam - Vinamilk");
				Assert.assertEquals(driver.getCurrentUrl(),"https://www.vinamilk.com.vn/vi/nha-cung-cap");
				
				driver.navigate().back();
				
			// Language
				driver.findElement(By.xpath("//nav[@class='corp-header__top-menu']//li[@class='corp-header__top-menu__lang']//a[contains(text(),'中文')]")).click();
				sleepInSecond(2);

				Assert.assertEquals(driver.getTitle(),"主页 - Vinamilk");
				Assert.assertEquals(driver.getCurrentUrl(),"https://www.vinamilk.com.vn/global/cn/");
				
				driver.navigate().back();
				
				driver.findElement(By.xpath("//nav[@class='corp-header__top-menu']//li[@class='corp-header__top-menu__lang']//a[contains(text(),'EN')]")).click();
				sleepInSecond(2);

				Assert.assertEquals(driver.getTitle(),"Home - Vinamilk");
				Assert.assertEquals(driver.getCurrentUrl(),"https://www.vinamilk.com.vn/en");
				
				
				driver.findElement(By.xpath("//nav[@class='corp-header__top-menu']//li[@class='corp-header__top-menu__lang']//a[contains(text(),'VN')]")).click();
				
				Assert.assertEquals(driver.getCurrentUrl(), "https://www.vinamilk.com.vn/vi");
							
				
		}
	
	
// MAIN MENU
	public void TC_01_mainmenu_Homepage() throws InterruptedException {
		driver.get("https://www.vinamilk.com.vn/"); 
		    //*****Departure day selection started.
		    //Click Trang chủ
		    driver.findElement(By.xpath("//nav[@class='corp-header__main-menu']//a[contains(text(),'Trang chủ')]")).click();
		    Assert.assertEquals(driver.getCurrentUrl(),"https://www.vinamilk.com.vn/vi");
	}
	
@Test
	public void TC_02_mainmenu_Câu_chuyện_Vinamilk() throws InterruptedException {
		driver.get("https://www.vinamilk.com.vn/"); 
		    
		    // Câu chuyện Vinamilk
		    driver.findElement(By.xpath("//div[@class='corp-header__menu']//a[contains(text(),'Câu chuyện Vinamilk')]")).click();
		    sleepInSecond(2);
		    Assert.assertEquals(driver.getTitle(),"Câu chuyện Vinamilk | Vinamilk Việt Nam - Vinamilk");
		    
		    // Sub-menu 
		    action.moveToElement(driver.findElement(By.xpath("//div[@class='hd']//a[@class='active']"))).perform();
		    driver.findElement(By.xpath("//div[@class='under-hd']//a[contains(text(),'Về công ty')]")).click();
		    sleepInSecond(2);
		    Assert.assertEquals(driver.getCurrentUrl(),"https://www.vinamilk.com.vn/vi/ve-cong-ty");
		    
		    action.moveToElement(driver.findElement(By.xpath("//div[@class='hd']//a[@class='active']"))).perform();
		    driver.findElement(By.xpath("//div[@class='under-hd']//a[contains(text(),'Lịch sử phát triển')]")).click();
		    sleepInSecond(2);
		    Assert.assertEquals(driver.getCurrentUrl(),"https://www.vinamilk.com.vn/vi/lich-su-phat-trien");
		    
		    action.moveToElement(driver.findElement(By.xpath("//div[@class='hd']//a[@class='active']"))).perform();
		    driver.findElement(By.xpath("//div[@class='under-hd']//a[contains(text(),'Chiến lược phát triển')]")).click();
		    sleepInSecond(2);
		    Assert.assertEquals(driver.getCurrentUrl(),"https://www.vinamilk.com.vn/vi/chien-luoc-phat-trien");
		    
		    action.moveToElement(driver.findElement(By.xpath("//div[@class='hd']//a[@class='active']"))).perform();
		    driver.findElement(By.xpath("//div[@class='under-hd']//a[contains(text(),'Hệ thống quản trị')]")).click();
		    sleepInSecond(2);
		    Assert.assertEquals(driver.getCurrentUrl(),"https://www.vinamilk.com.vn/vi/he-thong-quan-tri");
		    
		    action.moveToElement(driver.findElement(By.xpath("//div[@class='hd']//a[@class='active']"))).perform();
		    driver.findElement(By.xpath("//div[@class='under-hd']//a[contains(text(),'Nhân sự chủ chốt')]")).click();
		    sleepInSecond(2);
		    Assert.assertEquals(driver.getCurrentUrl(),"https://www.vinamilk.com.vn/vi/nhan-su-chu-chot");
		    
		    action.moveToElement(driver.findElement(By.xpath("//div[@class='hd']//a[@class='active']"))).perform();
		    driver.findElement(By.xpath("//div[@class='under-hd']//a[contains(text(),'Đơn vị thành viên')]")).click();
		    sleepInSecond(2);
		    Assert.assertEquals(driver.getCurrentUrl(),"https://www.vinamilk.com.vn/vi/don-vi-thanh-vien");
		    
		    action.moveToElement(driver.findElement(By.xpath("//div[@class='hd']//a[@class='active']"))).perform();
		    driver.findElement(By.xpath("//div[@class='under-hd']//a[contains(text(),'Thành tích nổi bật')]")).click();
		    sleepInSecond(2);
		    Assert.assertEquals(driver.getCurrentUrl(),"https://www.vinamilk.com.vn/vi/thanh-tich-noi-bat");
		    
		}
	
@Test
	public void TC_03_mainmenu_Phát_triển_bền_vững() throws InterruptedException {
		driver.get("https://www.vinamilk.com.vn/"); 
		    
		    // Phát triển bền vững
		    driver.findElement(By.xpath("//div[@class='corp-header__menu']//a[contains(text(),'Phát triển bền vững')]")).click();
		    sleepInSecond(2);
		    Assert.assertEquals(driver.getTitle(),"Phát triển bền vững | Vinamilk Việt Nam - Vinamilk");
		    
		    // Sub-menu 
		    action.moveToElement(driver.findElement(By.xpath("//div[@class='hd']//a[@class='active']"))).perform();
		    driver.findElement(By.xpath("//div[@class='under-hd']//a[contains(text(),'Vinamilk hướng tới sự bền vững')]")).click();
		    sleepInSecond(2);
		    Assert.assertEquals(driver.getCurrentUrl(),"https://www.vinamilk.com.vn/vi/vinamilk-huong-toi-su-ben-vung");
		    
		    action.moveToElement(driver.findElement(By.xpath("//div[@class='hd']//a[@class='active']"))).perform();
		    driver.findElement(By.xpath("//div[@class='under-hd']//a[contains(text(),'Kế hoạch hành động')]")).click();
		    sleepInSecond(2);
		    Assert.assertEquals(driver.getCurrentUrl(),"https://www.vinamilk.com.vn/vi/ke-hoach-hanh-dong");
		    
		    action.moveToElement(driver.findElement(By.xpath("//div[@class='hd']//a[@class='active']"))).perform();
		    driver.findElement(By.xpath("//div[@class='under-hd']//a[contains(text(),'Dinh dưỡng con người')]")).click();
		    sleepInSecond(2);
		    Assert.assertEquals(driver.getCurrentUrl(),"https://www.vinamilk.com.vn/vi/phat-trien-ben-vung/#ddcn");
		    
		    action.moveToElement(driver.findElement(By.xpath("//div[@class='hd']//a[@class='active']"))).perform();
		    driver.findElement(By.xpath("//div[@class='under-hd']//a[contains(text(),'Môi trường và năng lượng')]")).click();
		    sleepInSecond(2);
		    Assert.assertEquals(driver.getCurrentUrl(),"https://www.vinamilk.com.vn/vi/phat-trien-ben-vung/#mtnl");
		    
		    action.moveToElement(driver.findElement(By.xpath("//div[@class='hd']//a[@class='active']"))).perform();
		    driver.findElement(By.xpath("//div[@class='under-hd']//a[contains(text(),'Phát triển kinh tế địa phương')]")).click();
		    sleepInSecond(2);
		    Assert.assertEquals(driver.getCurrentUrl(),"https://www.vinamilk.com.vn/vi/phat-trien-ben-vung/#ptktdp");
		    
		    action.moveToElement(driver.findElement(By.xpath("//div[@class='hd']//a[@class='active']"))).perform();
		    driver.findElement(By.xpath("//div[@class='under-hd']//a[contains(text(),'Người lao động')]")).click();
		    sleepInSecond(2);
		    Assert.assertEquals(driver.getCurrentUrl(),"https://www.vinamilk.com.vn/vi/phat-trien-ben-vung/#nld");
		    
		    action.moveToElement(driver.findElement(By.xpath("//div[@class='hd']//a[@class='active']"))).perform();
		    driver.findElement(By.xpath("//div[@class='under-hd']//a[contains(text(),'Hỗ trợ & phát triển cộng đồng')]")).click();
		    sleepInSecond(2);
		    Assert.assertEquals(driver.getCurrentUrl(),"https://www.vinamilk.com.vn/vi/phat-trien-ben-vung/#htvptcd");
		    
		    action.moveToElement(driver.findElement(By.xpath("//div[@class='hd']//a[@class='active']"))).perform();
		    driver.findElement(By.xpath("//div[@class='under-hd']//a[contains(text(),'Tin tức phát triển bền vững')]")).click();
		    sleepInSecond(2);
		    Assert.assertEquals(driver.getCurrentUrl(),"https://www.vinamilk.com.vn/vi/tin-tuc-phat-trien-ben-vung");
		    
		}

@Test
	public void TC_04_mainmenu_Cải_tiến_đổi_mới() throws InterruptedException {
		driver.get("https://www.vinamilk.com.vn/"); 
		    
		    // Cải tiến & đổi mới
		    driver.findElement(By.xpath("//div[@class='corp-header__menu']//a[contains(text(),'Cải tiến & Đổi mới')]")).click();
		    sleepInSecond(2);
		    Assert.assertEquals(driver.getTitle(),"Phát triển sản phẩm Vinamilk | Vinamilk Việt Nam - Vinamilk");
		    
		    // Sub-menu 
		    action.moveToElement(driver.findElement(By.xpath("//div[@class='hd']//a[@class='active']"))).perform();
		    driver.findElement(By.xpath("//div[@class='under-hd']//a[contains(text(),'Công nghệ sản xuất mới')]")).click();
		    sleepInSecond(2);
		    Assert.assertEquals(driver.getCurrentUrl(),"https://www.vinamilk.com.vn/vi/cai-tien-doi-moi/cong-nghe-san-xuat-moi");
		    
		    action.moveToElement(driver.findElement(By.xpath("//div[@class='hd']//a[@class='active']"))).perform();
		    driver.findElement(By.xpath("//div[@class='under-hd']//a[contains(text(),'Nghiên cứu & cải tiến sản phẩm')]")).click();
		    sleepInSecond(2);
		    Assert.assertEquals(driver.getCurrentUrl(),"https://www.vinamilk.com.vn/vi/cai-tien-doi-moi/nghien-cuu-and-cai-tien-san-pham");
		    
		    action.moveToElement(driver.findElement(By.xpath("//div[@class='hd']//a[@class='active']"))).perform();
		    driver.findElement(By.xpath("//div[@class='under-hd']//a[contains(text(),'Chứng nhận về chất lượng và các hệ thống quản lý khác')]")).click();
		    sleepInSecond(2);
		    Assert.assertEquals(driver.getTitle(),"Chứng nhận chất lượng sản phẩm Vinamilk | Vinamilk Việt Nam - Vinamilk");
		    
		    
		}
	
@Test
	public void TC_05_mainmenu_Vùng_nguyên_liệu() throws InterruptedException {
		driver.get("https://www.vinamilk.com.vn/"); 
		    
		    // Vùng nguyên liệu
		    driver.findElement(By.xpath("//div[@class='corp-header__menu']//a[contains(text(),'Vùng nguyên liệu')]")).click();
		    sleepInSecond(2);
		    Assert.assertEquals(driver.getCurrentUrl(),"https://www.vinamilk.com.vn/vi/vung-nguyen-lieu/gioi-thieu-khoi-phat-trien-vung-nguyen-lieu");
		    
		     //Sub-menu 
		    action.moveToElement(driver.findElement(By.xpath("//div[@class='hd']//a[@class='active']"))).perform();
		    driver.findElement(By.xpath("//div[@class='under-hd']//li[@class='hv-sub active']//a")).click();
		    sleepInSecond(2);
		    Assert.assertEquals(driver.getCurrentUrl(),"https://www.vinamilk.com.vn/vi/vung-nguyen-lieu/gioi-thieu-khoi-phat-trien-vung-nguyen-lieu");
		    
		    action.moveToElement(driver.findElement(By.xpath("//div[@class='hd']//a[@class='active']"))).perform();
		    driver.findElement(By.xpath("//div[@class='under-hd']//a[contains(@href,'cong-ty-tnhh-mtv')]")).click();
		    sleepInSecond(2);
		    Assert.assertEquals(driver.getCurrentUrl(),"https://www.vinamilk.com.vn/vi/vung-nguyen-lieu/cong-ty-tnhh-mtv-bo-sua-viet-nam");
		    
		    action.moveToElement(driver.findElement(By.xpath("//div[@class='hd']//a[@class='active']"))).perform();
		    driver.findElement(By.xpath("//div[@class='under-hd']//a[contains(@href,'bo-sua-thong-nhat-thanh-hoa')]")).click();
		    sleepInSecond(2);
		    Assert.assertEquals(driver.getCurrentUrl(),"https://www.vinamilk.com.vn/vi/vung-nguyen-lieu/cong-ty-tnhh-bo-sua-thong-nhat-thanh-hoa");
		    
		    action.moveToElement(driver.findElement(By.xpath("//div[@class='hd']//a[@class='active']"))).perform();
		    driver.findElement(By.xpath("//div[@class='under-hd']//a[contains(text(),'Tin tức & hoạt động')]")).click();
		    sleepInSecond(2);
		    Assert.assertEquals(driver.getCurrentUrl(),"https://www.vinamilk.com.vn/vi/vung-nguyen-lieu/tin-tuc-hoat-dong");
		    
		    action.moveToElement(driver.findElement(By.xpath("//div[@class='hd']//a[@class='active']"))).perform();
		    driver.findElement(By.xpath("//div[@class='under-hd']//li[@class='hv-sub ']//a[contains(text(),'Thông tin liên lạc')]")).click();
		    sleepInSecond(2);
		    Assert.assertEquals(driver.getCurrentUrl(),"https://www.vinamilk.com.vn/vi/vung-nguyen-lieu/thong-tin-lien-lac");
		}
	
@Test
	public void TC_06_mainmenu_Truyền_thông() throws InterruptedException {
		driver.get("https://www.vinamilk.com.vn/"); 
		    
		    //Truyền thông
		    driver.findElement(By.xpath("//div[@class='corp-header__menu']//a[contains(text(),'Truyền thông')]")).click();
		    sleepInSecond(2);
		    Assert.assertEquals(driver.getTitle(),"Thông cáo báo chí Vinamilk | Vinamilk Việt Nam - Vinamilk");
		    
		    // Sub-menu 
		    action.moveToElement(driver.findElement(By.xpath("//div[@class='hd']//a[contains(text(),'Truyền thông')]"))).perform();
		    driver.findElement(By.xpath("//div[@class='under-hd']//a[contains(text(),'Thông cáo báo chí')]")).click();
		    sleepInSecond(2);
		    Assert.assertEquals(driver.getCurrentUrl(),"https://www.vinamilk.com.vn/vi/thong-cao-bao-chi");
		    
		    action.moveToElement(driver.findElement(By.xpath("//div[@class='hd']//a[contains(text(),'Truyền thông')]"))).perform();
		    driver.findElement(By.xpath("//div[@class='under-hd']//a[contains(text(),'Tin tức & Sự kiện')]")).click();
		    sleepInSecond(2);
		    Assert.assertEquals(driver.getCurrentUrl(),"https://www.vinamilk.com.vn/vi/tin-tuc-su-kien");
		    
		    action.moveToElement(driver.findElement(By.xpath("//div[@class='hd']//a[contains(text(),'Truyền thông')]"))).perform();
		    driver.findElement(By.xpath("//div[@class='under-hd']//a[contains(text(),'Thư viện')]")).click();
		    sleepInSecond(2);
		    Assert.assertEquals(driver.getTitle(),"Thư viện quảng cáo Vinamilk | Vinamilk Việt Nam - Vinamilk");
		    
		    action.moveToElement(driver.findElement(By.xpath("//div[@class='hd']//a[contains(text(),'Truyền thông')]"))).perform();
		    driver.findElement(By.xpath("//div[@class='under-hd']//li[@class='it-7']//a[contains(text(),'Thông tin liên lạc')]")).click();
		    sleepInSecond(2);
		    Assert.assertEquals(driver.getCurrentUrl(),"https://www.vinamilk.com.vn/vi/thong-tin-lien-lac");
		}

@Test
	public void TC_07_mainmenu_Search() throws InterruptedException {
		driver.get("https://www.vinamilk.com.vn/"); 
		    
		    //CASE: keyword invalid
		    driver.findElement(By.xpath("//a[@class='js-search-toggle-btn']")).click();
		    driver.findElement(By.xpath("//input[@class='corp-header__search-form__input']")).sendKeys("sgdfsdgah");
		    driver.findElement(By.xpath("//button[@class='corp-header__search-form__btn']")).click();
		    sleepInSecond(2);
			Assert.assertEquals(driver.findElement(By.xpath("//div[@class='gs-snippet']")).getText(),"Không có kết quả nào");
		    
			//CASE: keyword valid
		    driver.findElement(By.xpath("//input[@class='text q-search-pc2']")).clear();
		    driver.findElement(By.xpath("//input[@class='text q-search-pc2']")).sendKeys("vinamilk");
		    driver.findElement(By.xpath("//input[@class='icon btn-search-pc2']")).click();
		    sleepInSecond(2);
		    Assert.assertEquals(driver.getCurrentUrl(), "https://www.vinamilk.com.vn/vi/search?q=vinamilk");
	}
	
@Test
	public void TC_08_mainmenu_Sản_Phẩm() {
		driver.get("https://www.vinamilk.com.vn/");
		
		driver.findElement(By.xpath("//nav[@class='corp-header__main-menu']//a[text()='Sản Phẩm']")).click();
		sleepInSecond(2);
		Assert.assertEquals(driver.getCurrentUrl(), "https://www.vinamilk.com.vn/vi/nhan-hieu");
		Assert.assertEquals(driver.getTitle(), "Nhãn hiệu | Vinamilk Việt Nam - Vinamilk");
		driver.navigate().back();
		
	// Organic
		action.moveToElement(driver.findElement(By.xpath("//nav[@class='corp-header__main-menu']//a[text()='Sản Phẩm']"))).perform();
		driver.findElement(By.xpath("//nav[@class='corp-header__main-menu']//a[contains(text(),'Dinh dưỡng Organic')]")).click();
		Assert.assertEquals(driver.getCurrentUrl(), "https://www.vinamilk.com.vn/dinh-duong-organic/vi/");
		driver.navigate().back();
		
	// Sữa tươi
		action.moveToElement(driver.findElement(By.xpath("//nav[@class='corp-header__main-menu']//a[text()='Sản Phẩm']"))).perform();
		driver.findElement(By.xpath("//nav[@class='corp-header__main-menu']//a[contains(text(),'Sữa Nước Vinamilk')]")).click();
		Assert.assertEquals(driver.getCurrentUrl(), "https://www.vinamilk.com.vn/sua-tuoi-vinamilk/vi/");
		driver.navigate().back();
	
	// Sản phẩm cho giới trẻ
		action.moveToElement(driver.findElement(By.xpath("//nav[@class='corp-header__main-menu']//a[text()='Sản Phẩm']"))).perform();
		driver.findElement(By.xpath("//nav[@class='corp-header__main-menu']//a[contains(text(),'Sản phẩm cho giới trẻ')]")).click();
		Assert.assertEquals(driver.getCurrentUrl(),"https://www.vinamilk.com.vn/san-pham-cho-gioi-tre/");
		driver.navigate().back();
	
	// Sữa chua
		action.moveToElement(driver.findElement(By.xpath("//nav[@class='corp-header__main-menu']//a[text()='Sản Phẩm']"))).perform();
		driver.findElement(By.xpath("//nav[@class='corp-header__main-menu']//a[contains(text(),'Sữa Chua Vinamilk')]")).click();
		Assert.assertEquals(driver.getCurrentUrl(),"https://www.vinamilk.com.vn/sua-chua-vinamilk/vi/");
		driver.navigate().back();
		
	// SBTE
		action.moveToElement(driver.findElement(By.xpath("//nav[@class='corp-header__main-menu']//a[text()='Sản Phẩm']"))).perform();
		driver.findElement(By.xpath("//nav[@class='corp-header__main-menu']//a[contains(text(),'Sữa Bột Vinamilk')]")).click();
		Assert.assertEquals(driver.getCurrentUrl(),"https://www.vinamilk.com.vn/sua-bot-vinamilk/vi/");
		driver.navigate().back();
		
	// Bột ăn dặm	
		action.moveToElement(driver.findElement(By.xpath("//nav[@class='corp-header__main-menu']//a[text()='Sản Phẩm']"))).perform();
		driver.findElement(By.xpath("//nav[@class='corp-header__main-menu']//a[contains(text(),'Bột ăn dặm')]")).click();
		Assert.assertEquals(driver.getCurrentUrl(),"https://www.vinamilk.com.vn/the-gioi-an-dam/");
		driver.navigate().back();
		
	// Sữa bột người lớn
		action.moveToElement(driver.findElement(By.xpath("//nav[@class='corp-header__main-menu']//a[text()='Sản Phẩm']"))).perform();
		driver.findElement(By.xpath("//nav[@class='corp-header__main-menu']//a[contains(text(),'Sản phẩm dinh dưỡng dành cho người lớn')]")).click();
		Assert.assertEquals(driver.getCurrentUrl(),"https://www.vinamilk.com.vn/sua-bot-nguoi-lon-vinamilk/vi/");
		driver.navigate().back();
		
	// Sữa đặc
		action.moveToElement(driver.findElement(By.xpath("//nav[@class='corp-header__main-menu']//a[text()='Sản Phẩm']"))).perform();
		driver.findElement(By.xpath("//nav[@class='corp-header__main-menu']//a[contains(text(),'Sữa Đặc')]")).click();
		Assert.assertEquals(driver.getCurrentUrl(),"https://vinamilk.com.vn/sua-dac-vinamilk/vn/");
		driver.navigate().back();
		
	// Nước giải khát
		action.moveToElement(driver.findElement(By.xpath("//nav[@class='corp-header__main-menu']//a[text()='Sản Phẩm']"))).perform();
		driver.findElement(By.xpath("//nav[@class='corp-header__main-menu']//a[contains(text(),'Nước Giải Khát')]")).click();
		Assert.assertEquals(driver.getCurrentUrl(),"https://www.vinamilk.com.vn/vi/nhan-hieu/nuoc-giai-khat");
		driver.navigate().back();
		
			// sub sub-menu 
			action.moveToElement(driver.findElement(By.xpath("//nav[@class='corp-header__main-menu']//a[text()='Sản Phẩm']"))).perform();
			action.moveToElement(driver.findElement(By.xpath("//nav[@class='corp-header__main-menu']//a[contains(text(),'Nước Giải Khát')]"))).perform();
			driver.findElement(By.xpath("//nav[@class='corp-header__main-menu']//a[@title='Nước Trái Cây 100% Vfresh']")).click();
			Assert.assertEquals(driver.getCurrentUrl(),"https://www.vinamilk.com.vn/vi/san-pham/nuoc-giai-khat/nuoc-trai-cay-100-vfresh");
			driver.navigate().back();
			
			action.moveToElement(driver.findElement(By.xpath("//nav[@class='corp-header__main-menu']//a[text()='Sản Phẩm']"))).perform();
			action.moveToElement(driver.findElement(By.xpath("//nav[@class='corp-header__main-menu']//a[contains(text(),'Nước Giải Khát')]"))).perform();
			driver.findElement(By.xpath("//nav[@class='corp-header__main-menu']//a[@title='Nước Trái Cây Ép Vfresh']")).click();
			Assert.assertEquals(driver.getCurrentUrl(),"https://www.vinamilk.com.vn/vi/san-pham/nuoc-giai-khat/nuoc-trai-cay-ep-vfresh");
			driver.navigate().back();
			
			action.moveToElement(driver.findElement(By.xpath("//nav[@class='corp-header__main-menu']//a[text()='Sản Phẩm']"))).perform();
			action.moveToElement(driver.findElement(By.xpath("//nav[@class='corp-header__main-menu']//a[contains(text(),'Nước Giải Khát')]"))).perform();
			driver.findElement(By.xpath("//nav[@class='corp-header__main-menu']//a[@title='Nước Cam Ép Vfresh 180ml']")).click();
			Assert.assertEquals(driver.getCurrentUrl(),"https://www.vinamilk.com.vn/vi/san-pham/nuoc-giai-khat/nuoc-cam-ep-vfresh-180ml");
			driver.navigate().back();
			
			action.moveToElement(driver.findElement(By.xpath("//nav[@class='corp-header__main-menu']//a[text()='Sản Phẩm']"))).perform();
			action.moveToElement(driver.findElement(By.xpath("//nav[@class='corp-header__main-menu']//a[contains(text(),'Nước Giải Khát')]"))).perform();
			driver.findElement(By.xpath("//nav[@class='corp-header__main-menu']//a[@title='Nước Trái Cây Sữa Vfresh Smoothie']")).click();
			Assert.assertEquals(driver.getCurrentUrl(),"https://www.vinamilk.com.vn/vi/san-pham/nuoc-giai-khat/nuoc-trai-cay-sua-vfresh-smoothie");
			driver.navigate().back();
			
			action.moveToElement(driver.findElement(By.xpath("//nav[@class='corp-header__main-menu']//a[text()='Sản Phẩm']"))).perform();
			action.moveToElement(driver.findElement(By.xpath("//nav[@class='corp-header__main-menu']//a[contains(text(),'Nước Giải Khát')]"))).perform();
			driver.findElement(By.xpath("//nav[@class='corp-header__main-menu']//a[@title='Nước Dừa Tươi CocoFresh']")).click();
			Assert.assertEquals(driver.getCurrentUrl(),"https://www.vinamilk.com.vn/vi/san-pham/nuoc-giai-khat/nuoc-dua-tuoi-cocofresh");
			driver.navigate().back();
			
			action.moveToElement(driver.findElement(By.xpath("//nav[@class='corp-header__main-menu']//a[text()='Sản Phẩm']"))).perform();
			action.moveToElement(driver.findElement(By.xpath("//nav[@class='corp-header__main-menu']//a[contains(text(),'Nước Giải Khát')]"))).perform();
			driver.findElement(By.xpath("//nav[@class='corp-header__main-menu']//a[@title='Nước Nha Đam Vfresh']")).click();
			Assert.assertEquals(driver.getCurrentUrl(),"https://www.vinamilk.com.vn/vi/san-pham/nuoc-giai-khat/nuoc-nha-dam-vfresh");
			driver.navigate().back();
			
			action.moveToElement(driver.findElement(By.xpath("//nav[@class='corp-header__main-menu']//a[text()='Sản Phẩm']"))).perform();
			action.moveToElement(driver.findElement(By.xpath("//nav[@class='corp-header__main-menu']//a[contains(text(),'Nước Giải Khát')]"))).perform();
			driver.findElement(By.xpath("//nav[@class='corp-header__main-menu']//a[@title='Nước Đóng Chai ICY']")).click();
			Assert.assertEquals(driver.getCurrentUrl(),"https://www.vinamilk.com.vn/vi/san-pham/nuoc-giai-khat/nuoc-dong-chai-icy");
			driver.navigate().back();
			
			action.moveToElement(driver.findElement(By.xpath("//nav[@class='corp-header__main-menu']//a[text()='Sản Phẩm']"))).perform();
			action.moveToElement(driver.findElement(By.xpath("//nav[@class='corp-header__main-menu']//a[contains(text(),'Nước Giải Khát')]"))).perform();
			driver.findElement(By.xpath("//nav[@class='corp-header__main-menu']//a[@title='Nước chanh muối ICY']")).click();
			Assert.assertEquals(driver.getCurrentUrl(),"https://www.vinamilk.com.vn/vi/san-pham/nuoc-giai-khat/nuoc-chanh-muoi-icy");
			driver.navigate().back();
			
			action.moveToElement(driver.findElement(By.xpath("//nav[@class='corp-header__main-menu']//a[text()='Sản Phẩm']"))).perform();
			action.moveToElement(driver.findElement(By.xpath("//nav[@class='corp-header__main-menu']//a[contains(text(),'Nước Giải Khát')]"))).perform();
			driver.findElement(By.xpath("//nav[@class='corp-header__main-menu']//a[@title='Trà Atiso Vfresh']")).click();
			Assert.assertEquals(driver.getCurrentUrl(),"https://www.vinamilk.com.vn/vi/san-pham/nuoc-giai-khat/tra-atiso-vfresh");
			driver.navigate().back();
			
	// Kem Ăn
		action.moveToElement(driver.findElement(By.xpath("//nav[@class='corp-header__main-menu']//a[text()='Sản Phẩm']"))).perform();
		driver.findElement(By.xpath("//nav[@class='corp-header__main-menu']//a[contains(text(),'Kem Ăn')]")).click();
		Assert.assertEquals(driver.getCurrentUrl(),"https://www.vinamilk.com.vn/vi/nhan-hieu/kem-an");
		driver.navigate().back();
		
			//Sub Sub-menu
			action.moveToElement(driver.findElement(By.xpath("//nav[@class='corp-header__main-menu']//a[text()='Sản Phẩm']"))).perform();
			action.moveToElement(driver.findElement(By.xpath("//nav[@class='corp-header__main-menu']//a[contains(text(),'Kem Ăn')]"))).perform();
			driver.findElement(By.xpath("//div[@class='corp-header__main-menu__lvl-4']//a[@title='Kem Vinamilk']")).click();
			Assert.assertEquals(driver.getCurrentUrl(),"https://www.vinamilk.com.vn/vi/san-pham/kem-an/kem-vinamilk");
			driver.navigate().back();
			
			action.moveToElement(driver.findElement(By.xpath("//nav[@class='corp-header__main-menu']//a[text()='Sản Phẩm']"))).perform();
			action.moveToElement(driver.findElement(By.xpath("//nav[@class='corp-header__main-menu']//a[contains(text(),'Kem Ăn')]"))).perform();
			driver.findElement(By.xpath("//div[@class='corp-header__main-menu__lvl-4']//a[@title='Kem Nhóc kem']")).click();
			Assert.assertEquals(driver.getCurrentUrl(),"https://www.vinamilk.com.vn/vi/san-pham/kem-an/kem-nhoc-kem");
			driver.navigate().back();
			
			action.moveToElement(driver.findElement(By.xpath("//nav[@class='corp-header__main-menu']//a[text()='Sản Phẩm']"))).perform();
			action.moveToElement(driver.findElement(By.xpath("//nav[@class='corp-header__main-menu']//a[contains(text(),'Kem Ăn')]"))).perform();
			driver.findElement(By.xpath("//div[@class='corp-header__main-menu__lvl-4']//a[@title='Kem Delight ốc quế']")).click();
			Assert.assertEquals(driver.getCurrentUrl(),"https://www.vinamilk.com.vn/vi/san-pham/kem-an/kem-delight-oc-que");
			driver.navigate().back();
			
			action.moveToElement(driver.findElement(By.xpath("//nav[@class='corp-header__main-menu']//a[text()='Sản Phẩm']"))).perform();
			action.moveToElement(driver.findElement(By.xpath("//nav[@class='corp-header__main-menu']//a[contains(text(),'Kem Ăn')]"))).perform();
			driver.findElement(By.xpath("//div[@class='corp-header__main-menu__lvl-4']//a[@title='Kem Delight cây']")).click();
			Assert.assertEquals(driver.getCurrentUrl(),"https://www.vinamilk.com.vn/vi/san-pham/kem-an/kem-delight-cay");
			driver.navigate().back();
			
			action.moveToElement(driver.findElement(By.xpath("//nav[@class='corp-header__main-menu']//a[text()='Sản Phẩm']"))).perform();
			action.moveToElement(driver.findElement(By.xpath("//nav[@class='corp-header__main-menu']//a[contains(text(),'Kem Ăn')]"))).perform();
			driver.findElement(By.xpath("//div[@class='corp-header__main-menu__lvl-4']//a[@title='Kem Subo']")).click();
			Assert.assertEquals(driver.getCurrentUrl(),"https://www.vinamilk.com.vn/vi/san-pham/kem-an/kem-subo");
			driver.navigate().back();
			
			action.moveToElement(driver.findElement(By.xpath("//nav[@class='corp-header__main-menu']//a[text()='Sản Phẩm']"))).perform();
			action.moveToElement(driver.findElement(By.xpath("//nav[@class='corp-header__main-menu']//a[contains(text(),'Kem Ăn')]"))).perform();
			driver.findElement(By.xpath("//div[@class='corp-header__main-menu__lvl-4']//a[@title='Kem cao cấp Twin Cows']")).click();
			Assert.assertEquals(driver.getCurrentUrl(),"https://www.vinamilk.com.vn/vi/san-pham/kem-an/kem-cao-cap-twin-cows");
			driver.navigate().back();
			
	//Phô Mai
		action.moveToElement(driver.findElement(By.xpath("//nav[@class='corp-header__main-menu']//a[text()='Sản Phẩm']"))).perform();
		driver.findElement(By.xpath("//nav[@class='corp-header__main-menu']//a[contains(text(),'Phô Mai')]")).click();
		Assert.assertEquals(driver.getCurrentUrl(),"https://www.vinamilk.com.vn/vi/san-pham/pho-mai/pho-mai-vinamilk");
		driver.navigate().back();
	//Sữa Gạo Rang
		action.moveToElement(driver.findElement(By.xpath("//nav[@class='corp-header__main-menu']//a[text()='Sản Phẩm']"))).perform();
		driver.findElement(By.xpath("//nav[@class='corp-header__main-menu']//a[@title='Sữa Gạo Rang']")).click();
		Assert.assertEquals(driver.getCurrentUrl(),"https://www.vinamilk.com.vn/vi/nhan-hieu/sua-gao-rang");
		driver.navigate().back();
		
			//Sub - menu
			action.moveToElement(driver.findElement(By.xpath("//nav[@class='corp-header__main-menu']//a[text()='Sản Phẩm']"))).perform();
			action.moveToElement(driver.findElement(By.xpath("//nav[@class='corp-header__main-menu']//a[@title='Sữa Gạo Rang']"))).perform();
			driver.findElement(By.xpath("//div[@class='corp-header__main-menu__lvl-4']//a[@title='Sữa Gạo Rang Zori']")).click();
			Assert.assertEquals(driver.getCurrentUrl(),"https://www.vinamilk.com.vn/vi/san-pham/sua-gao-rang/sua-gao-rang-zori");
			driver.navigate().back();
			
	//Sữa Đậu Nành
		action.moveToElement(driver.findElement(By.xpath("//nav[@class='corp-header__main-menu']//a[text()='Sản Phẩm']"))).perform();
		driver.findElement(By.xpath("//nav[@class='corp-header__main-menu']//a[@title='Sữa Đậu Nành']")).click();
		Assert.assertEquals(driver.getCurrentUrl(),"https://www.vinamilk.com.vn/vi/nhan-hieu/sua-dau-nanh");
		driver.navigate().back();
			
			//Sub - menu
			action.moveToElement(driver.findElement(By.xpath("//nav[@class='corp-header__main-menu']//a[text()='Sản Phẩm']"))).perform();
			action.moveToElement(driver.findElement(By.xpath("//nav[@class='corp-header__main-menu']//a[@title='Sữa Đậu Nành']"))).perform();
			driver.findElement(By.xpath("//div[@class='corp-header__main-menu__lvl-4']//a[@title='Sữa đậu nành Đậu Đỏ']")).click();
			Assert.assertEquals(driver.getCurrentUrl(),"https://www.vinamilk.com.vn/vi/san-pham/sua-dau-nanh/sua-dau-nanh-dau-do");
			driver.navigate().back();
			
			action.moveToElement(driver.findElement(By.xpath("//nav[@class='corp-header__main-menu']//a[text()='Sản Phẩm']"))).perform();
			action.moveToElement(driver.findElement(By.xpath("//nav[@class='corp-header__main-menu']//a[@title='Sữa Đậu Nành']"))).perform();
			driver.findElement(By.xpath("//div[@class='corp-header__main-menu__lvl-4']//a[@title='Sữa đậu nành Hạnh nhân']")).click();
			Assert.assertEquals(driver.getCurrentUrl(),"https://www.vinamilk.com.vn/vi/san-pham/sua-dau-nanh/sua-dau-nanh-hanh-nhan");
			driver.navigate().back();
			
			action.moveToElement(driver.findElement(By.xpath("//nav[@class='corp-header__main-menu']//a[text()='Sản Phẩm']"))).perform();
			action.moveToElement(driver.findElement(By.xpath("//nav[@class='corp-header__main-menu']//a[@title='Sữa Đậu Nành']"))).perform();
			driver.findElement(By.xpath("//div[@class='corp-header__main-menu__lvl-4']//a[@title='Sữa đậu nành hạt Óc Chó']")).click();
			Assert.assertEquals(driver.getCurrentUrl(),"https://www.vinamilk.com.vn/vi/san-pham/sua-dau-nanh/sua-dau-nanh-hat-oc-cho");
			driver.navigate().back();
			
			action.moveToElement(driver.findElement(By.xpath("//nav[@class='corp-header__main-menu']//a[text()='Sản Phẩm']"))).perform();
			action.moveToElement(driver.findElement(By.xpath("//nav[@class='corp-header__main-menu']//a[@title='Sữa Đậu Nành']"))).perform();
			driver.findElement(By.xpath("//div[@class='corp-header__main-menu__lvl-4']//a[@title='Sữa đậu nành GoldSoy giàu đạm']")).click();
			Assert.assertEquals(driver.getCurrentUrl(),"https://www.vinamilk.com.vn/vi/san-pham/sua-dau-nanh/sua-dau-nanh-goldsoy-giau-dam");
			driver.navigate().back();
			
			action.moveToElement(driver.findElement(By.xpath("//nav[@class='corp-header__main-menu']//a[text()='Sản Phẩm']"))).perform();
			action.moveToElement(driver.findElement(By.xpath("//nav[@class='corp-header__main-menu']//a[@title='Sữa Đậu Nành']"))).perform();
			driver.findElement(By.xpath("//div[@class='corp-header__main-menu__lvl-4']//a[@title='Sữa đậu nành Vinamilk gấp đôi Canxi']")).click();
			Assert.assertEquals(driver.getCurrentUrl(),"https://www.vinamilk.com.vn/vi/san-pham/sua-dau-nanh/sua-dau-nanh-vinamilk-gap-doi-canxi");
			driver.navigate().back();
			
	//Cafe
		action.moveToElement(driver.findElement(By.xpath("//nav[@class='corp-header__main-menu']//a[text()='Sản Phẩm']"))).perform();
		driver.findElement(By.xpath("//nav[@class='corp-header__main-menu']//a[contains(text(),'Cà phê đóng chai')]")).click();
		Assert.assertEquals(driver.getCurrentUrl(),"https://www.vinamilk.com.vn/ca-phe-dong-chai/san-pham/hicafe/");
		driver.navigate().back();
		
	//Đường Vietsugar
		action.moveToElement(driver.findElement(By.xpath("//nav[@class='corp-header__main-menu']//a[text()='Sản Phẩm']"))).perform();
		driver.findElement(By.xpath("//nav[@class='corp-header__main-menu']//a[contains(text(),'Đường Vietsugar')]")).click();
		Assert.assertEquals(driver.getCurrentUrl(),"https://www.vinamilk.com.vn/vi/san-pham/duong-vietsugar/duong-vietsugar");
		driver.navigate().back();
			
	// Công bố sản phẩm
		action.moveToElement(driver.findElement(By.xpath("//nav[@class='corp-header__main-menu']//a[text()='Sản Phẩm']"))).perform();
		driver.findElement(By.xpath("//nav[@class='corp-header__main-menu']//a[contains(text(),'Công bố sản phẩm')]")).click();
		Assert.assertEquals(driver.getCurrentUrl(), "https://www.vinamilk.com.vn/cong-bo-san-pham/");
		driver.navigate().back();

	}
	
	
		   
	
//	private void switchToWindowByTitle(String parentID) {
//		// lấy  ra tất cả các ID đang có (tab/window)
//		Set<String> allWidows = driver.getWindowHandles();
//		
//		//duyệt qua từng ID đã lấy được
//		for (String runWindow : allWidows) {
//			
//			// nếu ID nào khác vs parent 
//			if(!runWindow.equals(parentID)) {
//				
//				// Switch qua
//				driver.switchTo().window(runWindow);
//				break; // Thoát vòng lặp
//			}
//		}			
//	}
	
	
	
	public void sleepInSecond(long time) {
		try {
			Thread.sleep(time * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

  @AfterClass
  public void afterClass() {
	  driver.quit();
  }

}
