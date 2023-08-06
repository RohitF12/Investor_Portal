package test_Pck;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Staff_Page {

public static void main(String[] args) {
		

		System.setProperty("webdriver.chrome.driver","C:\\Users\\RohitFulzele\\Desktop\\RCS\\Automation_Testing\\Testing\\chromedriver_win32(1)\\chromedriver.exe");
			
	                   	WebDriver driver = new ChromeDriver();
						
     	driver.get("https://ip.reyanarth.com/ipadmin/#/login");
     	
	     driver.manage().window().maximize();
	     
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Test_SW1");
		
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("12345678");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);	 
				
		//Select Account = new Select (driver.findElement(By.xpath("//select[@formcontrolname='parking']")));
		
	    //Account.selectByValue("1bd8c587-2922-4db1-b424-04af6a4b571f");
	    
	    //driver.findElement(By.xpath("//a[@class='nav-link nav-group-toggle ng-tns-c56-1']")).click();
		
        driver.findElement(By.xpath("//a[@href='#/admin']")).click();	
		
		driver.findElement(By.xpath("//button[@class='btn btn-dark']")).click();
		
		//driver.findElement(By.xpath("//input[@formcontrolname='portal_login_id']")).sendKeys("Test_User_R12");
		
		//driver.findElement(By.xpath("//input[@formcontrolname='portal_pwd']")).sendKeys("Test@12");
		
       // Select dM = new Select (driver.findElement(By.xpath("//select[@formcontrolname='salutation_code']")));
		
		//dM.selectByVisibleText("Mr");
		
		driver.findElement(By.xpath("//input[@formcontrolname='first_name_en']")).sendKeys("Test_");
		
		driver.findElement(By.xpath("//input[@formcontrolname='middle_name_en']")).sendKeys("User");
		
		driver.findElement(By.xpath("//input[@formcontrolname='last_name_en']")).sendKeys("_R12");
		
		driver.findElement(By.xpath("//input[@formcontrolname='first_name_lcl']")).sendKeys("चाचणी_");
		
		driver.findElement(By.xpath("//input[@formcontrolname='middle_name_lcl']")).sendKeys("वापरकर्ता");
		
		driver.findElement(By.xpath("//input[@formcontrolname='last_name_lcl']")).sendKeys("_R12");
		
        Select dMl = new Select (driver.findElement(By.xpath("//select[@formcontrolname='gender_code']")));
		
		dMl.selectByVisibleText("Male");
		
		driver.findElement(By.xpath("//input[@formcontrolname='email']")).sendKeys("rfulzele@gmail.com");
		
		driver.findElement(By.xpath("//input[@formcontrolname='mobile']")).sendKeys("1526487958");
		
        Select department = new Select (driver.findElement(By.xpath("//select[@formcontrolname='department']")));
		
        department.selectByVisibleText("Dev");
        
        Select designation = new Select (driver.findElement(By.xpath("//select[@formcontrolname='designation']")));
		
        designation.selectByVisibleText("Programmer");
		
        Select account = new Select (driver.findElement(By.xpath("//select[@formcontrolname='fk_adm_portal_account']")));
		
        account.selectByVisibleText("Test12");
		
        Select Role = new Select (driver.findElement(By.xpath("//select[@formcontrolname='user_role']")));
		
        Role.selectByVisibleText("Admin");
		
Select Mkd = new Select (driver.findElement(By.xpath("//select[@formcontrolname='type']")));
		
		Mkd.selectByVisibleText("Home");
		
		driver.findElement(By.xpath("//input[@formcontrolname='address1']")).sendKeys("Avenue 12,");
		
		driver.findElement(By.xpath("//input[@formcontrolname='city']")).sendKeys("Newyork");
		
		driver.findElement(By.xpath("//input[@formcontrolname='pincode']")).sendKeys("112112");
		
		driver.findElement(By.xpath("//input[@formcontrolname='dist']")).sendKeys("NY");
		
		driver.findElement(By.xpath("//input[@formcontrolname='state']")).sendKeys("Washington DC");
			
		driver.findElement(By.xpath("//input[@formcontrolname='country']")).sendKeys("America");
		
		driver.findElement(By.xpath("//input[@formcontrolname='building_no']")).sendKeys("112");
							
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		
		
}
}