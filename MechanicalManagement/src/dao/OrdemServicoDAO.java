package dao;

import entidades.Mecanico;
import entidades.OrdemServico;
import entidades.Veiculo;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import util.HibernateUtil;

/**
 *
 * @author Bruno
 */
public class OrdemServicoDAO {

    public OrdemServicoDAO() {
    }

    public static void gravar(OrdemServico ordemServico) {
        Session s = HibernateUtil.getSessionFactory().getCurrentSession();
        s.beginTransaction();
        s.save(ordemServico);
        s.getTransaction().commit();
    }

    public static void alterar(OrdemServico ordemServico) {
        Session s = HibernateUtil.getSessionFactory().getCurrentSession();
        s.beginTransaction();
        s.update(ordemServico);
        s.getTransaction().commit();
    }

    public static void apagar(OrdemServico ordemServico) {
        Session s = HibernateUtil.getSessionFactory().getCurrentSession();
        s.beginTransaction();
        s.delete(ordemServico);
        s.getTransaction().commit();
    }

    public static List<OrdemServico> obterTodos() {
        Session s = HibernateUtil.getSessionFactory().getCurrentSession();
        s.beginTransaction();
        Query qry = s.createQuery("SELECT o FROM OrdemServico o");
        List<OrdemServico> ordemServicos = qry.list();
        return ordemServicos;
    }

    public static List<OrdemServico> obterPorCodigo(Integer idOrdemServico) {
        Session s = HibernateUtil.getSessionFactory().getCurrentSession();
        s.beginTransaction();
        Query qry = s.createQuery("SELECT o FROM OrdemServico o WHERE o.idOrdemServico = :idOrdemServico");
        qry.setParameter("idOrdemServico", idOrdemServico);
        List<OrdemServico> ordemServicos = qry.list();
        return ordemServicos;
    }

    public static List<OrdemServico> obterPorData(Date data) {
        Session s = HibernateUtil.getSessionFactory().getCurrentSession();
        s.beginTransaction();
        Query qry = s.createQuery("SELECT o FROM OrdemServico o WHERE o.data = :data ");
        qry.setParameter("data", data);
        List<OrdemServico> ordemServicos = qry.list();
        return ordemServicos;
    }

    public static List<OrdemServico> obterPorDescricao(String descricao) {
        Session s = HibernateUtil.getSessionFactory().getCurrentSession();
        s.beginTransaction();
        Query qry = s.createQuery("SELECT o FROM OrdemServico o WHERE o.descricao LIKE :descricao");
        qry.setParameter("descricao", "%" + descricao + "%");
        List<OrdemServico> ordemServicos = qry.list();
        return ordemServicos;
    }

    public static List<OrdemServico> obterPorVeiculo(Veiculo veiculo) {
        if (veiculo == null) {
            return new ArrayList<>();
        }
        Session s = HibernateUtil.getSessionFactory().getCurrentSession();
        s.beginTransaction();
        Query qry = s.createQuery("SELECT o FROM OrdemServico o WHERE o.veiculo.idVeiculo = :idVeiculo");
        qry.setParameter("idVeiculo", veiculo.getIdVeiculo());
        List<OrdemServico> ordemServicos = qry.list();
        return ordemServicos;
    }

    public static List<OrdemServico> obterPorMecanico(Mecanico mecanico) {
        if (mecanico == null) {
            return new ArrayList<>();
        }
        Session s = HibernateUtil.getSessionFactory().getCurrentSession();
        s.beginTransaction();
        Query qry = s.createQuery("SELECT o FROM OrdemServico o WHERE o.mecanico.idMecanico = :idMecanico");
        qry.setParameter("idMecanico", mecanico.getIdMecanico());
        List<OrdemServico> ordemServicos = qry.list();
        return ordemServicos;
    }

    public static List<OrdemServico> obterPorStatus(Character status) {
        Session s = HibernateUtil.getSessionFactory().getCurrentSession();
        s.beginTransaction();
        Query qry = s.createQuery("SELECT o FROM OrdemServico o WHERE o.status = :status");
        qry.setParameter("status", status);
        List<OrdemServico> ordemServicos = qry.list();
        return ordemServicos;
    }

    public static List<OrdemServico> obterMaxCodigo() {
        Session s = HibernateUtil.getSessionFactory().getCurrentSession();
        s.beginTransaction();
        Query qry = s.createQuery("SELECT MAX(o.idOrdemServico) FROM OrdemServico o");
        List<OrdemServico> ordemServicos = qry.list();
        return ordemServicos;
    }
}
