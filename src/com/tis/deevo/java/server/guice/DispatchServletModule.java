package com.tis.deevo.java.server.guice;


import com.google.inject.servlet.ServletModule;
import com.gwtplatform.dispatch.shared.ActionImpl;
import com.gwtplatform.dispatch.shared.SecurityCookie;
import com.gwtplatform.dispatch.server.guice.DispatchServiceImpl;
import com.gwtplatform.dispatch.server.guice.HttpSessionSecurityCookieFilter;

public class DispatchServletModule extends ServletModule {

	@Override
	public void configureServlets() {
		serve("/" + ActionImpl.DEFAULT_SERVICE_NAME)
				.with(DispatchServiceImpl.class);

		bindConstant().annotatedWith(SecurityCookie.class).to("MYCOOKIE");
		
		filter("*").through(HttpSessionSecurityCookieFilter.class);
	}
}
