package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.CreateLeadPage;
import pages.LoginPage;
import wrappers.OpentapsWrappers;

public class TC02_CreateLead extends OpentapsWrappers{

	
	@BeforeClass
	public void startTestCase(){
		browserName 	= "chrome";
		dataSheetName 	= "TC02_CreateLead";
		testCaseName 	= "TC02_CreateLead";
		testDescription = "Create Lead using POM framework";
	}

	@Test(dataProvider="fetchData")
	public void createLead(String companyName,String firstName,String lastName,String userdata,String pass) {
		new LoginPage().enterUserName(userdata).enterPassword(pass).clickLogin().clickCrm().clickCreateLead() 
		.enterCompanyName(companyName)
		.enterFirstName(firstName)
		.enterlastName(lastName)
		.clickCreateLead();
	}	
}
