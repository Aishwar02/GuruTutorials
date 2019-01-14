package Page;

    
	import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
	
	public class Guru {

	
	WebDriver driver ;
	
	   public  Guru(WebDriver driver)
	   {
		this.driver =driver;
	   }
	   
	   @FindBy(linkText="Selenium")
	   
	   WebElement CourseSelenium;
	   
	   @FindBy(xpath="//h1[@itemprop='headline']")
	   
	   WebElement header;
	   
	   @FindBy(linkText="Java")
	   
	   WebElement CourseJava;
	   
	  public String SelectCourse(String courserequired)
	  
	  {
		  
		  if(courserequired.equalsIgnoreCase("java"))
		  {
			  CourseJava.click();
		  }
		  else
		  {
			  CourseSelenium.click();
		  }
		  
		  
		 String s = header.getText();
		 return s;
		  
	  }

	
	}

