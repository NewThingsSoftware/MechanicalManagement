package dao;

import entidades.Cliente;
import java.util.List;
import org.hibernate.Query;
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
    
    public static List<Cliente> obertPorNome(String nome){
        Session s = HibernateUtil.getSessionFactory().getCurrentSession();
        s.beginTransaction();
        Query qry = s.createQuery("SELECT c FROM Cliente c WHERE nome = :nome");
        qry.setParameter("nome", nome);
        List<Cliente> clientes = qry.list();
        return clientes;
    }
}
