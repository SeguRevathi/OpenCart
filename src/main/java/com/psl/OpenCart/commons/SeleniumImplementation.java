/**
 * 
 */
package com.psl.OpenCart.commons;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

/**
 * @author segu_revathi
 *
 */
public class SeleniumImplementation {
	Actions action;
	public void moveToElement(WebElement element,WebDriver driver)
	{
		action =new Actions(driver);
		action.moveToElement(element).build().perform();
	}
	
	public void click(WebElement element)
	{
		element.click();
	}
	
	public void clear(WebElement element)
	{
		element.clear();
	}
	
	public void setText(String text, WebElement element)
	{
		element.sendKeys(text);
	}
	
	public void selectByVisibleText(WebElement selectOption, String text)
	{
		Select s=new Select(selectOption);
		s.selectByVisibleText(text);
	}
	
	public boolean validateTExt(WebElement element, WebDriver driver, String expectedText)
	{
		String observedText=element.getText();
		//System.out.println(observedText+"\n"+"Success: You have modified your shopping cart!\n×");
		if(observedText.equals(expectedText))
		{
			return true;
		}
		return false;
	}
	
	public boolean finalPriceCheck(WebDriver driver)
	{
		
	}
}
