package com.tis.deevo.java.client;

import com.gwtplatform.mvp.client.ViewImpl;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Widget;
import com.google.inject.Inject;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Hyperlink;
import com.google.gwt.user.client.ui.TextBox;

public class SecondView extends ViewImpl implements SecondPresenter.MyView {

	private final Widget widget;

	public interface Binder extends UiBinder<Widget, SecondView> {
	}

	@Inject
	public SecondView(final Binder binder) {
		widget = binder.createAndBindUi(this);
	}

	@Override
	public Widget asWidget() {
		return widget;
	}
	@UiField Hyperlink hipervinculo;
	@UiField TextBox secondtext;
	public Hyperlink getHipervinculo() {
		return hipervinculo;
	}

	public TextBox getSecondtext() {
		return secondtext;
	}
	
	
}
