package com.tis.deevo.java.server;

import com.gwtplatform.dispatch.server.actionhandler.ActionHandler;
import com.tis.deevo.java.client.GetData;
import com.tis.deevo.java.client.GetDataResult;
import com.google.inject.Inject;
import com.gwtplatform.dispatch.server.ExecutionContext;
import com.gwtplatform.dispatch.shared.ActionException;

public class GetDataActionHandler implements
		ActionHandler<GetData, GetDataResult> {

	@Inject
	public GetDataActionHandler() {
	}

	
	@Override
	public GetDataResult execute(GetData action, ExecutionContext context)
			throws ActionException {
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
		}
		return new GetDataResult("Some Data =P");
	}

	
	@Override
	public void undo(GetData action, GetDataResult result, ExecutionContext context)
			throws ActionException {
	}

	@Override
	public Class<GetData> getActionType() {
		return GetData.class;
	}
}
