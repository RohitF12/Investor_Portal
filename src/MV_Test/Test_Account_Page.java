package MV_Test;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class Test_Account_Page {

	
	public static void main(String[] args) {
		
	

		System.setProperty("webdriver.chrome.driver","C:\\Users\\RohitFulzele\\Desktop\\RCS\\Automation_Testing\\Testing\\chromedriver_win32(1)\\chromedriver.exe");
			
	                   	WebDriver driver = new ChromeDriver();
						
     	driver.get("https://ip.reyanarth.com/ipadmin/#/login");
     	
	     driver.manage().window().maximize();
	     
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("testsuperadmin");
		
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("test@123");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);	 
		
		driver.findElement(By.xpath("//a[@class='nav-link nav-group-toggle ng-tns-c56-1']")).click();
			
		driver.findElement(By.xpath("//a[@href='#/account']")).click();
		
		driver.findElement(By.xpath("//button[@class='btn btn-dark']")).click();
		
		driver.findElement(By.xpath("//input[@class='form-control ng-untouched ng-pristine ng-invalid']")).sendKeys("Test12");
		
		driver.findElement(By.xpath("//input[@formcontrolname='org_name_lcl']")).sendKeys("चाचणी12");
		
		driver.findElement(By.xpath("//input[@formcontrolname='domain_name']")).sendKeys("@Test");
		
		driver.findElement(By.xpath("//input[@formcontrolname='administrator']")).sendKeys("R12");
		
		//webElement s = driver.findElement(By.xpath("//select[@formcontrolname='designation']"));
		
		driver.findElement(By.xpath("//input[@formcontrolname='fk_default_profile']")).sendKeys("Administrator");
		
		driver.findElement(By.xpath("//input[@formcontrolname='decimal_point']")).sendKeys("1");
		
		Select d = new Select (driver.findElement(By.xpath("//select[@formcontrolname='currency']")));
		
		d.selectByVisibleText("INR");
		
       Select kd = new Select (driver.findElement(By.xpath("//select[@formcontrolname='date_format']")));
		
		kd.selectByVisibleText("dd-MM-yyyy");
		
       Select Mkd = new Select (driver.findElement(By.xpath("//select[@formcontrolname='type']")));
		
		Mkd.selectByVisibleText("Home");
		
		driver.findElement(By.xpath("//input[@formcontrolname='address1']")).sendKeys("Avenue 12,");
		
		driver.findElement(By.xpath("//input[@formcontrolname='city']")).sendKeys("Newyork");
		
		driver.findElement(By.xpath("//input[@formcontrolname='pincode']")).sendKeys("112112");
		
		driver.findElement(By.xpath("//input[@formcontrolname='dist']")).sendKeys("NY");
		
		driver.findElement(By.xpath("//input[@formcontrolname='state']")).sendKeys("Washington DC");
		
       Select SMkd = new Select (driver.findElement(By.xpath("//select[@formcontrolname='code']")));
		
		SMkd.selectByVisibleText("+91");
		
		driver.findElement(By.xpath("//input[@formcontrolname='country']")).sendKeys("America");
		
		driver.findElement(By.xpath("//input[@formcontrolname='building_no']")).sendKeys("12");
							
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
				
					
		//driver.quit();
		
// use on staff page
		

		
		

	}

}
