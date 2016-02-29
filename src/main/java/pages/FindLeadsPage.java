package pages;

import utils.Reporter;
import wrappers.OpentapsWrappers;

public class FindLeadsPage extends OpentapsWrappers {
	
	public FindLeadsPage(){
		if (!verifyTitle("My Leads | opentaps CRM")) {
		Reporter.reportStep("This is NOT My Home page", "FAIL");
		}
	}
	
	public FindLeadsPage enteruserName(String firstName){
		enterByXpath(prop.getProperty("FindLeads.firstName.xpath"), firstName);
		return this;
	}
	
	public FindLeadsPage enterPassword(String lastName){
		enterByXpath(prop.getProperty("FindLeads.lastName.xpath"), lastName);
		return this;
	}
	
	public FindLeadsPage clickFindLeads(){
		clickByXpath(prop.getProperty("FindLeads.findLeadsButton.xpath"));
		return this;
	}
	
	public FindLeadsPage clickSortedList(String firstName){
		clickByLink(prop.getProperty(firstName));
		return this;
	}
	
	

}
