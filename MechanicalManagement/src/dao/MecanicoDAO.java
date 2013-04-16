/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entidades.Mecanico;
import entidades.Veiculo;
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

    public static List<Mecanico> obterPorNome(String nome) {
        Session s = HibernateUtil.getSessionFactory().getCurrentSession();
        s.beginTransaction();
        Query qry = s.createQuery("SELECT m FROM Mecanico m WHERE nome = :nome");
        qry.setParameter("nome", nome);
        List<Mecanico> mecanicos = qry.list();
        return mecanicos;
    }

    public static List<Mecanico> obterTodos() {
        Session s = HibernateUtil.getSessionFactory().getCurrentSession();
        s.beginTransaction();
        Query qry = s.createQuery("SELECT m FROM Mecanico m");
        List<Mecanico> mecanicos = qry.list();
        return mecanicos;
    }

    public static List<Mecanico> obterPorEspecialidade(String especialidade) {
        Session s = HibernateUtil.getSessionFactory().getCurrentSession();
        s.beginTransaction();
        Query qry = s.createQuery("SELECT m FROM Mecanico m WHERE especialidade = :especilidade");
        qry.setParameter("especialidade", especialidade);
        List<Mecanico> mecanicos = qry.list();
        return mecanicos;
    }
}