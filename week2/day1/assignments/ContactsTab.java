package week2.day1.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ContactsTab {

	public static void main(String[] args) {
		// Launch Browser
		ChromeDriver driver = new ChromeDriver();
		
		//Launch URL
		driver.get("http://leaftaps.com/opentaps/control/login");
		
		//Maximize Window
		driver.manage().window().maximize();
		
		//UserName & Password
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		//Click on Log In Button
		driver.findElement(By.className("decorativeSubmit")).click();
		
		//Click on CRM/SFA Link
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		
		//Click on Contacts Tab
		driver.findElement(By.linkText("Contacts")).click();
		
		//Click on Create Contact Menu
		driver.findElement(By.linkText("Create Contact")).click();
		
		//Enter First Name
		driver.findElement(By.id("firstNameField")).sendKeys("Priya");
		
		//Enter Last Name
		driver.findElement(By.id("lastNameField")).sendKeys("N");
		
		//Click on Create Contact Button
		driver.findElement(By.name("submitButton")).click();
		
		//Print the New First Name
		String fname = driver.findElement(By.id("viewContact_firstName_sp")).getText();
		System.out.println(fname);
		
		//Print Browser Title
		System.out.println(driver.getTitle());
		
		//Close the Browser
		driver.close();
	}

}
