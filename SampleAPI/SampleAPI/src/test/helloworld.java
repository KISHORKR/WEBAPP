package test;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
@Path("/hello")
public class helloworld {
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String print() {
		String s="<?xml version='1.0'?>"+"<hello>Hello World</hello>";
		return s;
	}
	
}
