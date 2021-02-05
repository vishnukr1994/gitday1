package org.bojo;

import java.awt.AWTException;
import java.awt.Robot;

import org.base.LibGlobal;
import org.openqa.selenium.Keys;
import org.pom.MakeMyTrip;

public class FlightCost  {
public static void main(String[] args) throws InterruptedException, AWTException {
	LibGlobal l = new LibGlobal();
	l.browserLaunch();
	l.launchUrl("https://www.makemytrip.com/");
	
	MakeMyTrip m = new MakeMyTrip();
	//Thread.sleep(8000);
	//l.btnClick(m.getAlClk());
	Thread.sleep(3000);
	//l.btnClick(m.getAlClk());
	l.btnClick(m.getBtnFrom());
	l.enterText(m.getTxtFrom(), "Mumbai");
	
	l.keyDown();
	l.enter();
	Thread.sleep(2000);
	l.btnClick(m.getBtnTo());
	l.enterText(m.getTxtTo(), "Kochi");
	l.keyDown();
	l.enter();
	
	l.btnClick(m.getSrchBtn());
	
	l.findElements("//*[@class='blackText fontSize18 blackFont']");
}
}
