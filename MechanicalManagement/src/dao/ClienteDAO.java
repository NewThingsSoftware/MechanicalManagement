package dao;

import entidades.Cliente;
import org.hibernate.Session;
import util.HibernateUtil;

public class ClienteDAO {

    public ClienteDAO() {
    }

    public static void gravar(Cliente cliente) {
        Session s = HibernateUtil.getSessionFactory().getCurrentSession();
        s.beginTransaction();
        s.save(cliente);
        s.getTransaction().commit();
    }
}