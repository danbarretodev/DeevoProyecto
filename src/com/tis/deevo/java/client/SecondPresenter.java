package com.tis.deevo.java.client;

import org.apache.tools.ant.listener.AnsiColorLogger;

import com.gwtplatform.common.client.IndirectProvider;
import com.gwtplatform.common.client.StandardProvider;
import com.gwtplatform.mvp.client.Presenter;
import com.gwtplatform.mvp.client.View;
import com.gwtplatform.mvp.client.annotations.ProxyCodeSplit;
import com.gwtplatform.mvp.client.annotations.NameToken;
import com.tis.deevo.java.client.place.NameTokens;
import com.gwtplatform.mvp.client.proxy.PlaceRequest;
import com.gwtplatform.mvp.client.proxy.ProxyPlace;
import com.gwtplatform.mvp.client.proxy.RevealContentEvent;
import com.google.inject.Inject;
import com.google.inject.Provider;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Hyperlink;
import com.google.gwt.user.client.ui.TextBox;
import com.gwtplatform.mvp.client.proxy.RevealRootContentEvent;

public class SecondPresenter extends
		Presenter<SecondPresenter.MyView, SecondPresenter.MyProxy> {

	public static final Object SLOT_list = new Object();
	
	public interface MyView extends View {
		public Hyperlink getHipervinculo();
		public TextBox getSecondtext();
		}
	
	private IndirectProvider<RatePagePresenter> ratepagefactory;
	
	@ProxyCodeSplit
	@NameToken(NameTokens.second)
	public interface MyProxy extends ProxyPlace<SecondPresenter> {
	}

	@Inject
	public SecondPresenter(final EventBus eventBus, final MyView view,
			final MyProxy proxy, Provider<RatePagePresenter> ratepagefactory) {
		super(eventBus, view, proxy);
		this.ratepagefactory = new StandardProvider<RatePagePresenter>(ratepagefactory);
	}

	@Override
	protected void revealInParent() {
		RevealContentEvent.fire(this, HeaderPresenter.SLOT_content ,this);
		//RevealRootContentEvent.fire(this, HeaderPresenter.SLOT_content ,this);
	}

	private String name="";
	@Override
	public void prepareFromRequest(PlaceRequest request) {
		// TODO Auto-generated method stub
		super.prepareFromRequest(request);
		name = request.getParameter("name", "Default Value");
	}
	
	@Override
	protected void onBind() {
		super.onBind();
	}

	@Override
	protected void onReset() {
		super.onReset();
		getView().getSecondtext().setText(name);
		
		setInSlot(SLOT_list, null);
		
		for (int i = 0; i < 3; i++) {
			ratepagefactory.get(new AsyncCallback<RatePagePresenter>() {
				
				@Override
				public void onSuccess(RatePagePresenter result) {
					// TODO Auto-generated method stub
					addToSlot(SLOT_list, result);
				}
				
				@Override
				public void onFailure(Throwable caught) {
					// TODO Auto-generated method stub
					
				}
			});
		}
	}
}
