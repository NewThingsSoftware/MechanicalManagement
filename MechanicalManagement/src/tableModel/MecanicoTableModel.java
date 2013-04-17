package tableModel;

import entidades.Mecanico;
import java.util.List;
import javax.swing.table.AbstractTableModel;
/**
 *
 * @author Bruno
 */
public class MecanicoTableModel extends AbstractTableModel{
    
    private static final long serialVersionUID = 1L;
    /* Lista de Cliente que representam as linhas. */
    private List<Mecanico> mecanicos;
    /* Lista de Strings com o nome das colunas. */
    private String[] colunas = new String[]{
        "Nome", "CPF", "RG", "Telefone", "Especialidade"};

    /* Cria um ClienteTableModel carregado com 
     * a lista de Cliente especificada. */
    public MecanicoTableModel(List<Mecanico> mecanicos) {
        this.mecanicos = mecanicos;
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
        return mecanicos.size();
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
        Mecanico mecanico = mecanicos.get(rowIndex);
        /*Retorna o campo referente a coluna especificada.  
         Aqui é feito um switch para verificar qual é a coluna  
         e retornar o campo adequado. As colunas são as mesmas  
         que foram especificadas no array "colunas". */
        switch (columnIndex) {
            // "Placa", "Modelo", "Marca", "Ano", "Km";  
            case 0:
                return mecanico.getNome();
            case 1:
                return mecanico.getCpf();
            case 2:
                return mecanico.getRg();
            case 3:
                return mecanico.getTelefone();
            case 4:
                return mecanico.getEspecialidade();
            default:
                // Isto não deveria acontecer...  
                throw new IndexOutOfBoundsException("columnIndex out of bounds");
        }
    }

    @Override
    //modifica na linha e coluna especificada  
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        Mecanico mecanico = mecanicos.get(rowIndex);
        // Carrega o item da linha que deve ser modificado  

        switch (columnIndex) { // Seta o valor do campo respectivo  
            case 0:
                mecanico.setNome(aValue.toString());
                break;
            case 1:
                mecanico.setCpf(Integer.parseInt(aValue.toString()));
                break;
            case 2:
                mecanico.setRg(Integer.parseInt(aValue.toString()));
                break;
            case 3:
                mecanico.setTelefone(aValue.toString());
                break;
            case 4:
                mecanico.setEspecialidade(aValue.toString());
                break;
            default:
            // Isto não deveria acontecer... 
        }
        fireTableCellUpdated(rowIndex, columnIndex);
    }

    //modifica na linha especificada  
    public void setValueAt(Mecanico aValue, int rowIndex) {
        Mecanico mecanico = mecanicos.get(rowIndex); // Carrega o item da linha que deve ser modificado  

        mecanico.setNome(aValue.getNome());
        mecanico.setCpf(aValue.getCpf());
        mecanico.setRg(aValue.getRg());
        mecanico.setTelefone(aValue.getTelefone());
        mecanico.setEspecialidade(aValue.getEspecialidade());

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

    public Mecanico getMecanico(int indiceLinha) {
        return mecanicos.get(indiceLinha);
    }

    /* Adiciona um registro. */
    public void addMecanico(Mecanico mecanico) {
        // Adiciona o registro.  
        mecanicos.add(mecanico);
        int ultimoIndice = getRowCount() - 1;
        fireTableRowsInserted(ultimoIndice, ultimoIndice);
    }

    /* Remove a linha especificada. */
    public void removeMecanico(int indiceLinha) {
        mecanicos.remove(indiceLinha);
        fireTableRowsDeleted(indiceLinha, indiceLinha);
    }

    /* Adiciona uma lista de Cliente ao final dos registros. */
    public void addListaDeVeiculo(List<Mecanico> mecanicos) {
        // Pega o tamanho antigo da tabela.  
        int tamanhoAntigo = getRowCount();

        // Adiciona os registros.  
        mecanicos.addAll(mecanicos);

        fireTableRowsInserted(tamanhoAntigo, getRowCount() - 1);
    }

    /* Remove todos os registros. */
    public void limpar() {
        mecanicos.clear();
        fireTableDataChanged();
    }

    /* Verifica se este table model esta vazio. */
    public boolean isEmpty() {
        return mecanicos.isEmpty();
    }
}
