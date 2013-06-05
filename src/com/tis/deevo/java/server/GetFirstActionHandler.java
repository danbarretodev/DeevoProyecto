package com.tis.deevo.java.server;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import org.mortbay.log.Log;

import com.gwtplatform.dispatch.server.actionhandler.ActionHandler;
import com.tis.deevo.java.client.GetDataResult;
import com.tis.deevo.java.client.GetFirst;
import com.tis.deevo.java.client.GetFirstResult;
import com.google.inject.Inject;
import com.gwtplatform.dispatch.server.ExecutionContext;
import com.gwtplatform.dispatch.shared.ActionException;

public class GetFirstActionHandler implements
		ActionHandler<GetFirst, GetFirstResult> {

	@Inject
	public GetFirstActionHandler() {
	}

	@Override
	public GetFirstResult execute(GetFirst action, ExecutionContext context)
			
			throws ActionException {
		
		EntityManager em = EMF.get().createEntityManager();
		

		Persona persona=null;
		
		try {
		           		            
		            persona=em.find(Persona.class,null);
		        } catch (Exception e) {
		        
		        
		        } finally {
		            
		        }

		String nombre=persona.getPer_nom();

		

		return new GetFirstResult(nombre);
	}

	@Override
	public void undo(GetFirst action, GetFirstResult result,
			ExecutionContext context) throws ActionException {
	}

	@Override
	public Class<GetFirst> getActionType() {
		return GetFirst.class;
	}
}
