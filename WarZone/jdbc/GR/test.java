import java.sql.*;
class Sample{
    public static void main(String args[]) throws Exception
    {
       Class.forName("com.mysql.cj.jdbc.Driver");
       Connection con = DriverManager.getConnection("jdbc:mysql://remotemysql.com:3306/cT3gafPYZK","cT3gafPYZK","u1yFGoXLMa");
       if(con!=null)
       System.out.println("Connected!");
    }
}