package org.pom;

import org.base.LibGlobal;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MakeMyTrip extends LibGlobal {
	public MakeMyTrip() {
		PageFactory.initElements(driver, this);
	}
	@FindBy (xpath="//span[text()='From']")
	private WebElement btnFrom;
	@FindBy (xpath="(//input[@type='text'])[2]")
	private WebElement txtFrom;
	@FindBy (xpath="//*[@id='toCity']")
	private WebElement btnTo;
	@FindBy (xpath="//*[@aria-controls='react-autowhatever-1']")
	private WebElement txtTo;
	@FindAll ({@FindBy(xpath ="//a[text()='Search']"),@FindBy(xpath = "//*[@class='primaryBtn font24 latoBold widgetSearchBtn ']")}) 
	private WebElement srchBtn;
	@FindBy (xpath="//div[@class='makeFlex column flexOne whiteText latoBold']")
	private WebElement alClk;
	
	@FindBy(xpath ="//*[@class='blackText fontSize18 blackFont']")
	private WebElement flightPrice;
	
	public WebElement getFlightPrice() {
		return flightPrice;
	}
	public WebElement getAlClk() {
		return alClk;
	}
	public WebElement getBtnFrom() {
		return btnFrom;
	}
	public WebElement getTxtFrom() {
		return txtFrom;
	}
	public WebElement getBtnTo() {
		return btnTo;
	}
	public WebElement getTxtTo() {
		return txtTo;
	}
	public WebElement getSrchBtn() {
		return srchBtn;
	}
	
	
	
}
