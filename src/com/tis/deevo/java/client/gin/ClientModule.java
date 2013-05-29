package com.tis.deevo.java.client.gin;

import com.gwtplatform.mvp.client.gin.AbstractPresenterModule;
import com.gwtplatform.mvp.client.gin.DefaultModule;
import com.tis.deevo.java.client.place.ClientPlaceManager;
import com.tis.deevo.java.client.FirstPresenter;
import com.tis.deevo.java.client.FirstView;
import com.tis.deevo.java.client.place.DefaultPlace;
import com.tis.deevo.java.client.place.NameTokens;
import com.tis.deevo.java.client.SecondPresenter;
import com.tis.deevo.java.client.SecondView;

public class ClientModule extends AbstractPresenterModule {

	@Override
	protected void configure() {
		install(new DefaultModule(ClientPlaceManager.class));

		bindPresenter(FirstPresenter.class, FirstPresenter.MyView.class,
				FirstView.class, FirstPresenter.MyProxy.class);

		bindConstant().annotatedWith(DefaultPlace.class).to(NameTokens.first);

		bindPresenterWidget(SecondPresenter.class,
				SecondPresenter.MyView.class, SecondView.class);

		bindPresenter(SecondPresenter.class, SecondPresenter.MyView.class,
				SecondView.class, SecondPresenter.MyProxy.class);
	}
}
