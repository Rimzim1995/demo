package monu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class selenium {
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\techbodhi\\exes\\chromedriver.exe");
	 driver =new ChromeDriver() ;
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("pass")).sendKeys("prachifatturi");;
Thread.sleep(1000);
		driver.findElement(By.id("email")).sendKeys("8959393415");
		driver.findElement(By.name("login")).click();

		driver.findElement(By.xpath("//span[text()='Next']")).click();
		driver.findElement(By.xpath("//div[@aria-label='Get Started']/div[1]")).click();


		//	driver =new ChromeDriver();
		
	//	driver.navigate().to("https://twitter.com/?lang=en-in");
	  //  Thread.sleep(1000);

    //driver1.close();
  //  driver.close();
   
	}

}
