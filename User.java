package com.day10.demorest;


import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class User {
    private String name;
    private String phone;
    
    public User() {
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getName() {
        return name;
    }
    public String getPhone() {
        return phone;
    }
}