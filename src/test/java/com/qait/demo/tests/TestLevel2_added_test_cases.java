/**
* This is a sample test 
* Step 1 : Open snapdeal.com/amazon.com/flipcart.com
* Step 2 : Search A product - Mobile
* Step 3 : Select First Product
* Step 4 : Add the product to cart
* Step 5 : Verify the product has been added to cart
* 
* Task : Stubs are already written , you have to implement them and run this test
*/

package com.qait.demo.tests;

import static com.qait.automation.utils.YamlReader.getYamlValue;

import java.lang.reflect.Method;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qait.automation.TestSessionInitiator;
import com.qait.automation.utils.YamlReader;

public class TestLevel2_added_test_cases {

	TestSessionInitiator test;
	String baseUrl;

	@BeforeClass
	public void Start_Test_Session() {
		test = new TestSessionInitiator(this.getClass().getSimpleName());
		initVars();
		test.launchApplication(baseUrl);
	}

	@BeforeMethod
	public void handleTestMethodName(Method method) {
		test.stepStartMessage(method.getName());
	}

	private void initVars() {
		baseUrl = getYamlValue("baseUrl");
	}
	
	@Test()
	public void TestStep1_VerifyCartImage(){
		
		test.homePage.verifyCartImage();
	}
	
	@Test()
	public void TestStep2_VerifySignIn(){
		
		test.homePage.verifySignIn();
	}
	
	@Test()
	public void TestStep3_SearchProduct(){
		test.homePage.enterProductName(getYamlValue("productName"));
		test.homePage.clickSearchIcon();
		test.resultPage.verifyResults(getYamlValue("productName"));
	}
	
	
	@Test()
	public void TestStep4_SelectTablets(){
		test.resultPage.clickTablets();
		test.resultPage.verifySearchResults();
	}
	
	@Test()
	public void TestStep5_VerifySortTab(){
		test.resultPage.verifySortTab();
		//test.resultPage.verifySearchResults();
	}
	
	@Test()
	public void TestStep6_SelectBrand(){
		test.resultPage.selectBrand();
		test.resultPage.verifySelectBrand();
	}
	
	@Test()
	public void TestStep7_SelectFirstProduct(){
		test.resultPage.verifyProduct();
		test.resultPage.clickFirstProduct();
		
	}
	
	@Test()
	public void TestStep8_verifyProductPage(){
		test.productDetailsPage.verifyBuyNowbtn();
		test.productDetailsPage.verifyViewCart();
		test.productDetailsPage.verifyProductImage();
	}
	
	@Test()
	public void TestStep9_AddProductToCart(){
		test.productDetailsPage.AddTheProductToCart();
		test.productDetailsPage.verifyProceedToChkout();
		test.productDetailsPage.verifyViewCartBtn();
	}
	
	@Test()
	public void TestStep10_Checkout(){
		test.productDetailsPage.clickProceedToChkout();
		test.productDetailsPage.verifyLoginHeader();
	}
	
	@AfterMethod
	public void take_screenshot_on_failure(ITestResult result) {
		test.takescreenshot.takeScreenShotOnException(result);
	}

	@AfterClass
	public void close_Test_Session() {
		test.closeBrowserSession();
	}

}
