package week2.day1.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DuplicateLead {

	public static void main(String[] args) {
		// Launch Browser
		ChromeDriver driver = new ChromeDriver();
		
		//Launch URL
		driver.get("http://leaftaps.com/opentaps/control/login");
		
		//UserName & Password
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		//Click on Log In Button
		driver.findElement(By.className("decorativeSubmit")).click();
		
		//Click on CRM/SFA Link
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		
		//Click on Leads Tab
		driver.findElement(By.linkText("Leads")).click();
		
		//Click on Create Lead
		driver.findElement(By.linkText("Create Lead")).click();
		
		//Enter Company Name
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		
		//Enter First Name Field using id Locator
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Priya");
		
		//Enter Last Name Field using id Locator
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("N");
		
		//Enter Department Name
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Software Testing");
		
		//Enter Description
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Responsible for the quality of software development and deployment");
		
		//Enter E-Mail ID
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("priyanaren0111@gmail.com");
		
		//Click on Create Lead Button
		driver.findElement(By.className("smallSubmit")).click();
		
		//Get the Title of Resulting Page
		String currenttitle = driver.getTitle();
		System.out.println(currenttitle);
		
		//Click on the Duplicate Lead Button
		driver.findElement(By.linkText("Duplicate Lead")).click();
		
		//Clear the Company Name Field
		driver.findElement(By.name("companyName")).clear();
		
		//Enter New First Name
		driver.findElement(By.id("createLeadForm_firstName")).clear();
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Priyaa");
		
		//Click On Create Lead Button
		driver.findElement(By.name("submitButton")).click();
		
		//Printing Title of Resulting Page
		System.out.println(driver.getTitle());
		
	}

}
