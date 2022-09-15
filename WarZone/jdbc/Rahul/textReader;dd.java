import java.io.*;
class Sample
{
    public static void main(String args[]) throws Exception
    {
        
       // InputStream fin =new FileInputStream("TableSchema.txt");

        FileReader fr = new FileReader("TableSchema.txt"); ///throws exc
        BufferedReader in = new BufferedReader(fr);
        String str="",t="";
        // while((str=in.readLine())!=null) /// print asit is
        // { 
        //     System.out.println(str);
        // }
        

        // while((t=in.readLine())!=null) /// print asit is
        //  str+=t;
        // //System.out.println(str);
        // String ans[] = str.split(";");
        // for(String tem : ans)
        //     System.out.println(tem+";");

        


        in.close();
        fr.close();
        
    }
}