import java.sql.*;
class Sample{
    public static void main(String args[])
    {  
        try{                         
  Class.forName("com.mysql.cj.jdbc.Driver");

 //x   Connection con=DriverManager.getConnection( "jdbc:mysql://sql6.freemysqlhosting.net:3306/sql6516585","sql6516585","3Lf6i6qrwF");
   //gr Connection con=DriverManager.getConnection( "jdbc:mysql://remotemysql.com:3306/UWwSx55o0Q","UWwSx55o0Q","4OTdHhHKv9");
   Connection con=DriverManager.getConnection( "jdbc:mysql://remotemysql.com:3306/cT3gafPYZK","cT3gafPYZK","u1yFGoXLMa");
                        
            Statement stmt=con.createStatement();  

// ResultSet rs=stmt.executeQuery("SELECT * FROM dept");
//             DBTablePrinter.printResultSet(rs);
           
//  sql = "CREATE TABLE dept (  deptno decimal(2,0) default NULL,  dname varchar(14) default NULL,  loc varchar(13) default NULL);";
            //  stmt.execute(sql); 


            
            System.out.println("success");
//             con.close();  
        }
        catch(Exception e){ System.out.println(e);}
    }
}
