package TableModels;

import entidades.Veiculo;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Bruno
 */
public class VeiculoTableModel extends AbstractTableModel {

    private static final long serialVersionUID = 1L;
    /* Lista de Cliente que representam as linhas. */
    private List<Veiculo> veiculos;
    /* Lista de Strings com o nome das colunas. */
    private String[] colunas = new String[]{
        "Placa", "Modelo", "Marca", "Ano", "Km"};

    /* Cria um ClienteTableModel carregado com 
     * a lista de Cliente especificada. */
    public VeiculoTableModel(List<Veiculo> veiculos) {
        this.veiculos = veiculos;
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
        return veiculos.size();
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
        Veiculo veiculo = veiculos.get(rowIndex);
        /*Retorna o campo referente a coluna especificada.  
         Aqui é feito um switch para verificar qual é a coluna  
         e retornar o campo adequado. As colunas são as mesmas  
         que foram especificadas no array "colunas". */
        switch (columnIndex) {
            // "Placa", "Modelo", "Marca", "Ano", "Km";  
            case 0:
                return veiculo.getPlaca();
            case 1:
                return veiculo.getModelo();
            case 2:
                return veiculo.getMarca();
            case 3:
                return veiculo.getAno();
            case 4:
                return veiculo.getKm();
            default:
                // Isto não deveria acontecer...  
                throw new IndexOutOfBoundsException("columnIndex out of bounds");
        }
    }

    @Override
    //modifica na linha e coluna especificada  
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        Veiculo veiculo = veiculos.get(rowIndex);
        // Carrega o item da linha que deve ser modificado  

        switch (columnIndex) { // Seta o valor do campo respectivo  
            case 0:
                veiculo.setPlaca(aValue.toString());
            case 1:
                veiculo.setModelo(aValue.toString());
            case 2:
                veiculo.setMarca(aValue.toString());
            case 3:
                veiculo.setAno(Integer.parseInt(aValue.toString()));
            case 4:
                veiculo.setKm(Integer.parseInt(aValue.toString()));
            default:
            // Isto não deveria acontecer... 
        }
        fireTableCellUpdated(rowIndex, columnIndex);
    }

    //modifica na linha especificada  
    public void setValueAt(Veiculo aValue, int rowIndex) {
        Veiculo veiculo = veiculos.get(rowIndex); // Carrega o item da linha que deve ser modificado  

        veiculo.setPlaca(aValue.getPlaca());
        veiculo.setModelo(aValue.getModelo());
        veiculo.setMarca(aValue.getMarca());
        veiculo.setAno(aValue.getAno());
        veiculo.setKm(aValue.getKm());

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

    public Veiculo getVeiculo(int indiceLinha) {
        return veiculos.get(indiceLinha);
    }

    /* Adiciona um registro. */
    public void addVeiculo(Veiculo veiculo) {
        // Adiciona o registro.  
        veiculos.add(veiculo);
        int ultimoIndice = getRowCount() - 1;
        fireTableRowsInserted(ultimoIndice, ultimoIndice);
    }

    /* Remove a linha especificada. */
    public void removeCliente(int indiceLinha) {
        veiculos.remove(indiceLinha);
        fireTableRowsDeleted(indiceLinha, indiceLinha);
    }

    /* Adiciona uma lista de Cliente ao final dos registros. */
    public void addListaDeVeiculo(List<Veiculo> veiculos) {
        // Pega o tamanho antigo da tabela.  
        int tamanhoAntigo = getRowCount();

        // Adiciona os registros.  
        veiculos.addAll(veiculos);

        fireTableRowsInserted(tamanhoAntigo, getRowCount() - 1);
    }

    /* Remove todos os registros. */
    public void limpar() {
        veiculos.clear();
        fireTableDataChanged();
    }

    /* Verifica se este table model esta vazio. */
    public boolean isEmpty() {
        return veiculos.isEmpty();
    }
}
