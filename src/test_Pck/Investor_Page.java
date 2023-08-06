package test_Pck;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Investor_Page {
	
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
	    
	    driver.findElement(By.xpath("//a[@class='nav-link nav-group-toggle ng-tns-c56-1']")).click();
		
        driver.findElement(By.xpath("//a[@href='#/user']")).click();
        
        Select Accounts = new Select (driver.findElement(By.xpath("//select[@formcontrolname='parking']")));
		
        Accounts.selectByVisibleText("Test12");
        
        driver.findElement(By.xpath("//button[@class='btn btn-dark']")).click();
		
		driver.findElement(By.xpath("//input[@formcontrolname='portal_login_id']")).sendKeys("Test_Investor_R12");
		
		driver.findElement(By.xpath("//input[@formcontrolname='portal_pwd']")).sendKeys("Test@12");
		
        Select dM = new Select (driver.findElement(By.xpath("//select[@formcontrolname='salutation_code']")));
		
		dM.selectByVisibleText("Mr");
		
		driver.findElement(By.xpath("//input[@formcontrolname='first_name_en']")).sendKeys("Test_");
		
		driver.findElement(By.xpath("//input[@formcontrolname='middle_name_en']")).sendKeys("Investor");
		
		driver.findElement(By.xpath("//input[@formcontrolname='last_name_en']")).sendKeys("_R12");
		
		driver.findElement(By.xpath("//input[@formcontrolname='first_name_lcl']")).sendKeys("चाचणी_");
        
driver.findElement(By.xpath("//input[@formcontrolname='middle_name_lcl']")).sendKeys("गुंतवणूकदार");
		
		driver.findElement(By.xpath("//input[@formcontrolname='last_name_lcl']")).sendKeys("_R12");
		
        Select dMl = new Select (driver.findElement(By.xpath("//select[@formcontrolname='gender_code']")));
		
		dMl.selectByVisibleText("Male");
		
		driver.findElement(By.xpath("//input[@formcontrolname='email']")).sendKeys("Test_Investor@gmail.com");
		
		driver.findElement(By.xpath("//input[@formcontrolname='mobile']")).sendKeys("1526487958");
		
		driver.findElement(By.xpath("//input[@formcontrolname='portfolio_id']")).sendKeys("PI87958");
		
		 Select Currency = new Select (driver.findElement(By.xpath("//select[@formcontrolname='portfolio_currency']")));
			
		 Currency.selectByVisibleText("INR");
		
		driver.findElement(By.xpath("//input[@formcontrolname='fk_portfolio_broker']")).sendKeys("Demo");
		
		driver.findElement(By.xpath("//input[@formcontrolname='portfolio_inception_date']")).sendKeys("11/06/2022");
		
		driver.findElement(By.xpath("//input[@formcontrolname='portfolio_closed_date']")).sendKeys("11/06/2023");
		
		driver.findElement(By.xpath("//input[@formcontrolname='portfolio_code']")).sendKeys("PC12");
		
		driver.findElement(By.xpath("//input[@formcontrolname='fk_portfolio_rm']")).sendKeys("Portfolio");
			
		
        Select Address = new Select (driver.findElement(By.xpath("//select[@formcontrolname='type']")));
		
        Address.selectByVisibleText("Home");
		
		driver.findElement(By.xpath("//input[@formcontrolname='address1']")).sendKeys("Avenue 12,");
		
		driver.findElement(By.xpath("//input[@formcontrolname='city']")).sendKeys("Newyork");
		
		driver.findElement(By.xpath("//input[@formcontrolname='pincode']")).sendKeys("112112");
		
		driver.findElement(By.xpath("//input[@formcontrolname='dist']")).sendKeys("NY");
		
		driver.findElement(By.xpath("//input[@formcontrolname='state']")).sendKeys("Washington DC");
			
		driver.findElement(By.xpath("//input[@formcontrolname='country']")).sendKeys("America");
		
		driver.findElement(By.xpath("//input[@formcontrolname='building_no']")).sendKeys("112");
							
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();

        
        

}}
