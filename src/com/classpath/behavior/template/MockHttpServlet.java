package com.classpath.behavior.template;

public class MockHttpServlet extends AbstractTemplate {

	public MockHttpServlet(String url, String hostName, String password) {
		super(url, hostName, password);
	}

	@Override
	void service() {
		System.out.println("Called from the MockHttpService ");
	}

	@Override
	public void destroy() {
		System.out.println("Cleaning up the resources in the destory method..");
	}

}
