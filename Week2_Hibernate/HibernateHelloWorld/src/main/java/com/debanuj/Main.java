package com.debanuj;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {

    public static void main(String[] args) {

        SessionFactory factory =
                new Configuration()
                        .configure()
                        .buildSessionFactory();

        Session session = factory.openSession();

        session.beginTransaction();

        Employee employee =
                new Employee(1, "Debanuj");

        session.persist(employee);

        session.getTransaction().commit();

        session.close();

        factory.close();

        System.out.println("Employee Saved Successfully!");

    }
}