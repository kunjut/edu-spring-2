package hibernate_test;

import hibernate_test.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();

        Session session = sessionFactory.getCurrentSession();

        try {
            Employee emp = new Employee("Zaur","Tregulov","IT",500);
            session.beginTransaction();
            session.save(emp);
            session.getTransaction().commit();
        } finally {
            sessionFactory.close();
        }
    }
}
