package dao;

import entidades.OrdemServico;
import entidades.Peca;
import entidades.PecaUsada;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import util.HibernateUtil;

/**
 *
 * @author Bruno
 */
public class PecaUsadaDAO {
    
    public PecaUsadaDAO(){
    }
    
    public static void gravar(PecaUsada pecaUsada){
        Session s = HibernateUtil.getSessionFactory().getCurrentSession();
        s.beginTransaction();
        s.save(pecaUsada);
        s.getTransaction().commit();
    }
    
    public static void alterar(PecaUsada pecaUsada){
        Session s = HibernateUtil.getSessionFactory().getCurrentSession();
        s.beginTransaction();
        s.update(pecaUsada);
        s.getTransaction().commit();
    }
    
    public static void apagar(PecaUsada pecaUsada){
        Session s = HibernateUtil.getSessionFactory().getCurrentSession();
        s.beginTransaction();
        s.delete(pecaUsada);
        s.getTransaction().commit();
    }
    
    public static List<PecaUsada> obterTodos(){
        Session s = HibernateUtil.getSessionFactory().getCurrentSession();
        s.beginTransaction();
        Query qry = s.createQuery("SELECT p FROM PecaUsada p");
        List<PecaUsada> pecaUsadas = qry.list();
        return pecaUsadas;
    }
    
    public static List<PecaUsada> obterPorOrdemServico(OrdemServico ordemServico){
        Session s = HibernateUtil.getSessionFactory().getCurrentSession();
        s.beginTransaction();
        Query qry = s.createQuery("SELECT p FROM PecaUsada p WHERE p.ordemServico.idOrdemServico = :idOrdemServico");
        qry.setParameter("idOrdemServico", ordemServico.getIdOrdemServico());
        List<PecaUsada> pecaUsadas = qry.list();
        return pecaUsadas;
    }
    
    public static List<PecaUsada> obterPorPeca(Peca peca){
        Session s = HibernateUtil.getSessionFactory().getCurrentSession();
        s.beginTransaction();
        Query qry = s.createQuery("SELECT p FROM PecaUsada p WHERE p.peca.idPeca = : idPeca");
        qry.setParameter("idPeca", peca.getIdPeca());
        List<PecaUsada> pecaUsadas = qry.list();
        return pecaUsadas;
    }
    
    public static double obterValorTotalPeca(OrdemServico ordemServico){
        Session s = HibernateUtil.getSessionFactory().getCurrentSession();
        s.beginTransaction();
        Query qry = s.createQuery("SELECT p FROM PecaUsada p WHERE p.ordemServico.idOrdemServico = :idOrdemServico");
        qry.setParameter("idOrdemServico", ordemServico.getIdOrdemServico());
        List<PecaUsada> pecaUsadas = qry.list();
        double retorno = 0;
        for (PecaUsada pecaUsada : pecaUsadas) {
            retorno += pecaUsada.getQuantidade() * Double.parseDouble(pecaUsada.getPeca().getPrecoVenda().toString());
        }
        return retorno;
    }
}
