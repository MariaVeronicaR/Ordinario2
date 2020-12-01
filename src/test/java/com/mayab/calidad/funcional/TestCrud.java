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

  public void sleep(double d) {

      try {
          // Tiempo que va a dormir las funciones en milisegundos
          Thread.sleep((long) (d * 1000));
      } catch (InterruptedException ex) {}

  }
  
  @Before
  public void setUp() throws Exception {
//	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Usuario\\Desktop\\6to_semestre\\Calidad y pruebas de software\\chromedriver_win32\\chromedriver.exe");
//	    driver = new ChromeDriver();
//	    baseUrl = "https://www.google.com/";
//	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
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
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/form/div[1]/div/input")).click();
	    driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/form/div[1]/div/input")).clear();
	    driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/form/div[1]/div/input")).sendKeys("Veeervonica");
	    driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/form/div[2]/div/input")).click();
	    driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/form/div[2]/div/input")).clear();
	    driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/form/div[2]/div/input")).sendKeys("Vervevvveonica@gmail.com");
	    driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/form/div[3]/div[1]/div/input")).click();
	    driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/form/div[3]/div[1]/div/input")).clear();
	    driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/form/div[3]/div[1]/div/input")).sendKeys("18");
	    sleep(1.2);
	    driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/form/button")).click();
	    sleep(1.2);
	    assertEquals("Successfully added!", driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/form/div[4]/div/p")).getText());
		
  }
  
  @Test
  public void edit() throws Exception {
	  driver.get("https://mern-crud.herokuapp.com/");
	  driver.findElement(By.xpath("//div[@id='root']/div/div[2]/table/tbody/tr/td[5]/button")).click();
	    driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/form/div[1]/div/input")).click();
	    driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/form/div[1]/div/input")).clear();
	    driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/form/div[1]/div/input")).sendKeys("prueffba");
	    driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/form/div[2]/div/input")).click();
	    driver.findElement(By.xpath("//div[2]/div/div[2]")).click();
	    driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/form/div[2]/div/input")).clear();
	    driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/form/div[2]/div/input")).clear();
	    driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/form/div[2]/div/input")).sendKeys("prueffba2@gmail.com");
	    sleep(1.2);
	    driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/form/button")).click(); 
	    sleep(1.2);


	    
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
