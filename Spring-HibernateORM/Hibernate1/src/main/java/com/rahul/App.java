package com.rahul;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.rahul.entity.Payment;

public class App 
{
    public static void main( String[] args )
    {
        Configuration configuration = new Configuration();
        configuration.configure("\\com\\rahul\\config\\hibernate-cfg.xml");
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        
        Payment payment = new Payment();
        payment.setAmount(1000);
        payment.setStatus("Pending");
        payment.setDescription("This is Iphone");
        payment.setSentBy("Rahul");
        
        session.save(payment);
        transaction.commit();
    }
}
