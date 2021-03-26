package utilities.db;

/**
 * This class is used to store commonly used database functions such as 
 * connecting to the database.
 */
import controllers.Application;
import java.sql.*;
import java.sql.Connection;

public final class DatabaseUtilities {
   
    /**
     * Registers the driver code for the database.The driver communicates
     * between the Java JDBC and the database. Creates the database connection
     * object using the url string. This string contains the IP address of the
     * database and also the database name. In this case, the database name is
     * "uml".
     *
     * @return connection object
     */
    public static Connection openDatabaseConnection() {

        // Register the MySQL JDBC Driver
        try {
        	Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Application.getAPPLICATION_LOGGER().finest("Database driver loaded: " + "uml/comweb");
            // This URL specifies we are connecting to a local database named uml.
            String url = "jdbc:sqlserver://comweb.uml.edu:51433";
            // Make a connection with the database. User is root, no password
            Connection connection = DriverManager.getConnection(url, "jthom00168", "jt2255");
            Application.getAPPLICATION_LOGGER().finest("Getting database connection: " + "uml/comweb");
            return connection;
        } catch (ClassNotFoundException | SQLException e) {

            Application.getAPPLICATION_LOGGER().finest("Problem getting database connection to uml: " + e.getMessage());
            return null;
        }
    }   
  
}
