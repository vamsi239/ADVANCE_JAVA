package M1Question19feb;

import java.util.*;

class ExamManager {

    private Map<String, LinkedHashMap<String, Integer>> map = new LinkedHashMap<>();


    public int addRecord(String id, String sub, int marks) {
    	if(!map.containsKey(id)) {
    		map.put(id,new LinkedHashMap());	
    	}
    	map.get(id).put(sub, marks);
    	
    	return 0;

       
    }

    public int removeRecord(String id, String sub) {
    	if(!map.containsKey(id)) return 0;
    	
    	LinkedHashMap<String,Integer> smap = map.get(id);
    	if(!map.containsKey(sub)&&smap.isEmpty()) map.remove(id);
    	
    	smap.remove(sub);
    	
    	return 0;

    
    }

    public String getTopScorer(String sub) {
    	int max =-1;
    	List<String> winner = new ArrayList();
    	for(String id:map.keySet()) {
    		LinkedHashMap<String,Integer> smap = map.get(id);
    		int marks =0;
    		for(String s :smap.keySet()) {
    			if(s.equals(sub)) marks=smap.get(s);
    			if(marks>max) {
    				max = marks;
    				winner.clear();
    				winner.add(id);
    			}else if(marks==max){
    				winner.add(id);
    			}
    			
    		}
    	}
    	String result="";
    	for(String id:winner) {
           result += id+" "+max+"\n";
    	}
    	return result;
  
    }

    public String getResult() {
    	
    	
    	for(String id:map.keySet()) {
    		LinkedHashMap<String,Integer> smap = map.get(id);
    		int sum=0;
    		int count =0;
    		for(Integer marks:smap.values()) {
    			sum+=marks;
    			count++;
    		}
    		double avg =(double)(sum/count);
    		return id+" "+String.format("%.2f", avg)+"\n";
    	}

   return "";
    }

    public int processCommands(Scanner sc, int N) {

        
    }

    public String getOutput() {
        return out.toString().trim();
    }
}

public class examSys {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
       
    }
}