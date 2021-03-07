
package schoolsystem;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class Course {
     public void insertUpdateDeleteStudent(char operation, Integer id, String label,Integer hours ) {

        //connect to db:
        Connection con = MyConnection.getConnection();
        PreparedStatement ps;
        if (operation == 'i') {
            try {
                ps = con.prepareStatement("INSERT INTO `course`( `label`, `hours_number`) VALUES (?,?)");
                ps.setString(1, label);
                ps.setInt(2, hours);
               
                if (ps.executeUpdate() > 0) {
                    JOptionPane.showMessageDialog(null, " New course add successfully");
                }

            } catch (SQLException ex) {
                Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

//        ///// update operation 
        if (operation == 'u') {
            try {
                ps = con.prepareStatement("UPDATE `course` SET `label`=?,`hours_number`=? WHERE `id`=?");
                ps.setString(1, label);
                ps.setInt(2, hours);
                ps.setInt(3, id);
               
              
                if (ps.executeUpdate() > 0) {
                    JOptionPane.showMessageDialog(null, " Data updated successfully");
                }

            } catch (SQLException ex) {
                Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
//
//        ////delete opeartion 


// when we delete a course, all scores of it must deleted by adding the following constraints:
    /*
ALTER TABLE score
add CONSTRAINT fk_score_course
FOREIGN KEY (`course_id`)
REFERENCES course (id)
ON DELETE CASCADE

*/
        if (operation == 'd') {
             int yesOrNo = JOptionPane.showConfirmDialog(null, "the scores of students will also deleted","Delete Course", JOptionPane.OK_CANCEL_OPTION);
            
            if (yesOrNo==0){
            try {
                ps = con.prepareStatement("DELETE FROM `course` WHERE `id` = ?");
                ps.setInt(1, id);
                if (ps.executeUpdate() > 0) {
                    JOptionPane.showMessageDialog(null, " Recored deleted successfully!");
                }

            } catch (SQLException ex) {
                Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
            }
            }

        }
    }
     
     //to check if the course already exist
     public boolean isExist(String courseName){
      // boolean flag =true;
        Connection con = MyConnection.getConnection();
        PreparedStatement ps;
        try {
            ps = con.prepareStatement("SELECT * FROM `course` WHERE `label` = ?");
            ps.setString(1, courseName);
            ResultSet rs = ps.executeQuery();
           
           
            if (rs.next()) {
              return true;
            }
            else {return false;}
        } catch (SQLException ex) {
            Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
        }
     
     return true;
     
     
     }
     
     public void fiiCourseTabel(JTable table) {
        Connection con = MyConnection.getConnection();
        PreparedStatement ps;
        try {
            ps = con.prepareStatement("SELECT * FROM `course`");
          //  ps.setString(1, "%" + valueToSearch + "%");
            ResultSet rs = ps.executeQuery();
            DefaultTableModel model = (DefaultTableModel) table.getModel();
            Object[] row;
            while (rs.next()) {
                row = new Object[3];
                row[0] = rs.getString(1);
                row[1] = rs.getString(2);
                row[2] = rs.getString(3);
               
                model.addRow(row);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
     
     public int getCourseId(String coureName){
     int courseId=0;
      Connection con = MyConnection.getConnection();
       PreparedStatement ps;
        try {
            ps = con.prepareStatement("SELECT * FROM `course` WHERE `label` = ?");
            ps.setString(1, coureName);
            ResultSet rs = ps.executeQuery();
           
            
            if  (rs.next()) {
               courseId = rs.getInt(1); //1: number of colomn that contain the target value!
            }
        } catch (SQLException ex) {
            Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
        }
     
     
         
       return courseId;  
     }
     
     //to fill items of combo with corses in db:
     public void fillCourseCombo(JComboBox combo) {
        Connection con = MyConnection.getConnection();
        PreparedStatement ps;
        try {
            ps = con.prepareStatement("SELECT * FROM `course`");
          
            ResultSet rs = ps.executeQuery();
          
            while (rs.next()) {
              combo.addItem(rs.getString("label")); 
            }
        } catch (SQLException ex) {
            Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
