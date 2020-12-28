package webdriver;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

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

	public void TC_01_mainmenu_Homepage() throws InterruptedException {
		driver.get("https://www.vinamilk.com.vn/"); 
		    //*****Departure day selection started.
		    //Click Trang chủ
		    driver.findElement(By.xpath("//nav[@class='corp-header__main-menu']//a[contains(text(),'Trang chủ')]")).click();
		    Assert.assertEquals(driver.getCurrentUrl(),"https://www.vinamilk.com.vn/vi");
	}
	

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
