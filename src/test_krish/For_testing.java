package test_krish;

import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class For_testing {
	
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
      
      WebElement otp = driver.findElement(By.xpath("//*[@id=\"MainModule\"]/div/div/div[1]/div/div/div/div/div[3]/div[9]/div/span[1]"));

      otp.click();
      
           
//      WebElement open_email = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\\\"AQAAAQqJuk4BAAABsw3QZAAAAAA=\\\"]/div/div/div[2]")));
//
//      open_email.click();
      
      Thread.sleep(5000);
            
      WebElement open_email = driver.findElement(By.xpath("//span[@title='mail@reyan.co.in']"));

     open_email.click();
     


     
//     driver.findElement(By.xpath("//*[@id=\"read_ellipses_menu\"]/span/i[1]/span/i")).click();
//     
//     Thread.sleep(5000);
//     
//     driver.findElement(By.xpath("//button[@aria-label='View']")).click();
//     
//     Thread.sleep(5000);
//     
//     driver.findElement(By.xpath("//button[@aria-label='Show in immersive reader']")).click();
//     
//     Thread.sleep(10000);
//     
//     
//     WebElement Select_All = driver.findElement(By.xpath("//*[@id=\"content-pane\"]/div/div[4]/button[5]"));
//     Select_All.sendKeys(Keys.CONTROL+"C");
//     //Select_All.sendKeys("C");
//     
////     WebElement copy = driver.findElement(By.xpath("//*[@id=\"content-pane\"]/div/div[4]/button[5]"));
////     copy.sendKeys(Keys.CONTROL);
////     copy.sendKeys("C");
//    
//     driver.close();
//     
//     Thread.sleep(5000);
//     
//     
//     WebElement paste = driver.findElement(By.xpath("//input[@id='otp']"));
//     paste.sendKeys(Keys.CONTROL+"V");
//     //paste.sendKeys("V");
//    
    // driver.findElement(By.xpath("//input[@id='otp']")).sendKeys("text");
     
//     driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
 
     
     
     
     
     
     
//     String output = driver.findElement(By.xpath("//*[@id=\"ReadingPaneContainerId\"]/div/div/div/div[2]/div/div/div[1]/div/div/div/div/div[3]/div/div/div")).getText();
//     File DestFile= new File("C:\\Users\\RohitFulzele\\Downloads\\new 23.txt");
//     FileUtils.writeStringToFile(DestFile, output);
//     driver.close();
//////////////////////////////////////////////////////////////////////////////////////////////////////////////       
//              String text = "";
//         
//         // Declaring a variable to lookup for
//	        // number of lines in afile
//	        int lineNumber;
//	 
//	        // Try block to check for exceptions
//	        try {
//	           
//	            // Creating a FileReader object so as to
//	            // get the directory of file to be read
//	            FileReader readfile = new FileReader(
//	                "C:\\Users\\RohitFulzele\\Downloads\\new 23.txt");
//	 
//	            // Creating a BufferReader class object to
//	            // read file as passed above
//	            BufferedReader readbuffer
//	                = new BufferedReader(readfile);
//	 
//	            // Buffer reader declaration
//	 
//	            // Conditionality for specific line/s
//	 
//	            // Loop for the traversing line by line
//	            // into the text file
//	            for (lineNumber = 1; lineNumber < 10;
//	                 lineNumber++) {
//	                // If specific line/s is found
//	                if (lineNumber == 3) {
//	                    // Store the content of this specific
//	                    // line
//	                    text = readbuffer.readLine();
//	                }
//	 
//	                else {
//	                    // Just keep on reading
//	                    readbuffer.readLine();
//	                }
//	            }
//	        }
//	 
//	        // Catching IOException exception
//	        catch (IOException e) {
//	 
//	            // Print the line number where exception occurred
//	            e.printStackTrace();
//	        }
//	 
//	        // Print the specific line from the file read
//	        System.out.println(" The specific Line is: "
//	                           + text);
//	        
//	        Thread.sleep(5000);
	        

     }
      
      
      
      
  
      
      
      
  
}
     


