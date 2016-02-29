package pages;

import utils.Reporter;
import wrappers.OpentapsWrappers;

public class ViewLeadPage extends OpentapsWrappers {

	
	public ViewLeadPage() {

		if (!verifyTitle("View Lead | opentaps CRM")) {
			Reporter.reportStep("This is NOT My View Lead page", "FAIL");
		}
	}
	
	public void verifyfirstName(String CompanyName) {
		//verifyTextById(idName, expectedText)
		
	}
	
}
