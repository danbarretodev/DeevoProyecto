package com.tis.deevo.java.client;

import com.gwtplatform.mvp.client.ViewImpl;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Widget;
import com.google.inject.Inject;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Button;

public class RatePageView extends ViewImpl implements RatePagePresenter.MyView {

	private final Widget widget;

	public interface Binder extends UiBinder<Widget, RatePageView> {
	}

	@Inject
	public RatePageView(final Binder binder) {
		widget = binder.createAndBindUi(this);
	}

	@Override
	public Widget asWidget() {
		return widget;
	}
	@UiField Button botonsi;
	@UiField Button botonno;
	public Button getBotonsi() {
		return botonsi;
	}

	public Button getBotonno() {
		return botonno;
	}
	
}
