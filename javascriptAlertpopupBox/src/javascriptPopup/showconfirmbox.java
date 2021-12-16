package javascriptPopup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class showconfirmbox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//The following button will display a confirm dialog when clicked.
		System.setProperty("webdriver.chrome.driver","C:/Users/LENOVO/Downloads/chromedriver_win32 (1)/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://testpages.herokuapp.com/styled/alerts/alert-test.html");
		driver.manage().window().maximize();
		//ACCEPT the popup
		driver.findElement(By.xpath("(//input[@class=\"styled-click-button\"])[2]")).click();
		Alert alt=driver.switchTo().alert();
		System.out.println(alt.getText());
		Thread.sleep(10000);
		alt.accept();
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//DISMISS the popup
		driver.findElement(By.xpath("(//input[@class=\"styled-click-button\"])[2]")).click();
		Alert alt1=driver.switchTo().alert();
		System.out.println(alt1.getText());
		Thread.sleep(10000);
		alt1.dismiss();
		System.out.println("succesfully handled");
		driver.close();
		
		
		

	}

}
