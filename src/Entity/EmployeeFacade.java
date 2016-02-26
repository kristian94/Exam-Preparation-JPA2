/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import javax.persistence.EntityManager;

/**
 *
 * @author Kristian Nielsen
 */
public class EmployeeFacade extends PersonFacade {

    @Override
    public void delete(Person p, EntityManager em) {
        super.delete((Employee)p, em); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void edit(Person p, EntityManager em) {
        super.edit((Employee)p, em); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Person find(long id, EntityManager em) {
        return (Employee)super.find(id, em); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void add(Person p, EntityManager em) {
        super.add((Employee)p, em); //To change body of generated methods, choose Tools | Templates.
    }
    
}
