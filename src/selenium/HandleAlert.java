package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAlert {

	public static void main(String[] args) {

		
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://demo.automationtesting.in/Alerts.html");
			
			String b= driver.getTitle();
			
			System.out.println(b);
			
			driver.findElement(By.xpath("//*[@class=\"btn btn-danger\"]")).click();
			
			Alert alert =driver.switchTo().alert();
			String a =driver.getWindowHandle();
			System.out.println(a);
			alert.accept();
			
			driver.findElement(By.xpath("//*[text()=\"Alert with OK & Cancel \"]")).click();
			
			driver.findElement(By.xpath("//*[text()=\"click the button to display a confirm box \"]")).click();
			
			//String a= driver.getTitle();
			
			//System.out.println(a);
			
			driver.switchTo().alert().accept();
			
			driver.findElement(By.xpath("//*[@href='#Textbox']")).click();
			
			driver.findElement(By.xpath("//*[text()=\"click the button to demonstrate the prompt box \"]")).click();
			
			alert.sendKeys("TextEntered");
			
			alert.accept();
			
		//	driver.close();
			
			
			
			
			
	}

}
