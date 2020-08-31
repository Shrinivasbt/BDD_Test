package StepDefs;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Smoketest {
	
	@Given("^I have to make Cofee$")
	public void I_have_to_make_Cofee() throws Throwable {
	    // Express the Regexp above with the code you wish you had
		System.out.println("I have to make Cofee");
	    throw new PendingException();
	    
	}

	@When("^I have sugar Cofee and gas$")
	public void I_have_sugar_Cofee_and_gas() throws Throwable {
	    // Express the Regexp above with the code you wish you had
		
		System.out.println("I have sugar Cofee and gas");
	    throw new PendingException();
	}

	@Then("^Prepared Cofee$")
	public void Prepared_Cofee() throws Throwable {
	    // Express the Regexp above with the code you wish you had
		System.out.println("Prepared Cofee");
	    throw new PendingException();
	}

	@Given("^I have to make Tea$")
	public void I_have_to_make_Tea() throws Throwable {
	    // Express the Regexp above with the code you wish you had
		System.out.println("I have to make Tea");
		
	    throw new PendingException();
	}

	@When("^I have sugar Tea and gas$")
	public void I_have_sugar_Tea_and_gas() throws Throwable {
	    // Express the Regexp above with the code you wish you had
		System.out.println("I have sugar Tea and gas");
	    throw new PendingException();
	}

	@Then("^Prepared Tea$")
	public void Prepared_Tea() throws Throwable {
	    // Express the Regexp above with the code you wish you had
		System.out.println("Prepared Tea");
	    throw new PendingException();
	}



}
