package org.bojo;

import java.io.IOException;

import org.base.LibGlobal;
import org.pom.LoginPage;
import org.pom.Page2;
import org.pom.Page3;
import org.pom.Page4;
import org.pom.Page5;

public class Adactin extends LibGlobal {
public static void main(String[] args) throws InterruptedException, IOException {
	LibGlobal global = new LibGlobal();
//	//login-page
	global.browserLaunch();
	global.launchUrl("https://adactinhotelapp.com/");
LoginPage page = new LoginPage();
//	global.enterText(page.getTxtUserName(), "karthi007");
//	global.enterText(page.getTxtPassWord(), "Karthi@1989");
//	global.btnClick(page.getBtnLogin());
//	//page2
	Page2 page2 = new  Page2();
//	global.selectByVisible(page2.getDropDownLoc(), "Sydney");
//	global.selectByVisible(page2.getDropDownHotel(),"Hotel Hervey");
//	global.selectByVisible(page2.getDropDownRoomType(), "Deluxe");
//	global.selectByVisible(page2.getDrpDwnRoomNo(), "1 - One");
//	global.selectByVisible(page2.getDrpDwnAdltRm(), "2 - Two");
//	global.selectByVisible(page2.getDrpDwnChldRom(), "0 - None");
//	global.btnClick(page2.getBtnSrch());
//	//page3
    Page3 page3 = new Page3();
//	global.btnClick(page3.getBtnRadioBtn());
//	global.btnClick(page3.getBtnCntnue());
//	//page4
   Page4 page4 = new Page4();
//	global.enterText(page4.getTxtFrstName(), "vishnu");
//	global.enterText(page4.getTxtLstName(), "kr");
//	global.enterText(page4.getTxtAddress(), "kerala");
//	global.enterText(page4.getTxtCredtCrd(), "4578124578784512");
//	global.selectByVisible(page4.getTxtCredtCrdType(), "VISA");
//	global.selectByVisible(page4.getDrpDwnExpryMnth(), "March");
//	global.selectByVisible(page4.getDrpDwnExpryYr(), "2022");
//	global.enterText(page4.getTxtCvvNo(), "145");
//	global.btnClick(page4.getBtnBookNow());
   Page5 p = new Page5();
//	Thread.sleep(5000);
//	global.btnClick(p.getBtnLogout());
Thread.sleep(2000);
	global.enterText(page.getTxtUserName(),global.readValueFromExcel("C:\\Users\\user\\eclipse-workspace\\Mavenday1\\excel data\\adactin.xlsx", "Sheet1", 1, 0));
	global.enterText(page.getTxtPassWord(),global.readValueFromExcel("C:\\Users\\user\\eclipse-workspace\\Mavenday1\\excel data\\adactin.xlsx", "Sheet1", 1, 1));
    global.btnClick(page.getBtnLogin());
    global.selectByVisible(page2.getDropDownLoc(), global.readValueFromExcel("C:\\Users\\user\\eclipse-workspace\\Mavenday1\\excel data\\adactin.xlsx","Sheet1", 1, 2));
    global.selectByVisible(page2.getDropDownHotel(), global.readValueFromExcel("C:\\Users\\user\\eclipse-workspace\\Mavenday1\\excel data\\adactin.xlsx","Sheet1", 1, 3));
    global.selectByVisible(page2.getDropDownRoomType(), global.readValueFromExcel("C:\\Users\\user\\eclipse-workspace\\Mavenday1\\excel data\\adactin.xlsx","Sheet1", 1, 4));
global.selectByVisible(page2.getDrpDwnRoomNo(), global.readValueFromExcel("C:\\Users\\user\\eclipse-workspace\\Mavenday1\\excel data\\adactin.xlsx", "Sheet1", 1, 5));
global.selectByVisible(page2.getDrpDwnAdltRm(), global.readValueFromExcel("C:\\Users\\user\\eclipse-workspace\\Mavenday1\\excel data\\adactin.xlsx", "Sheet1", 1, 6));
global.selectByVisible(page2.getDrpDwnChldRom(), global.readValueFromExcel("C:\\Users\\user\\eclipse-workspace\\Mavenday1\\excel data\\adactin.xlsx", "Sheet1", 1, 7));
global.btnClick(page2.getBtnSrch());
global.btnClick(page3.getBtnRadioBtn());
global.btnClick(page3.getBtnCntnue());
global.enterText(page4.getTxtFrstName(),global.readValueFromExcel("C:\\Users\\user\\eclipse-workspace\\Mavenday1\\excel data\\adactin.xlsx", "Sheet1", 1, 8));
global.enterText(page4.getTxtLstName(), global.readValueFromExcel("C:\\Users\\user\\eclipse-workspace\\Mavenday1\\excel data\\adactin.xlsx", "Sheet1", 1, 9));
global.enterText(page4.getTxtAddress(), global.readValueFromExcel("C:\\Users\\user\\eclipse-workspace\\Mavenday1\\excel data\\adactin.xlsx", "Sheet1", 1, 10));
global.enterText(page4.getTxtCredtCrd(),global.readValueFromExcel("C:\\Users\\user\\eclipse-workspace\\Mavenday1\\excel data\\adactin.xlsx", "Sheet1", 1, 11));
global.selectByVisible(page4.getTxtCredtCrdType(),global.readValueFromExcel("C:\\Users\\user\\eclipse-workspace\\Mavenday1\\excel data\\adactin.xlsx", "Sheet1", 1, 12));
global.selectByVisible(page4.getDrpDwnExpryMnth(),global.readValueFromExcel("C:\\Users\\user\\eclipse-workspace\\Mavenday1\\excel data\\adactin.xlsx", "Sheet1", 1, 13));
global.selectByVisible(page4.getDrpDwnExpryYr(),global.readValueFromExcel("C:\\Users\\user\\eclipse-workspace\\Mavenday1\\excel data\\adactin.xlsx", "Sheet1", 1, 14));
global.enterText(page4.getTxtCvvNo(), global.readValueFromExcel("C:\\Users\\user\\eclipse-workspace\\Mavenday1\\excel data\\adactin.xlsx", "Sheet1", 1, 15));
global.btnClick(page4.getBtnBookNow());
Thread.sleep(5000);
global.btnClick(p.getBtnLogout());


}

}
