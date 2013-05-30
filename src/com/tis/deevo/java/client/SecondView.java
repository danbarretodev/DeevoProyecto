package com.tis.deevo.java.client;

import com.gwtplatform.mvp.client.ViewImpl;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Widget;
import com.google.inject.Inject;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Hyperlink;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.HTMLPanel;

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
	
	@Override
	public void setInSlot(Object slot, Widget content) {
		// TODO Auto-generated method stub
		if(slot == SecondPresenter.SLOT_list){
			
			listpanel.clear();
			if(content != null){
				listpanel.add(content);
			}
		}else{
			super.setInSlot(slot, content);
		}
	}
	
	@Override
	public void addToSlot(Object slot, Widget content) {
		// TODO Auto-generated method stub
		if(slot == SecondPresenter.SLOT_list){
			
			if(content != null){
				listpanel.add(content);
			}
		}else{
			super.addToSlot(slot, content);
		}
	}
	
	@UiField Hyperlink hipervinculo;
	@UiField TextBox secondtext1;
	@UiField HTMLPanel listpanel;
	public Hyperlink getHipervinculo() {
		return hipervinculo;
	}

	public TextBox getSecondtext() {
		return secondtext1;
	}
	
	
}
