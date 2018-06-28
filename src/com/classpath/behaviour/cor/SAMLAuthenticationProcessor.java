package com.classpath.behaviour.cor;

public class SAMLAuthenticationProcessor extends AuthenticationProcessor{

    public SAMLAuthenticationProcessor(AuthenticationProcessor nextProcessor) {
		super(nextProcessor);
	}

	@Override
    public boolean isAuthorized(AuthenticationProvider authProvider) {
        if (authProvider instanceof SamlAuthenticationProvider) {
            return Boolean.TRUE;
        } else if (nextProcessor != null) {
            return nextProcessor.isAuthorized(authProvider);
        } else {
            return Boolean.FALSE;
        }
    }

}
