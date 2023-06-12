package com.actitime.generic;

import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.actitime.pom.LoginPage;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class BaseClass {
	public  WebDriver driver;
	 private static  Logger logger = LogManager.getLogger();
	
	//public  static Logger logger;
	
	@BeforeTest
	public void openBrowser() {
		//logger= LogManager.getLogger(BaseClass.class);
		
		//WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
	@BeforeMethod
	public void login() throws IOException {
		FileLib l= new FileLib();
		
		String url = l.getProperty("url");
		driver.get(url);
		logger.info("URL is Opened");
		String un=l.getProperty("username");
		
		String pwd = l.getProperty("password");
		
		LoginPage p= new LoginPage(driver);
		p.setLogin(un, pwd);
		logger.info("UN and PWD are Entered");
	}
	@AfterTest
	public void closeBrowser() {
		driver.close();
	}
}
