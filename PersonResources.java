package com.maven.Day9;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("person")
public class PersonResources {
	
	
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public Person getperson() {
		
		System.out.println("getperson called");
		
		Person p=new Person();
		p.setName("vicky");
		p.setId(1);
		
		return p;
	}

}
