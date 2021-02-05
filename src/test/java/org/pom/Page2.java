package org.pom;

import org.base.LibGlobal;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Page2 extends LibGlobal{
public Page2()  {
	PageFactory.initElements(driver, this);
}
@FindBy (id="location")
private WebElement dropDownLoc;

@FindBy (id="hotels")
private WebElement dropDownHotel;

@FindBy (id="room_type")
private WebElement dropDownRoomType;

@FindBy (id="room_nos")
private WebElement drpDwnRoomNo;

@FindBy (id="adult_room")
private WebElement drpDwnAdltRm;

@FindBy (id="child_room")
private WebElement drpDwnChldRom;

@FindBy (id="Submit")
private WebElement btnSrch;

public WebElement getDropDownLoc() {
	return dropDownLoc;
}

public WebElement getDropDownHotel() {
	return dropDownHotel;
}

public WebElement getDropDownRoomType() {
	return dropDownRoomType;
}

public WebElement getDrpDwnRoomNo() {
	return drpDwnRoomNo;
}

public WebElement getDrpDwnAdltRm() {
	return drpDwnAdltRm;
}

public WebElement getDrpDwnChldRom() {
	return drpDwnChldRom;
}

public WebElement getBtnSrch() {
	return btnSrch;
}



}



