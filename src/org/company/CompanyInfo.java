package org.company;

public class CompanyInfo {

	private void companyName() {
		System.out.println("Company Name : Greens Technology");
	}

	private void companyId() {
		System.out.println("Company ID ; 2246");
	}

	private void companyAddress() {
		System.out.println("Company Address : 51A," + "2nd floor," + "Velachery," + "Chennai-42");
	}

	private void companyMobile() {
		System.out.println("Company Mobile : 9965691225");
	}

	private void companyLAN() {
		System.out.println("Company LAN ; 044-0252246");
	}

	public static void main(String[] args) {
		CompanyInfo c = new CompanyInfo();
		c.companyName();
		c.companyId();
		c.companyAddress();
		c.companyMobile();
		c.companyLAN();

	}
}
