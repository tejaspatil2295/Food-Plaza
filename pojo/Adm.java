package com.pojo;

public class Adm {
	private String Admin_email;
	private String Admin_pword;
	public Adm() {
		super();
	}
	public Adm(String admin_email, String admin_pword) {
		super();
		Admin_email = admin_email;
		Admin_pword = admin_pword;
	}
	public String getAdmin_email() {
		return Admin_email;
	}
	public void setAdmin_email(String admin_email) {
		Admin_email = admin_email;
	}
	public String getAdmin_pword() {
		return Admin_pword;
	}
	public void setAdmin_pword(String admin_pword) {
		Admin_pword = admin_pword;
	}
	@Override
	public String toString() {
		return "Adm [Admin_email=" + Admin_email + ", Admin_pword=" + Admin_pword + "]";
	}
}
