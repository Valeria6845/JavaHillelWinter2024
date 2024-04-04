package org.homework27;

import org.hibernate.Session;
import java.util.List;
public class Access {
    public void persistStudent(Student student) {
        Session session = HibernateSession.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(student);
        session.getTransaction().commit();
        session.close();
    }
    public void deleteStudent(long id) {
        Session session = HibernateSession.getSessionFactory().openSession();
        session.beginTransaction();
        Student s = (Student) session.get(Student.class, id);
        session.remove(s);
        session.getTransaction().commit();
        session.close();
    }
    public void deleteStudent(Student student) {
        Session session = HibernateSession.getSessionFactory().openSession();
        session.beginTransaction();
        session.remove(student);
        session.getTransaction().commit();
        session.close();
    }
    public void updateStudent(Student student) {
        Session session = HibernateSession.getSessionFactory().openSession();
        session.beginTransaction();
        session.merge(student);
        session.getTransaction().commit();
        session.close();
    }
    public Student getStudent(long id) {
        Session session = HibernateSession.getSessionFactory().openSession();
        session.beginTransaction();
        Student s = (Student) session.get(Student.class, id);
        session.close();
        return s;
    }
    public List getStudents() {
        Session session = HibernateSession.getSessionFactory().openSession();
        session.beginTransaction();
        return session.createQuery("SELECT a FROM Student a").getResultList();
    }
}
