package com.QA.TestUtils;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.WebDriverEventListener;

public class EventHandler implements WebDriverEventListener {

	public void beforeAlertAccept(WebDriver driver) {
		// TODO Auto-generated method stub
		 System.out.println("beforeAlertAccept " +driver.getTitle() );	
	}

	public void afterAlertAccept(WebDriver driver) {
		// TODO Auto-generated method stub
		System.out.println("afterAlertAccept " +driver.getTitle() );	
	}

	public void afterAlertDismiss(WebDriver driver) {
		// TODO Auto-generated method stub
		System.out.println("afterAlertDismiss " +driver.getTitle() );	
	}

	public void beforeAlertDismiss(WebDriver driver) {
		// TODO Auto-generated method stub
		System.out.println("beforeAlertDismiss " +driver.getTitle() );	
	}

	public void beforeNavigateTo(String url, WebDriver driver) {
		// TODO Auto-generated method stub
		System.out.println("beforeNavigateTo " +driver.getCurrentUrl());	
	}

	public void afterNavigateTo(String url, WebDriver driver) {
		// TODO Auto-generated method stub
		System.out.println("afterNavigateTo " +driver.getCurrentUrl() );	
	}

	public void beforeNavigateBack(WebDriver driver) {
		// TODO Auto-generated method stub
		System.out.println("beforeNavigateBack " +driver.getCurrentUrl() );	
	}

	public void afterNavigateBack(WebDriver driver) {
		// TODO Auto-generated method stub
		System.out.println("afterNavigateBack " +driver.getCurrentUrl() );	
	}

	public void beforeNavigateForward(WebDriver driver) {
		// TODO Auto-generated method stub
		System.out.println("beforeNavigateForward " +driver.getCurrentUrl() );	
	}

	public void afterNavigateForward(WebDriver driver) {
		// TODO Auto-generated method stub
		System.out.println("afterNavigateForward " +driver.getCurrentUrl() );	
	}

	public void beforeNavigateRefresh(WebDriver driver) {
		// TODO Auto-generated method stub
		System.out.println("beforeNavigateRefresh " +driver.getCurrentUrl() );		
	}

	public void afterNavigateRefresh(WebDriver driver) {
		// TODO Auto-generated method stub
		System.out.println("afterNavigateRefresh " +driver.getCurrentUrl() );		
	}

	public void beforeFindBy(By by, WebElement element, WebDriver driver) {
		// TODO Auto-generated method stub
		System.out.println("beforeFindBy " + element.toString());		
	}

	public void afterFindBy(By by, WebElement element, WebDriver driver) {
		// TODO Auto-generated method stub
		System.out.println("afterFindBy " + element.toString());
	}

	public void beforeClickOn(WebElement element, WebDriver driver) {
		// TODO Auto-generated method stub
		System.out.println("beforeClickOn " + element.toString());
	}

	public void afterClickOn(WebElement element, WebDriver driver) {
		// TODO Auto-generated method stub
		System.out.println("afterClickOn " + element.toString());
	}

	public void beforeChangeValueOf(WebElement element, WebDriver driver, CharSequence[] keysToSend) {
		// TODO Auto-generated method stub
		System.out.println("beforeChangeValueOf " + element.toString());
	}

	public void afterChangeValueOf(WebElement element, WebDriver driver, CharSequence[] keysToSend) {
		// TODO Auto-generated method stub
		System.out.println("afterChangeValueOf " + element.toString());	
	}

	public void beforeScript(String script, WebDriver driver) {
		// TODO Auto-generated method stub
		System.out.println("beforeScript " + script);
	}

	public void afterScript(String script, WebDriver driver) {
		// TODO Auto-generated method stub
		System.out.println("afterScript " + script);
	}

	public void beforeSwitchToWindow(String windowName, WebDriver driver) {
		// TODO Auto-generated method stub
		System.out.println("beforeSwitchToWindow " + windowName.toString());
	}

	public void afterSwitchToWindow(String windowName, WebDriver driver) {
		// TODO Auto-generated method stub
		System.out.println("afterSwitchToWindow " + windowName.toString());
	}

	public void onException(Throwable throwable, WebDriver driver) {
		// TODO Auto-generated method stub
		System.out.println("afterScript " + throwable.getMessage());
	}

	public <X> void beforeGetScreenshotAs(OutputType<X> target) {
		// TODO Auto-generated method stub
		System.out.println("beforeGetScreenshotAs " + target.toString());
	}

	public <X> void afterGetScreenshotAs(OutputType<X> target, X screenshot) {
		// TODO Auto-generated method stub
		System.out.println("afterGetScreenshotAs " + screenshot.toString());
	}

	public void beforeGetText(WebElement element, WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	public void afterGetText(WebElement element, WebDriver driver, String text) {
		// TODO Auto-generated method stub
		
	}

	
		
}
