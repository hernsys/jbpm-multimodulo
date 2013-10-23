++ jbpm-endPoint is a module whit the endPoints, this module should be started in your local enviroments
		-- this application shuld be run with jetty -> mvn jetty:run after that
			-- http://localhost:8080/jbpm-endPoint -> it should show "Hello jbpm"
			-- http://localhost:8080/jbpm-endPoint/services -> it should show all the end-points

++ you must import the files *.bpmn2 in a new proyect in "jbpm console NG" after that you should 
to generate all forms

++ Copy the jbpm-services *jar into the jbpm-console.war/WEB-INF/lib directory 
++ Copy the jbpm-backend *jar into the jbpm-console.war/WEB-INF/lib directory

++ Configure the handlers in WEB-INF/classes/META-INF/CustomWorkItemHandlers.conf
"Step4": new com.hernsys.workItems.Step4WorkItemHandler(),


[
  [
    "name" : "Step4",
    "parameters" : [
      "To" : new StringDataType(),
      "From" : new StringDataType(),
      "Subject" : new StringDataType(),
      "Body" : new StringDataType()
    ],
    "displayName" : "Step4",
    "icon" : "defaulticon.gif"
  ]
]