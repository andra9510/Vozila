
package guid;
import Domain.Mesto;
import Domain.Osoba;
import static java.lang.Thread.sleep;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import sistemskeoperacije.mesto.MestoService;
import sistemskeoperacije.osoba.OsobaService;

public class JPanelOsoba extends javax.swing.JPanel {

    public JPanelOsoba() {
        initComponents();
        setTableData();
        setJcomboBoxMesto();
        sat();               
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelOsoba = new java.awt.Panel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jbtnClearListOsoba = new javax.swing.JButton();
        jbtnBrisanjeOsobe = new javax.swing.JButton();
        jbtnAddOsoba = new javax.swing.JButton();
        lblId = new javax.swing.JLabel();
        lblIme = new javax.swing.JLabel();
        lblPrezime = new javax.swing.JLabel();
        lblGodine = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        txtIme = new javax.swing.JTextField();
        txtPrezime = new javax.swing.JTextField();
        txtGodine = new javax.swing.JTextField();
        jbtnUpdateOsoba = new javax.swing.JButton();
        jbtnClearOsobaFields = new javax.swing.JButton();
        jlblMesto = new javax.swing.JLabel();
        jcomboBoxMesto = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jTable1MouseReleased(evt);
            }
        });
        jTable1.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jTable1ComponentShown(evt);
            }
        });
        jTable1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTable1KeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jbtnClearListOsoba.setText("Cela lista");
        jbtnClearListOsoba.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnClearListOsobaActionPerformed(evt);
            }
        });

        jbtnBrisanjeOsobe.setText("Brisanje");
        jbtnBrisanjeOsobe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnBrisanjeOsobeActionPerformed(evt);
            }
        });

        jbtnAddOsoba.setText("Add");
        jbtnAddOsoba.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnAddOsobaActionPerformed(evt);
            }
        });

        lblId.setText("ID");

        lblIme.setText("Ime");

        lblPrezime.setText("Prezime");

        lblGodine.setText("Godine");

        jbtnUpdateOsoba.setText("Update");
        jbtnUpdateOsoba.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnUpdateOsobaActionPerformed(evt);
            }
        });

        jbtnClearOsobaFields.setText("Clear Fileds");
        jbtnClearOsobaFields.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnClearOsobaFieldsActionPerformed(evt);
            }
        });

        jlblMesto.setText("Mesto");

        jcomboBoxMesto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcomboBoxMestoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelOsobaLayout = new javax.swing.GroupLayout(jPanelOsoba);
        jPanelOsoba.setLayout(jPanelOsobaLayout);
        jPanelOsobaLayout.setHorizontalGroup(
            jPanelOsobaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelOsobaLayout.createSequentialGroup()
                .addGap(151, 151, 151)
                .addComponent(jlblMesto)
                .addGap(30, 30, 30)
                .addComponent(jcomboBoxMesto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(299, Short.MAX_VALUE))
            .addGroup(jPanelOsobaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelOsobaLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanelOsobaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanelOsobaLayout.createSequentialGroup()
                            .addGroup(jPanelOsobaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanelOsobaLayout.createSequentialGroup()
                                    .addComponent(jbtnBrisanjeOsobe)
                                    .addGap(22, 22, 22))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelOsobaLayout.createSequentialGroup()
                                    .addComponent(jbtnClearListOsoba)
                                    .addGap(18, 18, 18)))
                            .addGroup(jPanelOsobaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanelOsobaLayout.createSequentialGroup()
                                    .addGap(53, 53, 53)
                                    .addGroup(jPanelOsobaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanelOsobaLayout.createSequentialGroup()
                                            .addGroup(jPanelOsobaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(lblPrezime)
                                                .addComponent(lblGodine)
                                                .addComponent(lblIme))
                                            .addGroup(jPanelOsobaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanelOsobaLayout.createSequentialGroup()
                                                    .addGap(18, 18, 18)
                                                    .addGroup(jPanelOsobaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(txtPrezime, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(txtGodine, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGroup(jPanelOsobaLayout.createSequentialGroup()
                                                    .addGap(18, 18, 18)
                                                    .addComponent(txtIme, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addGroup(jPanelOsobaLayout.createSequentialGroup()
                                            .addComponent(lblId)
                                            .addGap(44, 44, 44)
                                            .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jbtnClearOsobaFields))))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(0, 0, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelOsobaLayout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbtnUpdateOsoba)
                            .addGap(18, 18, 18)
                            .addComponent(jbtnAddOsoba)))
                    .addContainerGap()))
        );
        jPanelOsobaLayout.setVerticalGroup(
            jPanelOsobaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelOsobaLayout.createSequentialGroup()
                .addContainerGap(273, Short.MAX_VALUE)
                .addGroup(jPanelOsobaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlblMesto)
                    .addComponent(jcomboBoxMesto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(71, 71, 71))
            .addGroup(jPanelOsobaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelOsobaLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanelOsobaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanelOsobaLayout.createSequentialGroup()
                            .addComponent(jbtnBrisanjeOsobe)
                            .addGap(18, 18, 18)
                            .addComponent(jbtnClearListOsoba))
                        .addGroup(jPanelOsobaLayout.createSequentialGroup()
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addGroup(jPanelOsobaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblId)
                                .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jbtnClearOsobaFields))
                            .addGap(4, 4, 4)
                            .addGroup(jPanelOsobaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblIme)
                                .addComponent(txtIme, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(9, 9, 9)
                            .addGroup(jPanelOsobaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblPrezime)
                                .addComponent(txtPrezime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanelOsobaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblGodine)
                                .addComponent(txtGodine, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                    .addGroup(jPanelOsobaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jbtnAddOsoba)
                        .addComponent(jbtnUpdateOsoba))
                    .addContainerGap()))
        );

        jLabel1.setBackground(new java.awt.Color(51, 250, 0));
        jLabel1.setFont(new java.awt.Font("Traditional Arabic", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 0, 51));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 74, Short.MAX_VALUE)
                .addComponent(jPanelOsoba, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 74, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(228, 228, 228)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 38, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelOsoba, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 86, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseReleased
      setOsobaForm();
    }//GEN-LAST:event_jTable1MouseReleased

    private void jTable1ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jTable1ComponentShown

    }//GEN-LAST:event_jTable1ComponentShown

    private void jbtnClearListOsobaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnClearListOsobaActionPerformed

    }//GEN-LAST:event_jbtnClearListOsobaActionPerformed

    private void jbtnBrisanjeOsobeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnBrisanjeOsobeActionPerformed
        try {
            int rowSelected = jTable1.getSelectedRow();
            Object osobaId =  jTable1.getModel().getValueAt(rowSelected, 0);
            boolean obrisan = new OsobaService().delete(((int) osobaId));
            if (obrisan) {
                setTableData();
            }
        } catch (SQLException ex) {
            Logger.getLogger(JPanelOsoba.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jbtnBrisanjeOsobeActionPerformed

    private void jbtnAddOsobaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnAddOsobaActionPerformed

        try {
        OsobaService os = new OsobaService();
            if(os.Insert(getOsobaFromForm())){
                setTableData();
                ClearFieldsOsoba();
            }
        }  catch (SQLException ex) {
            Logger.getLogger(JPanelOsoba.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jbtnAddOsobaActionPerformed

    private void jbtnUpdateOsobaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnUpdateOsobaActionPerformed
        try {
        OsobaService os = new OsobaService();
            if(os.Update(getOsobaFromForm())){
                setTableData();
                //ClearFieldsOsoba();
            }
        }  catch (SQLException ex) {
            Logger.getLogger(JPanelOsoba.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jbtnUpdateOsobaActionPerformed

    private void jbtnClearOsobaFieldsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnClearOsobaFieldsActionPerformed
        ClearFieldsOsoba();
    }//GEN-LAST:event_jbtnClearOsobaFieldsActionPerformed

    private void jcomboBoxMestoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcomboBoxMestoActionPerformed
    
   
    }//GEN-LAST:event_jcomboBoxMestoActionPerformed

    private void jTable1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable1KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable1KeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private java.awt.Panel jPanelOsoba;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton jbtnAddOsoba;
    private javax.swing.JButton jbtnBrisanjeOsobe;
    private javax.swing.JButton jbtnClearListOsoba;
    private javax.swing.JButton jbtnClearOsobaFields;
    private javax.swing.JButton jbtnUpdateOsoba;
    private javax.swing.JComboBox jcomboBoxMesto;
    private javax.swing.JLabel jlblMesto;
    private javax.swing.JLabel lblGodine;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblIme;
    private javax.swing.JLabel lblPrezime;
    private javax.swing.JTextField txtGodine;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtIme;
    private javax.swing.JTextField txtPrezime;
    // End of variables declaration//GEN-END:variables

private void ClearFieldsOsoba(){
                txtId.setText(null);
                txtIme.setText(null);
                txtPrezime.setText(null);
                txtGodine.setText(null);
    }
    
    private Osoba getOsobaFromForm(){
        Osoba osobaFromForm = new Osoba();
        osobaFromForm.setId(Integer.parseInt(txtId.getText()));
        osobaFromForm.setName(txtIme.getText());
        osobaFromForm.setPrezime(txtPrezime.getText());
        osobaFromForm.setDatumRodjenja(Integer.parseInt(txtGodine.getText()));            
        osobaFromForm.setMesto((Mesto)jcomboBoxMesto.getSelectedItem());       //
        return osobaFromForm;
    }
    
    private void setOsobaForm()
             {
      int rowSelected = jTable1.getSelectedRow();
        txtId.setText( jTable1.getModel().getValueAt(rowSelected, 0).toString());
        txtIme.setText( jTable1.getModel().getValueAt(rowSelected, 1).toString());
        txtPrezime.setText( jTable1.getModel().getValueAt(rowSelected, 2).toString());
        txtGodine.setText( jTable1.getModel().getValueAt(rowSelected, 3).toString());
        
        Osoba o = ((OsobaTableModel)jTable1.getModel()).getSelectedItem(rowSelected);
        
        jcomboBoxMesto.getModel().setSelectedItem(o.getMesto());  //
        jcomboBoxMesto.repaint(); //

    }
    private void setTableData(){
     try{
   
          List<Osoba> listaOsoba = new OsobaService().GetAllOsoba(); 
          OsobaTableModel osobaTableModel = new OsobaTableModel(listaOsoba);     
          jTable1.setModel(osobaTableModel);
            // jTable1.setModel(DbUtils.resultSetToTableModel(listaOsoba));
        }
        catch(Exception e){
            System.out.println(e);
        }
   
     }
      private void setJcomboBoxMesto(){
           
        MestoService ms = new MestoService();
        List<Mesto>mestos= ms.GetAllMesta();
        MestoComboBoxModel mcbm = new MestoComboBoxModel(mestos);
        jcomboBoxMesto.setModel(mcbm);
        
       
    }
      private void sat(){
           
        Thread th = new Thread(){
            public void run(){
                try{
                    for(;;){
                        Calendar cl= new GregorianCalendar();
                        
                        int day = cl.get(Calendar.DAY_OF_MONTH);
                        int month =cl.get(Calendar.MONTH);
                        int year = cl.get(Calendar.YEAR);
                        
                        int second= cl.get(Calendar.SECOND);
                        int min = cl.get(Calendar.MINUTE);
                        int hour =cl.get(Calendar.HOUR);
                        int am_pm = cl.get(Calendar.AM_PM);
                        
                        String d_n = "";
                        if(am_pm == 1)
                            d_n ="PM";
                        else
                            d_n = "AM";
                        jLabel1.setText(""+hour+":"+min+":"+second+":"+d_n+" "+day+"/"+month+"/"+year+"");
                        sleep(1000);
                    }
                }
                catch(Exception ex){
                    ex.printStackTrace();
                    
                }
            }
        };
        th.start();
    
      }}
    

