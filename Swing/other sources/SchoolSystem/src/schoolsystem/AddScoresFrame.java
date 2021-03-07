
package schoolsystem;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;


public class AddScoresFrame extends javax.swing.JFrame {

   private  Course course ;
   private Student s;
    private Score sc;
   
    public AddScoresFrame() {
        initComponents();
        s=new Student();
        course= new Course();
        sc=new Score();
        //fill combo items 
        course.fillCourseCombo(jComboBox_courseid);
        s.fiiStudentTabel(jTable1, "");
        
        //Hide some colomns from Score frame:
        HideColumn(6);
         HideColumn(5);
          HideColumn(4);
           HideColumn(3);
    }

   private void HideColumn(int colIndex){
   TableColumn co =jTable1.getColumnModel().getColumn(colIndex);
   
   co.setMaxWidth(0);
   co.setMinWidth(0);
   co.setPreferredWidth(0);
   }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton_add = new javax.swing.JButton();
        jButton_cancel = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTextField_id = new javax.swing.JTextField();
        jComboBox_courseid = new javax.swing.JComboBox();
        jTextFieldScore = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField_rate = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(34, 167, 240));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Add Score");

        jPanel4.setBackground(new java.awt.Color(218, 223, 225));

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Student id:");

        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Course id:");

        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("    Score:");

        jButton_add.setText("Add");
        jButton_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_addActionPerformed(evt);
            }
        });

        jButton_cancel.setText("Cancel");
        jButton_cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_cancelActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "first name", "last name", "Gender", "birthdate", "phone", "address"
            }
        ));
        jTable1.setRowHeight(40);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jTable1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTable1KeyReleased(evt);
            }
        });
        jScrollPane2.setViewportView(jTable1);

        jTextField_id.setEditable(false);

        jTextFieldScore.setToolTipText("Enter a number");
        jTextFieldScore.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldScoreKeyTyped(evt);
            }
        });

        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Rate:");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField_id, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBox_courseid, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jTextFieldScore, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jTextField_rate)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jButton_cancel)
                        .addGap(42, 42, 42)
                        .addComponent(jButton_add, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 549, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jComboBox_courseid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextFieldScore, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_rate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_cancel)
                    .addComponent(jButton_add))
                .addGap(168, 168, 168))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 36, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 445, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(334, 334, 334)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_addActionPerformed

        
        int stId =Integer.valueOf(jTextField_id.getText());
       int cid = course.getCourseId(jComboBox_courseid.getSelectedItem().toString());
       double scores =Double.valueOf(jTextFieldScore.getText());
       String rate = jTextField_rate.getText();
       
     
        if (jTextFieldScore.getText().equals("")){
      JOptionPane.showMessageDialog(null, "must enter a score");
       }
       else {   
       sc.insertUpdateDeleteStudent('i', stId, cid, (float) scores, rate);
       
         //add to Jtable in edit form 
          Object[] o =new Object[]{"Student id", "course id", "Score", "Rate"};
             EditScore.jTableS.setModel(new DefaultTableModel(null, o));
            sc.fiiCourseTabel(EditScore.jTableS);
               }
    }//GEN-LAST:event_jButton_addActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
     int SelectedRowIndex = jTable1.getSelectedRow();
      DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
     jTextField_id.setText((String) model.getValueAt(SelectedRowIndex, 0));
         
//     try {
    //      DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
//            int SelectedRowIndex = jTable1.getSelectedRow();
//            jTextField_id.setText((String) model.getValueAt(SelectedRowIndex, 0));
//            jTextField_fn.setText((String) model.getValueAt(SelectedRowIndex, 1));
//            jTextField_ln.setText((String) model.getValueAt(SelectedRowIndex, 2));
//
//            String gender = ((String) model.getValueAt(SelectedRowIndex, 3));
//            if (gender.equals("female")) {
//                jRadioButton_female.setSelected(true);
//                jRadioButton_male.setSelected(false);
//            } else {
//                jRadioButton_male.setSelected(true);
//                jRadioButton_female.setSelected(false);
//            }
//            String date = ((String) model.getValueAt(SelectedRowIndex, 4));
//            Date date1 = new SimpleDateFormat("yyyy-mm-dd").parse(date);   //convert String to Date simple format
//            jDateChooser1.setDate(date1);
//
//            jTextField_phone.setText((String) model.getValueAt(SelectedRowIndex, 5));
//            jTextArea1.setText((String) model.getValueAt(SelectedRowIndex, 6));
//        } catch (ParseException ex) {
//            Logger.getLogger(ManageForm.class.getName()).log(Level.SEVERE, null, ex);
//        }
//
    }//GEN-LAST:event_jTable1MouseClicked

    private void jTable1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable1KeyReleased
//        if (evt.getKeyCode() == KeyEvent.VK_UP || evt.getKeyCode() == KeyEvent.VK_DOWN) {
//
//            try {
//                DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
//                int SelectedRowIndex = jTable1.getSelectedRow();
//                jTextField_id.setText((String) model.getValueAt(SelectedRowIndex, 0));
//                jTextField_fn.setText((String) model.getValueAt(SelectedRowIndex, 1));
//                jTextField_ln.setText((String) model.getValueAt(SelectedRowIndex, 2));
//
//                String gender = ((String) model.getValueAt(SelectedRowIndex, 3));
//                if (gender.equals("female")) {
//                    jRadioButton_female.setSelected(true);
//                    jRadioButton_male.setSelected(false);
//                } else {
//                    jRadioButton_male.setSelected(true);
//                    jRadioButton_female.setSelected(false);
//                }
//                String date = ((String) model.getValueAt(SelectedRowIndex, 4));
//                Date date1 = new SimpleDateFormat("yyyy-mm-dd").parse(date);   //convert String to Date simple format
//                jDateChooser1.setDate(date1);
//
//                jTextField_phone.setText((String) model.getValueAt(SelectedRowIndex, 5));
//                jTextArea1.setText((String) model.getValueAt(SelectedRowIndex, 6));
//            } catch (ParseException ex) {
//                Logger.getLogger(ManageForm.class.getName()).log(Level.SEVERE, null, ex);
//            }
//        }
    }//GEN-LAST:event_jTable1KeyReleased

    private void jButton_cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_cancelActionPerformed
      this.dispose();
    }//GEN-LAST:event_jButton_cancelActionPerformed

    private void jTextFieldScoreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldScoreKeyTyped
      /*  if (!Character.isDigit(evt.getKeyChar())) { //if the user typing char not numbers
            evt.consume(); //stop that event!!
        }*/
    }//GEN-LAST:event_jTextFieldScoreKeyTyped

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AddScoresFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddScoresFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddScoresFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddScoresFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddScoresFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_add;
    private javax.swing.JButton jButton_cancel;
    private javax.swing.JComboBox<String> jComboBox_courseid;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    static javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextFieldScore;
    private javax.swing.JTextField jTextField_id;
    private javax.swing.JTextField jTextField_rate;
    // End of variables declaration//GEN-END:variables
}
