package org.example;
import java.sql.Connection;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws InterruptedException
    {
        JDBCConnectionPool pool = new JDBCConnectionPool(
                "com.mysql.jdbc.Driver", "jdbc:mysql://localhost:3306/world_x?autoReconnect=true&useSSL=false",
                "root", "my-password-here");

        // Get a connection:
        Connection con = pool.giveMeObject(); // from here we are getting object from pool
        Thread.sleep(3000);
        // Return the connection:
        pool.releaseObject(con); // releasing the object

        Connection con1 = pool.giveMeObject();


    }

}
