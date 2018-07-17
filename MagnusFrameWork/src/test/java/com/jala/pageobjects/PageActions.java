package com.jala.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageActions extends PageObjects {

	public PageActions(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	/**
	 * Method is to click on a web element
	 * 
	 * @author JALA Technologies Date: 11-04-2018
	 * @param ele
	 * @param msg
	 */
	public void click(WebElement ele, String msg) {
		System.out.println("In click method");
		ele.click();

	}

	/**
	 * Method is type text in the Text Box or Text Area
	 * Date: 11-Apr-2018
	 * @param ele
	 * @param msg
	 */

	public void type(WebElement ele, String msg) {
		System.out.println("In type method");
		ele.clear();
		ele.sendKeys(msg);

	}
	
	
	

}
