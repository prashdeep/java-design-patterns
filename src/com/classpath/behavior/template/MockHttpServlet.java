package com.classpath.behavior.template;

public class MockHttpServlet extends AbstractTemplate {

	@Override
	void init() {
		System.out.println("Custom initilization logic");
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
