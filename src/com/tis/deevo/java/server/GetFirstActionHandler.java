package com.tis.deevo.java.server;

import java.util.logging.Level;
import java.util.logging.Logger;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import com.gwtplatform.dispatch.server.actionhandler.ActionHandler;
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
		EntityTransaction tx = em.getTransaction();

		//Persona persona =new Persona();
		Persona per=new Persona();
	    //persona.setPer_dni("12345679");
		String id="12345679";
	    //persona.setPer_nom("IEEEVAN!!");
		//persona.setPer_nac(get);
		try {
					//tx.begin();
					//em.persist(persona);
					//persona = em.find(Persona.class, id);
					//tx.commit();
					//persona.setPer_nom("IEEEVAN!!!");
					//tx.begin();
		            //em.merge(persona);
		            per = em.find(Persona.class,id);
		            //tx.commit();
		        } catch (Exception e) {
		        	Logger log = Logger.getLogger("ERROR PERSIST");
		            log.log(Level.WARNING, "Rolling Back:", e);
		            tx.rollback();
		        
		        } finally {
		            em.close();
		        }

		String nombre=per.getPer_nom();
		nombre = verifica(nombre);
		

		return new GetFirstResult(nombre);
	}

	private String verifica(String nom) {
		
		if(nom == null){
			nom="FAAAAAIL";
		}
		// TODO Auto-generated method stub
		return nom;
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
