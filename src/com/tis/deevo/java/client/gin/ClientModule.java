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
import com.tis.deevo.java.client.HeaderPresenter;
import com.tis.deevo.java.client.HeaderView;
import com.tis.deevo.java.client.ThirdPresenter;
import com.tis.deevo.java.client.ThirdView;
import com.tis.deevo.java.client.RatePagePresenter;
import com.tis.deevo.java.client.RatePageView;


public class ClientModule extends AbstractPresenterModule {

	@Override
	protected void configure() {
		install(new DefaultModule(ClientPlaceManager.class));

		bindPresenter(FirstPresenter.class, FirstPresenter.MyView.class,
				FirstView.class, FirstPresenter.MyProxy.class);

		bindConstant().annotatedWith(DefaultPlace.class).to(NameTokens.first);


		bindPresenter(SecondPresenter.class, SecondPresenter.MyView.class,
				SecondView.class, SecondPresenter.MyProxy.class);

		bindPresenter(HeaderPresenter.class, HeaderPresenter.MyView.class,
				HeaderView.class, HeaderPresenter.MyProxy.class);



		bindPresenter(ThirdPresenter.class, ThirdPresenter.MyView.class,
				ThirdView.class, ThirdPresenter.MyProxy.class);

		bindPresenterWidget(RatePagePresenter.class,
				RatePagePresenter.MyView.class, RatePageView.class);
	}
}
