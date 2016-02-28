package pages;

import utils.Reporter;
import wrappers.OpentapsWrappers;

public class CreateLeadPage extends OpentapsWrappers {

	public CreateLeadPage() {

		if (!verifyTitle("Create Lead | opentaps CRM")) {
			Reporter.reportStep("This is NOT My Home page", "FAIL");
		}
	}

	public CreateLeadPage enterCompanyName(String companyName) {
		enterById(prop.getProperty("CreateLead.companyname.id"), companyName);
		return this;
	}

	public CreateLeadPage enterFirstName(String firstName) {

		enterById(prop.getProperty("CreateLead.fname.id"), firstName);
		return this;

	}

	public CreateLeadPage enterlastName(String lastName) {

		enterById(prop.getProperty("CreateLead.lname.id"), lastName);
		return this;

	}
	
	public CreateLeadPage clickCreateLead() {

		clickByName(prop.getProperty("CreateLead.click.name"));
		return this;

	}
	
}
