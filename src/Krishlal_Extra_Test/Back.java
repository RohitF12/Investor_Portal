package Krishlal_Extra_Test;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;


public class Back {
	
	static WebDriver driver;
	
	public static void main(String[]args) {
		
	
	     
	      Set<String> handles = driver.getWindowHandles();
	      
	      Iterator it = handles.iterator();
	 
	      String Parent_id = (String) it.next();
	      
	      String Child_Id = (String) it.next();
	           
	      driver.switchTo().window(Child_Id).close(); 
	      
	      driver.navigate().back();
	}

}
