/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guid;

import Domain.Osoba;
import java.util.ArrayList;
import java.util.List;
import javafx.scene.chart.PieChart;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Andrija
 */
public class OsobaTableModel  extends AbstractTableModel {

    private List<Osoba> li = new ArrayList();
    private String[] columnNames = { "ID", "Ime", "Prezime","Age"};

    public OsobaTableModel(List<Osoba> list){
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
        Osoba si = li.get(rowIndex);
        switch (columnIndex) {
            case 0: 
                return si.getId();
            case 1:
                return si.getName();
            case 2:
                return si.getPrezime();
            case 3:
                return si.getDatumRodjenja();
           
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
               return String.class;
             case 3:
               return Integer.class;
  
             }
             return null;
      }
   
    public Osoba getSelectedItem(int index) {
        return li.get(index);
    }
      
      
 }

