package com.hybrid.framework.util;

public class Keywords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericKeywords kw=new GenericKeywords();
		kw.openBrowser("chrome");
		kw.navigate("url");
		kw.click("gmailLink_xpath");
		kw.input("email_id", "email_Address");
		kw.click("nextButton_id");
		kw.input("password_id", "pwd");
		kw.click("signInButton_id");
		kw.closeBrowser();
	}

}
