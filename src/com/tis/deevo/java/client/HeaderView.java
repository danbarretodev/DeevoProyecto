package com.tis.deevo.java.client;

import com.gwtplatform.mvp.client.ViewImpl;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Widget;
import com.google.inject.Inject;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.Label;

public class HeaderView extends ViewImpl implements HeaderPresenter.MyView {

	private final Widget widget;

	public interface Binder extends UiBinder<Widget, HeaderView> {
	}

	@Inject
	public HeaderView(final Binder binder) {
		widget = binder.createAndBindUi(this);
	}

	@Override
	public Widget asWidget() {
		return widget;
	}
	@UiField HTMLPanel contentpanel;
	@UiField Label labelfeliz;
	
	@Override
	public void setInSlot(Object slot, Widget content) {
		// TODO Auto-generated method stub
		if(slot == HeaderPresenter.SLOT_content){
			contentpanel.clear();
			if(content != null){
				contentpanel.add(labelfeliz);
				contentpanel.add(content);
			}
		}else{
			super.setInSlot(slot, content);
		}
	}

	public HTMLPanel getContentpanel() {
		return contentpanel;
	}

	public Label getLabelfeliz() {
		return labelfeliz;
	}
	
	
	
}
