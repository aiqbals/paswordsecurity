import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class PassGen {


	public static long a=0;
	public static int z=0;
	
	
	//method: for replacing characters with specific character
		public static String rand_replacement(String s){
		    int m=s.length();
		    int n=0;
		    while(n<m){
			    Random random = new Random();
			    int index = random.nextInt(s.length());
			    //System.out.println(index);
			   // return s.charAt(index);
			    if (s.charAt(index)=='a')
			    {
			    	char[] myNameChars = s.toCharArray();
			    	myNameChars[index] = '@';
			    	s = String.valueOf(myNameChars);
			    }
			    else if(s.charAt(index)=='t'||s.charAt(index)=='T')
			    {
			    	char[] myNameChars = s.toCharArray();
			    	myNameChars[index] = '7';
			    	s = String.valueOf(myNameChars);
			    }
			    else if(s.charAt(index)=='e')
			    {
			    	char[] myNameChars = s.toCharArray();
			    	myNameChars[index] = '3';
			    	s = String.valueOf(myNameChars);
			    }
			    else if(s.charAt(index)=='g'||s.charAt(index)=='B')
			    {
			    	char[] myNameChars = s.toCharArray();
			    	myNameChars[index] = '8';
			    	s = String.valueOf(myNameChars);
			    }
			    else if(s.charAt(index)=='i'||s.charAt(index)=='I')
			    {
			    	char[] myNameChars = s.toCharArray();
			    	myNameChars[index] = '1';
			    	s = String.valueOf(myNameChars);
			    }
			    
			    else if(s.charAt(index)=='x'||s.charAt(index)=='X')
			    {
			    	char[] myNameChars = s.toCharArray();
			    	myNameChars[index] = '*';
			    	s = String.valueOf(myNameChars);
			    }
			    else if(s.charAt(index)=='O'||s.charAt(index)=='o')
			    {
			    	char[] myNameChars = s.toCharArray();
			    	myNameChars[index] = '0';
			    	s = String.valueOf(myNameChars);
			    }
			    
			    else if(s.charAt(index)=='b')
			    {
			    	char[] myNameChars = s.toCharArray();
			    	myNameChars[index] = '6';
			    	s = String.valueOf(myNameChars);
			    }
			   
			    else if(s.charAt(index)=='y')
			    {
			    	char[] myNameChars = s.toCharArray();
			    	myNameChars[index] = '4';
			    	s = String.valueOf(myNameChars);
			    }
			    else if(s.charAt(index)=='i')
			    {
			    	char[] myNameChars = s.toCharArray();
			    	myNameChars[index] = '!';
			    	s = String.valueOf(myNameChars);
			    }
			    else if(s.charAt(index)=='i')
			    {
			    	char[] myNameChars = s.toCharArray();
			    	myNameChars[index] = '1';
			    	s = String.valueOf(myNameChars);
			    }
			    else if(s.charAt(index)=='S'||s.charAt(index)=='s')
			    {
			    	char[] myNameChars = s.toCharArray();
			    	myNameChars[index] = '$';
			    	s = String.valueOf(myNameChars);
			    }
			    else if(s.charAt(index)=='s')
			    {
			    	char[] myNameChars = s.toCharArray();
			    	myNameChars[index] = '5';
			    	s = String.valueOf(myNameChars);
			    }
			    else if(s.charAt(index)=='V'||s.charAt(index)=='v')
			    {
			    	char[] myNameChars = s.toCharArray();
			    	myNameChars[index] = '^';
			    	s = String.valueOf(myNameChars);
			    }
			    
			    else if(s.charAt(index)=='R'||s.charAt(index)=='W'||s.charAt(index)=='P')
			    {
			    	char[] myNameChars = s.toCharArray();
			    	myNameChars[index] = '&';
			    	s = String.valueOf(myNameChars);
			    }
			   ++n;
			   }
			   
			    return s;

			}

	
	
	
	
	
	 private static String readUsingScanner(String fileName) throws IOException {
	        Scanner scanner = new Scanner(Paths.get(fileName), StandardCharsets.UTF_8.name());
	        //we can use Delimiter regex as "\\A", "\\Z" or "\\z"
	        String data = scanner.useDelimiter("\\A").next();
	        scanner.close();
	        return data;
	    }
	
	
	 
	 


	public static void main(String[] args) throws IOException{
		 String str = "abcdef"; // for testing purpose

		    String[] uniStr;
		    System.out.println("Started....wait & see all generated files......");
			String file_name = "C:/Users/Sharif Uddin/workspace/pass_sec/try1.txt";

			String new_file = readUsingScanner(file_name); // method calling to read file
	        
	        /*PrintWriter printWriter = new PrintWriter ("C:/Users/Sharif Uddin/workspace/pass_sec/initial_string.txt");
	        printWriter.println (new_file);
	        printWriter.close ();*/ 

			 //String input = "verylo"; // for testing purpose
			 String newSt1,newSt2,newSt3;
			 //String s1,s2;
	         newSt1=rand_replacement(new_file);
	         PrintWriter printWriter1 = new PrintWriter ("C:/Users/Sharif Uddin/workspace/pass_sec/after_replacement1.txt");
	         printWriter1.println (newSt1);
	         printWriter1.close (); 
	         newSt2=rand_replacement(new_file);
	         PrintWriter printWriter2 = new PrintWriter ("C:/Users/Sharif Uddin/workspace/pass_sec/after_replacement2.txt");
	         printWriter2.println (newSt2);
	         printWriter2.close (); 
	         newSt3=rand_replacement(new_file);
	         PrintWriter printWriter3 = new PrintWriter ("C:/Users/Sharif Uddin/workspace/pass_sec/after_replacement3.txt");
	         printWriter3.println (newSt3);
	         printWriter3.close (); 
	         //System.out.println(newSt1+" "+newSt2+" "+newSt3);
	         int j,m;

	         for(int i=1;i<=3;i++)
	         {
	        	 switch(i)
	        	 {
	        	 case 1:
	        		 
	        		 
	        		String st1 = newSt1;
	        		 //String[] words1 = st1.split(" ");
	        		String[] words1 = st1.split("\\s+");
	        		for (j = 0; j < words1.length; j++) {
	        		
	        		     words1[j] = words1[j].replaceAll(" ", "");
	        		     //System.out.print(words1[j]+" ");
	        		 }
	        		//System.out.println();
	        		
	        		m=j;
	        		 
	        		 for(j=0;j<m;j++){
	        			 int l=words1[j].length();
	        			 if(l>=6)
	        			 
	        			 {
	        				 //System.out.println(words1[j]);

	        			     uniStr= uniform(words1[j]);
	        			     permute(uniStr, uniStr.length);
	        			     uniStr=uniform(words1[j]);
	        			     permute(uniStr, uniStr.length);
	        	             //System.out.println("------------------");
	        		 }
	        		 }
	        	
	        		 break;
	        	     
	        	        
	        	     
	        	 case 2:
	        		 
		        		String st2 = newSt2;
		        		 String[] words2 = st2.split("\\s+");
		        		for (j = 0; j < words2.length; j++) {
		        		
		        		     words2[j] = words2[j].replaceAll(" ", "");
		        		    // System.out.print(words2[j]+" ");
		        		 }
		        		//System.out.println();
		        		
		        		m=j;
		        		 
		        		 for(j=0;j<m;j++){
		        			 int l=words2[j].length();
		        			 if(l>=6)
		        			 
		        			 {
		        				 //System.out.println(words2[j]);

		        			      uniStr= uniform(words2[j]);
		        			      permute(uniStr, uniStr.length);
		        			      uniStr=uniform(words2[j]);
		        			      permute(uniStr, uniStr.length);

		        	    // System.out.println("------------------");
		        		 }
		        		 }
		        		
		        	     break;
	        	     
	        	     
	        	 case 3:

		        		String st3 = newSt3;
		        		 String[] words3 = st3.split("\\s+");
		        		for (j = 0; j < words3.length; j++) {
		        		
		        		     words3[j] = words3[j].replaceAll(" ", "");
		        		     //System.out.print(words3[j]+" ");
		        		 }
		        		//System.out.println();
		        		
		        		m=j;
		        		 
		        		 for(j=0;j<m;j++){
		        			 int l=words3[j].length();
		        			 if(l>=6)
		        			 
		        			 {
		        				 //System.out.println(words3[j]);
		        				 
		        			      uniStr= uniform(words3[j]);
		        			      permute(uniStr, uniStr.length);
		        			      uniStr=uniform(words3[j]);
		        			      permute(uniStr, uniStr.length);
		        	     //System.out.println("------------------");
		        		 }
		        		 }

		        	     break;
	        	 }
	        	 //System.out.println("finished !!!!!!!!!");
	        	 
	        	 
	         }
	         System.out.println("Total generated strings/pass="+" "+a);
	         System.out.println("successfully finished !!!!!!!!!");

	}
	
	
	
	
	
	public static String[] uniform(String words3){
		//String[] 
		String s1,s2;
		String[] erg;
		z++;
		if(z<2){
		s1=words3.substring(0, 3);
		//System.out.println(s1);
        s2 = words3.substring(3);
        //System.out.println(s2);
		 String[] array31={s1};
	     String[] array33=s2.split("");
	     //String[] erg1=result.split("");
	     erg = new String[array31.length + array33.length];
	     System.arraycopy(array31, 0, erg, 0, array31.length);
	     System.arraycopy(array33, 0, erg, array31.length, array33.length);

		}
		else{
			s1=words3.substring(0, words3.length() - 3 );
			s2 = words3.substring(words3.length() - 3);
			//System.out.println(s1);
	        //System.out.println(s2);
			 String[] array31=s1.split("");
		     String[] array33={s2};
		     //String[] erg1=result.split("");
		     erg = new String[array31.length + array33.length];
		     System.arraycopy(array31, 0, erg, 0, array31.length);
		     System.arraycopy(array33, 0, erg, array31.length, array33.length);
		     z=0;  
		}
		return erg;
	}
	
	
	
	
	
	private static void swap(String[] ourarray, int right, int left) {
        String temp = ourarray[right];
        ourarray[right] = ourarray[left];
        ourarray[left] = temp;
    }

    public static void permute(String[] ourArray, int currentPosition) {
        if (currentPosition == 1) {
        	a++;
            //System.out.println(a+" "+" "+Arrays.toString(ourArray));
            String str1 = Arrays.toString(ourArray);
            str1=str1.substring(1, str1.length()-1).replaceAll(", ","");
            //System.out.println(str1);
            //System.out.println(a+" "+" "+str1);
            
            
            
            
            File file = new File("C:/Users/Sharif Uddin/workspace/pass_sec/final_file57.txt");
        	try{
        	    //System.out.println(file.createNewFile());
        		file.createNewFile();
        	    PrintWriter pw = new PrintWriter(new FileOutputStream(file,true));
        	    //pw.print(a+"."+str1+" ");
        	    pw.print(str1+" ");
        	    pw.flush();
        	    pw.close();
        	}catch(IOException ex){
        	    ex.printStackTrace();
        	}
  
        } else {
            for (int i = 0; i < currentPosition; i++) {
                // subtract one from the last position (here is where you are
                // selecting the the next last item 
                permute(ourArray, currentPosition - 1);

                // if it's odd position
                if (currentPosition % 2 == 1) {
                    swap(ourArray, 0, currentPosition - 1);
                } else {
                    swap(ourArray, i, currentPosition - 1);
                }
            }
        }
    }


}
