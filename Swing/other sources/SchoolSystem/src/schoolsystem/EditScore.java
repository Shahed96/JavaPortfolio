
package schoolsystem;

import com.sun.glass.events.KeyEvent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;



public class EditScore extends javax.swing.JFrame {

    Score score;
    public EditScore() {
        initComponents();
        score =new Score();
        score.fiiCourseTabel(jTableS);
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
        jButton_Edit = new javax.swing.JButton();
        jButton_remove = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableS = new javax.swing.JTable();
        jTextField_Sid = new javax.swing.JTextField();
        jTextFieldScore = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField_rate = new javax.swing.JTextField();
        jTextField_courseId = new javax.swing.JTextField();
        jButton_add = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(34, 167, 240));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Edit Score");

        jPanel4.setBackground(new java.awt.Color(218, 223, 225));

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Student id:");

        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Course id:");

        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("    Score:");

        jButton_Edit.setText("Edit");
        jButton_Edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_EditActionPerformed(evt);
            }
        });

        jButton_remove.setText("Remove");
        jButton_remove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_removeActionPerformed(evt);
            }
        });

        jTableS.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Student id", "course id", "Score", "Rate"
            }
        ));
        jTableS.setRowHeight(40);
        jTableS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableSMouseClicked(evt);
            }
        });
        jTableS.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTableSKeyReleased(evt);
            }
        });
        jScrollPane2.setViewportView(jTableS);

        jTextField_Sid.setEditable(false);

        jTextFieldScore.setToolTipText("Enter a number");
        jTextFieldScore.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldScoreKeyTyped(evt);
            }
        });

        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Rate:");

        jTextField_courseId.setEditable(false);

        jButton_add.setText("Add");
        jButton_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_addActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField_Sid, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField_rate)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTextFieldScore, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextField_courseId, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(jButton_remove)
                                .addGap(42, 42, 42)
                                .addComponent(jButton_Edit, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(jButton_add, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 549, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField_Sid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField_courseId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                    .addComponent(jButton_remove)
                    .addComponent(jButton_Edit))
                .addGap(29, 29, 29)
                .addComponent(jButton_add)
                .addGap(114, 114, 114))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 36, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 445, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(340, 340, 340)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
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

    private void jButton_EditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_EditActionPerformed
     
       //Getting the texts from the fields:  
        int studentId = Integer.valueOf(jTextField_Sid.getText()); 
        
       int courseId =Integer.valueOf(jTextField_courseId.getText());
       float scoreT = Float.valueOf(jTextFieldScore.getText());
       String rate = jTextField_rate.getText();
      
       
//checking:
        if (rate.equals("")) {
            JOptionPane.showMessageDialog(null, "Add rate");
        }
        else if (jTextFieldScore.getText().equals(""))
           {
            JOptionPane.showMessageDialog(null, "score is empty!");
           } 
        
        
        else {
            //update operation to db:
         score.insertUpdateDeleteStudent('u',studentId,courseId,scoreT,rate);
        //update operation to JTabel:
          EditScore.jTableS.setModel(new DefaultTableModel(null, new Object[]{"Student id", "course id", "Score","Rate"}));
          score.fiiCourseTabel(EditScore.jTableS);
       
      
        }
       
    }//GEN-LAST:event_jButton_EditActionPerformed

    private void jButton_removeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_removeActionPerformed
        if (jTextField_Sid.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "No recored to delete");
        } else {
            int sid = Integer.valueOf(jTextField_Sid.getText());
            int cid = Integer.valueOf(jTextField_courseId.getText());
            //delete the recored from db
            score.insertUpdateDeleteStudent('d', sid, cid, null, null);
            
            //delete from JTable
            EditScore.jTableS.setModel(new DefaultTableModel(null, new Object[]{"Student id", "course id", "Score","Rate"}));
          score.fiiCourseTabel(EditScore.jTableS);
            
           
            
            //after delete clean all the fields:
            
            jTextField_Sid.setText("");
            jTextField_courseId.setText("");
            jTextFieldScore.setText("");
             jTextField_rate.setText("");
           
          

        }
    }//GEN-LAST:event_jButton_removeActionPerformed

    private void jTableSMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableSMouseClicked
        // DefaultTableModel model = (DefaultTableModel) jTableS.getModel();
            int SelectedRowIndex = jTableS.getSelectedRow();
            jTextField_Sid.setText( jTableS.getValueAt(SelectedRowIndex, 0).toString());
          jTextField_courseId.setText(jTableS.getValueAt(SelectedRowIndex, 1).toString());
          jTextFieldScore.setText(jTableS.getValueAt(SelectedRowIndex, 2).toString());
         jTextField_rate.setText(jTableS.getValueAt(SelectedRowIndex, 3).toString());
            
    }//GEN-LAST:event_jTableSMouseClicked

    private void jTableSKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTableSKeyReleased
if (evt.getKeyCode() == KeyEvent.VK_UP || evt.getKeyCode() == KeyEvent.VK_DOWN){
 int SelectedRowIndex = jTableS.getSelectedRow();
            jTextField_Sid.setText( jTableS.getValueAt(SelectedRowIndex, 0).toString());
          jTextField_courseId.setText(jTableS.getValueAt(SelectedRowIndex, 1).toString());
          jTextFieldScore.setText(jTableS.getValueAt(SelectedRowIndex, 2).toString());
         jTextField_rate.setText(jTableS.getValueAt(SelectedRowIndex, 3).toString());


}     
           
    }//GEN-LAST:event_jTableSKeyReleased

    private void jTextFieldScoreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldScoreKeyTyped
   
    }//GEN-LAST:event_jTextFieldScoreKeyTyped

    private void jButton_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_addActionPerformed
        AddScoresFrame nsc = new AddScoresFrame();
        nsc.setVisible(true);
        nsc.pack();
        nsc.setLocationRelativeTo(null);
        nsc.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_jButton_addActionPerformed

    
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
            java.util.logging.Logger.getLogger(EditScore.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditScore.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditScore.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditScore.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditScore().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Edit;
    private javax.swing.JButton jButton_add;
    private javax.swing.JButton jButton_remove;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    public static javax.swing.JTable jTableS;
    private javax.swing.JTextField jTextFieldScore;
    private javax.swing.JTextField jTextField_Sid;
    private javax.swing.JTextField jTextField_courseId;
    private javax.swing.JTextField jTextField_rate;
    // End of variables declaration//GEN-END:variables
}
