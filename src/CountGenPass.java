import java.io.BufferedReader;

public class CountGenPass {

    public static void main (String args[]) throws Exception {

          System.out.println ("Counting Words....");       
          FileReader fr = new FileReader ("C:/Users/Sharif Uddin/workspace/pass_sec/final_file57.txt");        
          BufferedReader br = new BufferedReader (fr);     
          String line = br.readLine ();
          long count = 0;
          while (line != null) {
             String []parts = line.split(" ");
             System.out.println(parts);
             for( String w : parts)
             {
                // System.out.println(parts);
               count++;        
             }
             line = br.readLine();
          }         
          System.out.println(count);
       }
}