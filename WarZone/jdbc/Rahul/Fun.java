import java.util.*;
import java.io.*;
class Fun
{
        public static void clear()
        {
             try{   if (System.getProperty("os.name").contains("Windows"))
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        else
            Runtime.getRuntime().exec("clear");
        }
        catch(Exception e){System.out.println(e);

        }
        }
       public static void clearConsole()
       {
           System.out.print("\033[H\033[2J"); //033 esc char [H top left  [2j clear to end
           System.out.flush();
        }


public static void executeCons(String s)
{
        try{   if (System.getProperty("os.name").contains("Windows"))
        new ProcessBuilder("cmd", "/c", s).inheritIO().start().waitFor();
    else
        Runtime.getRuntime().exec("clear");
    }
    catch(Exception e){System.out.println(e);

    }
}
        
//         public static void ExecuteConsol(String command)
//         {
            
// Runtime run = Runtime.getRuntime();
// try {
// Process pr = run.exec(command);
// pr.waitFor();
// BufferedReader buf = new BufferedReader(new InputStreamReader(pr.getInputStream()));
// String line = "";
// while ((line=buf.readLine())!=null) {
// System.out.println(line);
// }
// }
// catch (IOException e) {
//         // TODO Auto-generated catch block
//         e.printStackTrace();
//     }
//     catch(Exception e)
//     {
//             System.out.println(e);
//     }
//         }

}