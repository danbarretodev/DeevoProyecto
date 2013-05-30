package com.tis.deevo.java.client.gin;

import com.google.gwt.inject.client.GinModules;
import com.gwtplatform.dispatch.client.gin.DispatchAsyncModule;
import com.tis.deevo.java.client.gin.ClientModule;
import com.google.gwt.inject.client.Ginjector;
import com.google.gwt.event.shared.EventBus;
import com.gwtplatform.mvp.client.proxy.PlaceManager;
import com.google.gwt.inject.client.AsyncProvider;
import com.tis.deevo.java.client.FirstPresenter;
import com.tis.deevo.java.client.SecondPresenter;
import com.tis.deevo.java.client.HeaderPresenter;
import com.tis.deevo.java.client.ThirdPresenter;


@GinModules({ DispatchAsyncModule.class, ClientModule.class })
public interface ClientGinjector extends Ginjector {

	EventBus getEventBus();

	PlaceManager getPlaceManager();

	AsyncProvider<FirstPresenter> getFirstPresenter();

	AsyncProvider<SecondPresenter> getSecondPresenter();

	AsyncProvider<HeaderPresenter> getHeaderPresenter();

	AsyncProvider<ThirdPresenter> getThirdPresenter();

}
