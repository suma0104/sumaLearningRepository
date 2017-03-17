package com.selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.selenium.common.CommonFunctions;

public class DSLRCamerasPage extends CommonFunctions {


	By dslrHomeTitle=By.xpath("//strong[contains(text(),'DSLR')]");
	By dslrEightyDAddToCart=By.xpath("//li[h3[div[a[@title='EOS 80D Single Kit']]]]//child::div[2]/button[@title='Add to cart']");
	By cartPopupWindowTitle=By.xpath("//*[@class='success']");
	WebElement dslrHomeTitleElement;
	
	public WebElement getDslrHomeTitleElement(){
		return driver.findElement(dslrHomeTitle);
	}

	/*public WebElement getDslrEightyDSingleKitElement() {
		dslrEightyDSingleKitElement=driver.findElement(dslrEightyDSingleKit);
		return dslrEightyDSingleKitElement;
	}	
	*/
	public void clickOnAddToCart(){
		driver.findElement(dslrEightyDAddToCart).click();	
	}
	
	public WebElement getCartPopUpWindowTitle(){
		return driver.findElement(cartPopupWindowTitle);
	}
}
