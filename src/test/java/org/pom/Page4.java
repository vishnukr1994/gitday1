package org.pom;

import org.base.LibGlobal;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Page4 extends LibGlobal{
public Page4() {
PageFactory.initElements(driver, this);}
@FindBy (id="first_name")
private WebElement txtFrstName;
@FindBy (id="last_name")
private WebElement txtLstName;
@FindBy (id="address")
private WebElement txtAddress;
@FindBy (id="cc_num")
private WebElement txtCredtCrd;
@FindBy (id="cc_type")
private WebElement txtCredtCrdType;
@FindBy (id="cc_exp_month")
private WebElement drpDwnExpryMnth;
@FindBy (id="cc_exp_year")
private WebElement drpDwnExpryYr;
@FindBy (id="cc_cvv")
 private WebElement txtCvvNo;
@FindBy (id="book_now")
private WebElement btnBookNow;
public WebElement getTxtFrstName() {
	return txtFrstName;
}
public WebElement getTxtLstName() {
	return txtLstName;
}
public WebElement getTxtAddress() {
	return txtAddress;
}
public WebElement getTxtCredtCrd() {
	return txtCredtCrd;
}
public WebElement getTxtCredtCrdType() {
	return txtCredtCrdType;
}
public WebElement getDrpDwnExpryMnth() {
	return drpDwnExpryMnth;
}
public WebElement getDrpDwnExpryYr() {
	return drpDwnExpryYr;
}
public WebElement getTxtCvvNo() {
	return txtCvvNo;
}
public WebElement getBtnBookNow() {
	return btnBookNow;
}


}
