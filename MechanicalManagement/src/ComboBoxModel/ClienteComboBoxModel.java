package ComboBoxModel;

import entidades.Cliente;
import java.util.ArrayList;
import java.util.List;
import javax.swing.AbstractListModel;
import javax.swing.MutableComboBoxModel;

/**
 *
 * @author Bruno
 */
public class ClienteComboBoxModel extends AbstractListModel implements MutableComboBoxModel {

    private Object selectedItem;
    private List list;

    public ClienteComboBoxModel() {
        this.list = new ArrayList();
    }

    public ClienteComboBoxModel(List<Cliente> clientes) {
        this.list = new ArrayList();
        for (Cliente cliente : clientes) {
            list.add(cliente.getNome());
        }
    }

    public void setList(List list) {
        this.list = list;
        fireContentsChanged(this, 0, list.size());
    }

    @Override
    public int getSize() {
        return list.size();
    }

    @Override
    public Object getElementAt(int i) {
        try {
            return list.get(i);
        } catch (java.lang.IndexOutOfBoundsException ex) {
            return null;
        }
    }

    @Override
    public Object getSelectedItem() {
        return selectedItem;
    }

    public Integer getSelectedIndex() {
        int index = list.indexOf(this.getSelectedItem());
        return index;
    }

    @Override
    public void setSelectedItem(Object newValue) {
        selectedItem = newValue;
        fireContentsChanged(this, -1, list.size());
    }

    // MutableComboBoxModel  
    public void setElementAt(Object element, int index) {
        list.set(index, element);
        // Added at end, notify ListDataListener objects  
        int length = getSize();
        fireIntervalAdded(this, length - 1, length - 1);
    }

    // MutableComboBoxModel  
    @Override
    public void addElement(Object element) {
        list.add(element);
        // Added at end, notify ListDataListener objects  
        int length = getSize();
        fireIntervalAdded(this, length - 1, length - 1);
    }

    @Override
    public void insertElementAt(Object element, int index) {
        // Insert the element at the specified position  
        list.add(index, element);
        // Added in middle, notify ListDataListener objects  
        fireIntervalAdded(this, index, index);
    }

    @Override
    public void removeElement(Object element) {
        // Find out position  
        int index = list.indexOf(element);
        if (index != -1) {
            // Remove an element  
            list.remove(element);
            // Removed from middle, notify ListDataListener objects  
            fireIntervalRemoved(this, index, index);
        }
    }

    public void removeAllItens() {
        if (list != null && list.size() > 0) {
            list.clear();
            fireContentsChanged(this, -1, list.size());
        }
    }

    @Override
    public void removeElementAt(int index) {
        if (getSize() >= index) {
            // Remove an element at the specified position  
            list.remove(index);
            // Removed from index, notify ListDataListener objects  
            fireIntervalRemoved(this, index, index);
        }
    }
}
