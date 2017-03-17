package com.selenium.testcases;

import org.testng.annotations.Test;

import com.selenium.common.CommonFunctions;
import com.selenium.pages.CannonHomePage;
import com.selenium.pages.DSLRCamerasPage;

import java.io.IOException;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BuyCameras extends CommonFunctions {
  
	public CannonHomePage cannonHomePage;
	public DSLRCamerasPage dslrCamerasPage;
	
	@BeforeTest
	public void initialSetUp() throws IOException {
		System.out.println("inside initial setup :"+getPropFile().getProperty("url"));
		initialSetUp(getPropFile().getProperty("url"));
		//initialSetUp("https://store.canon.com.au/");;
		cannonHomePage=new CannonHomePage();
		dslrCamerasPage=new DSLRCamerasPage();
	}
	
	@AfterTest
	public void afterSetUp() throws InterruptedException {
		Thread.sleep(6000);
		closeDriver();
	}
	
	@Test
	public void buyDSLRCameras() {
		//Check if the Home page title is "Store"
		Assert.assertTrue(cannonHomePage.getStorePageTitleElement().getText().equalsIgnoreCase("Store"));
		System.out.println("Cannon store home page is correct");
		
		//click on the DSLR Cameras link in the dropdown
		cannonHomePage.clickDSLRCamerasLink();
		System.out.println("Clicked on DSLR link");
		
		//Check if the DSLR cameras page is opened
		Assert.assertTrue(dslrCamerasPage.getDslrHomeTitleElement().getText().equalsIgnoreCase("DSLR Cameras"));
		System.out.println("DSLRHome page opened");
		//Click on the Add to Cart for EOS 80D Single Kit Camera
		dslrCamerasPage.clickOnAddToCart();
		
		System.out.println("DSLR camera added to cart");
		//Check for the popupwindow title
		//Assert.assertTrue(new DSLRCamerasPage().getCartPopUpWindowTitle().getText().contains("Item was successfully added to Cart"));
		
	}
  

}
