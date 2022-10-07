import java.sql.*;
import java.util.*;
class Sample{
    public static void main(String args[]) throws Exception 
    {
    
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mysql://remotemysql.com:3306/cT3gafPYZK","cT3gafPYZK","u1yFGoXLMa");
        if(conn != null)
        {System.out.println("connected");}
        
        Scanner sc = new Scanner(System.in);//
        String query =null;
        Statement st = conn.createStatement();
        while(true)
        {
        System.out.print("SQL> ");
        query = sc.nextLine();
        if(query.equalsIgnoreCase("Exit"))
         break;
        try
        {
        if(st.execute(query)) // select
        {
            ResultSet rs = st.getResultSet();
            ResultSetMetaData md = rs.getMetaData();
            int cc = md.getColumnCount();
            for(int i=1;i<=cc;i++)
            {
                System.out.printf("%10s",md.getColumnName(i));
            }
            System.out.println();
            while(rs.next())
            {
                for(int i=1;i<=cc;i++)
                {
                 System.out.printf("%10Es",rs.getString(i));   
                }
                System.out.println();
            }
        } 
        else ///update
        {
            System.out.println(st.getUpdateCount()+" rows Updated");
        }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }

        } // while
    
    
    } // main
    } //sample