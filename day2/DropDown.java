package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/.");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("democsr2");
	    driver.findElement(By.id("password")).sendKeys("crmsfa");
	    driver.findElement(By.className("decorativeSubmit")).click();
	    driver.findElement(By.linkText("CRM/SFA")).click();// //a[contains(text(),'CRM')]
	    driver.findElement(By.linkText("Leads")).click();
	    driver.findElement(By.linkText("Create Lead")).click();
	    driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
	    driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Anandita");
	    driver.findElement(By.id("createLeadForm_lastName")).sendKeys("S");
	    WebElement sourceDD   = driver.findElement(By.id("createLeadForm_dataSourceId"));
	    Select sel = new Select(sourceDD);
	    sel.selectByIndex(4);
	    WebElement sourceDD1= driver.findElement(By.id("createLeadForm_marketingCampaignId"));
	    Select sel1= new Select(sourceDD1);
	    sel1.selectByVisibleText("Demo Marketing Campaign");
	    WebElement sourceDD2= driver.findElement(By.id("createLeadForm_ownershipEnumId"));
	    Select sel2= new Select(sourceDD2);
	    sel2.selectByValue("OWN_SCORP");
	    driver.findElement(By.className("smallSubmit")).click();
	    System.out.println(driver.getTitle());
	    driver.close();
	    /* using x path 
	    Basic xpath:

	    	1)AttributeBasedXpath:
	    	syn://tagName[@attribute='attribute value']
	    	eg)//input[@id='username']
	    	2)Text based xpath:
	    	syn://tagName[text()='text value']
	    	eg)//a[text()='Leads']
	    	3)partial attribute xpath:
	    	syn://tagname[contains(@attibute,'attribute value')]
	    	eg)//input[contains(@class,'Submit')]
	    	4)partial textbased xpath:
	    	syn://tagName[contains(text(),'text value ')]
	    	eg)//a[contains(text(),'CRM')]
	    	5)collection based xpath
	    	syn:(//tagName[@attribute='attribute value'])[2]
	    	eg)(//input[@class='inputLogin'])[2]*/
	 
	    
	    
	}

}
