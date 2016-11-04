package com.qait.demo.keywords;



import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.qait.automation.getpageobjects.GetPage;

public class ResultsPageActions extends GetPage {
	
	WebDriver driver;

    public ResultsPageActions(WebDriver driver) {
        super(driver, "ResultsPage");
        this.driver = driver;
    }

	
	public void verifySearchResults(String resultText) {
		isElementDisplayed("area_searchResult");
		Assert.assertTrue(element("txt_resultCount",resultText).isDisplayed(), "Result count section is not present");
		logMessage("Search Results successfully displayed");
	}
	
	
	public void getResponseCode(String url){
		logMessage("Status Code for the URL '"+url+"' :- "+ apiTester.getStatusCodeOfTheService(url));
	}

	public void getHeaders(String url){
		Map<String, List<String>> map = apiTester.getAllHeaderFields(url);
		Iterator it = map.entrySet().iterator();
		while(it.hasNext()){
			logMessage("Map value:- "+it.next());
		}
	}


	public void clickFirstProduct() {
		element("first_product").click(); 
	}

	public void verifyProduct() {
		// TODO Auto-generated method stub
		Assert.assertEquals(true, element("verify_product_list").isDisplayed());
	}	

	public void clickTablets() {
		element("tablet_tab").click();
	}
	
	public void verifyResults(String yamlValue) {
		// TODO Auto-generated method stub
	Assert.assertEquals(element("result_text").getText().contains(yamlValue), true);
	}
	
	public void verifySearchResults() {
		// TODO Auto-generated method stub
	Assert.assertEquals(element("result_text").getText().contains("Tablets"), true);
	
	}
	
	public void selectBrand() {
		wait.hardWait(1);
		element("brand_li").click();
	}
    
	public void verifySelectBrand() {
		// TODO Auto-generated method stub
		Assert.assertEquals(true, element("brand_verify").isDisplayed());
	}
    
	
	public void verifySortTab(){
	     element("sort_dropdown").click();
	     element("select_fresh_arrival").click();
	     Assert.assertTrue(element("txt_sort_selected_value").getText().trim().contains("Fresh Arrival"),"Dropdown element not present");
	    }
    
}
