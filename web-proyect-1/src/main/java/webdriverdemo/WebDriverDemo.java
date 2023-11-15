package webdriverdemo;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverDemo {
	WebDriver driver;
	
   @Before
   public void setUp() {
       // Configuración previa a la ejecución de cada prueba
       //System.setProperty("webdriver.chrome.driver", "ruta/del/chromedriver");
       driver = new ChromeDriver();
       driver.manage().window().maximize();
       driver.get("http://www.calculator.net/");
	   // Click on Math Calculators
	   driver.findElement(By.xpath("//*[@id=\"homelistwrap\"]/div[3]/div[2]/a")).click();
	      
	    // Click on Percent Calculators
	   driver.findElement(By.xpath("//*[@id=\"content\"]/table[2]/tbody/tr/td/div[3]/a")).click();
   }
   
   @Test
   public void testPositives() {
	      
	      // Enter value 10 in the first number of the percent Calculator
	      driver.findElement(By.id("cpar1")).sendKeys("10");
	      
	      // Enter value 50 in the second number of the percent Calculator
	      driver.findElement(By.id("cpar2")).sendKeys("50");
	      
	      // Click Calculate Button
	      driver.findElement(By.xpath("//*[@id=\"content\"]/form[1]/table/tbody/tr[2]/td/input[2]")).click();

	      
	      // Get the Result Text based on its xpath
	      String result =
	         driver.findElement(By.xpath(".//*[@id = 'content']/p[2]/font/b")).getText();

	      // ASSERTS
	      assertEquals("5",result);
   }
   
   @Test
   public void testNegatives() {
	      
	      // Enter value 10 in the first number of the percent Calculator
	      driver.findElement(By.id("cpar1")).sendKeys("10");
	      
	      // Enter value -50 in the second number of the percent Calculator
	      driver.findElement(By.id("cpar2")).sendKeys("-50");
	      
	      // Click Calculate Button
	      driver.findElement(By.xpath("//*[@id=\"content\"]/form[1]/table/tbody/tr[2]/td/input[2]")).click();

	      
	      // Get the Result Text based on its xpath
	      String result =
	         driver.findElement(By.xpath(".//*[@id = 'content']/p[2]/font/b")).getText();

	      // ASSERTS
	      assertEquals("-5",result);   
   }
   
   @Test
   public void testZeroPercentage() {
	      
	      // Enter value 10 in the first number of the percent Calculator
	      driver.findElement(By.id("cpar1")).sendKeys("10");
	      
	      // Enter value 0 in the second number of the percent Calculator
	      driver.findElement(By.id("cpar2")).sendKeys("0");
	      
	      // Click Calculate Button
	      driver.findElement(By.xpath("//*[@id=\"content\"]/form[1]/table/tbody/tr[2]/td/input[2]")).click();

	      
	      // Get the Result Text based on its xpath
	      String result =
	         driver.findElement(By.xpath(".//*[@id = 'content']/p[2]/font/b")).getText();
 
	      // ASSERTS
	      assertEquals("0",result);   
   }
 
   @Test
   public void testPercentageOfNegaive() {
	      
	      // Enter value -10 in the first number of the percent Calculator
	      driver.findElement(By.id("cpar1")).sendKeys("-10");
	      
	      // Enter value 50 in the second number of the percent Calculator
	      driver.findElement(By.id("cpar2")).sendKeys("50");
	      
	      // Click Calculate Button
	      driver.findElement(By.xpath("//*[@id=\"content\"]/form[1]/table/tbody/tr[2]/td/input[2]")).click();

	      
	      // Get the Result Text based on its xpath
	      String result =
	         driver.findElement(By.xpath(".//*[@id = 'content']/p[2]/font/b")).getText();
 
	      // ASSERTS
	      assertEquals("-5",result);   
   }

   @Test
   public void testUnknownPercentage() {
	      
	      // Enter the variable 'x' in the first number of the Percentage Calculator
	      driver.findElement(By.id("cpar1")).sendKeys("x");
	      
	      // Enter value 50 in the second number of the percent Calculator
	      driver.findElement(By.id("cpar2")).sendKeys("50");
	      
	      // Enter value 5 in the third number of the percent Calculator
	      driver.findElement(By.id("cpar3")).sendKeys("5");
	      
	      // Click Calculate Button
	      driver.findElement(By.xpath("//*[@id=\"content\"]/form[1]/table/tbody/tr[2]/td/input[2]")).click();

	      
	      // Get the Result Text based on its xpath
	      String result =
	         driver.findElement(By.xpath(".//*[@id = 'content']/p[2]/font/b")).getText();
	  
	      // ASSERTS
	      assertEquals("10%",result);   
   }

   @Test
   public void testUnknownNumberPercentage() {
	      
	      // Enter value 10 in the first number of the percent Calculator
	      driver.findElement(By.id("cpar1")).sendKeys("10");
	      
	      // Enter the variable 'x' in the second number of the Percentage Calculator
	      driver.findElement(By.id("cpar2")).sendKeys("x");
	      
	      // Enter value 5 in the third number of the percent Calculator
	      driver.findElement(By.id("cpar3")).sendKeys("5");
	      
	      // Click Calculate Button
	      driver.findElement(By.xpath("//*[@id=\"content\"]/form[1]/table/tbody/tr[2]/td/input[2]")).click();

	      
	      // Get the Result Text based on its xpath
	      String result =
	         driver.findElement(By.xpath(".//*[@id = 'content']/p[2]/font/b")).getText();
     
	      // ASSERTS
	      assertEquals("50",result);   
   }

   @After
   public void tearDown() {
	   if (driver != null) {
		   driver.quit();
	   }
   }
   
   
   public static void main(String[] args) {
   	//Set up web driver (chrome, firefox,...)
	//System.setProperty("webdriver.gecko.driver", "C:\\...\\Selenium\\Selenium WebDriver\\Java\\Libs\\geckodriver-v0.23.0-win32\\geckodriver.exe");
	   
	WebDriver driver = new ChromeDriver();
      //Puts an Implicit wait, Will wait for 10 seconds before throwing exception
      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
      
      //Launch website
      driver.navigate().to("http://www.calculator.net/");
      
      //Maximize the browser
      driver.manage().window().maximize();
      
      // Click on Math Calculators
      driver.findElement(By.xpath("//*[@id=\"homelistwrap\"]/div[3]/div[2]/a")).click();
      
      // Click on Percent Calculators
      driver.findElement(By.xpath("//*[@id=\"content\"]/table[2]/tbody/tr/td/div[3]/a")).click();
      
      // Enter value 10 in the first number of the percent Calculator
      driver.findElement(By.id("cpar1")).sendKeys("10");
      
      // Enter value 50 in the second number of the percent Calculator
      driver.findElement(By.id("cpar2")).sendKeys("50");
      
      // Click Calculate Button
      driver.findElement(By.xpath("//*[@id=\"content\"]/form[1]/table/tbody/tr[2]/td/input[2]")).click();

      
      // Get the Result Text based on its xpath
      String result =
         driver.findElement(By.xpath(".//*[@id = 'content']/p[2]/font/b")).getText();
    //*[@id="content"]/p[2]/font/b

      
      // Print a Log In message to the screen
      System.out.println(" The Result is " + result);
      
      //Close the Browser.
      driver.close();
   }
}