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

public class Student {

    public void insertUpdateDeleteStudent(char operation, Integer id, String fname, String lname,
            String sex, String bdate, String phone, String address) {

        //connect to db:
        Connection con = MyConnection.getConnection();
        PreparedStatement ps;
        if (operation == 'i') {
            try {
                ps = con.prepareStatement("INSERT INTO `student`(`first_name`, `last_name`, `sex`, `birthdate`, `phone`, `address`) VALUES (?,?,?,?,?,?)");
                ps.setString(1, fname);
                ps.setString(2, lname);
                ps.setString(3, sex);
                ps.setString(4, bdate);
                ps.setString(5, phone);
                ps.setString(6, address);
                if (ps.executeUpdate() > 0) {
                    JOptionPane.showMessageDialog(null, " New student add successfully");
                }

            } catch (SQLException ex) {
                Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

        ///// update operation 
        if (operation == 'u') {
            try {
                ps = con.prepareStatement("UPDATE `student` SET `first_name` = ?,`last_name` = ?,`sex` = ?,`birthdate` = ?,`phone` = ?,`address`= ? WHERE `id`= ?");
                ps.setString(1, fname);
                ps.setString(2, lname);
                ps.setString(3, sex);
                ps.setString(4, bdate);
                ps.setString(5, phone);
                ps.setString(6, address);
                ps.setInt(7, id);
                if (ps.executeUpdate() > 0) {
                    JOptionPane.showMessageDialog(null, " Data updated successfully");
                }

            } catch (SQLException ex) {
                Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

        ////delete opeartion 
        if (operation == 'd') {
            /*
            When delete a student, the scores of him/her must deleted!
            this done by adding constraint and foregen key to score database:
            
            
            */
            //return 0 if you press ok 
          int yesOrNo = JOptionPane.showConfirmDialog(null, "the scores will also deleted","Delete Student", JOptionPane.OK_CANCEL_OPTION);
            
            if (yesOrNo==0){
             try {
                ps = con.prepareStatement("DELETE FROM `student` WHERE `id` = ?");
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

    public void fiiStudentTabel(JTable table, String valueToSearch) {
        Connection con = MyConnection.getConnection();
        PreparedStatement ps;
        try {
            ps = con.prepareStatement("SELECT * FROM `student` WHERE CONCAT(`id`,`first_name`, `last_name`, `sex`, `birthdate`, `phone`, `address`)LIKE ?");
            ps.setString(1, "%" + valueToSearch + "%");
            ResultSet rs = ps.executeQuery();
            DefaultTableModel model = (DefaultTableModel) table.getModel();
            Object[] row;
            while (rs.next()) {
                row = new Object[7];
                row[0] = rs.getString(1);
                row[1] = rs.getString(2);
                row[2] = rs.getString(3);
                row[3] = rs.getString(4);
                row[4] = rs.getString(5);
                row[5] = rs.getString(6);
                row[6] = rs.getString(7);
                model.addRow(row);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
