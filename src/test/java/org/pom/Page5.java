package org.pom;

import org.base.LibGlobal;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Page5  extends LibGlobal{
	public Page5() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (id="logout")
	private WebElement btnLogout;

	public WebElement getBtnLogout() {
		return btnLogout;
	}
	
}
