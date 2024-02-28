package com.web.search;

import java.util.*;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class FlightSearch {


	public static void main(String[] args) throws InterruptedException {

		//Chrome browser

		System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver chromeDriver = new ChromeDriver();


		chromeDriver.get("https://www.makemytrip.com/");
		System.out.println("Make My Trip: " + chromeDriver.getTitle());


		//chromeDriver.findElement(By.name("chNavIcon appendBottom2 chSprite chHotels")).click();
		//.xpath("a[@class='primaryBtn font24 latoBold widgetSearchBtn ']
		//System.out.println(By.tagName("a").name("widgetSearchBtn "));
		System.out.println(" before click current url:: "+chromeDriver.getCurrentUrl()); 
		WebDriverWait wait2 = new WebDriverWait(chromeDriver, 10);
		WebElement element2 = wait2.until(ExpectedConditions.visibilityOfElementLocated(By.className("widgetSearchBtn")));
		element2.click();
		//chromeDriver.findElement(By.className("widgetSearchBtn")).click();

		// new WebDriverWait(chromeDriver, 0) 

		WebDriverWait wait = new WebDriverWait(chromeDriver, 20);
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("overlayCrossIcon")));
		element.click();
		
		//trip type //li[normalize-space()='Round Trip']
		System.out.println("set trip type");
		//chromeDriver.findElement(By.id("tripType-backDrop")).click();
		//chromeDriver.findElement(By.xpath("//li[normalize-space()='Round Trip']")).click();
		//chromeDriver.findElement(By.xpath("//li[normalize-space()='Round Trip']")).click();


		chromeDriver.findElement(By.id("fromCity")).click();		    
		System.out.println("Sendkeys Pune");
		chromeDriver.findElement(By.xpath("//input[@placeholder='Enter City']")).sendKeys("Pune, India");
		chromeDriver.findElement(By.xpath("//p[normalize-space()='Pune, India']")).click();


		chromeDriver.findElement(By.id("toCity")).click();
		System.out.println("Sendkeys Hyderabad");
		chromeDriver.findElement(By.xpath("//input[@placeholder='Enter City']")).sendKeys("Hyderabad, India");
		chromeDriver.findElement(By.xpath("//li[@id='react-autowhatever-1-section-0-item-0']//div//div[@class='makeFlex spaceBtwCenter']//div[@class='makeFlex']//div//p[@class='makeFlex blackText'][normalize-space()='Hyderabad, India']")).click();

		System.out.println("click on departure to set date");	   	
		System.out.println("set date");
		//chromeDriver.findElement(By.id("departure")).click();
		chromeDriver.findElement(By.xpath("//div[@aria-label='Thursday, 29 February 2024']//p[contains(text(),'29')]")).click();
		
		System.out.println("click on Return to set date");
		chromeDriver.findElement(By.id("return")).click();
		chromeDriver.findElement(By.xpath("//div[contains(@aria-label,'Sunday, 3 March 2024')]")).click();
		
		System.out.println("Passneger deatils");
		chromeDriver.findElement(By.id("travellerAndClass")).click();		
		//System.out.println("Select Adults");
		//chromeDriver.findElement(By.xpath("//li[contains(@class,'selected')][normalize-space()='2']")).click();
		//System.out.println("now select economy");
		//chromeDriver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[2]/header[1]/div[1]/div[1]/div[7]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[2]")).click();
		
		//passneger detalis not working


		WebDriverWait wait1 = new WebDriverWait(chromeDriver, 10);
		WebElement element1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("search-button")));
		element1.click();

		//  chromeDriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		//chromeDriver.navigate().refresh();
		// Thread.sleep(20000);
		//chromeDriver.findElement(By.className("viewAllCta")).click();
		/* WebDriver flightPage = null;
	    for (String handle : chromeDriver.getWindowHandles()) {

	    	System.out.println("handle: "+handle);
	    	flightPage = chromeDriver.switchTo().window(handle);
	    	}
		 */

		System.out.println(" after click current url:: "+chromeDriver.getCurrentUrl()); 
		// chromeDriver.findElement(By.className("viewAllCta")).getText();
		//  System.out.println(flightPage.findElement(By.className("airlineName")).getText());
		System.out.println(" after click current url:: "+chromeDriver.getCurrentUrl()); 
		//airlineName
	}








	//  chromeDriver.navigate().back();
	//    System.out.println("Navigated back. Title: " + chromeDriver.getTitle());



	// Close all the browsers
	//	     chromeDriver.quit();


}








