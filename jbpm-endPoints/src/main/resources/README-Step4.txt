1) jbpm-endPoint is a module whit all the endPoints, this module should be started in your local enviroments
		-- this application should be run with jetty -> mvn jetty:run after that
			-- http://localhost:8080/jbpm-endPoint -> it shows "Hello jbpm"
			-- http://localhost:8080/jbpm-endPoint/services -> it shows all the end-points(RS and WS)
				-- you should see two sections
					a) Available SOAP services -> wsdl section:
					b) Available RESTful services -> wadl section:



2) jbpm-services has all the WorkItemhandlers



3) Changes in the "jbpm Console NG":

	3.a) Copy the jbpm-services *jar into the jbpm-console.war/WEB-INF/lib directory or add this jar from the buildPath

	3.b) Configure the handlers in WEB-INF/classes/META-INF/CustomWorkItemHandlers.conf, this file in de project is /jbpm-console-ng-showcase/src/main/resources/META-INF/CustomWorkItemHandlers.conf

"step4": new com.hernsys.workItems.Step4WorkItemHandler(),




4) When "jbpm console NG" is executed you should make the following steps
	
	4.a) All the components that we define in WorkDefinitions.wid will appear in the Tooling of "Jbpm Console NG" 
in the section "Services Task" . Therefore if we define a new component it must appear in this section, for example:
	- WorkDefinitions.wid is create when we create the project in the "jbpm-console ng"(inside of WORK ITEM DEFINITIONS in the left panel) for default 
	there are 4 components (Email, Log, WS, REST)

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
    "name" : "Step4",
    "parameters" : [
      "name" : new StringDataType(),
      "age" : new StringDataType(),
      "email" : new StringDataType()
    ],
    "displayName" : "Step4",
    "icon" : "defaulticon.gif"
  ]

]



	4.b) you should import the files step4.bpmn2 in a new project in "jbpm console NG" 
	4.c) you should to generate all the forms
