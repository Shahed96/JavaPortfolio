
package schoolsystem;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class Score {
    
    
     public void insertUpdateDeleteStudent(char operation, Integer sId ,Integer cId, Float sScore, String description ) {

        //connect to db:
        Connection con = MyConnection.getConnection();
        PreparedStatement ps;
        if (operation == 'i') {
            try {
                ps = con.prepareStatement("INSERT INTO `score`(`student_id`, `course_id`, `student_score`, `description`) VALUES (?,?,?,?)");
                ps.setInt(1, sId);
                 ps.setInt(2, cId);
                  ps.setFloat(3, sScore);
                   ps.setString(4, description);
                   
               
                if (ps.executeUpdate() > 0) {
                    JOptionPane.showMessageDialog(null, " New Score add successfully");
                }

            } catch (SQLException ex) {
                Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

       ///// update operation 
      if (operation == 'u') {
            try {
               ps = con.prepareStatement("UPDATE `score` SET `student_score` = ?,`description` = ? WHERE `student_id` = ? and `course_id`= ?");
                ps.setFloat(1, sScore);
               ps.setString(2, description);
               ps.setInt(3,sId );
                ps.setInt(4,cId );
              
              
               if (ps.executeUpdate() > 0) {
                  JOptionPane.showMessageDialog(null, " Data updated successfully");
               }

            } catch (SQLException ex) {
               Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
           }

       }

       ////delete opeartion 
       if (operation == 'd') {
            try {
               ps = con.prepareStatement("DELETE FROM `score` WHERE `student_id`= ? and  `course_id` = ?");
               ps.setInt(1, sId);
               ps.setInt(2,cId );
                if (ps.executeUpdate() > 0) {
                   JOptionPane.showMessageDialog(null, " Recored deleted successfully!");
               }

            } catch (SQLException ex) {
               Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
           }



       }
    }
     
     
     //to fill JTabel in EditScore frame, then call this function in the constructor of the EditScore frame
      public void fiiCourseTabel(JTable table) {
        Connection con = MyConnection.getConnection();
        PreparedStatement ps;
        try {
            ps = con.prepareStatement("SELECT * FROM `score`");
            ResultSet rs = ps.executeQuery();
            DefaultTableModel model = (DefaultTableModel) table.getModel();
            Object[] row;
            while (rs.next()) {
                row = new Object[4];
                row[0] = rs.getInt(1);
                row[1] = rs.getInt(2);
                row[2] = rs.getFloat(3);
                row[3] = rs.getString(4);
               
                model.addRow(row);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
}
