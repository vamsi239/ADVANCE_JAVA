package oneTooneCar;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class SaveCarData{

    public static void main(String[] args) {

        EntityManagerFactory emf =Persistence.createEntityManagerFactory("post");
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();

        Engine e = new Engine();
        e.setId(201);
        e.setCc(1500);

        Car c = new Car();
        c.setId(1);
        c.setBrand("Toyota");
        c.setEngine(e);

        et.begin();
        em.persist(e);
        em.persist(c);
        et.commit();

        System.out.println("Saved Successfully");
    }
}