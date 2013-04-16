package mechanicalmanagement;

import dao.ClienteDAO;
import dao.MecanicoDAO;
import dao.VeiculoDAO;
import entidades.Cliente;
import entidades.Mecanico;
import entidades.Veiculo;

public class MechanicalManagement {

    public static void main(String[] args) {
//        TelaCentral telaCentral = new TelaCentral();
//        telaCentral.setVisible(true);
        Cliente cliente = new Cliente("Bru", 45698, 12412, "35371260", "Ruaa", true);
        ClienteDAO.gravar(cliente);
        Veiculo veiculo = new Veiculo(cliente, "HKZ-5474", 1874, "Gm", "Corsa", 5474, true);
        VeiculoDAO.gravar(veiculo);
        Mecanico mecanico = new Mecanico("Osvaldo", 4576, 6541, "35371260", "Mecanico", true);
        MecanicoDAO.gravar(mecanico);
        Peca peca = 
    }
}
