package Krishlal_Extra_Test;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Govet_scheme_NA {
	
	public static void main(String[]args) throws InterruptedException  {
		
		

		   System.setProperty("webdriver.chrome.driver","C:\\Users\\RohitFulzele\\Desktop\\RCS\\Automation_Testing\\Testing\\chromedriver_win32(1)\\chromedriver.exe");
		
	     	WebDriver driver = new ChromeDriver();
		
	        driver.get("https://www.krishlal.com/index.php");
	     	

	        driver.manage().window().maximize();    
	        
	        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	        
	      WebElement Government_Scheme =  driver.findElement(By.xpath("//a[@href='governmentScheme.php']"));
	        
	      Government_Scheme.click();
	
	
	
	
	
	//अनुदान_पर_गौशाला_निर्माण	      
    
    
	  WebElement अनुदान_पर_गौशाला_निर्माण =  driver.findElement(By.xpath("//a[@href='governmentScheme-details.php?id=30']"));
      
	  अनुदान_पर_गौशाला_निर्माण.click();	
						     
	  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		   					     
	  WebElement More_Info9 = driver.findElement(By.xpath("//a[@href='https://kisansamadhan.com/a-grant-of-rs-10-lakh-is-being-given-on-the-construction-of-gaushala/']"));
						        
	  More_Info9.click();
	  
	  Thread.sleep(10000);
		 		 		      
	  Set<String> handles9 = driver.getWindowHandles();
				      
    Iterator it9 = handles9.iterator();
	
   String Parent_id9 = (String) it9.next();
				      
   String Child_Id9 = (String) it9.next();
					     
   driver.switchTo().window(Child_Id9).close();
					      
   driver.switchTo().window(Parent_id9); 
   
   driver.navigate().back();					      
			      				      
			      
//अनुदानपर_पाली_हॉउस,				      
			      
	  WebElement अनुदानपर_पाली_हॉउस =  driver.findElement(By.xpath("//a[@href='governmentScheme-details.php?id=29']"));
      
	  अनुदानपर_पाली_हॉउस.click();	
						     
	  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		   					     
	  WebElement More_Info10 = driver.findElement(By.xpath("//a[@href='https://kisansamadhan.com/apply-for-subsidy-on-green-house-shed-net-house-plastic-mulching-and-pack-house/']"));
						        
	  More_Info10.click();
	  
	  Thread.sleep(10000);
		 		 		      
	  Set<String> handles10 = driver.getWindowHandles();
				      
    Iterator it10 = handles10.iterator();
	
   String Parent_id10 = (String) it10.next();
				      
   String Child_Id10 = (String) it10.next();
					     
   driver.switchTo().window(Child_Id10).close();
					      
   driver.switchTo().window(Parent_id10); 
   
   driver.navigate().back();					      
			      
//नए_बाग_लगाने_पर_सब्सिडी	
   
	  WebElement नए_बाग_लगाने_पर_सब्सिडी =  driver.findElement(By.xpath("//a[@href='governmentScheme-details.php?id=28']"));
      
	  नए_बाग_लगाने_पर_सब्सिडी.click();	
						     
	  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		   					     
	  WebElement More_Info11 = driver.findElement(By.xpath("//a[@href='https://hindi.krishijagran.com/government-scheme/haryana-government-will-give-50-percent-subsidy-on-planting-orchard/']"));
						        
	  More_Info11.click();
	  
	  Thread.sleep(10000);
		 		 		      
	  Set<String> handles11 = driver.getWindowHandles();
				      
    Iterator it11 = handles11.iterator();
	
   String Parent_id11 = (String) it11.next();
				      
   String Child_Id11 = (String) it11.next();
					     
   driver.switchTo().window(Child_Id11).close();
					      
   driver.switchTo().window(Parent_id11); 
   
   driver.navigate().back();	     
			      
//मत्स्य_विकास_पुरस्कार_योजना	
   
	  WebElement मत्स्य_विकास_पुरस्कार_योजना	 =  driver.findElement(By.xpath("//a[@href='governmentScheme-details.php?id=27']"));
      
	  मत्स्य_विकास_पुरस्कार_योजना.click();	
						     
	  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		   					     
	  WebElement More_Info12 = driver.findElement(By.xpath("//a[@href='https://hindi.krishijagran.com/government-scheme/complete-information-about-matsya-vikas-puraskar-yojana-of-chhattisgarh-government/']"));
						        
	  More_Info12.click();
	  
	  Thread.sleep(10000);
	  		 		 		      
	  Set<String> handles12 = driver.getWindowHandles();
				      
    Iterator it12 = handles12.iterator();
	
   String Parent_id12 = (String) it12.next();
				      
   String Child_Id12 = (String) it12.next();
					     
   driver.switchTo().window(Child_Id12).close();
					      
   driver.switchTo().window(Parent_id12); 
   
   driver.navigate().back();	 	
   
//फसल_अवशेषों_के_प्रबंधन	
   
	  WebElement फसल_अवशेषों_के_प्रबंधन	 =  driver.findElement(By.xpath("//a[@href='governmentScheme-details.php?id=26']"));
      
	  फसल_अवशेषों_के_प्रबंधन.click();	
						     
	  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		   					     
	  WebElement More_Info13 = driver.findElement(By.xpath("//a[@href='https://agrimachinery.nic.in/Files/Guidelines/CRM.pdf']"));
						        
	  More_Info13.click();
	  
	  Thread.sleep(10000);
	  		 		 		      
	  Set<String> handles13 = driver.getWindowHandles();
				      
    Iterator it13 = handles13.iterator();
	
   String Parent_id13 = (String) it13.next();
				      
   String Child_Id13 = (String) it13.next();
					     
   driver.switchTo().window(Child_Id13).close();
					      
   driver.switchTo().window(Parent_id13); 
   
   driver.navigate().back();	 	     
   
//Beej_Anudan_Avedan_Yojana	     
   
	  WebElement Beej_Anudan_Avedan_Yojana	 =  driver.findElement(By.xpath("//a[@href='governmentScheme-details.php?id=25']"));
      
	  Beej_Anudan_Avedan_Yojana.click();	
						     
	  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		   					     
	  WebElement More_Info14 = driver.findElement(By.xpath("//a[@href='http://brbn.bihar.gov.in/']"));
						        
	  More_Info14.click();
	  
	  Thread.sleep(10000);
	  		 		 		      
	  Set<String> handles14 = driver.getWindowHandles();
				      
    Iterator it14 = handles14.iterator();
	
   String Parent_id14 = (String) it14.next();
				      
   String Child_Id14 = (String) it14.next();
					     
   driver.switchTo().window(Child_Id14).close();
					      
   driver.switchTo().window(Parent_id14); 
   
   driver.navigate().back();	     

//Goat_Farming	     
   
	  WebElement Goat_Farming	 =  driver.findElement(By.xpath("//a[@href='governmentScheme-details.php?id=24']"));
      
	  Goat_Farming.click();	
						     
	  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		   					     
	  WebElement More_Info15 = driver.findElement(By.xpath("//a[@href='https://hindi.krishijagran.com/news/goat-farming-90-subsidy-on-goat-farming-and-artificial-insemination/']"));
						        
	  More_Info15.click();
	  
	  Thread.sleep(10000);
	  		 		 		      
	  Set<String> handles15 = driver.getWindowHandles();
				      
    Iterator it15 = handles15.iterator();
	
   String Parent_id15 = (String) it15.next();
				      
   String Child_Id15 = (String) it15.next();
					     
   driver.switchTo().window(Child_Id15).close();
					      
   driver.switchTo().window(Parent_id15); 
   
   driver.navigate().back();	    	     
   
   
//Farm_Machinery_Bank_scheme   
   
	  WebElement Farm_Machinery_Bank_scheme	 =  driver.findElement(By.xpath("//a[@href='governmentScheme-details.php?id=23']"));
      
	  Farm_Machinery_Bank_scheme.click();	
						     
	  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		   					     
	  WebElement More_Info17 = driver.findElement(By.xpath("//a[@href='https://hindi.krishijagran.com/government-scheme/under-farm-machinery-bank-up-to-80-percent-subsidy-is-being-given-on-agricultural-machinery/']"));
						        
	  More_Info17.click();
	  
	  Thread.sleep(10000);
	  		 		 		      
	  Set<String> handles17 = driver.getWindowHandles();
				      
    Iterator it17 = handles17.iterator();
	
   String Parent_id17 = (String) it17.next();
				      
   String Child_Id17 = (String) it17.next();
					     
   driver.switchTo().window(Child_Id17).close();
					      
   driver.switchTo().window(Parent_id17); 
   
   driver.navigate().back();	     
   
   
//Scheme_for_the_establishment_of_Hi_Tech
   
	  WebElement Scheme_for_the_establishment_of_Hi_Tech =  driver.findElement(By.xpath("//a[@href='governmentScheme-details.php?id=18']"));
      
	  Scheme_for_the_establishment_of_Hi_Tech.click();	
						     
	  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		   					     
	  WebElement More_Info18 = driver.findElement(By.xpath("//a[@href='http://pashudhanharyana.gov.in/schemes']"));
						        
	  More_Info18.click();
	  
	  Thread.sleep(10000);
	  		 		 		      
	  Set<String> handles18 = driver.getWindowHandles();
				      
    Iterator it18 = handles18.iterator();
	
   String Parent_id18 = (String) it18.next();
				      
   String Child_Id18 = (String) it18.next();
					     
   driver.switchTo().window(Child_Id18).close();
					      
   driver.switchTo().window(Parent_id18); 
   
   driver.navigate().back();		     
   
	}
}
