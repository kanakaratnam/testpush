package excelReadandWrite;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExcelRead {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\ratnam1\\chromedriver_win32\\78 version\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver d=new ChromeDriver();
		d.get("http://google.com");
		d.manage().window().maximize();
		WebElement e=d.findElement(By.name("q"));
		WebDriverWait wait =new WebDriverWait(d, 2000);
		e.sendKeys("gmail.com");
		Thread.sleep(5000);
		for (int i = 0; i <=8; i++) 
		{
			e.sendKeys(Keys.DOWN);
			String s=e.getAttribute("value");
			System.out.println(s);
			if (s.equalsIgnoreCase("gmail.com sign in")) 
			{	
				Thread.sleep(5000);
				e.sendKeys(Keys.ENTER);
				break;
			}
		}
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Google Login - Sign in - Google Accounts']")));
		d.findElement(By.xpath("//*[text()='Google Login - Sign in - Google Accounts']")).click();
		
		Thread.sleep(5000);
		d.findElement(By.id("identifierId")).sendKeys("kanakaratnam4a2");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Next']")));

		d.findElement(By.xpath("//*[text()='Next']")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("password")));
		d.findElement(By.name("password")).sendKeys("ratnam@833");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Next']")));

		d.findElement(By.xpath("//*[text()='Next']")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Next']")));
		d.findElement(By.xpath("//*[@class='DPvwYc vYZd7']")).click();
	}

}
