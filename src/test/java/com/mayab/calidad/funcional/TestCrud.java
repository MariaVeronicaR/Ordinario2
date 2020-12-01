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
import org.openqa.selenium.support.ui.Select;



public class TestCrud {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();


  @Before
  public void setUp() throws Exception {
	  
	  		baseUrl = "https://mern-crud.herokuapp.com";
			System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
			driver = new ChromeDriver();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
  }

  
  @Test
  public void add() throws Exception {

	  
	    driver.get("https://mern-crud.herokuapp.com/");
	    driver.findElement(By.xpath("//div[@id='root']/div/div[2]/button")).click();
	    driver.findElement(By.name("name")).click();
	    driver.findElement(By.name("name")).clear();
	    driver.findElement(By.name("name")).sendKeys("Veronica");
	    driver.findElement(By.name("email")).click();
	    driver.findElement(By.name("email")).clear();
	    driver.findElement(By.name("email")).sendKeys("Veronica@gmail.com");
	    driver.findElement(By.name("age")).click();
	    driver.findElement(By.name("age")).clear();
	    driver.findElement(By.name("age")).sendKeys("18");
	    driver.findElement(By.xpath("//div[3]/div[2]/div/div")).click();
	    driver.findElement(By.xpath("//div[3]/span")).click();
	    driver.findElement(By.xpath("//form/button")).click();
	    driver.findElement(By.xpath("//div[4]")).click();
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
	    driver.findElement(By.xpath("//div[4]/div/p")).click();
	    driver.findElement(By.xpath("//div[4]/div/p")).click();
	    driver.findElement(By.xpath("//form/button")).click();
	    
	    assertEquals("Successfully added!", driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/form/div[4]/div/p")).getText());
		
  }
  
  @Test
  public void edit() throws Exception {
	  driver.get("https://mern-crud.herokuapp.com/");
	  driver.findElement(By.xpath("//div[@id='root']/div/div[2]/table/tbody/tr/td[5]/button")).click();
	    driver.findElement(By.name("name")).click();
	    driver.findElement(By.name("name")).clear();
	    driver.findElement(By.name("name")).sendKeys("prueba");
	    driver.findElement(By.name("email")).click();
	    driver.findElement(By.xpath("//div[2]/div/div[2]")).click();
	    driver.findElement(By.name("email")).clear();
	    driver.findElement(By.name("email")).sendKeys("prueba2@gmail.com");
	    driver.findElement(By.xpath("//div[3]/div[2]/div/div")).click();
	    driver.findElement(By.xpath("//div[3]/span")).click();
	    driver.findElement(By.xpath("//form/button")).click();
	    driver.findElement(By.xpath("//div[4]")).click();
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
	    driver.findElement(By.xpath("//div[4]/div/p")).click();
	    driver.findElement(By.xpath("//div[4]/div/p")).click();
	    driver.findElement(By.xpath("//form/button")).click();
	    
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	    
	    assertEquals("Successfully updated!", driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/form/div[4]/div/p")).getText());
		
  }
  
  @Test
  public void retrieve() throws Exception {
	  String expected = "Pruueba1 123@123.com 18 EditDelete";
	    driver.get("https://mern-crud.herokuapp.com/");
	    String comp1=driver.findElement(By.xpath("/html/body/div/div/div[2]/table/tbody/tr[1]")).getText();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	    assertEquals(expected, comp1);
		
  }
 
  
  @Test
  public void delete() throws Exception {

	  	boolean prueba=true;
	  
	    driver.get("https://mern-crud.herokuapp.com/");
	    String correo=driver.findElement(By.xpath("/html/body/div/div/div[2]/table/tbody/tr[1]/td[2]")).getText();
	    driver.findElement(By.xpath("//div[@id='root']/div/div[2]/table/tbody/tr/td[5]/button[2]")).click();
	    driver.findElement(By.xpath("//div[3]/button")).click();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.get("https://mern-crud.herokuapp.com/");
	    String correo2=driver.findElement(By.xpath("/html/body/div/div/div[2]/table/tbody/tr[1]/td[2]")).getText();
	    System.out.println(correo);
	    System.out.println(correo2);

	    if (correo.equals(correo2)) {
	    	prueba=false;
	    }
	    
	    assertEquals(prueba, true);
		
  }
  
  @After
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

}
