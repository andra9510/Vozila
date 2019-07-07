package guid;
import Domain.Mesto;
import java.util.List;
import javax.swing.ComboBoxModel;
import javax.swing.event.ListDataListener;

public class MestoComboBoxModel implements ComboBoxModel<Mesto>{

    private List<Mesto> lm;
    private Mesto selectedItem;
    private int selectedItemIndex;
    
    public MestoComboBoxModel(List<Mesto> lm){
        this.lm = lm;
    }
    
    @Override
    public void setSelectedItem(Object anItem) {
        //this.selectedItem = lm.get(lm.indexOf((Mesto)anItem));
        int index = lm.indexOf((Mesto)anItem);
        if (index > -1 ) {
            this.selectedItem = lm.get(index);
            this.selectedItemIndex = index;
        }else{
            selectedItem = null;
            selectedItemIndex = -1;
        }
    }

    @Override
    public Object getSelectedItem() {
        return selectedItem;
    }

    @Override
    public int getSize() {
        return lm.size();
    }

    @Override
    public Mesto getElementAt(int index) {
        return lm.get(index);
    }

    @Override
    public void addListDataListener(ListDataListener l) {
        
    }

    @Override
    public void removeListDataListener(ListDataListener l) {
       
    }

}
