package Test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import generic.BaseTest;
import generic.getDatafromExcel;
import pom.loginPage;

public class launchTest extends BaseTest{
  @Test
  public void validTest() throws EncryptedDocumentException, IOException {
	  loginPage lp = new loginPage(driver);
	  getDatafromExcel ge= new getDatafromExcel();
	  lp.setUsername().sendKeys(ge.ReadExcel("Sheet1", 0, 0));
	  lp.setPassword().sendKeys(ge.ReadExcel("Sheet1",0,1));
	  lp.clickLoginBTN();
	  
	  
	  
	  
  }
}
