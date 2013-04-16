package dao;

import entidades.Cliente;
import entidades.Mecanico;
import entidades.OrdemServico;
import entidades.Veiculo;
import java.util.List;
import java.util.Date;
import org.hibernate.Query;
import org.hibernate.Session;
import util.HibernateUtil;

/**
 *
 * @author ctb03
 */

public class OrdemServicoDAO {
    public OrdemServicoDAO(){
    }
    
    public static void gravar(OrdemServico ordemServico){
        Session s = HibernateUtil.getSessionFactory().getCurrentSession();
        s.beginTransaction();
        s.save(ordemServico);
        s.getTransaction().commit();
    }
    
    public static void alterar(OrdemServico ordemServico){
        Session s = HibernateUtil.getSessionFactory().getCurrentSession();
        s.beginTransaction();
        s.update(ordemServico);
        s.getTransaction().commit();
    }
    
    public static void apagar(OrdemServico ordemServico){
        Session s = HibernateUtil.getSessionFactory().getCurrentSession();
        s.beginTransaction();
        s.delete(ordemServico);
        s.getTransaction().commit();
    }
    public static List<OrdemServico> obterTodos(){
        Session s = HibernateUtil.getSessionFactory().getCurrentSession();
        s.beginTransaction();
        Query qry = s.createQuery("SELECT o FROM OrdemServico o");
        List<OrdemServico> ordemServicos = qry.list();
        return ordemServicos;
    }
    public static List<OrdemServico> obterPorData(Date data){
        Session s = HibernateUtil.getSessionFactory().getCurrentSession();
        s.beginTransaction();
        Query qry = s.createQuery("SELECT o FROM OrdemServico o WHERE o.data = :data ");
        qry.setParameter("data", data);
        List<OrdemServico> ordemServicos = qry.list();
        return ordemServicos;
    }
    public static List<OrdemServico> obterPorDescricao(String descricao){
        Session s = HibernateUtil.getSessionFactory().getCurrentSession();
        s.beginTransaction();
        Query qry = s.createQuery("SELECT o FROM OrdemServico o WHERE o.descricao LIKE :descricao");
        qry.setParameter("descricao", "%"+descricao+"%");
        List<OrdemServico> ordemServicos = qry.list();
        return ordemServicos;
    }
    public static List<OrdemServico> obterPorVeiculo(Veiculo veiculo){
        Session s = HibernateUtil.getSessionFactory().getCurrentSession();
        s.beginTransaction();
        Query qry = s.createQuery("SELECT o FROM OrdemServico o WHERE o.idVeiculo");
        List<OrdemServico> ordemServicos = qry.list();
        return ordemServicos;
    }
    public static List<OrdemServico> obterPorMecanico(){
        Session s = HibernateUtil.getSessionFactory().getCurrentSession();
        s.beginTransaction();
        Query qry = s.createQuery("SELECT o FROM OrdemServico o");
        List<OrdemServico> ordemServicos = qry.list();
        return ordemServicos;
    }
}
