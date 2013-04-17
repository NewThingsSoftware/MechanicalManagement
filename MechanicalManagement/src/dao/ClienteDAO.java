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

    public static void alterar(Cliente cliente) {
        Session s = HibernateUtil.getSessionFactory().getCurrentSession();
        s.beginTransaction();
        s.update(cliente);
        s.getTransaction().commit();
    }

    public static void apagar(Cliente cliente) {
        Session s = HibernateUtil.getSessionFactory().getCurrentSession();
        s.beginTransaction();
        s.delete(cliente);
        s.getTransaction().commit();
    }

    public static List<Cliente> obterTodos() {
        Session s = HibernateUtil.getSessionFactory().getCurrentSession();
        s.beginTransaction();
        Query qry = s.createQuery("SELECT v FROM Cliente v");
        return qry.list();
    }

    public static List<Cliente> obterPorNome(String nome) {
        Session s = HibernateUtil.getSessionFactory().getCurrentSession();
        s.beginTransaction();
        Query qry = s.createQuery("SELECT c FROM Cliente c WHERE c.nome LIKE :nome");
        qry.setParameter("nome", "%" + nome + "%");
        List<Cliente> clientes = qry.list();
        return clientes;
    }

    public static List<Cliente> obterPorCpf(String cpf) {
        Session s = HibernateUtil.getSessionFactory().getCurrentSession();
        s.beginTransaction();
        Query qry = s.createQuery("SELECT c FROM Cliente c WHERE c.cpf LIKE :cpf");
        qry.setParameter("cpf","%"+ cpf+"%");
        List<Cliente> clientes = qry.list();
        return clientes;
    }

    public static List<Cliente> obterPorRG(String rg) {
        Session s = HibernateUtil.getSessionFactory().getCurrentSession();
        s.beginTransaction();
        Query qry = s.createQuery("SELECT c FROM Cliente c WHERE c.rg LIKE :rg");
        qry.setParameter("rg","%"+ rg+"%");
        List<Cliente> clientes = qry.list();
        return clientes;
    }

    public static List<Cliente> obterStatus(Boolean status) {
        Session s = HibernateUtil.getSessionFactory().getCurrentSession();
        s.beginTransaction();
        Query qry = s.createQuery("SELECT v FROM Cliente v WHERE v.status = :status");
        qry.setParameter("status", status);
        List<Cliente> clientes = qry.list();
        return clientes;
    }
}
