package dao;

import entidades.Veiculo;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import util.HibernateUtil;

public class VeiculoDAO {

    public VeiculoDAO() {
    }

    public static void gravar(Veiculo veiculo) {
        Session s = HibernateUtil.getSessionFactory().getCurrentSession();
        s.beginTransaction();
        s.save(veiculo);
        s.getTransaction().commit();
    }

    public static void alterar(Veiculo veiculo) {
        Session s = HibernateUtil.getSessionFactory().getCurrentSession();
        s.beginTransaction();
        s.update(veiculo);
        s.getTransaction().commit();
    }

    public static void apagar(Veiculo veiculo) {
        Session s = HibernateUtil.getSessionFactory().getCurrentSession();
        s.beginTransaction();
        s.delete(veiculo);
        s.getTransaction().commit();
    }

    public static List<Veiculo> obterTodos() {
        Session s = HibernateUtil.getSessionFactory().getCurrentSession();
        s.beginTransaction();
        Query qry = s.createQuery("SELECT v FROM Veiculo v");
        List<Veiculo> veiculos = qry.list();
        s.getTransaction().commit();
        return veiculos;
    }

    public static List<Veiculo> obterPlaca(String placa) {
        Session s = HibernateUtil.getSessionFactory().getCurrentSession();
        s.beginTransaction();
        Query qry = s.createQuery("SELECT v FROM Veiculo v WHERE v.placa LIKE :placa");
        qry.setParameter("placa", "%" + placa + "%");
        List<Veiculo> veiculos = qry.list();
        s.getTransaction().commit();
        return veiculos;
    }

    public static List<Veiculo> obterAno(Integer ano) {
        Session s = HibernateUtil.getSessionFactory().getCurrentSession();
        s.beginTransaction();
        Query qry = s.createQuery("SELECT v FROM Veiculo v WHERE v.ano = :ano");
        qry.setParameter("ano", ano);
        List<Veiculo> veiculos = qry.list();
        return veiculos;
    }

    public static List<Veiculo> obterMarca(String marca) {
        Session s = HibernateUtil.getSessionFactory().getCurrentSession();
        s.beginTransaction();
        Query qry = s.createQuery("SELECT v FROM Veiculo v WHERE v.marca LIKE :marca");
        qry.setParameter("marca", "%" + marca + "%");
        List<Veiculo> veiculos = qry.list();
        s.getTransaction().commit();
        return veiculos;
    }
    
    public static List<Veiculo> obterModelo(String modelo) {
        Session s = HibernateUtil.getSessionFactory().getCurrentSession();
        s.beginTransaction();
        Query qry = s.createQuery("SELECT v FROM Veiculo v WHERE v.modelo LIKE :modelo");
        qry.setParameter("modelo", "%" + modelo + "%");
        List<Veiculo> veiculos = qry.list();
        s.getTransaction().commit();
        return veiculos;
    }
    
    public static List<Veiculo> obterKm (Integer km) {
        Session s = HibernateUtil.getSessionFactory().getCurrentSession();
        s.beginTransaction();
        Query qry = s.createQuery("SELECT v FROM Veiculo v WHERE v.km = :km");
        qry.setParameter("km", km);
        List<Veiculo> veiculos = qry.list();
        s.getTransaction().commit();
        return veiculos;
    }
    
    public static List<Veiculo> obterStatus (Boolean status) {
        Session s = HibernateUtil.getSessionFactory().getCurrentSession();
        s.beginTransaction();
        Query qry = s.createQuery("SELECT v FROM Veiculo v WHERE v.status = :status");
        qry.setParameter("status", status);
        List<Veiculo> veiculos = qry.list();
        s.getTransaction().commit();
        return veiculos;
    }
}
