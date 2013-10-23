package com.hernsys.workItems;

import org.kie.api.runtime.process.WorkItem;
import org.kie.api.runtime.process.WorkItemHandler;
import org.kie.api.runtime.process.WorkItemManager;

import com.hernsys.entities.Customer;

public class Step4WorkItemHandler implements WorkItemHandler {

	@Override
	public void executeWorkItem(WorkItem workItem, WorkItemManager manager) {
		try{
			Customer customer = new Customer();
			customer.setAge((Integer) workItem.getParameter("in_age"));
			customer.setEmail((String) workItem.getParameter("in_name"));
			customer.setEmail((String) workItem.getParameter("in_email"));
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
