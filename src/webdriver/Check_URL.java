package webdriver;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class Check_URL {
	WebDriver driver;
	WebDriverWait expliciWait;
	JavascriptExecutor jsExecutor;
	String projectPath = System.getProperty("user.dir");
	
 
	@BeforeClass
	public void beforeClass() {
		//driver = new FirefoxDriver();
		System.setProperty("webdriver.chrome.driver", projectPath + "\\browserDriver\\chromedriver.exe");
		driver = new ChromeDriver();
		
		jsExecutor = (JavascriptExecutor) driver;
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

	@Test
	public void TC_01_() throws InterruptedException {
		driver.get("https://www.vinamilk.com.vn/"); 
		    //*****Departure day selection started.
		    //Click Trang chủ
		    driver.findElement(By.xpath("//nav[@class='corp-header__main-menu']//a[contains(text(),'Trang chủ')]")).click();
		    Assert.assertEquals(driver.getCurrentUrl(),"https://www.vinamilk.com.vn/vi");
		    
		    
		    
		    //Click Câu chuyện Vinamilk
		    driver.findElement(By.xpath("//nav[@class='corp-header__main-menu']//a[contains(text(),'Câu chuyện Vinamilk')]")).click();
		    sleepInSecond(3);
		    Assert.assertEquals(driver.getTitle(),"Câu chuyện Vinamilk | Vinamilk Việt Nam - Vinamilk");

		    driver.findElement(By.xpath("//div[@class='under-hd']//a[contains(text(),'Về công ty')]")).click();
		    Assert.assertEquals(driver.getCurrentUrl(),"https://www.vinamilk.com.vn/vi/ve-cong-ty");
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
