package PracticeProject;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class PracticeScript extends ReusableMethods{
	
/*public static void main(String[] args)

{
	System.out.println("Test cases start");
	
}	*/
	
	@Test
	public static void LoginErrorMessage() throws InterruptedException
	{

		InitializeDriver();
		driver.get("https://login.xero.com/");
	    driver.manage().window().maximize();
	    
	    WebElement username = driver.findElement(By.xpath("//input[@id='email']"));
	    enterText(username,"selenium88priyanka@gmail.com","UserName");
	    System.out.println("UserName sucessfully entered");
	    
	    WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
	    enterText(password,"pri88selenium","Password");
	    System.out.println("Password sucessfully entered");
	    
	    WebElement login = driver.findElement(By.xpath("//button[@id='submitButton']"));
	    clickElement(login,"Login");
	    System.out.println("Login clicked sucessfully");
	    
	    
       Thread.sleep(3000);	
       driver.close();
       CloseTC();
	}
	
	

	    
}
	
	


