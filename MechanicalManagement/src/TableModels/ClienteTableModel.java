package TableModels;

import javax.swing.table.AbstractTableModel;
import entidades.Cliente;
import java.util.List;
/**
 *
 * @author ctb03
 */
public class ClienteTableModel extends AbstractTableModel{
    private static final long serialVersionUID = 1L;
    /* Lista de Cliente que representam as linhas. */
    private List<Cliente> clientes;
    /* Lista de Strings com o nome das colunas. */
    private String[] colunas = new String[]{
        "Nome", "CPF", "RG", "Telefone", "Endereco"};

    /* Cria um ClienteTableModel carregado com 
     * a lista de Cliente especificada. */
    public ClienteTableModel(List<Cliente> clientes) {
        this.clientes = clientes;
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
        return clientes.size();
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
        Cliente cliente = clientes.get(rowIndex);
        /*Retorna o campo referente a coluna especificada.  
         Aqui é feito um switch para verificar qual é a coluna  
         e retornar o campo adequado. As colunas são as mesmas  
         que foram especificadas no array "colunas". */
        switch (columnIndex) {
            // "Placa", "Modelo", "Marca", "Ano", "Km";  
            case 0:
                return cliente.getNome();
            case 1:
                return cliente.getCpf();
            case 2:
                return cliente.getRg();
            case 3:
                return cliente.getTelefone();
            case 4:
                return cliente.getEndereco();
            default:
                // Isto não deveria acontecer...  
                throw new IndexOutOfBoundsException("columnIndex out of bounds");
        }
    }

    @Override
    //modifica na linha e coluna especificada  
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        Cliente cliente = clientes.get(rowIndex);
        // Carrega o item da linha que deve ser modificado  

        switch (columnIndex) { // Seta o valor do campo respectivo  
            case 0:
                cliente.setNome(aValue.toString());
                break;
            case 1:
                cliente.setCpf(Integer.parseInt(aValue.toString()));
                break;
            case 2:
                cliente.setRg(Integer.parseInt(aValue.toString()));
                break;
            case 3:
                cliente.setTelefone(aValue.toString());
                break;
            case 4:
                cliente.setEndereco(aValue.toString());
                break;
            default:
            // Isto não deveria acontecer... 
        }
        fireTableCellUpdated(rowIndex, columnIndex);
    }

    //modifica na linha especificada  
    public void setValueAt(Cliente aValue, int rowIndex) {
        Cliente cliente = clientes.get(rowIndex); // Carrega o item da linha que deve ser modificado  

        cliente.setNome(aValue.getNome());
        cliente.setCpf(aValue.getCpf());
        cliente.setRg(aValue.getRg());
        cliente.setTelefone(aValue.getTelefone());
        cliente.setEndereco(aValue.getEndereco());

        fireTableCellUpdated(rowIndex, 0);
        fireTableCellUpdated(rowIndex, 1);
        fireTableCellUpdated(rowIndex, 2);
        fireTableCellUpdated(rowIndex, 3);
        fireTableCellUpdated(rowIndex, 4);
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }

    public Cliente getCliente(int indiceLinha) {
        return clientes.get(indiceLinha);
    }

    /* Adiciona um registro. */
    public void addCliente(Cliente cliente) {
        // Adiciona o registro.  
        clientes.add(cliente);
        int ultimoIndice = getRowCount() - 1;
        fireTableRowsInserted(ultimoIndice, ultimoIndice);
    }

    /* Remove a linha especificada. */
    public void removeCliente(int indiceLinha) {
        clientes.remove(indiceLinha);
        fireTableRowsDeleted(indiceLinha, indiceLinha);
    }

    /* Adiciona uma lista de Cliente ao final dos registros. */
    public void addListaDeCliente(List<Cliente> clientes) {
        // Pega o tamanho antigo da tabela.  
        int tamanhoAntigo = getRowCount();

        // Adiciona os registros.  
        clientes.addAll(clientes);

        fireTableRowsInserted(tamanhoAntigo, getRowCount() - 1);
    }

    /* Remove todos os registros. */
    public void limpar() {
        clientes.clear();
        fireTableDataChanged();
    }

    /* Verifica se este table model esta vazio. */
    public boolean isEmpty() {
        return clientes.isEmpty();
    }
}
