package com.tis.deevo.java.client;

import com.gwtplatform.dispatch.shared.ActionImpl;
import com.tis.deevo.java.client.GetDataResult;

public class GetData extends ActionImpl<GetDataResult> {

	public GetData() {
	}
	@Override
	public boolean isSecured() {
		return false;
		}
}
