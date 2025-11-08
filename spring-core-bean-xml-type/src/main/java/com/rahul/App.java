package com.rahul;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
   public static void main(String[] args) {
	ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("\\com\\rahul\\resource\\applicationContext.xml");
	
	Account account =  (Account) applicationContext.getBean("acc");
	System.out.println(account);
	applicationContext.close();
}
   
}
