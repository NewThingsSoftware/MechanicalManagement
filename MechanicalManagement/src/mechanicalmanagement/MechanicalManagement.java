package mechanicalmanagement;

public class MechanicalManagement {

    public static void main(String[] args) {
        TelaCentral telaCentral = new TelaCentral();
        telaCentral.setVisible(true);


        /*Código abaixo para poluir primeira vez o banco*/
        /*
         * Cliente cliente = new Cliente("Bru", 45698, 12412, "35371260", "Ruaa", true);
         * ClienteDAO.gravar(cliente);
         * Veiculo veiculo = new Veiculo(cliente, "HKZ-5474", 1874, "Gm", "Corsa", 5474, true);
         * VeiculoDAO.gravar(veiculo);
         * Mecanico mecanico = new Mecanico("Osvaldo", 4576, 6541, "35371260", "Mecanico", true);
         * MecanicoDAO.gravar(mecanico);
         * Peca peca = new Peca("Parafuso", "Inox", new BigDecimal("10.50"), new BigDecimal("15.45"), 20.0, true);
         * PecaDAO.gravar(peca);
         * OrdemServico ordemServico = new OrdemServico(veiculo, mecanico, new Date(2013, 4, 16), "Concerto", true);
         * OrdemServicoDAO.gravar(ordemServico);
         */
    }
}
