package com.selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import com.selenium.common.CommonFunctions;

public class CannonHomePage extends CommonFunctions {

	By shopForProducts= By.xpath("//a[@class='link -products']");
	By dslrCameras= By.xpath("//a[contains(text(),'DSLR')]");
	By storePageTitle=By.xpath("//span[@class='tab-store']");
	
	public WebElement getShopForProductsElement(){
		return driver.findElement(shopForProducts);
	}
	
	public WebElement getDSLRCamerasElement(){
		return  driver.findElement(dslrCameras);
	}
	
	public WebElement getStorePageTitleElement(){
		return driver.findElement(storePageTitle);
	}
	
	
	public void clickDSLRCamerasLink(){
		getActionsObject().moveToElement(getShopForProductsElement()).perform();
		getDSLRCamerasElement().click();
	}
	
	
}
