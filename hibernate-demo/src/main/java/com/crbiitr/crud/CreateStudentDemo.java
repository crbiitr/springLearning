package com.crbiitr.crud;


import com.crbiitr.entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class CreateStudentDemo {

    public static void main(String[] args) {

        // create session factory
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Student.class)
                .buildSessionFactory();

        // create session
        Session session = factory.getCurrentSession();

        try {
            // create a student object
            System.out.println("Creating new student object...");
            Student tempStudent1 = new Student("Chaman", "Kumar", "ck@gmail.com");
            Student tempStudent2 = new Student("Karan", "Singh", "ks@gmail.com");
            Student tempStudent3 = new Student("Ratan", "Thakur", "rt@gmail.com");

            // start a transaction
            session.beginTransaction();

            // save the student object
            System.out.println("Saving the student...");
            session.save(tempStudent1);
            session.save(tempStudent2);
            session.save(tempStudent3);

            // commit transaction
            session.getTransaction().commit();

            System.out.println("Done!");
        }
        finally {
            factory.close();
        }
    }

}

