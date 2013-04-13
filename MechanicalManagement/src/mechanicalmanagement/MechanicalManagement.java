package mechanicalmanagement;

import dao.ClienteDAO;
import dao.VeiculoDAO;
import entidades.Cliente;
import entidades.Veiculo;

public class MechanicalManagement {

    public static void main(String[] args) {
       Cliente cliente = VeiculoDAO.obterPorMarca("honda").get(0).getCliente();
        System.out.println(cliente.getNome());
    }
}
