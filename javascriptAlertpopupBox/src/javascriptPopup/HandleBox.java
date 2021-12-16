package javascriptPopup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HandleBox 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:/Users/LENOVO/Downloads/chromedriver_win32 (1)/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		ChromeOptions options=new ChromeOptions();
		options.addArguments("incognito");
		driver.navigate().to("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		System.out.println(driver.getPageSource());
		driver.findElement(By.xpath("//button[@class=\"btn btn-default\"]")).click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Alert alt=driver.switchTo().alert();
		alt.accept();
		driver.close();
		System.out.println("javascript alert box popup handled at runtime");
		

	}

}
