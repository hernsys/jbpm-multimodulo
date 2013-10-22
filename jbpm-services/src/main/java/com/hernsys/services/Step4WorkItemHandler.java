package com.hernsys.services;

import org.kie.api.runtime.process.WorkItem;
import org.kie.api.runtime.process.WorkItemHandler;
import org.kie.api.runtime.process.WorkItemManager;

public class Step4WorkItemHandler implements WorkItemHandler {

	@Override
	public void executeWorkItem(WorkItem workItem, WorkItemManager manager) {
		try{
			workItem.getParameter("in_customer_email");
			throw new Exception(); 
		}catch(Exception e){
			e.printStackTrace();
		}
        
		
	}

	@Override
	public void abortWorkItem(WorkItem workItem, WorkItemManager manager) {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
		
	}

}
