package org.pom;

import org.base.LibGlobal;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Page3 extends LibGlobal {
public Page3() {
	PageFactory.initElements(driver, this);}
@FindBy (id="radiobutton_0")
private WebElement btnRadioBtn;
@FindBy (id="continue")
private WebElement btnCntnue;
public WebElement getBtnRadioBtn() {
	return btnRadioBtn;
}
public WebElement getBtnCntnue() {
	return btnCntnue;
}

}
