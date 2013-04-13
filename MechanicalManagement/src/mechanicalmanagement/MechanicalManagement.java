package mechanicalmanagement;

import dao.VeiculoDAO;
import entidades.Cliente;

public class MechanicalManagement {

    public static void main(String[] args) {
       Cliente c = VeiculoDAO.obterPorModelo("Vectra").get(0).getCliente();
        System.out.println(c.getNome());
    }
}
