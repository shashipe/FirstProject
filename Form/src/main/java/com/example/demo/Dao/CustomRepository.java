package com.example.demo.Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.Entity.Book;
import com.example.demo.Entity.BookPublisher;
import com.example.demo.Entity.Employee_Address;
import com.example.demo.Entity.Publisher;
import com.example.demo.Entity.UserDetails;



@Repository
@Transactional
public class CustomRepository {

    @PersistenceContext
    EntityManager entityManager;
    
    public List<UserDetails> getFirstNamesLike(String firstName) {
    	
        Query query = entityManager.createNativeQuery("SELECT * from user_details u " +
                "WHERE u.first_name LIKE ?", UserDetails.class);
        query.setParameter(1, firstName + "%");
        
        return query.getResultList();
    }
    
    public void saveEmloyee(){
    	/*Employee e=new Employee();
    	e.setEmpName("satya");
    	Employee_Address ea=new Employee_Address();
    	ea.setCity("hyd");
    	ea.setEmployee(e);
    	Set<Employee_Address> l=new HashSet<Employee_Address>();
    	l.add(ea);
    	e.setEmployeeAddress(l);
    	entityManager.persist(e);*/
    	
    	
    	Book b=new Book();
        b.setId(1);
    	Publisher p=new Publisher();
    	p.setId(1);
    	BookPublisher bp=new BookPublisher();
    	bp.setBook(b);
    	bp.setPublisher(p);
    	
    	entityManager.persist(bp);
    	
    }
    
    



	public void saveEmplyeeAddress(Employee_Address employee_Address) {
		entityManager.persist(employee_Address);		
	}
    
}
