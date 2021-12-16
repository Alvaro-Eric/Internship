/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import org.hibernate.Session;

/**
 *
 * @author Alvaro
 */
public class Main {
    public static void main(String[] args){
        Session s = HibernateUtil.getSessionFactory().openSession();
    }
}
