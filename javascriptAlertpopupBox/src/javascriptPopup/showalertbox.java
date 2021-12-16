package javascriptPopup;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class showalertbox 
{

	public static void main(String[] args) throws InterruptedException
{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:/Users/LENOVO/Downloads/chromedriver_win32 (1)/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://testpages.herokuapp.com/styled/alerts/alert-test.html");
		driver.manage().window().maximize();
		driver.findElement(By.className("styled-click-button")).click();
		Thread.sleep(5000);
		Alert alt=driver.switchTo().alert();
		System.out.println(alt.getText());
		Thread.sleep(5000);
		alt.accept();
		Thread.sleep(5000);
		System.out.println(driver.getTitle());
		System.out.println("succesfully handled");
		driver.close();
		

	}

}
