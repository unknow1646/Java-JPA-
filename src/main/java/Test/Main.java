/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import Entities.Person;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author hernan
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.mycompany_tareajava_jar_1.0-SNAPSHOTPU");
        EntityManager manager= factory.createEntityManager();
        
        
         
        // Metodo para agregar personas por ID
        /*
        Person p = manager.find(Person.class, new Long(151));
        p.setNombre("Tarea Java");
        manager.getTransaction().begin();
        manager.persist(p);
        manager.getTransaction().commit();
        */
        
        
        // Metodo para agregar personas 
        
        Person p= new Person();
        p.setNombre("Pedro ");
        p.setApellido("Riquelme");
        
        try{
        manager.getTransaction().begin();
        manager.persist(p);
        
        
        manager.getTransaction().commit();
        }
        catch(Exception ex){
            ex.printStackTrace();
            manager.getTransaction().rollback();
        }
        
        
        //Metodo para eliminar 
        /*
        manager.getTransaction().begin();
        manager.remove(p);
        manager.getTransaction().commit();
        */
    }
    
}
