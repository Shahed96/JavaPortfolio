package schoolsystem;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MyFunction {

    public static int countData(String tabelName) {
        int total = 0;
        Connection con = MyConnection.getConnection();
        Statement st;
        try {
            st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT COUNT(*) AS 'totalCountInDB' FROM " + tabelName);
            while (rs.next()) {
                total = rs.getInt("totalCountInDB");
            }
        } catch (SQLException ex) {
            Logger.getLogger(MyFunction.class.getName()).log(Level.SEVERE, null, ex);
        }

        return total;
    }
}
