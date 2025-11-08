package com.rahul;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.rahul.bean.Order;
import com.rahul.bean.config.SpringConfiig;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfiig.class);
        Order order = applicationContext.getBean(Order.class);
        System.out.println("Employee Id : "+order.getEmpId()+"\nEmployee Name :"+order.getEmpName()+"\nEmployee Salary : "+order.getEmpSal());
    }
}
