package NewDemo;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class DemoJenkins {

	@Test
	public void jenkinsDemo() throws InterruptedException{
		
		System.out.println("Hi");
		File src=new File("C:\\Users\\Amit Pal\\Desktop\\phantomjs-2.1.1-windows (1)\\phantomjs-2.1.1-windows\\bin\\phantomjs.exe");
		System.setProperty("phantomjs.binary.path",src.getAbsolutePath());
		//System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		WebDriver driver = new PhantomJSDriver();
		driver.get("https://www.linkedin.com/");
		driver.manage().window().maximize();
		String title =driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title,"LinkedIn: Log In or Sign Up");
		driver.findElement(By.xpath(".//*[@id='login-email']")).sendKeys();
		driver.findElement(By.xpath(".//*[@id='login-password']")).sendKeys();
		driver.findElement(By.xpath(".//*[@id='login-submit']")).click();;
		String IndexPage =driver.getTitle();
		System.out.println(IndexPage);
		Assert.assertEquals(IndexPage,"LinkedIn");
		//driver.findElement(By.xpath(".//*[@id='nav-settings__dropdown-trigger']")).click();
		//Thread.sleep(3000);
		//driver.findElement(By.xpath(".//*[@id='ember3165']/span[2]/span")).click();
		//String ProfilePage =driver.getTitle();
		//System.out.println(ProfilePage);
		//Assert.assertEquals(ProfilePage,"Amit B.Pal");
		driver.quit();
		
	}
}
