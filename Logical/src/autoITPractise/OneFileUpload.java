package autoITPractise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OneFileUpload {

	public static void main(String[] args) throws Exception
	{
		WebDriver obj= new FirefoxDriver();
		obj.get("http://www.gmail.com");
		obj.findElement(By.id("identifierId")).sendKeys("devakee.rathour@gmail.com");
		Thread.sleep(5000);
		obj.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[2]/form/div[2]/div/div[2]/div[1]/content/span")).click();
		Thread.sleep(5000);
		obj.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[2]/form/div[2]/div/div/div[1]/div[1]/div/div[1]/div/div[1]/input")).sendKeys("sudinrathour");
		Thread.sleep(5000);
	    obj.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[2]/form/div[2]/div/div/div[2]/div[1]/content/span")).click();
	    Thread.sleep(5000);
	    obj.findElement(By.xpath("/html/body/div[7]/div[3]/div/div[2]/div[1]/div[1]/div[1]/div[2]/div/div/div/div[1]/div/div")).click();
	    Thread.sleep(5000);
	    obj.findElement(By.id(":ph")).click();
	    Thread.sleep(5000);
	    Runtime.getRuntime().exec("E:\\SeleniumSoftware\\AutoIT\\ExcuteFile\\GamilCompose.exe");
	    
		    
	}

}
