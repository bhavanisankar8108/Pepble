package pebbles;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Signup {

 
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		WebDriver wd= new ChromeDriver();
		
		//Maximize window
		wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		wd.manage().window().maximize();
		
		// Checking the Functionality of given URL
				wd.get("https://pepble.com/#/signUp");
				String Actual=wd.getCurrentUrl();
				String Expected="https://pepble.com/#/signUp";
				Assert.assertEquals(Actual,Expected);
				if(Actual.equals(Expected))
				{
					System.out.println("The Actual URL meets condition of Expected URL");
				}
				else
				{
				System.out.println("The Actual URL meets condition of Expected URL");
				}
				
		
		//Sign up Functionality
		wd.findElement(By.xpath("//*[@id=\"app\"]/div/main/section/div/div[2]/form/fieldset/div[1]/div[1]/input")).sendKeys("BhavaniShankar");
		String Name =wd.findElement(By.xpath("//*[@id=\"app\"]/div/main/section/div/div[2]/form/fieldset/div[1]/div[1]/input")).getAttribute("value");
		System.out.println("Name  : "+Name);
		
		wd.findElement(By.xpath("//*[@id=\"app\"]/div/main/section/div/div[2]/form/fieldset/div[1]/div[2]/input")).sendKeys("9063514427");
		String Phone=wd.findElement(By.xpath("//*[@id=\"app\"]/div/main/section/div/div[2]/form/fieldset/div[1]/div[2]/input")).getAttribute("value");
		System.out.println("Mobile  : "+Phone);
	
		
		wd.findElement(By.xpath("//*[@id=\"app\"]/div/main/section/div/div[2]/form/fieldset/div[2]/div/input")).sendKeys("sankar@gmail.com");
		String Email=wd.findElement(By.xpath("//*[@id=\"app\"]/div/main/section/div/div[2]/form/fieldset/div[2]/div/input")).getAttribute("value");
		System.out.println("Email  : "+Email);
		
		
		//Xpath using Contains method
		wd.findElement(By.xpath("//*[contains(@type,'password')]")).sendKeys("Bhavani8108");
		String password=wd.findElement(By.xpath("//*[contains(@type,'password')]")).getAttribute("value");
		System.out.println("Password :"+password);
		
		
		// X path for Confirm Password  
		wd.findElement(By.xpath("//*[@id=\"app\"]/div/main/section/div/div[2]/form/fieldset/div[4]/div/input")).sendKeys("Bhavani8108");
		String ConfirmPassword= wd.findElement(By.xpath("//*[@id=\"app\"]/div/main/section/div/div[2]/form/fieldset/div[4]/div/input")).getAttribute("value");
		System.out.println("Confirm Password  :"+ConfirmPassword);
		
		
		//Xpath for SignUp Button Functionality
		wd.findElement(By.xpath("//*[contains(@class,'uk-button uk-button-primary')]")).click();
		
		Thread.sleep(9000);
		wd.close();
	}
	}

