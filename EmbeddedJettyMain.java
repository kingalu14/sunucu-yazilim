package net.kinginfotech.embeddedjetty;

import org.eclipse.jetty.server.Connector;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.util.resource.ResourceCollection;
import org.eclipse.jetty.webapp.WebAppContext; 

public class EmbeddedJettyMain  {

	public static void main(String[] args) throws Exception {
		   Server server = new Server(8080);
		   // ServletContextHandler handler = new ServletContextHandler(server, "/example");
		   //handler.addServlet(ExampleServlet.class, "/");
		   // server.start();
		   
		    WebAppContext wac = new WebAppContext();
	        wac.setContextPath("/myapp");
	        wac.setBaseResource(
	            new ResourceCollection(
	                new String[] {"./src/main/webapp"}));

	        server.setHandler(wac);
	        server.setStopAtShutdown(true);
	        server.start();
	        server.join();

	}

}
