package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Page.Guru;
import junit.framework.Assert;

public class TutorialTopic {
	
	WebDriver driver;
	String Coursetype;
	
	@Test
	public void Coursecheck()
	{
		Coursetype="Selenium";
		 driver = BrowserLogin.Browser();
		Guru obj =  PageFactory.initElements(driver, Guru.class);
		String s = obj.SelectCourse(Coursetype);
		
		if(Coursetype.equalsIgnoreCase("java"))
		Assert.assertEquals("Java Tutorial for Beginners: Learn in 7 Days",s);
		
		else
		Assert.assertEquals("Selenium Tutorial for Beginners: Learn WebDriver in 7 Days",s);
		
		 
	}
	
}
