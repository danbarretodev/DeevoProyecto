package com.tis.deevo.java.client;

import com.gwtplatform.dispatch.shared.ActionImpl;
import com.tis.deevo.java.client.GetFirstResult;
import java.lang.String;

public class GetFirst extends ActionImpl<GetFirstResult> {

	private String text;

	
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
