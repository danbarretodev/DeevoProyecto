package com.tis.deevo.java.client.place;

import com.gwtplatform.mvp.client.proxy.PlaceManagerImpl;
import com.gwtplatform.mvp.client.proxy.PlaceRequest;
import com.tis.deevo.java.client.place.DefaultPlace;
import com.google.inject.Inject;
import com.google.gwt.event.shared.EventBus;
import com.gwtplatform.mvp.client.proxy.TokenFormatter;

public class ClientPlaceManager extends PlaceManagerImpl {

	private final PlaceRequest defaultPlaceRequest;

	@Inject
	public ClientPlaceManager(final EventBus eventBus,
			final TokenFormatter tokenFormatter,
			@DefaultPlace final String defaultPlaceNameToken) {
		super(eventBus, tokenFormatter);
		this.defaultPlaceRequest = new PlaceRequest(defaultPlaceNameToken);
	}

	@Override
	public void revealDefaultPlace() {
		revealPlace(defaultPlaceRequest, false);
	}
	
	@Override
	public void revealErrorPlace(String invalidHistoryToken) {
		// TODO Auto-generated method stub
		//super.revealErrorPlace(invalidHistoryToken);
		PlaceRequest request = new PlaceRequest(NameTokens.error);
		revealPlace(request,false);
	} 
	
	@Override
	public void revealUnauthorizedPlace(String unauthorizedHistoryToken) {
		// TODO Auto-generated method stub
		
		PlaceRequest current = getCurrentPlaceRequest();
		PlaceRequest request = new PlaceRequest(NameTokens.login);
		revealPlace(request);
		//super.revealUnauthorizedPlace(unauthorizedHistoryToken);
	}
}
