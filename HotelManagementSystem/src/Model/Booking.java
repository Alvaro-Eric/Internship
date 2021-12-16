/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;
import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


/**
 *
 * @author Alvaro
 */
@Entity
public class Booking implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "roomid")
    private Room room;
    @ManyToOne
    @JoinColumn(name = "customerid")
    private Customer customer;
    private LocalDate startDate;
    private LocalDate endDate;
    @Enumerated(EnumType.STRING)
    private AvailableStatus status;

    public Booking(Long id, Room room, Customer customer, LocalDate startDate, LocalDate endDate, AvailableStatus status) {
        this.id = id;
        this.room = room;
        this.customer = customer;
        this.startDate = startDate;
        this.endDate = endDate;
        this.status = status;
    }

    public Booking(Room room, Customer customer, LocalDate startDate, LocalDate endDate, AvailableStatus status) {
        this.room = room;
        this.customer = customer;
        this.startDate = startDate;
        this.endDate = endDate;
        this.status = status;
    }

    public Booking(Room room, LocalDate startDate, LocalDate endDate, AvailableStatus status) {
        this.room = room;
        this.startDate = startDate;
        this.endDate = endDate;
        this.status = status;
    }
    
    
    public Booking(Room room, AvailableStatus status) {
        this.room = room;
        this.status = status;
    }

    
    

    public Booking() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public AvailableStatus getStatus() {
        return status;
    }

    public void setStatus(AvailableStatus status) {
        this.status = status;
    }
       
    
    
    
    
    
}
