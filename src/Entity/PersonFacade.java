/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import java.util.Date;
import javax.persistence.EntityManager;

/**
 *
 * @author Kristian Nielsen
 */
public class PersonFacade {
    
    public void add(Person p, EntityManager em){
        em.getTransaction().begin();
        em.persist(p);
        em.getTransaction().commit();
    }
    
    public Person find(long id, EntityManager em){
        return em.find(Person.class, id);
    }
    
    public void edit(Person p, EntityManager em){
        em.getTransaction().begin();
        em.merge(p);
        em.getTransaction().commit();
    }
    
    public void delete(Person p, EntityManager em){
        em.getTransaction().begin();
        em.remove(p);
        em.getTransaction().commit();
    }
    
    
    
}
