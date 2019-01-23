import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcConnection {
    // JDBC driver name and database URL
    static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver"; //MySQL
    static final String DB_URL = "jdbc:mysql://localhost/mybank";
    //  Database credentials
    static final String USER = "root";
    static final String PASS = "rootroot";

    public static void main(String[] args) {
        Connection conn = null;
        try{
            Class.forName(JDBC_DRIVER);
            System.out.println("Connecting to database...");
            conn = DriverManager.getConnection(DB_URL,USER,PASS);

            if(conn!= null){
                System.out.println("connected to the db");
            }

        }catch(SQLException se){
            se.printStackTrace();
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
