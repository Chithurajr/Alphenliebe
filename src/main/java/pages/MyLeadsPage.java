package pages;

import utils.Reporter;
import wrappers.OpentapsWrappers;

public class MyLeadsPage extends OpentapsWrappers {
	
	public MyLeadsPage() {
	
		if (!verifyTitle("My Leads | opentaps CRM")) {
			Reporter.reportStep("This is NOT My Home page", "FAIL");
		}
	}
		public FindLeadsPage clickFindleads(){
			clickByLink(prop.getProperty("MyLeads.FindLeads.LinkText"));
			return new FindLeadsPage();
		}
	
	}

