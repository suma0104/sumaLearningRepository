package com.selenium.common;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.interactions.Actions;

public class CommonFunctions {

	public static WebDriver driver;
	public static Actions actions;	
	public CommonFunctions(){
		if (driver==null){
			driver=new FirefoxDriver();
		}
	}
	
	public Actions getActionsObject(){
		return new Actions(driver);	
	}
	
	public void initialSetUp(String url){
		driver.get(url);
		driver.manage().window().maximize();
	}
	
	public void closeDriver(){
		driver.close();
		driver.quit();
	}
	
	public Properties getPropFile() throws IOException{
		Properties prop=new Properties();
		FileInputStream fis=new FileInputStream("src/com/selenium/data/dataDriven.properties");
		prop.load(fis);
		return prop;
	}
	/*
	public static void main(String ar[]) throws IOException{
		Properties prop=new Properties();
		FileInputStream fis=new FileInputStream("src/com/selenium/data/dataDriven.properties");
		prop.load(fis);
		System.out.println(prop.getProperty("url"));
	}*/
	
}
