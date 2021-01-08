import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.Map.Entry;

public class MatchedPass {
	 public Map<String, Integer> getWordCount(String fileName){
		 
	        FileInputStream fis = null;
	        DataInputStream dis = null;
	        BufferedReader br = null;
	        Map<String, Integer> wordMap = new HashMap<String, Integer>();
	        try {
	            fis = new FileInputStream(fileName);
	            dis = new DataInputStream(fis);
	            br = new BufferedReader(new InputStreamReader(dis));
	            String line = null;
	            while((line = br.readLine()) != null){
	                StringTokenizer st = new StringTokenizer(line, " ");
	                while(st.hasMoreTokens()){
	                    String tmp = st.nextToken().toLowerCase();
	                    if(wordMap.containsKey(tmp)){
	                        wordMap.put(tmp, wordMap.get(tmp)+1);
	                    } else {
	                        wordMap.put(tmp, 1);
	                    }
	                }
	            }
	        } catch (FileNotFoundException e) {
	            e.printStackTrace();
	        } catch (IOException e) {
	            e.printStackTrace();
	        } finally{
	            try{if(br != null) br.close();}catch(Exception ex){}
	        }
	        return wordMap;
	    }
	     
	    public List<Entry<String, Integer>> sortByValue(Map<String, Integer> wordMap){
	         
	        Set<Entry<String, Integer>> set = wordMap.entrySet();
	        List<Entry<String, Integer>> list = new ArrayList<Entry<String, Integer>>(set);
	        Collections.sort( list, new Comparator<Map.Entry<String, Integer>>()
	        {
	            public int compare( Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2 )
	            {
	                return (o2.getValue()).compareTo( o1.getValue() );
	            }
	        } );
	        return list;
	    }
	     

	public static void main(String a[]) throws FileNotFoundException {
		File file = new File("C:/Users/Sharif Uddin/workspace/pass_sec/matching_words.txt");
		matchedPass mdc = new matchedPass();
        Map<String, Integer> wordMap = mdc.getWordCount("C:/Users/Sharif Uddin/workspace/pass_sec/final_file57.txt");
        List<Entry<String, Integer>> list = mdc.sortByValue(wordMap);
        for(Map.Entry<String, Integer> entry:list){
            //System.out.println(entry.getKey()+" ==== "+entry.getValue());
        	
        	
        	if(entry.getValue()>1)
        	{
            //Save output to a file
        		
        		
        		//File file = new File("C:/Users/Sharif Uddin/workspace/pass_sec/matching_words.txt");
            	try{
            	    //System.out.println(file.createNewFile());
            		file.createNewFile();
            	    PrintWriter pw = new PrintWriter(new FileOutputStream(file,true));
            	    pw.print(entry.getKey()+"- "+entry.getValue()+" times" + "\n");
            	    pw.flush();
            	    pw.close();
            	}catch(IOException ex){
            	    ex.printStackTrace();
            	}

        	}
        	
        }
        
        try{
    	    //System.out.println(file.createNewFile());
        	file.createNewFile();
    	    PrintWriter pw = new PrintWriter(new FileOutputStream(file,true));
    	    pw.print("\n"+"----------------------------------------------");
    	    System.out.println();
    	    pw.flush();
    	    pw.close();
    	}catch(IOException ex){
    	    ex.printStackTrace();
    	}
        
        
        System.out.println("Successfully finished - See generated file !!!!");
    }
}