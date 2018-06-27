package com.classpath.behavior.template;

public class DummyServlet extends AbstractTemplate {

	public DummyServlet(String url, String hostName, String password) {
		super(url, hostName, password);
		}

	@Override
	void service() {
		System.out.println("Called from the DummyServlet1 class");
	}
	

}
