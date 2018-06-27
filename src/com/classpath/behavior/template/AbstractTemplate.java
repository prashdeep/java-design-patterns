package com.classpath.behavior.template;

public abstract class AbstractTemplate {
	private String url;
	private String hostName;
	private String password;
	
	public AbstractTemplate(String url, String hostName, String password) {
		this.url = url;
		this.hostName = hostName;
		this.password = password;
	}
	
	public final void execute() {
		init();
		
		service();
		
		destroy();
	}

	 void destroy() {
		System.out.println("Cleaning up the resources ...");
	}

	 abstract void service();

	 private final void init() {
		System.out.println("Default init method..");
		
	}
	

}
