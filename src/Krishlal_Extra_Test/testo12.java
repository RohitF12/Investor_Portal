package Krishlal_Extra_Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class testo12 {
	
	public static void main(String[]args) throws InterruptedException {
		
		   System.setProperty("webdriver.chrome.driver","C:\\Users\\RohitFulzele\\Desktop\\RCS\\Automation_Testing\\Testing\\chromedriver_win32(1)\\chromedriver.exe");
		
	     	WebDriver driver = new ChromeDriver();
		
	        driver.get("https://www.krishlal.com/index.php");

	        driver.manage().window().maximize();

	
	
	        boolean Service_provider_seller = driver.findElement(By.xpath("//img[@src='assets/uploads/service-5.png']")).isDisplayed();
            
	        System.out.println(Service_provider_seller);
	         
	        String Service_provider_seller1 = driver.findElement(By.xpath("//img[@src='assets/uploads/service-5.png']")).getText();
	                 
	        System.out.println(Service_provider_seller1);
          
	
	}
	
}
