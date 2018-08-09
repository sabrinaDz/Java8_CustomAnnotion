package com.jspring.annuaire;

import com.jspring.core.report.Print;
import com.jspring.core.report.Report;


@Report(printDate=true)
public class Person {

	@Print(print=true)
	private String firstName;
	
	@Print(print=true)
	private String lastName;
	
	
	private String persoMail;
	
	@Print(print=true)
	private String proMail;
	
	
	
	
	private Adress adress;
	
	
	
	
	
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getPersoMail() {
		return persoMail;
	}
	public void setPersoMail(String persoMail) {
		this.persoMail = persoMail;
	}
	public String getProMail() {
		return proMail;
	}
	public void setProMail(String proMail) {
		this.proMail = proMail;
	}
	public Adress getAdress() {
		return adress;
	}
	public void setAdress(Adress adress) {
		this.adress = adress;
	}
	public Person(String firstName, String lastName, String proMail) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.proMail = proMail;
	}
	
	
	
	
	
	
}
