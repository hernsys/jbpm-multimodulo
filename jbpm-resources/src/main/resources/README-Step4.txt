1) jbpm-endPoint: it is a module whit all the endPoints, this module should be started in your local enviroments
		-- this application runs with jetty -> access the directory jbpm-endPoints and execute: mvn jetty:run
			-- http://localhost:8080/jbpm-endPoint -> it shows "Hello jbpm"
			-- http://localhost:8080/jbpm-endPoint/services -> it shows all the end-points(RS and WS)
				-- you should see two sections
					a) Available SOAP services -> wsdl section:
					b) Available RESTful services -> wadl section:



2) jbpm-services: it has all the WorkItemhandlers so it is the module(jbpm-services.jar) that you should put in the "jbpm console NG"

3) Changes in the "jbpm Console NG":

	3.a) You should create the jar jbpm-service.jar 
		3.a.1) if you is working with .war you should copy this jar into the jbpm-console.war/WEB-INF/lib directory 
		3.a.2) if you is working in "Dev mode" you should add this jar(external jar) into to buildPath 

	3.b) Configure the handlers in WEB-INF/classes/META-INF/CustomWorkItemHandlers.conf, 
		3.b.1) if you is working with .war this file is in WEB-INF/classes/META-INF/CustomWorkItemHandlers.conf
		3.b.2) if you is working in "Dev mode" this file is in /jbpm-console-ng-showcase/src/main/resources/META-INF/CustomWorkItemHandlers.conf 
		
			Add in this file the next line
			"step4": new com.hernsys.workItems.Step4WorkItemHandler(),




4) When "jbpm console NG" is executed you should make the following changes
	
	4.a) Authoring -> Process Authoring
	4.b) New -> Project
		4.b.1) Resource Name : step4
		4.b.2) Project Name : step4
			   Project Description: -
			   Group ID : org.hernsys
			   Artifact ID : step4
			   Version ID : 1.0.0
	4.c) you should access to the new project "step4"
		4.c.1) New -> Business Process
		4.c.2) Resource Name : step4
	4.d) in "Work Item Definitions" you should edit the WorkItemDefinitions
		4.d.1) Put in this code, and save. (for default there are 4 components (Email, Log, WS, REST)), at this moment 
			   we are creating the new option "save user" -> These options appear in the left tool ("Service Tasks" in the designer's tooling)
			   
				import org.drools.core.process.core.datatype.impl.type.StringDataType;
				import org.drools.core.process.core.datatype.impl.type.ObjectDataType;
				
				[
				  [
				    "name" : "Email",
				    "parameters" : [
				      "From" : new StringDataType(),
				      "To" : new StringDataType(),
				      "Subject" : new StringDataType(),
				      "Body" : new StringDataType()
				    ],
				    "displayName" : "Email",
				    "icon" : "defaultemailicon.gif"
				  ],
				
				  [
				    "name" : "Log",
				    "parameters" : [
				      "Message" : new StringDataType()
				    ],
				    "displayName" : "Log",
				    "icon" : "defaultlogicon.gif"
				  ],
				
				  [
				    "name" : "WebService",
				    "parameters" : [
				        "Url" : new StringDataType(),
				         "Namespace" : new StringDataType(),
				         "Interface" : new StringDataType(),
				         "Operation" : new StringDataType(),
				         "Parameter" : new StringDataType(),
				         "Mode" : new StringDataType()
				    ],
				    "results" : [
				        "Result" : new ObjectDataType(),
				    ],
				    "displayName" : "WS",
				    "icon" : "defaultservicenodeicon.png"
				  ],
				
				  [
				    "name" : "Rest",
				    "parameters" : [
				        "Url" : new StringDataType(),
				        "Method" : new StringDataType(),
				        "ConnectTimeout" : new StringDataType(),
				        "ReadTimeout" : new StringDataType(),
				        "Username" : new StringDataType(),
				        "Password" : new StringDataType()
				    ],
				    "results" : [
				        "Result" : new ObjectDataType(),
				    ],
				    "displayName" : "REST",
				    "icon" : "defaultservicenodeicon.png"
				  ],
				
				[
				    "name" : "step4",
				    "parameters" : [
				      "in_name" : new StringDataType(),
				      "in_age" : new StringDataType(),
				      "in_email" : new StringDataType()
				    ],
				    "displayName" : "save user",
				    "icon" : "defaulticon.gif"
				  ]
				
				]
				 
	4.e) Refresh project
	4.f) in "Business Processes" you should edit the "step4"
		4.f.1) In the top tooling select "Import from BPMN2" and select our process step4.bpmns (/jbpm-endPoints/src/main/resources/step4.bpmn2)
		4.f.2) In the top tooling select "Generate all froms"
	4.g) Tools -> Project Editor
		4.g.1) Build & Deploy

5)Process Definitions
	5.a) Play in the current proccess
	5.b) If you are logged in with a user belonging to "HR group" -> in the 
		5.b.1) Work -> Task List . You should see the first task for this new process. 		
		5.b.2) select this task and in the right section you should see "Details about this task" and in the work section you will have the options
		for to complete this task   
	5.c) after filling the data pertaining to this task: you should claim this task
	5.d) Select the option "Complete"
	5.e) This task will be finished

Cheer