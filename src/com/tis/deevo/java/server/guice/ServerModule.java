package com.tis.deevo.java.server.guice;

import com.gwtplatform.dispatch.server.guice.HandlerModule;
import com.tis.deevo.java.client.GetFirst;
import com.tis.deevo.java.server.GetFirstActionHandler;
import com.tis.deevo.java.client.GetData;
import com.tis.deevo.java.server.GetDataActionHandler;

public class ServerModule extends HandlerModule {

	@Override
	protected void configureHandlers() {

		bindHandler(GetFirst.class, GetFirstActionHandler.class);

		bindHandler(GetData.class, GetDataActionHandler.class);
	}
}
