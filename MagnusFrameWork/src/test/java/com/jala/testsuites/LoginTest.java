package com.jala.testsuites;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.jala.pageobjects.PageActions;

/**
 * 
 * @author JALA Technologies Date:11-Apr-2018
 *
 */

public class LoginTest {

	WebDriver driver;
	public PageActions pageObj;
	public static String URL = "http://magnus2.jalatechnologies.com/";
	public static String driverPath = "D:\\seleniumStuff\\chromedriver.exe";

	/**
	 * Date:11-04-2018
	 * 
	 */
	
	@BeforeMethod
	public void setUp() {
		System.out.println("Before Method ");

		try {
			System.out.println("launching chrome browser");
			System.setProperty("webdriver.chrome.driver", driverPath);
			driver = new ChromeDriver();
			driver.get(URL);
			System.out.println("Application launched successfully");

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	/**
	 * 
	 * @throws Exception
	 */
	
	
	@Test
	public void loginAdmin() throws Exception {
		try {

			System.out.println("First Test ................");
			pageObj = new PageActions(driver);
			pageObj.click(pageObj.admin_link, " Admin link");
			pageObj.type(pageObj.admin_login_username_txt, "admin");
			pageObj.type(pageObj.admin_login_password_txt, "admin");
			pageObj.click(pageObj.admin_login_button, "Clicking the Login button");

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

}
