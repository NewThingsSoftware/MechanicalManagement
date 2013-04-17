package comboBoxModel;

import entidades.Cliente;
import java.util.List;
import javax.swing.AbstractListModel;
import javax.swing.MutableComboBoxModel;

/**
 *
 * @author Bruno
 */
public class ClienteComboBoxModel extends AbstractListModel<Cliente> implements MutableComboBoxModel<Cliente> {

    private static final long serialVersionUID = 1L;
    /* Lista de Cliente que representam as linhas. */
    private List<Cliente> clientes;

    public ClienteComboBoxModel(List<Cliente> clientes) {
        this.clientes = clientes;
    }

    @Override
    public int getSize() {
        return clientes.size();
    }

    @Override
    public Cliente getElementAt(int index) {
        try {
            return clientes.get(index);
        }catch(java.lang.IndexOutOfBoundsException ex){
            return null;
        }
    }

    @Override
    public void addElement(Cliente cliente) {
        clientes.add(cliente);
    }

    @Override
    public void removeElement(Object cliente) {
        clientes.remove((Cliente) cliente);
    }

    @Override
    public void insertElementAt(Cliente cliente, int index) {
        clientes.add(index, cliente);
    }

    @Override
    public void removeElementAt(int index) {
        clientes.remove(index);
    }

    @Override
    public void setSelectedItem(Object anItem) {
    }

    @Override
    public Object getSelectedItem() {
        return null;
    }
}
