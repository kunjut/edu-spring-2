package hibernate_test;

import hibernate_test.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test2 {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();

        Session session = sessionFactory.getCurrentSession();

        try {
            Employee emp = new Employee("Elena","Petrova","Sales",800);
            session.beginTransaction();
            session.save(emp);
            session.getTransaction().commit();

            System.out.println("Done!");

            int myId = emp.getId();

            session = sessionFactory.getCurrentSession();
            session.beginTransaction();
            Employee employee = session.get(Employee.class, myId);
            session.getTransaction().commit();

            System.out.println(employee);

        } finally {
            sessionFactory.close();
        }
    }
}
