package dao;

import entidades.Mecanico;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import util.HibernateUtil;

/**
 *
 * @author Kaue
 */
public class MecanicoDAO {

    public MecanicoDAO() {
    }

    public static void gravar(Mecanico mecanico) {
        Session s = HibernateUtil.getSessionFactory().getCurrentSession();
        s.beginTransaction();
        s.save(mecanico);
        s.getTransaction().commit();
    }

    public static void alterar(Mecanico mecanico) {
        Session s = HibernateUtil.getSessionFactory().getCurrentSession();
        s.beginTransaction();
        s.update(mecanico);
        s.getTransaction().commit();
    }

    public static void excluir(Mecanico mecanico) {
        Session s = HibernateUtil.getSessionFactory().getCurrentSession();
        s.beginTransaction();
        s.delete(mecanico);
        s.getTransaction().commit();
    }

    public static List<Mecanico> obterTodos() {
        Session s = HibernateUtil.getSessionFactory().getCurrentSession();
        s.beginTransaction();
        Query qry = s.createQuery("SELECT m FROM Mecanico m");
        List<Mecanico> mecanicos = qry.list();
        return mecanicos;
    }

    public static List<Mecanico> obterPorCodigo(Integer idMecanico){
        Session s = HibernateUtil.getSessionFactory().getCurrentSession();
        s.beginTransaction();
        Query qry = s.createQuery("SELECT m FROM Mecanico m WHERE m.idMecanico = :idMecanico");
        qry.setParameter("idMecanico", idMecanico);
        List<Mecanico> mecanicos = qry.list();
        return mecanicos;
    }
    public static List<Mecanico> obterPorNome(String nome) {
        Session s = HibernateUtil.getSessionFactory().getCurrentSession();
        s.beginTransaction();
        Query qry = s.createQuery("SELECT m FROM Mecanico m WHERE m.nome LIKE :nome");
        qry.setParameter("nome", "%" + nome + "%");
        List<Mecanico> mecanicos = qry.list();
        return mecanicos;
    }

    public static List<Mecanico> obterPorCpf(String cpf) {
        Session s = HibernateUtil.getSessionFactory().getCurrentSession();
        s.beginTransaction();
        Query qry = s.createQuery("SELECT m FROM Mecanico m WHERE m.cpf LIKE :cpf");
        qry.setParameter("cpf","%"+ cpf+"%" );
        List<Mecanico> mecanicos = qry.list();
        return mecanicos;
    }
    
    public static List<Mecanico> obterPorEspecialidade(String especialidade) {
        Session s = HibernateUtil.getSessionFactory().getCurrentSession();
        s.beginTransaction();
        Query qry = s.createQuery("SELECT m FROM Mecanico m WHERE m.especialidade LIKE :especialidade");
        qry.setParameter("especialidade", "%" + especialidade + "%");
        List<Mecanico> mecanicos = qry.list();
        return mecanicos;
    }
    public static List<Mecanico> obterPorStatus(Boolean status) {
        Session s = HibernateUtil.getSessionFactory().getCurrentSession();
        s.beginTransaction();
        Query qry = s.createQuery("SELECT m FROM Mecanico m WHERE m.status = :status");
        qry.setParameter("status", status);
        List<Mecanico> mecanicos = qry.list();
        return mecanicos;
    }
}
