package Krishlal_Extra_Test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.Message;
import org.openqa.selenium.grid.data.Session;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Name1 {
	
    public static void main(String[] args) throws InterruptedException, IOException  {

   	 

 	   System.setProperty("webdriver.chrome.driver","C:\\Users\\RohitFulzele\\Desktop\\RCS\\Automation_Testing\\Testing\\chromedriver_win32(1)\\chromedriver.exe");    
             
     WebDriver driver = new ChromeDriver();
     driver.get("https://ip.reyanarth.com/#/dashboard");  

     
     driver.manage().window().maximize();
     driver.findElement(By.xpath("//input[@type='email']")).sendKeys("sssarkar@reyan.co.in");


     driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();


     ((JavascriptExecutor)driver).executeScript("window.open()");

     ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());



     driver.switchTo().window(tabs.get(1));

     driver.get("https://outlook.office.com");


     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
     WebElement usernameField = driver.findElement(By.id("i0116"));
     usernameField.sendKeys("sssarkar@reyan.co.in");

     driver.findElement(By.xpath("//input[@id='idSIButton9']")).click();
     driver.findElement(By.xpath("//input[@id='i0118']")).sendKeys("Bug97765");


     driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);





    // WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
    // WebElement loginButton = wait.until(ExpectedConditions.elementToBeClickable(By.id("idSIButton9")));



  // Wait for the login button to be clickable

     WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(160));

     WebElement loginButton1 = wait.until(ExpectedConditions.elementToBeClickable(By.id("idSIButton9")));

     loginButton1.click();

     WebElement NoButton = wait.until(ExpectedConditions.elementToBeClickable(By.id("idBtn_Back")));

     NoButton.click();
     
     Thread.sleep(5000);
     
     WebElement otp1 = driver.findElement(By.xpath("//*[@id=\"MainModule\"]/div/div/div[1]/div/div/div/div/div[3]/div[10]/div/div/i/span/i"));

     otp1.click();
     
          
//     WebElement open_email = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\\\"AQAAAQqJuk4BAAABsw3QZAAAAAA=\\\"]/div/div/div[2]")));
//
//     open_email.click();
     
     Thread.sleep(5000);
           
     WebElement open_email = driver.findElement(By.xpath("//span[@title='mail@reyan.co.in']"));

    open_email.click();
    
    WebElement element = driver.findElement(By.xpath("//*[@id=\"ReadingPaneContainerId\"]/div/div/div/div[2]/div/div/div[1]/div/div/div/div/div[3]/div/div/div"));
    
    String content = element.getText();
    
    Pattern pattern = Pattern.compile("\\b(\\d{6})\\b");
    
    Matcher matcher = pattern.matcher(content);
    
    String otp = null;
    
    if (matcher.find()) 
    
    { 
    	otp =  matcher.group(1);
    	
    	//System.out.println(otp);
    	
    	   	
    	
    }
    else {
    	System.out.println("opt not found");
    }
    
    Set<String> handles = driver.getWindowHandles();
    
    Iterator it = handles.iterator();

    String Parent_id = (String) it.next();
    
    String Child_Id = (String) it.next();
    		                 
    driver.switchTo().window(Child_Id).close();
    
    driver.switchTo().window(Parent_id);
    
    
    WebElement otp_Field = driver.findElement(By.xpath("//input[@id='otp']"));
    
    otp_Field.sendKeys(otp);
    
    driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
    
    
    
    
  // driver.quit();
		        
   
   
		    }
		
			
		
}