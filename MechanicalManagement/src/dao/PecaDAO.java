package dao;

import entidades.Peca;
import org.hibernate.Session;
import util.HibernateUtil;

/**
 *
 * @author ctb03
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
}
