package com.tis.deevo.java.client;

import javax.print.attribute.standard.PageRanges;

import com.gwtplatform.dispatch.shared.DispatchAsync;
import com.gwtplatform.mvp.client.Presenter;
import com.gwtplatform.mvp.client.View;
import com.gwtplatform.mvp.client.annotations.ProxyCodeSplit;
import com.gwtplatform.mvp.client.annotations.NameToken;
import com.tis.deevo.java.client.place.NameTokens;
import com.gwtplatform.mvp.client.proxy.ManualRevealCallback;
import com.gwtplatform.mvp.client.proxy.PlaceManager;
import com.gwtplatform.mvp.client.proxy.PlaceRequest;
import com.gwtplatform.mvp.client.proxy.ProxyPlace;
import com.gwtplatform.mvp.client.proxy.RevealContentEvent;
import com.google.inject.Inject;
import com.google.gwt.core.client.Callback;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.TextBox;
import com.gwtplatform.mvp.client.proxy.RevealRootContentEvent;

public class FirstPresenter extends
		Presenter<FirstPresenter.MyView, FirstPresenter.MyProxy> {
	
	public static final Object SLOT_rate = new Object();
	
	public interface MyView extends View {
		public Button getFirstboton() ;
		public TextBox getFirstbox();
		public Label getFirstLabel();
	}

	@ProxyCodeSplit
	@NameToken(NameTokens.first)
	public interface MyProxy extends ProxyPlace<FirstPresenter> {
	}

	@Inject
	public FirstPresenter(final EventBus eventBus, final MyView view,
			final MyProxy proxy) {
		super(eventBus, view, proxy);
	}

	@Override
	protected void revealInParent() {
		RevealContentEvent.fire(this, HeaderPresenter.SLOT_content ,this);
		//RevealRootContentEvent.fire(this, this);
	}
	
	@Override
	public boolean useManualReveal() {
		return true;
	}
	@Override
	public void prepareFromRequest(PlaceRequest request) {
		super.prepareFromRequest(request);
		GetData action = new GetData();
		dispatchAsync.execute(action, getDataCallback);
	}
	private AsyncCallback<GetDataResult> getDataCallback = ManualRevealCallback.create(this,new AsyncCallback<GetDataResult>() {
		
		public void onFailure(Throwable caught) {};
		
		public void onSuccess(GetDataResult result) {
			getView().getFirstbox().setText(result.getData());
		};
	});
	@Inject PlaceManager placemanager;
	
	@Inject RatePagePresenter ratepagepresenter;
	@Inject DispatchAsync dispatchAsync;
	
	@Override
	protected void onBind() {
		super.onBind();
		
	}

	@Override
	protected void onReset() {
		super.onReset();
		
		setInSlot(SLOT_rate, ratepagepresenter);
		getView().getFirstboton().addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				// TODO Auto-generated method stub
				/*PlaceRequest request = new PlaceRequest(NameTokens.second).with("name", getView().getFirstbox().getText());
				placemanager.revealPlace(request);*/
				
				GetFirst action = new GetFirst(getView().getFirstbox().getText());
				dispatchAsync.execute(action, getCallback);
			}
		});
	}
	private AsyncCallback<GetFirstResult> getCallback = new AsyncCallback<GetFirstResult>() {

		@Override
		public void onFailure(Throwable caught) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void onSuccess(GetFirstResult result) {
			// TODO Auto-generated method stub
			PlaceRequest request = new PlaceRequest(NameTokens.second).with("name", result.getText());
			placemanager.revealPlace(request);
			
		}
	};
}
