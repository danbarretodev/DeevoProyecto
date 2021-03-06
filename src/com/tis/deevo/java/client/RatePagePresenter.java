package com.tis.deevo.java.client;

import com.gwtplatform.mvp.client.PresenterWidget;
import com.gwtplatform.mvp.client.View;
import com.google.inject.Inject;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.shared.EventBus;
//import com.google.web.bindery.event.shared.EventBus;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;

public class RatePagePresenter extends
		PresenterWidget<RatePagePresenter.MyView> {

	public interface MyView extends View {
		public Button getBotonsi() ;

		public Button getBotonno() ;
	}

	private EventBus eventBus;
	@Inject
	public RatePagePresenter(final com.google.gwt.event.shared.EventBus eventBus, final MyView view) {
		super(eventBus, view);
		
		this.eventBus = eventBus;
	}

	@Inject WhyNotPresenter whyNotPresenter;
	@Override
	protected void onBind() {
		super.onBind();
		getView().getBotonsi().addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				// TODO Auto-generated method stub
				Window.alert("que bien");
			}
		});
		
		getView().getBotonno().addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				// TODO Auto-generated method stub
				//Window.alert("fue pe");
				UserNotHappyEvent userNotHappyEvent = new UserNotHappyEvent();
				RatePagePresenter.this.eventBus.fireEvent(userNotHappyEvent);
				addToPopupSlot(whyNotPresenter);
			}
		});
	}
}
