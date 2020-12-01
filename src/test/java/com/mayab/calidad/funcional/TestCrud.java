package com.mayab.calidad.funcional;

import static org.junit.Assert.*;


import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.runners.MethodSorters;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.openqa.selenium.support.ui.Select;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class TestCrud {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();


  @Before
  public void setUp() throws Exception {
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\melis\\Music\\quality\\chromedriver_win32\\chromedriver.exe");
//
//    driver = new ChromeDriver();
//    baseUrl = "https://www.google.com/";
//    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//    
    
	  
	  baseUrl = "https://mern-crud.herokuapp.com";
			
			System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
			
			driver = new ChromeDriver();
			
			driver.manage().deleteAllCookies();
			
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			
  }
  

  @Test
  public void atestUntitledTestCase() throws Exception {
    driver.get("https://mern-crud.herokuapp.com/");
    driver.findElement(By.xpath("//div[@id='root']/div/div[2]/button")).click();
    driver.findElement(By.name("name")).click();
    driver.findElement(By.name("name")).clear();
    driver.findElement(By.name("name")).sendKeys("pruueba1");
    driver.findElement(By.name("email")).click();
    driver.findElement(By.name("email")).clear();
    driver.findElement(By.name("email")).sendKeys("123@123.com");
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

   String compare= driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/form/div[4]/div/p")).getText();
   
	assertEquals("Nice one!", compare);
  }
  

  @Test
  public void btestretrieve() throws Exception {
	  String expected = "Pruueba1 123@123.com 18 EditDelete";
	    driver.get("https://mern-crud.herokuapp.com/");
	    String comp1=driver.findElement(By.xpath("/html/body/div/div/div[2]/table/tbody/tr[1]")).getText();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	    assertEquals(expected, comp1);
		
  }
 
  
  @Test
  public void ctesteditar() throws Exception {
	  driver.get("https://mern-crud.herokuapp.com/");
	  driver.findElement(By.xpath("//div[@id='root']/div/div[2]/table/tbody/tr/td[5]/button")).click();
	    driver.findElement(By.name("name")).click();
	    driver.findElement(By.name("name")).clear();
	    driver.findElement(By.name("name")).sendKeys("edit");
	    driver.findElement(By.name("email")).click();
	    driver.findElement(By.xpath("//div[2]/div/div[2]")).click();
	    driver.findElement(By.name("email")).clear();
	    driver.findElement(By.name("email")).sendKeys("editar@absc.com");
	    driver.findElement(By.xpath("//div[3]/div[2]/div/div")).click();
	    driver.findElement(By.xpath("//div[3]/span")).click();
	    driver.findElement(By.xpath("//form/button")).click();
	    driver.findElement(By.xpath("//div[4]")).click();
	    driver.findElement(By.xpath("//div[4]/div/p")).click();
	    driver.findElement(By.xpath("//div[4]/div/p")).click();
	    driver.findElement(By.xpath("//div[4]/div/p")).click();
	    driver.findElement(By.xpath("//div[4]/div/p")).click();
	    driver.findElement(By.xpath("//form/button")).click();

	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	    String comparee= driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/form/div[4]/div/p")).getText();

	    assertEquals("Successfully updated!", comparee);
		
  }
 
  
  @Test
  public void delete() throws Exception {

	  	boolean bandera=true;
	  
	    driver.get("https://mern-crud.herokuapp.com/");
	    String comp1=driver.findElement(By.xpath("/html/body/div/div/div[2]/table/tbody/tr[1]")).getText();
	    driver.findElement(By.xpath("//div[@id='root']/div/div[2]/table/tbody/tr/td[5]/button[2]")).click();
	    driver.findElement(By.xpath("//div[3]/button")).click();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    String comp2=driver.findElement(By.xpath("/html/body/div/div/div[2]/table/tbody/tr[1]")).getText();
	    
	    if (comp1==comp2) {
	    	bandera=false;
	    }

	    assertEquals(bandera, true);
		
  }

  @After
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}

