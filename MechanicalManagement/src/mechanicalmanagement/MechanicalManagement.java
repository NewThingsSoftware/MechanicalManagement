package mechanicalmanagement;

import dao.ClienteDAO;
import dao.VeiculoDAO;
import entidades.Cliente;
import entidades.Veiculo;

public class MechanicalManagement {

    public static void main(String[] args) {
        //RODAR A PRIMEIRA VEZ PARA POLUIR O BANCO!
//        Cliente cliente = new Cliente("Bruno", 010, 014, 3537, "Rua", true, null);
//        Cliente cliente2 = new Cliente("Marih", 020, 05, 3521, "Rua", true, null);
//        Veiculo veiculo = new Veiculo(cliente, "IHW-0593", "GM", "Vectra", true);
//        Veiculo veiculo2 = new Veiculo(cliente2, "HHH-6666", "Honda", "Biz", true);
//        ClienteDAO.gravar(cliente);
//        ClienteDAO.gravar(cliente2);
//        VeiculoDAO.gravar(veiculo);
//        VeiculoDAO.gravar(veiculo2);
        Veiculo v = VeiculoDAO.obterModelo("Vectra").get(0);
        v.setAno(1998);
        VeiculoDAO.alterar(v);
        System.out.println(VeiculoDAO.obterAno(1998).get(0).getCliente().getNome());
    }
}
