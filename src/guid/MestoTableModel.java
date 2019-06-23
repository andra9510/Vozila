
package guid;


import Domain.Mesto;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class MestoTableModel extends AbstractTableModel {

    private List<Mesto> li = new ArrayList();
    private String[] columnNames = { "mestoId", "naziv", "ptt"};

    public MestoTableModel(List<Mesto> list){
         this.li = list;
    }

    @Override
    public String getColumnName(int columnIndex){
         return columnNames[columnIndex];
    }

    @Override     
    public int getRowCount() {
        return li.size();
    }

    @Override        
    public int getColumnCount() {
        return columnNames.length; 
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Mesto me = li.get(rowIndex);
        switch (columnIndex) {
            case 0: 
                return me.getMestoId();
            case 1:
                return me.getNaziv();
            case 2:
                return me.getPtt();
           }
           return null;
   }

   @Override
   public Class<?> getColumnClass(int columnIndex){
          switch (columnIndex){
             case 0:
               return Integer.class;
             case 1:
               return String.class;
             case 2:
               return int.class;
           
  
             }
             return null;
      }
  
    
}
