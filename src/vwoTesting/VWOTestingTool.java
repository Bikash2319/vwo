package vwoTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VWOTestingTool {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://vwo.com/");
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.findElement(By.xpath("//button[text()='Try VWO for Free']")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.id("modal-v1-step1-email")).sendKeys("bikashsahoo595@gmail.com");
		driver.findElement(By.id("modal-472cu-gdpr-consent-checkbox")).click();
		driver.findElement(By.xpath("//button[text()='Start Now']")).click();
        Thread.sleep(2000);
		
		driver.findElement(By.id("modal-v1-fname")).sendKeys("Bikash");
		driver.findElement(By.id("modal-v1-lname")).sendKeys("Sahoo");
		driver.findElement(By.id("modal-v1-pnumber")).sendKeys("8249073673");
		driver.findElement(By.id("modal-v1-pwd")).sendKeys("Pass@1234");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//button[text()='create account']")).click();
		
	

	}

}
