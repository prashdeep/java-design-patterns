package com.classpath.behavior.template;

public class TemplateClient {
	public static void main(String[] args) {
		AbstractTemplate template = new MockHttpServlet("","","");
		template.execute();
	}

}
