package com.mayab.calidad.cross;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;




import java.net.URL;
public class Crossbrowsertesting{
/* Este sera el que se muestre en la demostracion de la expo*/



	 public static final String URL = "https://melissapuertoa:c02caeee-3be1-4b9b-9b2a-b7fa2d454a52@ondemand.us-west-1.saucelabs.com:443/wd/hub";
	 
	 public static void main(String[] args) throws Exception {
	 
		 
		 /*
		  DesiredCapabilities caps = DesiredCapabilities.firefox();
		  
		    caps.setCapability("platform", "macOS 10.13");
		    caps.setCapability("version", "latest");
		    caps.setCapability("name", "80-cross-browser");
		    caps.setCapability("extendedDebugging", "true");
		    caps.setCapability("buildNumber", "3.0");
		    */

		 
		 DesiredCapabilities caps = DesiredCapabilities.chrome();
		    caps.setCapability("platform", "Windows 10");
		    caps.setCapability("platform", "Linux");
		    caps.setCapability("platform", "macOS 10.13");
		    caps.setCapability("version", "latest");
		    caps.setCapability("name", "Safari 11");
		    caps.setCapability("extendedDebugging", "true");
		    caps.setCapability("buildNumber", "3.0");
		    
		    
			    
		    WebDriver driver = new RemoteWebDriver(new java.net.URL(URL), caps);
		       driver.get("https://mern-crud.herokuapp.com");
		  
	    driver.findElement(By.xpath("//div[@id='root']/div/div[2]/button")).click();
	    driver.findElement(By.name("name")).click();
	    driver.findElement(By.name("name")).clear();
	    driver.findElement(By.name("name")).sendKeys("prueb");
	    driver.findElement(By.name("email")).click();
	    driver.findElement(By.name("email")).clear();
	    driver.findElement(By.name("email")).sendKeys("prueba1223@gmail.com");
	    driver.findElement(By.name("age")).click();
	    driver.findElement(By.name("age")).clear();
	    driver.findElement(By.name("age")).sendKeys("18");
	    driver.findElement(By.xpath("//div[3]/div[2]/div/div")).click();
	    driver.findElement(By.xpath("//div[3]/span")).click();
	    driver.findElement(By.xpath("//form/button")).click();
	    driver.findElement(By.xpath("//div[4]")).click();
	    driver.findElement(By.xpath("//div[4]/div/p")).click();
	    driver.findElement(By.xpath("//div[4]/div/p")).click();
	    // ERROR: Caught exception [ERROR: Unsupported command [doubleClick | //div[4]/div/p | ]]
	    driver.findElement(By.xpath("//div[4]/div/p")).click();
	    driver.findElement(By.xpath("//div[4]/div/p")).click();
	    driver.findElement(By.xpath("//div[4]/div/p")).click();
	    driver.findElement(By.xpath("//div[4]/div/p")).click();
	    driver.findElement(By.xpath("//div[4]/div/p")).click();
	    driver.findElement(By.xpath("//div[4]/div/p")).click();
	    driver.findElement(By.xpath("//div[4]/div/p")).click();
	    driver.findElement(By.xpath("//div[4]/div/p")).click();
	    driver.findElement(By.xpath("//div[4]/div/p")).click();
	    driver.findElement(By.xpath("//div[4]/div/p")).click();
	    driver.findElement(By.xpath("//div[4]/div/p")).click();
	    driver.findElement(By.xpath("//form/button")).click();
	    
	    String expected = "Successfully added!";
		String gotMessage="";
		WebElement result = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/form/div[4]/div/p"));
		gotMessage = result.getText();
		assertThat(expected,is(equalTo(gotMessage)));
		boolean finalResult = false;
		if(gotMessage.equals("Successfully added!")) {
			finalResult = true;
		}else {
			finalResult = false;
		}
		if (finalResult){
		      ((JavascriptExecutor)driver).executeScript("sauce:job-result=passed");
		    }
		    else {
		      ((JavascriptExecutor)driver).executeScript("sauce:job-result=failed");
		    }
		driver.quit();
		
	  }
}


