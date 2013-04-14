package mechanicalmanagement;

import dao.ClienteDAO;
import entidades.Cliente;


public class MechanicalManagement {

    public static void main(String[] args) {
        TelaCentral telaCentral = new TelaCentral();
        telaCentral.setVisible(true);
        //Cliente cliente = ClienteDAO.obertPorNome("Mari").get(0);
    }
}
