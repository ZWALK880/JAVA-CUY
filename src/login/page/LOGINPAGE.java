package login.page;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class LOGINPAGE {
    public static Connection configDB() throws SQLException {
        try {
            String url = "jdbc:mysql://localhost:3306/akademik"; 
            String user = "root"; 
            String password = ""; 
            DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
            Connection conn = DriverManager.getConnection(url, user, password);
            return conn;
        } catch (SQLException e) {
            System.out.println("Koneksi ke database gagal: " + e.getMessage());
            throw e;
        }
    }
}
