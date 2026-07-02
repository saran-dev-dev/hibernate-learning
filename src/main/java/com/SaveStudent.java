package com;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class SaveStudent {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("postgresql");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		Student s=new Student();
		s.setId(101);
		s.setName("Saran");
		s.setAge(23);
		s.setMobile(988634623);
		s.setWeight(77);
		
		/*
		 * et.begin(); em.persist(s); et.commit();
		 */		
	System.out.println("Id :"+s.getId()+" "+"Name :"+s.getName());
	} 
}







