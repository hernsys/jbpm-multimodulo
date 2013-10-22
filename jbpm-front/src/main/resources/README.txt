-- Copy the jbpm-services *jar into the jbpm-console.war/WEB-INF/lib directory 

-- Configure the handlers in WEB-INF/classes/META-INF/CustomWorkItemHandlers.conf
"Step4": new com.hernsys.services.Step4WorkItemHandler(),


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