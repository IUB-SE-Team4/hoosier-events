package se.hoosierevents.project.springboot.controller;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class RegForm {

    private String name;
    private String password;
    private String address;
    private String email;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public RegForm(){};

    public RegForm(String name, String password, String address, String email){
        this.address=address;
        this.name=name;
        this.password=password;
        this.email=email;
    }
}
