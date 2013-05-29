package com.tis.deevo.java.client;

import com.gwtplatform.mvp.client.ViewImpl;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Widget;
import com.google.inject.Inject;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.Label;

public class FirstView extends ViewImpl implements FirstPresenter.MyView {

	private final Widget widget;

	public interface Binder extends UiBinder<Widget, FirstView> {
	}

	@Inject
	public FirstView(final Binder binder) {
		widget = binder.createAndBindUi(this);
	}

	@Override
	public Widget asWidget() {
		return widget;
	}
	
	@UiField Button firstboton;
	@UiField TextBox firstbox;
	@UiField Label firstLabel;
	public Button getFirstboton() {
		return firstboton;
	}

	public TextBox getFirstbox() {
		return firstbox;
	}

	public Label getFirstLabel() {
		return firstLabel;
	}
	
	
}
