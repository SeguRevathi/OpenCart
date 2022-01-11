/**
 * 
 */
package com.psl.OpenCart.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.psl.OpenCart.commons.SeleniumImplementation;

/**
 * @author segu_revathi
 *
 */
public class ShoppingCartPF {
	@FindBy(xpath="//*[@id=\"top-links\"]/ul/li[4]/a/span")
	WebElement ShoppingCartTab;
	@FindBy(xpath="//*[@id=\"content\"]/form/div/table/tbody/tr[1]/td[4]/div/input")
	WebElement countOfItems;
	@FindBy(xpath="//*[@id=\"content\"]/form/div/table/tbody/tr[1]/td[4]/div/span/button[1]")
	WebElement updateBtn;
	@FindBy(xpath="//*[@id=\"checkout-cart\"]/div[1]")
	WebElement popupmsg;
	@FindBy(xpath="//*[@id=\"content\"]/form/div/table/tbody/tr/td[4]/div/span/button[2]")
	WebElement removeBtn;
	@FindBy(xpath="//*[@id=\"content\"]/div[2]/div/table/tbody/tr[2]/td[2]")
	WebElement finalPrice;
	
	SeleniumImplementation selenium;

	public ShoppingCartPF(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		selenium=new SeleniumImplementation();
	}
	
	public boolean validateUpdatefunc(WebDriver driver)
	{
		selenium.click(ShoppingCartTab);
		selenium.moveToElement(countOfItems, driver);
		selenium.clear(countOfItems);
		selenium.setText("10", countOfItems);
		selenium.click(updateBtn);
		return selenium.validateTExt(popupmsg, driver,"Success: You have modified your shopping cart!\n×");
	}
	
	public boolean validateRemoveFunc(WebDriver driver)
	{
		selenium.click(ShoppingCartTab);
		selenium.click(removeBtn);
		
		return true;
		
	}
	public double finalTotal(WebDriver driver)
	{
		selenium.click(ShoppingCartTab);
		
		return 0;
		
	}
	
}
