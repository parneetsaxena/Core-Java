/*JDBC or Java Database Connectivity is an API used to connect Java with a database.
 There are 6 main steps to connect your Java application with a database.
 1. Import the required package (java.sql.*)
 2. Load the driver and establish the connection
 3. Create a statement
 4. Execute the statement
 5. Create a resultSet to process the result
 6. Close the connections
 */

package advanced;
import java.io.FileInputStream;
import java.sql.*;
import java.util.Properties;
public class JDBC {
    public static void main(String[] args) throws Exception {

        Properties props = new Properties();
        FileInputStream fis = new FileInputStream("db.properties");
        props.load(fis);

        String url = props.getProperty("db.url");
        String username = props.getProperty("db.username");
        String password = props.getProperty("db.password");

        String query = "SELECT * FROM customer";

        Class.forName("org.postgresql.Driver");

        Connection con = DriverManager.getConnection(url,username,password);

        Statement st = con.createStatement();

        ResultSet rs = st.executeQuery(query);

        rs.next();

        String data = rs.getString("first_name");

        System.out.println(data);

        con.close();
        st.close();
        rs.close();
        fis.close();
    }
}
