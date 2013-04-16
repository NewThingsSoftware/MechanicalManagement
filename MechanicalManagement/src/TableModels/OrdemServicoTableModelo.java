package TableModels;

import javax.swing.table.AbstractTableModel;
import java.util.List;
import entidades.OrdemServico;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author ctb03
 */
public class OrdemServicoTableModelo extends AbstractTableModel {

    private static final long serialVersionUID = 1L;
    /* Lista de Cliente que representam as linhas. */
    private List<OrdemServico> ordemServicos;
    /* Lista de Strings com o nome das colunas. */
    private String[] colunas = new String[]{
        "Data", "Nome do Cliente", "Placa do Veiculo", "Marca do Veiculo", 
        "Modelo do Veiculo", "Nome do Mecânico", "Descrição do serviço"};

    /* Cria um ClienteTableModel carregado com 
     * a lista de Cliente especificada. */
    public OrdemServicoTableModelo(List<OrdemServico> ordemServicos) {
        this.ordemServicos = ordemServicos;
    }

    /* Retorna a quantidade de colunas. */
    @Override
    public int getColumnCount() {
        // Está retornando o tamanho do array "colunas".  
        return colunas.length;
    }

    /* Retorna a quantidade de linhas. */
    @Override
    public int getRowCount() {
        // Retorna o tamanho da lista de Cliente.  
        return ordemServicos.size();
    }

    @Override
    public String getColumnName(int columnIndex) {
        // Retorna o conteúdo da Lista que possui o nome das colunas  
        return colunas[columnIndex];
    }

    ;  
  
    @Override
    public Class<?> getColumnClass(int columnIndex) {
        return String.class;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        OrdemServico ordemServico = ordemServicos.get(rowIndex);
        /*Retorna o campo referente a coluna especificada.  
         Aqui é feito um switch para verificar qual é a coluna  
         e retornar o campo adequado. As colunas são as mesmas  
         que foram especificadas no array "colunas". */
        switch (columnIndex) {
            // "Placa", "Modelo", "Marca", "Ano", "Km";  
            case 0:
                return ordemServico.getData();
            case 1:
                return ordemServico.getVeiculo().getCliente().getNome();
            case 2:
                return ordemServico.getVeiculo().getPlaca();
            case 3:
                return ordemServico.getVeiculo().getMarca();
            case 4:
                return ordemServico.getVeiculo().getModelo();
            case 5:
                return ordemServico.getMecanico().getNome();
            case 6:
                return ordemServico.getDescricao();
            default:
                // Isto não deveria acontecer...  
                throw new IndexOutOfBoundsException("columnIndex out of bounds");
        }
    }

    @Override
    //modifica na linha e coluna especificada  
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        OrdemServico ordemServico = ordemServicos.get(rowIndex);
        // Carrega o item da linha que deve ser modificado  

        switch (columnIndex) { // Seta o valor do campo respectivo  
            case 0:
                try {
                    ordemServico.setData(new SimpleDateFormat("dd/MM/yyyy").parse(aValue.toString()));
                } catch (ParseException ex) {
                    JOptionPane.showMessageDialog(null, "Formato incorreto de Data");
                }
            case 1:
                ordemServico.getVeiculo().getCliente().setNome(aValue.toString());
                break;
            case 2:
                ordemServico.getVeiculo().setPlaca(aValue.toString());
                break;
            case 3:
                ordemServico.getVeiculo().setMarca(aValue.toString());
                break;
            case 4:
                ordemServico.getVeiculo().setModelo(aValue.toString());
                break;
            case 5:
                ordemServico.getMecanico().setNome(aValue.toString());
                break;
            case 6:
                ordemServico.setDescricao(aValue.toString());
                break;
            default:
            // Isto não deveria acontecer... 
        }
        fireTableCellUpdated(rowIndex, columnIndex);
    }

    //modifica na linha especificada  
    public void setValueAt(OrdemServico aValue, int rowIndex) {
        OrdemServico ordemServico = ordemServicos.get(rowIndex); // Carrega o item da linha que deve ser modificado  

        ordemServico.setData(aValue.getData());
        ordemServico.getVeiculo().getCliente().setNome(aValue.getVeiculo().getCliente().getNome());
        ordemServico.getVeiculo().setPlaca(aValue.getVeiculo().getPlaca());
        ordemServico.getVeiculo().setMarca(aValue.getVeiculo().getMarca());
        ordemServico.getVeiculo().setModelo(aValue.getVeiculo().getModelo());
        ordemServico.getMecanico().setNome(aValue.getMecanico().getNome());
        ordemServico.setDescricao(aValue.getDescricao());

        fireTableCellUpdated(rowIndex, 0);
        fireTableCellUpdated(rowIndex, 1);
        fireTableCellUpdated(rowIndex, 2);
        fireTableCellUpdated(rowIndex, 3);
        fireTableCellUpdated(rowIndex, 4);
        fireTableCellUpdated(rowIndex, 5);
        fireTableCellUpdated(rowIndex, 6);
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }

    public OrdemServico getOrdemServico(int indiceLinha) {
        return ordemServicos.get(indiceLinha);
    }

    /* Adiciona um registro. */
    public void addOrdemServico(OrdemServico ordemServico) {
        // Adiciona o registro.  
        ordemServicos.add(ordemServico);
        int ultimoIndice = getRowCount() - 1;
        fireTableRowsInserted(ultimoIndice, ultimoIndice);
    }

    /* Remove a linha especificada. */
    public void removeOrdemServico(int indiceLinha) {
        ordemServicos.remove(indiceLinha);
        fireTableRowsDeleted(indiceLinha, indiceLinha);
    }

    /* Adiciona uma lista de Cliente ao final dos registros. */
    public void addListaDeOrdemServico(List<OrdemServico> ordemServicos) {
        // Pega o tamanho antigo da tabela.  
        int tamanhoAntigo = getRowCount();

        // Adiciona os registros.  
        this.ordemServicos.addAll(ordemServicos);

        fireTableRowsInserted(tamanhoAntigo, getRowCount() - 1);
    }

    /* Remove todos os registros. */
    public void limpar() {
        ordemServicos.clear();
        fireTableDataChanged();
    }

    /* Verifica se este table model esta vazio. */
    public boolean isEmpty() {
        return ordemServicos.isEmpty();
    }
}
