package com.classpath.behaviour.cor;

public class ChainOfResponsibilityTest {
	
	public static void main(String[] args) {
		getChainOfAuthProcessor();
		givenOAuthProvider_whenCheckingAuthorized_thenSuccess();
		givenSamlProvider_whenCheckingAuthorized_thenSuccess();
	}
	
    private static AuthenticationProcessor getChainOfAuthProcessor() {
        AuthenticationProcessor oAuthProcessor = new OAuthAuthenticationProcessor(null);
        return new UsernamePasswordAuthenticationProcessor(oAuthProcessor);
    }
 
    
    public static void givenOAuthProvider_whenCheckingAuthorized_thenSuccess() {
        AuthenticationProcessor authProcessorChain = getChainOfAuthProcessor();
        System.out.println((authProcessorChain.isAuthorized(new OAuthTokenProvider())));
    }
 
    public static void givenSamlProvider_whenCheckingAuthorized_thenSuccess() {
        AuthenticationProcessor authProcessorChain = getChainOfAuthProcessor();
  
        System.out.println((authProcessorChain.isAuthorized(new SamlAuthenticationProvider())));
    }
}
