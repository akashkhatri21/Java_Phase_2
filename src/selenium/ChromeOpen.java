package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

public class ChromeOpen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeOptions options= new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		
		WebDriver driver= new ChromeDriver(options);
		driver.get("https://www.facebook.com/login/");
		
		driver.manage().window().maximize();
		//driver.equals(driver  );
	}

}
