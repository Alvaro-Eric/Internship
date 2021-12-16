/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Model.AvailableStatus;
import Model.Booking;
import Model.Customer;
import Model.CustomerCategory;
import Model.Room;
import java.time.LocalDate;
import java.util.List;

/**
 *
 * @author Alvaro
 */
public class BookingRes implements BookingInterface {
    GenericDao<Booking> bkingDao = new GenericDao<>(Booking.class);
    GenericDao<Room> rmDao = new GenericDao<>(Room.class);
    GenericDao<Customer> cusDao = new GenericDao<>(Customer.class);
    
    Booking bking = new Booking();

    @Override
    public void availableRoom(String roomId) {
      Room rm = rmDao.findById(roomId);
      
      bkingDao.createA(new Booking(rm, AvailableStatus.AVAILABLE));
      rm.setAvailable(true);
      rmDao.updateA(rm);
    }

    @Override
    public void occupiedRoom(String roomId, LocalDate startDate, LocalDate endDate) {
     Room rm = rmDao.findById(roomId);
     
     if(rm == null){
       throw new RuntimeException("We Don't have this Room");
     }
     if(rm.isAvailable()== Boolean.FALSE){
       throw new RuntimeException("This room is Occupied");
     }
     
     bkingDao.createA(new Booking(rm, startDate, endDate, AvailableStatus.OCCUPIED));
     rm.setAvailable(false);
     rmDao.updateA(rm);
    }
    
    @Override
    public void singleRoom(String customerId) {
       Customer cc = new Customer();
       String customer = cc.getCustomerid();
       cusDao.createA(new Customer(customer, CustomerCategory.SINGLE));
    }

    @Override
    public void coupleRoom(String customerId) {
       Customer cc = new Customer();
       String customer = cc.getCustomerid();
       cusDao.createA(new Customer(customer, CustomerCategory.COUPLE)); 
    }

    @Override
    public void FamilyRoom(String customerId) {
       Customer cc = new Customer();
       String customer = cc.getCustomerid();
       cusDao.createA(new Customer(customer, CustomerCategory.FAMILY)); 
    }

    
}
