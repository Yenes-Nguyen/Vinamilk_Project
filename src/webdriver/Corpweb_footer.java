package webdriver;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class Corpweb_footer {
	WebDriver driver;
	Actions action;
	JavascriptExecutor jsExecutor;
	String projectPath = System.getProperty("user.dir");
 
	@BeforeClass
	public void beforeClass() {
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		action = new Actions(driver);
	}


	public void TC_01_Top_footer() {
		driver.get("https://www.vinamilk.com.vn/");
		
	// Liên kết nhanh
		driver.findElement(By.xpath("//div[@class='corp-footer__top']//a[contains(text(),'Thông tin dinh dưỡng')]")).click();
		Assert.assertEquals(driver.getCurrentUrl(),"https://www.vinamilk.com.vn/vi/thong-tin-dinh-duong");
		Assert.assertEquals(driver.findElement(By.xpath("//div[@id='content_wrap']//div[contains(text(),'DINH DƯỠNG')]")).getText(),"DINH DƯỠNG");
		driver.navigate().back();
		
		driver.findElement(By.xpath("//div[@class='corp-footer__top']//a[contains(text(),'Hỗ trợ khách hàng')]")).click();
		Assert.assertEquals(driver.getCurrentUrl(),"https://www.vinamilk.com.vn/vi/goc-khach-hang");
		Assert.assertEquals(driver.findElement(By.xpath("//div[@id='content']//div[@class='title_home_a']//span")).getText(),"KHÁCH HÀNG");
		driver.navigate().back();
		
		driver.findElement(By.xpath("//div[@class='corp-footer__top']//a[contains(text(),'Tuyển dụng')]")).click();
		Assert.assertEquals(driver.getCurrentUrl(),"https://www.vinamilk.com.vn/vi/tuyen-dung/vi-sao-chon-vinamilk");
		Assert.assertEquals(driver.findElement(By.xpath("//div[@id='content']//div[@class='title_td left']//span")).getText(),"VINAMILK");
		driver.navigate().back();
		
		driver.findElement(By.xpath("//div[@class='corp-footer__top']//a[contains(text(),'Sản phẩm')]")).click();
		Assert.assertEquals(driver.getCurrentUrl(),"https://www.vinamilk.com.vn/vi/nhan-hieu");
		driver.navigate().back();
		
		driver.findElement(By.xpath("//div[@class='corp-footer__top']//a[@title='Tin tức']")).click();
		Assert.assertEquals(driver.getCurrentUrl(),"https://www.vinamilk.com.vn/vi/tin-tuc-su-kien");
		Assert.assertEquals(driver.findElement(By.xpath("//div[@id='content']//div[@class='title_gockh']")).getText(),"TIN TỨC");
		driver.navigate().back();
		
		driver.findElement(By.xpath("//div[@class='corp-footer__top']//a[@title='Khuyến mãi']")).click();
		Assert.assertEquals(driver.getCurrentUrl(),"https://www.vinamilk.com.vn/vi/tin-tuc-su-kien#5");
		Assert.assertEquals(driver.findElement(By.xpath("//div[@id='content']//li[@class='tabs active']//a")).getText(),"TIN TỨC KHUYẾN MÃI");
		driver.navigate().back();
		
		driver.findElement(By.xpath("//div[@class='corp-footer__top']//a[@title='Hệ thống phân phối']")).click();
		Assert.assertEquals(driver.getCurrentUrl(),"https://www.vinamilk.com.vn/vi/phan-phoi/thi-truong-noi-dia");
		Assert.assertEquals(driver.findElement(By.xpath("//div[@id='content_wrap']//div[@class='title_pp left']//span")).getText(),"NỘI ĐỊA");
		driver.navigate().back();
		
		driver.findElement(By.xpath("//div[@class='corp-footer__top']//a[@title='Về công ty']")).click();
		Assert.assertEquals(driver.getCurrentUrl(),"https://www.vinamilk.com.vn/vi/ve-cong-ty");
		Assert.assertEquals(driver.findElement(By.xpath("//div[@id='content_wrap']//div[text()='TẦM NHÌN']")).getText(),"TẦM NHÌN");
		driver.navigate().back();
		
		driver.findElement(By.xpath("//div[@class='corp-footer__top']//a[@title='Lịch sử phát triển']")).click();
		Assert.assertEquals(driver.getCurrentUrl(),"https://www.vinamilk.com.vn/vi/lich-su-phat-trien");
		Assert.assertEquals(driver.findElement(By.xpath("//div[@id='content_wrap']//div[text()='2001']")).getText(),"2001");
		driver.navigate().back();
		
		driver.findElement(By.xpath("//div[@class='corp-footer__top']//a[@title='Chiến lược phát triển']")).click();
		Assert.assertEquals(driver.getCurrentUrl(),"https://www.vinamilk.com.vn/vi/chien-luoc-phat-trien");
		Assert.assertEquals(driver.findElement(By.xpath("//div[@id='content_wrap']//div[@class='title_gockh']")).getText(),"CHIẾN LƯỢC");
		driver.navigate().back();
		
		driver.findElement(By.xpath("//div[@class='corp-footer__top']//a[@title='Hệ thống quản trị']")).click();
		Assert.assertEquals(driver.getCurrentUrl(),"https://www.vinamilk.com.vn/vi/he-thong-quan-tri");
		Assert.assertEquals(driver.findElement(By.xpath("//div[@id='content_wrap']//div[@class='title_gockh']")).getText(),"HỆ THỐNG");
		driver.navigate().back();
		
		driver.findElement(By.xpath("//div[@class='corp-footer__top']//a[@title='Nhân sự chủ chốt']")).click();
		Assert.assertEquals(driver.getCurrentUrl(),"https://www.vinamilk.com.vn/vi/nhan-su-chu-chot");
		Assert.assertEquals(driver.findElement(By.xpath("//div[@id='content_wrap']//div[@class='title_gockh']")).getText(),"NHÂN SỰ");
		driver.navigate().back();
		
		driver.findElement(By.xpath("//div[@class='corp-footer__top']//a[@title='Đơn vị thành viên']")).click();
		Assert.assertEquals(driver.getCurrentUrl(),"https://www.vinamilk.com.vn/vi/don-vi-thanh-vien");
		Assert.assertEquals(driver.findElement(By.xpath("//div[@id='content_wrap']//div[@class='title_gockh']")).getText(),"ĐƠN VỊ");
		driver.navigate().back();
		
		driver.findElement(By.xpath("//div[@class='corp-footer__top']//a[@title='Thành tích nổi bật']")).click();
		Assert.assertEquals(driver.getCurrentUrl(),"https://www.vinamilk.com.vn/vi/thanh-tich-noi-bat");
		Assert.assertEquals(driver.findElement(By.xpath("//div[@id='content_wrap']//div[@class='title_gockh']")).getText(),"THÀNH TÍCH");
		driver.navigate().back();
		
		driver.findElement(By.xpath("//div[@class='corp-footer__top']//a[@title='Đại hội đồng cổ đông']")).click();
		Assert.assertEquals(driver.getCurrentUrl(),"https://www.vinamilk.com.vn/vi/dai-hoi-dong-co-dong");
		Assert.assertEquals(driver.findElement(By.xpath("//div[@id='content_wrap']//div[@class='title_gockh']")).getText(),"ĐẠI HỘI ĐỒNG");
		driver.navigate().back();
		
		driver.findElement(By.xpath("//div[@class='corp-footer__top']//a[@title='Thông báo cổ đông']")).click();
		Assert.assertEquals(driver.getCurrentUrl(),"https://www.vinamilk.com.vn/vi/thong-bao-co-dong");
		Assert.assertEquals(driver.findElement(By.xpath("//div[@id='content_wrap']//div[@class='title_gockh_1 tbcd']")).getText(),"CỔ ĐÔNG");
		driver.navigate().back();
		
		driver.findElement(By.xpath("//div[@class='corp-footer__top']//a[@title='Báo cáo thường niên']")).click();
		Assert.assertEquals(driver.getCurrentUrl(),"https://www.vinamilk.com.vn/vi/bao-cao-thuong-nien");
		Assert.assertEquals(driver.findElement(By.xpath("//div[@id='content_wrap']//div[@class='title_gockh_1 bctn']")).getText(),"THƯỜNG NIÊN");
		driver.navigate().back();
		
		driver.findElement(By.xpath("//div[@class='corp-footer__top']//a[@title='Thông tin tài chính']")).click();
		Assert.assertEquals(driver.getCurrentUrl(),"https://www.vinamilk.com.vn/vi/thong-tin-tai-chinh");
		Assert.assertEquals(driver.findElement(By.xpath("//div[@id='content_wrap']//div[@class='title_gockh_1 tttt']")).getText(),"TÀI CHÍNH");
		driver.navigate().back();
		
		driver.findElement(By.xpath("//div[@class='corp-footer__top']//ul[@class='hidden-xs']//strong[text()='Phát triển bền vững']")).click();
		Assert.assertEquals(driver.getCurrentUrl(),"https://www.vinamilk.com.vn/vi/phat-trien-ben-vung");
		Assert.assertEquals(driver.findElement(By.xpath("//div[@id='content_wrap']//div[@class='title_gockh_1 ptbv']")).getText(),"BỀN VỮNG");
		driver.navigate().back();
		
		driver.findElement(By.xpath("//div[@class='corp-footer__top']//ul[@class='hidden-xs']//strong[text()='Cải tiến & Đổi mới']")).click();
		Assert.assertEquals(driver.getCurrentUrl(),"https://www.vinamilk.com.vn/vi/cai-tien-doi-moi");
		Assert.assertEquals(driver.findElement(By.xpath("//div[@id='warp_gkh_home_a']//div[@class='title_home_a']//span")).getText(),"& ĐỔI MỚI");
		driver.navigate().back();
		
		driver.findElement(By.xpath("//div[@class='corp-footer__top']//a[text()='Thông cáo báo chí']")).click();
		Assert.assertEquals(driver.getCurrentUrl(),"https://www.vinamilk.com.vn/vi/thong-cao-bao-chi");
		Assert.assertEquals(driver.findElement(By.xpath("//div[@id='content_wrap']//div[@class='title_gockh_1 tcbc']")).getText(),"BÁO CHÍ");
		driver.navigate().back();
		
		driver.findElement(By.xpath("//div[@class='corp-footer__top']//a[text()='Tin tức & Sự kiện']")).click();
		Assert.assertEquals(driver.getCurrentUrl(),"https://www.vinamilk.com.vn/vi/tin-tuc-su-kien");
		Assert.assertEquals(driver.findElement(By.xpath("//div[@id='content_wrap']//div[@class='title_gockh_1 ttsk']")).getText(),"& SỰ KIỆN");
		driver.navigate().back();
		
		driver.findElement(By.xpath("//div[@class='corp-footer__top']//a[text()='Thư viện']")).click();
		Assert.assertEquals(driver.getCurrentUrl(),"https://www.vinamilk.com.vn/vi/thu-vien");
		Assert.assertEquals(driver.findElement(By.xpath("//div[@id='content_wrap']//div[@class='title_gockh_1 tv']//h1")).getText(),"THƯ VIỆN");
		driver.navigate().back();
		
		driver.findElement(By.xpath("//div[@class='corp-footer__top']//a[text()='Thông tin liên lạc']")).click();
		Assert.assertEquals(driver.getCurrentUrl(),"https://www.vinamilk.com.vn/vi/thong-tin-lien-lac");
		Assert.assertEquals(driver.findElement(By.xpath("//div[@id='content_wrap']//div[@class='title_gockh']")).getText(),"THÔNG TIN LIÊN LẠC");
		driver.navigate().back();
		
		driver.findElement(By.xpath("//div[@class='corp-footer__top']//a[@title='Đối tác']//strong")).click();
		Assert.assertEquals(driver.getCurrentUrl(),"https://www.vinamilk.com.vn/vi/nha-cung-cap");
		Assert.assertEquals(driver.findElement(By.xpath("//div[@id='content_wrap']//div[@class='title_td left']//span")).getText(),"CUNG CẤP");
		driver.navigate().back();
		
		driver.findElement(By.xpath("//div[@class='corp-footer__top']//strong[text()='Liên Hệ']")).click();
		Assert.assertEquals(driver.getCurrentUrl(),"https://www.vinamilk.com.vn/vi/lien-he");
		Assert.assertEquals(driver.findElement(By.xpath("//div[@id='content_wrap']//div[@class='title_gockh']")).getText(),"THÔNG TIN LIÊN LẠC");
		driver.navigate().back();
		
	}

	
	@Test
	public void TC_02_Footer_Network() {
		driver.get("https://www.vinamilk.com.vn/");
		
		String parentWindownID = driver.getWindowHandle();
		System.out.println("Parent ID = " + parentWindownID);
		
//	app store
		driver.findElement(By.xpath("//div[@class='footer-network-2']//a[@href='https://appsto.re/vn/2t-lib.i']")).click();
		
		switchToWindowByID(parentWindownID);		
		Assert.assertEquals(driver.getCurrentUrl(),"https://apps.apple.com/vn/app/gi%E1%BA%A5c-m%C6%A1-s%E1%BB%AFa-vi%E1%BB%87t/id1211098358?mt=8");
		
		switchToWindowByTitle("Vinamilk - Vươn cao Việt Nam - Vinamilk");
		sleepInSecond(3);
		Assert.assertEquals(driver.getCurrentUrl(), "https://www.vinamilk.com.vn/");
		
//	google play
		driver.findElement(By.xpath("//div[@class='footer-network-2']//a[@href='https://play.google.com/store/apps/details?id=com.giacmosuaviet']//img")).click();
		
		switchToWindowByTitle("Giấc mơ sữa Việt - Apps on Google Play");
		Assert.assertEquals(driver.getCurrentUrl(),"https://play.google.com/store/apps/details?id=com.giacmosuaviet");
			
		switchToWindowByTitle("Vinamilk - Vươn cao Việt Nam - Vinamilk");
		sleepInSecond(3);
		Assert.assertEquals(driver.getCurrentUrl(), "https://www.vinamilk.com.vn/");
		
//	giỏ hàng
		driver.findElement(By.xpath("//div[@class='footer-network-2']//div[@class='footer-network-2__col -cart']//img")).click();
			
		switchToWindowByTitle("Mua sữa Vinamilk Online tại Giấc Mơ Sữa Việt Vinamilk eShop");
		Assert.assertEquals(driver.getCurrentUrl(),"https://giacmosuaviet.com.vn/");
				
		switchToWindowByTitle("Vinamilk - Vươn cao Việt Nam - Vinamilk");
		sleepInSecond(3);
		Assert.assertEquals(driver.getCurrentUrl(), "https://www.vinamilk.com.vn/");
		
	
//	Social - Fb vinamilk babycare
		action.moveToElement(driver.findElement(By.xpath("//div[@class='footer-network-2']//div[@class='footer-network-2__col -social']//img[@src='https://www.vinamilk.com.vn/static/tpl/dist/assets/images/footer-network-2/social-fb.png']"))).perform();;
		driver.findElement(By.xpath("//div[@class='footer-network-2']//div[@class='footer-network-2__col -social']//a[text()='Vinamilk Babycare']")).click();	
		
		switchToWindowByTitle("Đăng nhập Facebook | Facebook");
		sleepInSecond(3);
		Assert.assertEquals(driver.getTitle(),"Đăng nhập Facebook | Facebook");
		
		driver.close();
				
		switchToWindowByTitle("Vinamilk - Vươn cao Việt Nam - Vinamilk");
		sleepInSecond(3);
		Assert.assertEquals(driver.getCurrentUrl(), "https://www.vinamilk.com.vn/");

// Social - fb bí quyết ngon khỏe
		action.moveToElement(driver.findElement(By.xpath("//div[@class='footer-network-2']//div[@class='footer-network-2__col -social']//img[@src='https://www.vinamilk.com.vn/static/tpl/dist/assets/images/footer-network-2/social-fb.png']"))).perform();
		driver.findElement(By.xpath("//div[@class='footer-network-2']//div[@class='footer-network-2__col -social']//a[text()='Vinamilk - Bí Quyết Ngon Khỏe Từ Thiên Nhiên']")).click();	
		
		switchToWindowByTitle("Đăng nhập Facebook | Facebook");
		sleepInSecond(3);
		Assert.assertEquals(driver.getTitle(),"Đăng nhập Facebook | Facebook");
		
		switchToWindowByTitle("Vinamilk - Vươn cao Việt Nam - Vinamilk");
		sleepInSecond(3);
		Assert.assertEquals(driver.getCurrentUrl(), "https://www.vinamilk.com.vn/");
		
// Social - fb giấc mơ sữa việt
		action.moveToElement(driver.findElement(By.xpath("//div[@class='footer-network-2']//div[@class='footer-network-2__col -social']//img[@src='https://www.vinamilk.com.vn/static/tpl/dist/assets/images/footer-network-2/social-fb.png']"))).perform();
		driver.findElement(By.xpath("//div[@class='footer-network-2']//div[@class='footer-network-2__col -social']//a[text()='Vinamilk - Giấc Mơ Sữa Việt']")).click();	
				
		switchToWindowByTitle("Đăng nhập Facebook | Facebook");
		sleepInSecond(3);
		Assert.assertEquals(driver.getTitle(),"Đăng nhập Facebook | Facebook");
						
		switchToWindowByTitle("Vinamilk - Vươn cao Việt Nam - Vinamilk");
		sleepInSecond(3);
		Assert.assertEquals(driver.getCurrentUrl(), "https://www.vinamilk.com.vn/");
		
//social - youtube
		driver.findElement(By.xpath("//div[@class='footer-network-2']//div[@class='footer-network-2__col -social']//a[@href='https://www.youtube.com/user/vinamilk']//img")).click();
		
		switchToWindowByTitle("Vinamilk - YouTube");
		Assert.assertEquals(driver.getCurrentUrl(),"https://www.youtube.com/user/vinamilk");
		
		switchToWindowByTitle("Vinamilk - Vươn cao Việt Nam - Vinamilk");
		sleepInSecond(3);
		Assert.assertEquals(driver.getCurrentUrl(), "https://www.vinamilk.com.vn/");
		
// Social - intagram
		action.moveToElement(driver.findElement(By.xpath("//div[@class='footer-network-2']//div[@class='footer-network-2__col -social']//img[@src='https://www.vinamilk.com.vn/static/tpl/dist/assets/images/footer-network-2/social-in.png']"))).perform();
		driver.findElement(By.xpath("//div[@class='footer-network-2']//div[@class='footer-network-2__col -social']//a[text()='Vinamilk - Baby Care']")).click();	
						
		switchToWindowByTitle("Login • Instagram");
		Assert.assertEquals(driver.getCurrentUrl(),"https://www.instagram.com/accounts/login/?next=/vinamilk.baby.care/");
		
		driver.close();
								
		switchToWindowByTitle("Vinamilk - Vươn cao Việt Nam - Vinamilk");
		sleepInSecond(3);
		Assert.assertEquals(driver.getCurrentUrl(), "https://www.vinamilk.com.vn/");
//
		action.moveToElement(driver.findElement(By.xpath("//div[@class='footer-network-2']//div[@class='footer-network-2__col -social']//img[@src='https://www.vinamilk.com.vn/static/tpl/dist/assets/images/footer-network-2/social-in.png']"))).perform();
		driver.findElement(By.xpath("//div[@class='footer-network-2']//div[@class='footer-network-2__col -social']//a[text()='Vinamilk -  Bí quyết ngon khoẻ từ thiên nhiên']")).click();	
						
		switchToWindowByTitle("Login • Instagram");
		Assert.assertEquals(driver.getCurrentUrl(),"https://www.instagram.com/accounts/login/?next=/vinamilk_ngonkhoetuthiennhien/");
		
		driver.close();
		
		switchToWindowByTitle("Vinamilk - Vươn cao Việt Nam - Vinamilk");
		sleepInSecond(3);
		Assert.assertEquals(driver.getCurrentUrl(), "https://www.vinamilk.com.vn/");
//
		action.moveToElement(driver.findElement(By.xpath("//div[@class='footer-network-2']//div[@class='footer-network-2__col -social']//img[@src='https://www.vinamilk.com.vn/static/tpl/dist/assets/images/footer-network-2/social-in.png']"))).perform();
		driver.findElement(By.xpath("//div[@class='footer-network-2']//div[@class='footer-network-2__col -social']//a[text()='Hi Café – Trọn Đam Mê']")).click();	
						
		switchToWindowByTitle("Login • Instagram");
		Assert.assertEquals(driver.getCurrentUrl(),"https://www.instagram.com/accounts/login/?next=/hicafe_trondamme/");
		
		driver.close();
		
		switchToWindowByTitle("Vinamilk - Vươn cao Việt Nam - Vinamilk");
		sleepInSecond(3);
		Assert.assertEquals(driver.getCurrentUrl(), "https://www.vinamilk.com.vn/");

// Icon Bộ công thương
		driver.findElement(By.xpath("//div[@class='footer-network-2']//div[@class='footer-network-2__col -bct']//img")).click();
		
		switchToWindowByTitle("Thông tin website thương mại điện tử - Online.Gov.VN");
		Assert.assertEquals(driver.getCurrentUrl(),"http://online.gov.vn/Home/WebDetails/53186?AspxAutoDetectCookieSupport=1");
		
		switchToWindowByTitle("Vinamilk - Vươn cao Việt Nam - Vinamilk");
		sleepInSecond(3);
		Assert.assertEquals(driver.getCurrentUrl(), "https://www.vinamilk.com.vn/");
		
	}
	
	
	public void TC_03_() {
	
	}
	
	public void switchToWindowByID (String parentID) {
		// lấy  ra tất cả các ID đang có (tab/window)
		Set<String> allWidows = driver.getWindowHandles();
		
		//duyệt qua từng ID đã lấy được
		for (String runWindow : allWidows) {
			
			// nếu ID nào khác vs parent 
			if(!runWindow.equals(parentID)) {
				
				// Switch qua
				driver.switchTo().window(runWindow);
				break; // Thoát vòng lặp
			}
		}	
	}
	 
	// Switch = Title (correct with all case: 2 | >2 tab/ windows)
	public void switchToWindowByTitle (String expectedTitle) {
			
		//lấy ra tất cả ID của tab và window đang có
		Set<String> allWindows = driver.getWindowHandles();
			
		// Duyệt qua từng ID đã lấy được
		for (String WindowID : allWindows) {
				
			//switch vào từng ID trước
			driver.switchTo().window(WindowID);
				
			// Lấy ra title của tab đó
			String actualTitle = driver.getTitle();
				
			// Nếu title của tab = title mong muốn -> break khỏi vòng for
			if(actualTitle.equals(expectedTitle)) {
				break;
			}
		}	
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
