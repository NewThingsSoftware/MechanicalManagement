package dao;

import entidades.Peca;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import util.HibernateUtil;

/**
 *
 * @author Bruno
 */
public class PecaDAO {

    public PecaDAO() {
    }

    public static void gravar(Peca peca) {
        Session s = HibernateUtil.getSessionFactory().getCurrentSession();
        s.beginTransaction();
        s.save(peca);
        s.getTransaction().commit();
    }

    public static void alterar(Peca peca) {
        Session s = HibernateUtil.getSessionFactory().getCurrentSession();
        s.beginTransaction();
        s.update(peca);
        s.getTransaction().commit();
    }

    public static void apagar(Peca peca) {
        Session s = HibernateUtil.getSessionFactory().getCurrentSession();
        s.beginTransaction();
        s.delete(peca);
        s.getTransaction().commit();
    }
    
    public static List<Peca> obterTodos() {
        Session s = HibernateUtil.getSessionFactory().getCurrentSession();
        s.beginTransaction();
        Query qry = s.createQuery("SELECT p FROM Peca p");
        return qry.list();
    }

    public static List<Peca> obterPorDescricao(String descricao){
        Session s = HibernateUtil.getSessionFactory().getCurrentSession();
        s.beginTransaction();
        Query qry = s.createQuery("SELECT p FROM Peca p WHERE p.descricao = :descricao");
        qry.setParameter("descricao", "%" + descricao + "%");
        List<Peca> pecas = qry.list();
        return pecas;
    }
    
        public static List<Peca> obterPorMarca(String marca) {
        Session s = HibernateUtil.getSessionFactory().getCurrentSession();
        s.beginTransaction();
        Query qry = s.createQuery("SELECT p FROM Peca p WHERE p.marca LIKE :marca");
        qry.setParameter("marca", "%" + marca + "%");
        List<Peca> pecas = qry.list();
        return pecas;
    }
        
        public static List<Peca> obterPorPrecoCompra(Integer preco_compra) {
        Session s = HibernateUtil.getSessionFactory().getCurrentSession();
        s.beginTransaction();
        Query qry = s.createQuery("SELECT p FROM Peca p WHERE p.preco_compra = :preco_compra");
        qry.setParameter("preco_compra", preco_compra);
        List<Peca> pecas = qry.list();
        return pecas;
    }
    
        public static List<Peca> obterPorPrecoVenda(Integer preco_venda) {
        Session s = HibernateUtil.getSessionFactory().getCurrentSession();
        s.beginTransaction();
        Query qry = s.createQuery("SELECT p FROM Peca p WHERE p.preco_venda = :preco_venda");
        qry.setParameter("preco_venda", preco_venda);
        List<Peca> pecas = qry.list();
        return pecas;
    }
        
        public static List<Peca> obterPorQuantidade(Integer quantidade) {
        Session s = HibernateUtil.getSessionFactory().getCurrentSession();
        s.beginTransaction();
        Query qry = s.createQuery("SELECT p FROM Peca p WHERE p.quantidade = :quantidade");
        qry.setParameter("quantidade", quantidade);
        List<Peca> pecas = qry.list();
        return pecas;
    }
    
    public static List<Peca> obterStatus (Boolean status) {
        Session s = HibernateUtil.getSessionFactory().getCurrentSession();
        s.beginTransaction();
        Query qry = s.createQuery("SELECT p FROM Peca p WHERE p.status = :status");
        qry.setParameter("status", status);
        List<Peca> pecas = qry.list();
        return pecas;
    }
}
