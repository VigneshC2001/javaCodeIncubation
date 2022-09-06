package com.day10.demorest;

import com.day10.demorest.User;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("getUser")
public class CustomResource {
    
    @GET
    @Produces(MediaType.APPLICATION_XML)
    public User getUser() {
        
        System.out.println("getUser Called!");
        User user = new User();
        user.setName("Varun");
        user.setPhone("xxxxxxxxxx");
        System.out.println(user);
        return user;
    }
}