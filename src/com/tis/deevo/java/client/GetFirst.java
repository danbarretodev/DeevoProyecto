package com.tis.deevo.java.client;

import com.gwtplatform.dispatch.shared.ActionImpl;
import com.tis.deevo.java.client.GetFirstResult;
import java.lang.String;

public class GetFirst extends ActionImpl<GetFirstResult> {

	private String text;

	@Override
	public boolean isSecured() {
		// TODO Auto-generated method stub
		return true;
	}
	@SuppressWarnings("unused")
	private GetFirst() {
		// For serialization only
	}

	public GetFirst(String text) {
		this.text = text;
	}

	public String getText() {
		return text;
	}
}
