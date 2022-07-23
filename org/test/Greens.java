package org.test;

import java.awt.AWTException;
import java.awt.RenderingHints.Key;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Greens {
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\eclipse-workspace\\SeleniumDay3\\chrome\\chromedriver.exe");
		
		
		WebDriver driver=new ChromeDriver();
		
	 
		driver.get("http://greenscart.in/#/login?returnUrl=%2F");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		
		WebElement findtext = driver.findElement(By.id("loginEmailId"));
		findtext.sendKeys("gowrisankar431@gmail.com");
		
		WebElement findtext1= driver.findElement(By.id("loginPassword"));
		findtext1.sendKeys("Gaw91@");
		
		
		WebElement textlogin = driver.findElement(By.xpath("//input[@value='Login']"));
		textlogin.click();
		Thread.sleep(7000);
		Actions action=new Actions(driver);
		WebElement findsearch = driver.findElement(By.id("typeahead-basic"));
		findsearch.sendKeys("Realme",Keys.ENTER);
	//	WebElement find = driver.findElement(By.xpath("//button[@class='btn btn-outline-secondary']"));
		Thread.sleep(5000);
	//	find.click();
		Robot robat=new Robot();
	
		robat.keyPress(KeyEvent.VK_DOWN);
		robat.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(5000);
		
	//	robat.keyPress(KeyEvent.VK_DOWN);
	//	robat.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(5000);
		robat.keyPress(KeyEvent.VK_ENTER);
		robat.keyRelease(KeyEvent.VK_ENTER);
		
		WebElement addcard = driver.findElement(By.xpath("//button[text()='Buy Now']"));
		Actions act=new Actions(driver);
		act.doubleClick(addcard).perform();
		WebElement addgift = driver.findElement(By.xpath("//button[text()='ADD GIFT CODE']"));
		addgift.click();
		Thread.sleep(5000);
		WebElement promo = driver.findElement(By.xpath("//span[text()='GRN10']"));
		Actions act1=new Actions(driver);
		act1.doubleClick(promo).perform();
		System.out.println("hi");
		

}}
