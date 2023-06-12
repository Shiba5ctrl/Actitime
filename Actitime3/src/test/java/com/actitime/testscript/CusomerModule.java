package com.actitime.testscript;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.actitime.generic.BaseClass;

public class CusomerModule extends BaseClass {

	@Test
	public void createCustomer() {
		String etitle = "actiTIME - Enter Time-Track";
		WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("logo_aT")));
		String atitle = driver.getTitle();
		SoftAssert s= new SoftAssert();
		s.assertEquals(etitle, atitle,"Pass");
		s.assertAll("Not Matched and Fail");
		}
}
