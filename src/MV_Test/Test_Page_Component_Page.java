package MV_Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test_Page_Component_Page {
	
public static void main(String[] args) {
		

		System.setProperty("webdriver.chrome.driver","C:\\Users\\RohitFulzele\\Desktop\\RCS\\Automation_Testing\\Testing\\chromedriver_win32(1)\\chromedriver.exe");
			
	                   	WebDriver driver = new ChromeDriver();
						
     	driver.get("https://ip.reyanarth.com/ipadmin/#/login");
     	
	     driver.manage().window().maximize();
	     
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("testsuperadmin");
		
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("test@123");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);	
		
	    Select Account = new Select (driver.findElement(By.xpath("//select[@formcontrolname='parking']")));
			
	    Account.selectByValue("1bd8c587-2922-4db1-b424-04af6a4b571f");
	    
	    driver.findElement(By.xpath("//a[@class='nav-link nav-group-toggle ng-tns-c56-2']")).click();
		
        driver.findElement(By.xpath("//a[@href='#/childcomponent']")).click();
	

}}