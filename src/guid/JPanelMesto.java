
package guid;

import Domain.Mesto;


import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import sistemskeoperacije.mesto.BrisanjeMesto;
import sistemskeoperacije.mesto.InsertovanjeMesto;
import sistemskeoperacije.mesto.MestoService;
import sistemskeoperacije.mesto.MestoUpdate;


public class JPanelMesto extends javax.swing.JPanel {

    public JPanelMesto() {
        initComponents();
        setTableDatamesto();
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTableMesto = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jbtnAddMesto = new javax.swing.JButton();
        jbtnUpdateMesto = new javax.swing.JButton();
        txMestoId = new javax.swing.JTextField();
        txNaziv = new javax.swing.JTextField();
        txPtt = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButtonBrisanjeMesto = new javax.swing.JButton();
        Clear = new javax.swing.JButton();

        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                formMouseReleased(evt);
            }
        });

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jTable2MouseReleased(evt);
            }
        });
        jTableMesto.setViewportView(jTable2);

        jbtnAddMesto.setText("Add");
        jbtnAddMesto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnAddMestoActionPerformed(evt);
            }
        });

        jbtnUpdateMesto.setText("Update");
        jbtnUpdateMesto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnUpdateMestoActionPerformed(evt);
            }
        });

        jLabel1.setText("MestId");

        jLabel2.setText("Naziv");

        jLabel3.setText("Ptt");

        jButtonBrisanjeMesto.setText("Delete");
        jButtonBrisanjeMesto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBrisanjeMestoActionPerformed(evt);
            }
        });

        Clear.setText("Clear");
        Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(51, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTableMesto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButtonBrisanjeMesto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbtnUpdateMesto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbtnAddMesto)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txMestoId, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
                    .addComponent(txPtt)
                    .addComponent(txNaziv))
                .addGap(59, 59, 59)
                .addComponent(Clear)
                .addGap(19, 19, 19))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTableMesto, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txMestoId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(Clear)
                        .addGap(28, 28, 28)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txNaziv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txPtt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnAddMesto)
                    .addComponent(jbtnUpdateMesto)
                    .addComponent(jButtonBrisanjeMesto))
                .addContainerGap(22, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnUpdateMestoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnUpdateMestoActionPerformed
       MestoUpdate u = new MestoUpdate();
       try{
           if(u.updatemesto(getMestoFromForm())){
               setTableDatamesto();
              // ClearFieldsMesto();
           }
       }
       catch (SQLException ex) {
            Logger.getLogger(JFramelMain.class.getName()).log(Level.SEVERE, null, ex);
       }
    }//GEN-LAST:event_jbtnUpdateMestoActionPerformed

    private void jButtonBrisanjeMestoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBrisanjeMestoActionPerformed

        int rowSelected = jTable2.getSelectedRow();
        Object mestoId =jTable2.getModel().getValueAt(rowSelected, 0);
        try{
            boolean obrisan = new BrisanjeMesto().deletemesto((int) mestoId);
            if(obrisan){
                setTableDatamesto();
            }
        }catch(SQLException ex){
          Logger.getLogger(JFramelMain.class.getName()).log(Level.SEVERE,null,ex);  
        }
    }//GEN-LAST:event_jButtonBrisanjeMestoActionPerformed

    private void formMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseReleased

    }//GEN-LAST:event_formMouseReleased

    private void jTable2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseReleased
       setMestoForm();
    }//GEN-LAST:event_jTable2MouseReleased

    private void jbtnAddMestoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnAddMestoActionPerformed
     InsertovanjeMesto insert= new InsertovanjeMesto();
     try{
             if(insert.insermesto(getMestoFromForm())){
                 setTableDatamesto();
                 ClearFieldsMesto();
             }
     }catch(SQLException ex){
         Logger.getLogger(JFramelMain.class.getName()).log(Level.SEVERE,null,ex); 
         
     }
    }//GEN-LAST:event_jbtnAddMestoActionPerformed

    private void ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearActionPerformed
    ClearFieldsMesto();
    }//GEN-LAST:event_ClearActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Clear;
    private javax.swing.JButton jButtonBrisanjeMesto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTable jTable2;
    private javax.swing.JScrollPane jTableMesto;
    private javax.swing.JButton jbtnAddMesto;
    private javax.swing.JButton jbtnUpdateMesto;
    private javax.swing.JTextField txMestoId;
    private javax.swing.JTextField txNaziv;
    private javax.swing.JTextField txPtt;
    // End of variables declaration//GEN-END:variables

    private void ClearFieldsMesto(){
        txMestoId.setText(null);
        txNaziv.setText(null);
        txPtt.setText(null);
    }
    private Mesto getMestoFromForm(){
       Mesto mestoFromForm = new Mesto();
       mestoFromForm.setMestoId(Integer.parseInt(txMestoId.getText()));
       mestoFromForm.setNaziv(txNaziv.getText());
       mestoFromForm.setPtt(Integer.parseInt(txPtt.getText()));
        return mestoFromForm;
      
    }
    private void setMestoForm(){
        int rowSelected=jTable2.getSelectedRow();
        txMestoId.setText(jTable2.getModel().getValueAt(rowSelected, 0).toString());
        txNaziv.setText(jTable2.getModel().getValueAt(rowSelected, 1).toString());
        txPtt.setText(jTable2.getModel().getValueAt(rowSelected, 2).toString());
    }
   private void setTableDatamesto(){
         try{
          List<Mesto> listamesto = new MestoService().GetAllMesta();
          MestoTableModel mestoTableModel = new MestoTableModel(listamesto);     
          jTable2.setModel(mestoTableModel);
      }
          catch(Exception e){
            System.out.println(e);
        
    }
   }
  
}
    
    
    
    
    
    

