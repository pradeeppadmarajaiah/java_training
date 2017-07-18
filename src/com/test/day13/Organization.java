package com.test.day13;

public abstract class Organization {

	public int getTotalEmployeeCount() {
		return 123;
	}

	public abstract String getOrganizationName();

	public static void main(String[] args) {
		PradeepOrganization organization = new PradeepOrganization();
		System.out.println(organization.getTotalEmployeeCount());
	}

}

class PradeepOrganization extends Organization {

	@Override
	public int getTotalEmployeeCount() {

		return 1000;
	}

	@Override
	public String getOrganizationName() {
		return "Pradeep";
	}

}