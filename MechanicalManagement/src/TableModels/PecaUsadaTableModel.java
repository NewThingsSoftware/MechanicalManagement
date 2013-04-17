package TableModels;

import entidades.PecaUsada;
import java.util.List;
import javax.swing.table.AbstractTableModel;
/**
 *
 * @author Bruno
 */
public class PecaUsadaTableModel extends AbstractTableModel{
    private static final long serialVersionUID = 1L;
    /* Lista de Cliente que representam as linhas. */
    private List<PecaUsada> pecaUsadas;
    /* Lista de Strings com o nome das colunas. */
    private String[] colunas = new String[]{
        "Código da Peça", "Descrição", "Quantidade"};

    /* Cria um ClienteTableModel carregado com 
     * a lista de Cliente especificada. */
    public PecaUsadaTableModel(List<PecaUsada> pecas) {
        this.pecaUsadas = pecas;
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
        return pecaUsadas.size();
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
        PecaUsada pecaUsada = pecaUsadas.get(rowIndex);
        /*Retorna o campo referente a coluna especificada.  
         Aqui é feito um switch para verificar qual é a coluna  
         e retornar o campo adequado. As colunas são as mesmas  
         que foram especificadas no array "colunas". */
        switch (columnIndex) {
            // "Placa", "Modelo", "Marca", "Ano", "Km";  
            case 0:
                return pecaUsada.getPeca().getIdPeca();
            case 1:
                return pecaUsada.getPeca().getDescricao();
            case 2:
                return pecaUsada.getQuantidade();
            default:
                // Isto não deveria acontecer...  
                throw new IndexOutOfBoundsException("columnIndex out of bounds");
        }
    }

    @Override
    //modifica na linha e coluna especificada  
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        PecaUsada pecaUsada = pecaUsadas.get(rowIndex);
        // Carrega o item da linha que deve ser modificado  

        switch (columnIndex) { // Seta o valor do campo respectivo  
            case 0:
                pecaUsada.getPeca().setIdPeca(Integer.parseInt(aValue.toString()));
                break;
            case 1:
                pecaUsada.getPeca().setDescricao(aValue.toString());
                break;
            case 2:
                pecaUsada.setQuantidade(Double.parseDouble(aValue.toString()));
                break;
            default:
            // Isto não deveria acontecer... 
        }
        fireTableCellUpdated(rowIndex, columnIndex);
    }

    //modifica na linha especificada  
    public void setValueAt(PecaUsada aValue, int rowIndex) {
        PecaUsada pecaUsada = pecaUsadas.get(rowIndex); // Carrega o item da linha que deve ser modificado  

        pecaUsada.getPeca().setIdPeca(aValue.getPeca().getIdPeca());
        pecaUsada.getPeca().setDescricao(aValue.getPeca().getDescricao());
        pecaUsada.setQuantidade(aValue.getQuantidade());

        fireTableCellUpdated(rowIndex, 0);
        fireTableCellUpdated(rowIndex, 1);
        fireTableCellUpdated(rowIndex, 2);
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }

    public PecaUsada getPecaUsada(int indiceLinha) {
        return pecaUsadas.get(indiceLinha);
    }

    /* Adiciona um registro. */
    public void addPecaUsada(PecaUsada pecaUsada) {
        // Adiciona o registro.  
        pecaUsadas.add(pecaUsada);
        int ultimoIndice = getRowCount() - 1;
        fireTableRowsInserted(ultimoIndice, ultimoIndice);
    }

    /* Remove a linha especificada. */
    public void removePecaUsada(int indiceLinha) {
        pecaUsadas.remove(indiceLinha);
        fireTableRowsDeleted(indiceLinha, indiceLinha);
    }

    /* Adiciona uma lista de Cliente ao final dos registros. */
    public void addListaDePecaUsada(List<PecaUsada> pecaUsadas) {
        // Pega o tamanho antigo da tabela.  
        int tamanhoAntigo = getRowCount();

        // Adiciona os registros.  
        pecaUsadas.addAll(pecaUsadas);

        fireTableRowsInserted(tamanhoAntigo, getRowCount() - 1);
    }

    /* Remove todos os registros. */
    public void limpar() {
        pecaUsadas.clear();
        fireTableDataChanged();
    }

    /* Verifica se este table model esta vazio. */
    public boolean isEmpty() {
        return pecaUsadas.isEmpty();
    }
}
