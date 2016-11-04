package com.qait.demo.keywords;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.events.WebDriverEventListener;
import org.testng.Assert;

import com.qait.automation.getpageobjects.GetPage;
import com.qait.automation.utils.YamlReader;
import com.thoughtworks.selenium.Wait;
import com.thoughtworks.selenium.Wait.WaitTimedOutException;

public class ProductDetailsActions extends GetPage {

	WebDriver driver;
	private EventFiringWebDriver e_driver;

	public ProductDetailsActions(WebDriver driver) {
		super(driver, "HomePage");
		this.driver = driver;
		}

	
	public void AddTheProductToCart() {
		element("add_cart").click();	
		driver.navigate().refresh();
			}
	
	public void verifyProceedToChkout() {
		Assert.assertEquals(true, element("verify_procced_to_chkout").isDisplayed());
			}
	
	public void verifyViewCartBtn() {
		Assert.assertEquals(true, element("verify_view_cart").isDisplayed());
			}
	
	public void verifyBuyNowbtn() {
		for (String handle : driver.getWindowHandles()) {
	        driver.switchTo().window(handle);
	        }
		Assert.assertEquals(true, element("verify_buy_now_btn").isDisplayed());
			}
	
	public void verifyViewCart() {
		Assert.assertEquals(true, element("verify_view_cart_btn").isDisplayed());
			}

	public void verifyProductImage() {
		Assert.assertEquals(true, element("verify_product_img").isDisplayed());
			}

	public void clickProceedToChkout() {
		element("verify_procced_to_chkout").click();
			}
	
	public void verifyLoginHeader() {
			// TODO Auto-generated method stub
		Assert.assertEquals(element("verify_login_header").getText().contains("Login"), true);
		
		
			}
}


