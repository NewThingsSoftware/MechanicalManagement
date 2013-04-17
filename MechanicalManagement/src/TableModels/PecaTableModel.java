package TableModels;

import entidades.Peca;
import java.math.BigDecimal;
import java.util.List;
import javax.swing.table.AbstractTableModel;
/**
 *
 * @author Bruno
 */
public class PecaTableModel extends AbstractTableModel {
    
    private static final long serialVersionUID = 1L;
    /* Lista de Cliente que representam as linhas. */
    private List<Peca> pecas;
    /* Lista de Strings com o nome das colunas. */
    private String[] colunas = new String[]{
        "Código", "Descrição", "Marca", "Preço Compra", "Preço Venda", 
    "Quantidade"};

    /* Cria um ClienteTableModel carregado com 
     * a lista de Cliente especificada. */
    public PecaTableModel(List<Peca> pecas) {
        this.pecas = pecas;
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
        return pecas.size();
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
        Peca peca = pecas.get(rowIndex);
        /*Retorna o campo referente a coluna especificada.  
         Aqui é feito um switch para verificar qual é a coluna  
         e retornar o campo adequado. As colunas são as mesmas  
         que foram especificadas no array "colunas". */
        switch (columnIndex) {
            // "Placa", "Modelo", "Marca", "Ano", "Km";  
            case 0:
                return peca.getIdPeca();
            case 1:
                return peca.getDescricao();
            case 2:
                return peca.getMarca();
            case 3:
                return peca.getPrecoCompra();
            case 4:
                return peca.getPrecoVenda();
            case 5:
                return peca.getQuantidade();
            default:
                // Isto não deveria acontecer...  
                throw new IndexOutOfBoundsException("columnIndex out of bounds");
        }
    }

    @Override
    //modifica na linha e coluna especificada  
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        Peca peca = pecas.get(rowIndex);
        // Carrega o item da linha que deve ser modificado  

        switch (columnIndex) { // Seta o valor do campo respectivo  
            case 0:
                peca.setIdPeca(Integer.parseInt(aValue.toString()));
                break;
            case 1:
                peca.setDescricao(aValue.toString());
                break;
            case 2:
                peca.setMarca(aValue.toString());
                break;
            case 3:
                peca.setPrecoCompra(new BigDecimal(aValue.toString()));
                break;
            case 4:
                peca.setPrecoVenda(new BigDecimal(aValue.toString()));
                break;
            case 5:
                peca.setQuantidade(Double.parseDouble(aValue.toString()));
                break;
            default:
            // Isto não deveria acontecer... 
        }
        fireTableCellUpdated(rowIndex, columnIndex);
    }

    //modifica na linha especificada  
    public void setValueAt(Peca aValue, int rowIndex) {
        Peca peca = pecas.get(rowIndex); // Carrega o item da linha que deve ser modificado  

        peca.setIdPeca(aValue.getIdPeca());
        peca.setDescricao(aValue.getDescricao());
        peca.setMarca(aValue.getMarca());
        peca.setPrecoCompra(aValue.getPrecoCompra());
        peca.setPrecoVenda(aValue.getPrecoVenda());
        peca.setQuantidade(aValue.getQuantidade());

        fireTableCellUpdated(rowIndex, 0);
        fireTableCellUpdated(rowIndex, 1);
        fireTableCellUpdated(rowIndex, 2);
        fireTableCellUpdated(rowIndex, 3);
        fireTableCellUpdated(rowIndex, 4);
        fireTableCellUpdated(rowIndex, 5);
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }

    public Peca getPeca(int indiceLinha) {
        return pecas.get(indiceLinha);
    }

    /* Adiciona um registro. */
    public void addPeca(Peca peca) {
        // Adiciona o registro.  
        pecas.add(peca);
        int ultimoIndice = getRowCount() - 1;
        fireTableRowsInserted(ultimoIndice, ultimoIndice);
    }

    /* Remove a linha especificada. */
    public void removePeca(int indiceLinha) {
        pecas.remove(indiceLinha);
        fireTableRowsDeleted(indiceLinha, indiceLinha);
    }

    /* Adiciona uma lista de Cliente ao final dos registros. */
    public void addListaDePeca(List<Peca> pecas) {
        // Pega o tamanho antigo da tabela.  
        int tamanhoAntigo = getRowCount();

        // Adiciona os registros.  
        pecas.addAll(pecas);

        fireTableRowsInserted(tamanhoAntigo, getRowCount() - 1);
    }

    /* Remove todos os registros. */
    public void limpar() {
        pecas.clear();
        fireTableDataChanged();
    }

    /* Verifica se este table model esta vazio. */
    public boolean isEmpty() {
        return pecas.isEmpty();
    }
}
