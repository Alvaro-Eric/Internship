/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author Alvaro
 */
@Entity
public class Customer implements Serializable {
    @Id
    private String customerid;
    private String firstname;
    private String lastname;
    private String contact;
    private CustomerCategory customerCategory;

    public Customer() {
    }

    public Customer(String customerid, String firstname, String lastname, String contact, CustomerCategory customerCategory) {
        this.customerid = customerid;
        this.firstname = firstname;
        this.lastname = lastname;
        this.contact = contact;
        this.customerCategory = customerCategory;
    }

    public Customer(String customerid, CustomerCategory customerCategory) {
        this.customerid = customerid;
        this.customerCategory = customerCategory;
    }
    
    public String getCustomerid() {
        return customerid;
    }

    public void setCustomerid(String customerid) {
        this.customerid = customerid;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public CustomerCategory getCustomerCategory() {
        return customerCategory;
    }

    public void setCustomerCategory(CustomerCategory customerCategory) {
        this.customerCategory = customerCategory;
    }
    
    
    
    
   
    
}
