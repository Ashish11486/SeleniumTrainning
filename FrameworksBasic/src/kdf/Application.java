package kdf;

import java.io.IOException;

import org.testng.annotations.Test;

import utils.ReadExcel;

public class Application {
	@Test
	public void testApplication() throws IOException{
		String[][] data = ReadExcel.getData("C:\\Ashish\\QA\\Software\\Data\\TestData.xlsx", "Sheet3");
		
		for (int i = 1; i < data.length; i++) {
			switch(data[i][3])
			{
			case "openBrowser"://i=1,10
				Methods.openBrowser();
				break;
			case "maximizeBrowser"://i=2,11
				Methods.maximizeBrowser();
				break;
			case "implementWait"://i=3,12
				Methods.implementWait();
				break;
			case "navigateTo"://i=4,13
				Methods.navigateTo(data[i][6]);
				break;
			case "enterInvalidUsername"://i=5,14
				Methods.enterInvalidUsername(data[i][5],data[i][6]);
				break;
			case "enteriInvalidPassword"://i=6,15
				Methods.enteriInvalidPassword(data[i][5],data[i][6]);
				break;
			case "ClickSubmit"://i=7,16
				Methods.clickSubmit(data[i][5]);
				break;
			case "varifyMessage"://i=8,17
				Methods.varifyMessage(data[i][4],data[i][5],data[i][6]);
				break;
			case "closeBrowser"://i=9,18
				Methods.closeBrowser();
				break;
							
			}
		}
	}
}
