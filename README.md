technology:
* mvn
* bpmn2
* spring
* cxf(rs - ws)
* jetty


1) jbpm-endPoint is a module whit all the endPoints, this module should be started in your local enviroments
	-- this application shuld be run with jetty -> mvn jetty:run after that
		-- http://localhost:8080/jbpm-endPoint -> it should show "Hello jbpm"
		-- http://localhost:8080/jbpm-endPoint/services -> it should show all the end-points
			-- you should see two sections
				a) Available SOAP services -> wsdl section:
				b) Available RESTful services -> wadl section:

For more information you can see /jbpm-endPoints/src/main/resources/README.txt
