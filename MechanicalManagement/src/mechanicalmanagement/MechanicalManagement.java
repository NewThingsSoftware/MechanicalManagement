package mechanicalmanagement;

import dao.ClienteDAO;
import dao.MecanicoDAO;
import dao.OrdemServicoDAO;
import dao.PecaDAO;
import dao.PecaUsadaDAO;
import dao.VeiculoDAO;
import entidades.Cliente;
import entidades.Mecanico;
import entidades.OrdemServico;
import entidades.Peca;
import entidades.PecaUsada;
import entidades.Veiculo;
import java.math.BigDecimal;
import java.util.Date;
import java.util.Set;

public class MechanicalManagement {

    public static void main(String[] args) {
        TelaCentral telaCentral = new TelaCentral();
        telaCentral.ordem_servico.setVisible(true);


        /*Código abaixo para poluir primeira vez o banco*/

//        Cliente cliente = new Cliente("Bruno", "010.047.109-2", "42.623.445-5", "(49)9104-9669", "Rua Min João Cleophas, 433 AP 2", true);
//        ClienteDAO.gravar(cliente);
//        Veiculo veiculo = new Veiculo(cliente, "HKZ-5474", 1874, "Gm", "Corsa", 5474, true);
//        VeiculoDAO.gravar(veiculo);
//        Mecanico mecanico = new Mecanico("Osvaldo", "052.521.584-49", "95.655.214-5", "35371260", "Mecanico", true);
//        MecanicoDAO.gravar(mecanico);
//        Peca peca = new Peca("Parafuso", "Marca", new BigDecimal("45.50"), new BigDecimal("54.30"), 25.0, true);
//        PecaDAO.gravar(peca);
//        OrdemServico ordemServico = new OrdemServico(veiculo, mecanico, new Date(2013, 04, 21), "Problema", 'P', null);
//        OrdemServicoDAO.gravar(ordemServico);
//        OrdemServico ordemServico = OrdemServicoDAO.obterPorCodigo(20).get(0);
//        Peca peca = PecaDAO.obterPorCodigo(3).get(0);
//        PecaUsada pecaUsada = new PecaUsada(ordemServico, peca, 40);
//        ordemServico.addPecaUsada(pecaUsada);
//        OrdemServicoDAO.gravar(ordemServico);
//        Set peca_usadas = ordemServico.getPecaUsadas();
//        for (Object object : peca_usadas) {
//            PecaUsada peca2 = (PecaUsada) object;
//            System.out.println(peca2.getPeca().getDescricao());
//        }
        
    }
}
