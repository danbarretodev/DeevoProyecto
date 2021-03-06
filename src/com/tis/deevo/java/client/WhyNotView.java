package com.tis.deevo.java.client;

import com.gwtplatform.mvp.client.PopupViewImpl;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.event.shared.EventBus;
import com.google.inject.Inject;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Button;

public class WhyNotView extends PopupViewImpl implements WhyNotPresenter.MyView {

	private final Widget widget;

	public interface Binder extends UiBinder<Widget, WhyNotView> {
	}

	@Inject
	public WhyNotView(final EventBus eventBus, final Binder binder) {
		super(eventBus);
		widget = binder.createAndBindUi(this);
	}

	@Override
	public Widget asWidget() {
		return widget;
	}
	@UiField Button okbu;
	public Button getOkbu() {
		return okbu;
	}
	
	
}
