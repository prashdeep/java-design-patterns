package com.classpath.behavior.template;

public class DummyServlet extends AbstractTemplate {

	@Override
	void service() {
		System.out.println("Called from the DummyServlet1 class");
	}
	

}
