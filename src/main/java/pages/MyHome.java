package pages;

import utils.Reporter;
import wrappers.OpentapsWrappers;

public class MyHome extends OpentapsWrappers{

	public MyHome() {

		if(!verifyTitle("Create Lead | opentaps CRM")){
			Reporter.reportStep("This is NOT My Home page", "FAIL");
		}
	}
		public CreateLeadPage clickCreateLead(){
			clickByLink(prop.getProperty("MyHome.Createlead.linktext"));
			return new CreateLeadPage();
		}
		
		public MyLeadsPage clickLeads(){
			clickByLink(prop.getProperty("MyHome.Leads.LinkText"));	
			return new MyLeadsPage();
		}		
	}

