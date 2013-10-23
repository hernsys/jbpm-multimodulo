--you could import the files *.bpmn2 in a new proyect in "jbpm console NG" after that you should 
to generate all forms

-- jbpm-init is a module of reference, this module should not be imported in "jbpm console ng"
-- Copy the jbpm-services *jar into the jbpm-console.war/WEB-INF/lib directory 
-- Copy the jbpm-backend *jar into the jbpm-console.war/WEB-INF/lib directory

-- Configure the handlers in WEB-INF/classes/META-INF/CustomWorkItemHandlers.conf
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