import java.sql.*;
class Sample{
    public static void main(String args[]) throws Exception
    {
    // System.out.println("just looop");
    Class.forName("com.mysql.cj.jdbc.Driver");
    Connection conn = DriverManager.getConnection("jdbc:mysql://remotemysql.com:3306/cT3gafPYZK","cT3gafPYZK","u1yFGoXLMa");
    Statement st = conn.createStatement();
    if(conn != null)
     System.out.println("success");
    // Statement st =conn.createStatement(); ///number xxx ,=> integer , numeric ,   /// varchar2 =>> varchar
    // String sql ="create table Employee (eid Integer (9) Primary key ,ename varchar(10) , salary numeric (5) )";
    // String sql = "drop table Employee";
    // ResultSet rs =
    String sql = "select * from Employee";
    // String sql = "insert into Employee values(67,'cc',15000)";
    ResultSet rs = st.executeQuery(sql);
    DBTablePrinter.printResultSet(rs);
    //  st.execute(sql);
    
    
    }
}