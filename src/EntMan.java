
import Entity.PersonFacade;
import Entity.Person;
import Entity.Student;
import Entity.StudentFacade;
import java.util.Date;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kristian Nielsen
 */
public class EntMan {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("ExamPrepJPA2PU");
        EntityManager em = emf.createEntityManager();
        PersonFacade ef = new PersonFacade();
        StudentFacade sf = new StudentFacade();
        Student s = new Student();
        s.setFirstName("John");
        sf.add(s, em);
        
        Person editS = sf.find(1, em);
        editS.setFirstName("NotJohn");
        sf.edit(editS, em);
        
    }
}
