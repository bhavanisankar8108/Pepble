package pebbles;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Pebble_login {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		WebDriver wd= new ChromeDriver();
		
		wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		wd.manage().window().maximize();
		
		// Checking the Functionality of given URL
		wd.get("https://pepble.com/#/signIn");
		String Actual=wd.getCurrentUrl();
		String Expected="https://pepble.com/#/signIn";
		Assert.assertEquals(Actual,Expected);
		if(Actual.equals(Expected))
		{
			System.out.println("The Actual URL meets condition of Expected URL");
		}
		else
		{
		System.out.println("The Actual URL meets condition of Expected URL");
		}
		
		// Username 
		wd.findElement(By.xpath("//input[contains(@type,'text')]")).sendKeys("sankar@gmail.com");
		String usr=wd.findElement(By.xpath("//input[contains(@type,'text')]")).getAttribute("value");
		System.out.println("USERNAME  :"+usr);
		
		
		//Password
		wd.findElement(By.xpath("//input[contains(@type,'password')]")).sendKeys("Bhavani8108");
		String pass=wd.findElement(By.xpath("//input[contains(@type,'password')]")).getAttribute("value");
		System.out.println("PASSWORD  :"+pass);
		//Login Button Functionality
		
		//wd.findElement(By.xpath("//*[contains(@type,'submit')]")).click();
		wd.findElement(By.xpath("//*[@id=\"app\"]/div/main/section/div/div[2]/form[1]/fieldset/div[4]/button")).click();
		
		Thread.sleep(9000);
		wd.close();
		
		
		
	}

}
