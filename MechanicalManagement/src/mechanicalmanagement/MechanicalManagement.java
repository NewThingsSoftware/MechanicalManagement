package mechanicalmanagement;

import dao.ClienteDAO;
import dao.VeiculoDAO;
import entidades.Cliente;

public class MechanicalManagement {

    public static void main(String[] args) {
        Cliente c = new Cliente("Teste", 444, 0004, true);
        ClienteDAO.gravar(c);
    }
}
