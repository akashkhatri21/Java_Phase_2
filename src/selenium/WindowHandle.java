package selenium;

import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WindowHandle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver= new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Windows.html");
		
		
		driver.findElement(By.xpath("//*[text()=\"Open Seperate Multiple Windows\"]")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath(" //button[@onclick='multiwindow()']")).click();	
		
		Thread.sleep(3000);
		driver.findElement(By.xpath(" //button[@onclick='multiwindow()']")).click();
		
		Set<String> allWindowHandle=driver.getWindowHandles();
		
		System.out.println(allWindowHandle);
	}

}
