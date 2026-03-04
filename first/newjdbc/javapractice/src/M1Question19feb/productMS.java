package M1Question19feb;

import java.util.*;

public class productMS {
	   private Map<String, List<Double>> map = new HashMap<>();
	   
	   public void addProduct(String product, Double price) {
		   
		   if(!map.containsKey(product)) {
			   map.put(product, new ArrayList());
		   }
		   map.get(product).add(price);
		   System.out.println("Product added"+product+" "+price);
	   }
	   
      public void removeProduct(String product) {
    	  map.remove(product);
		   
	   }
	   public String getPattern(String product) {
		  List<Double> prices =  map.get(product);
		  if (prices == null || prices.size() < 2)
	            return "NO_PATTERN";
		  
		  boolean inc = true;
		  boolean dec = true;
		  boolean eq =true;
		  

	        for (int i = 1; i < prices.size(); i++) {
			  if(prices.get(i)<=prices.get(i-1)) {
				  inc = false;
			  }
			  if(prices.get(i)>=prices.get(i-1)) {
				  dec = false;
			  }
			  if(prices.get(i)!=prices.get(i-1)) {
				  eq = false;
			  }
	        }
			  if(inc) return "Increasing";
			  if(dec) return "Decreasing";
			  if(eq) return "Equal";
			  if(isPeak(prices)) {
				  return "Peak";
			  
		      }
			  return "NO_PATTERN";

	   }
	   boolean isPeak(List<Double> prices) {
		   int i =1;
		   while(i<prices.size()&&prices.get(i-1)<prices.get(i)) i++;
		   if (i == 1 || i == prices.size())
	            return false;
		   while(i<prices.size()&&prices.get(i-1)>prices.get(i)) i++;
		   return i==prices.size();
	   }
	   
	   
	   public static void main(String[] args) {
		   productMS p = new productMS();
		   Scanner sc =  new Scanner(System.in);
		   
		   int n = sc.nextInt();
		   sc.nextLine();
		   for(int i =0;i<n;i++) {
			   String s = sc.nextLine().trim();
			   
			   String[] parts = s.split(" ");
			   if(parts[0].equals("ADD")) {
				   p.addProduct(parts[1], Double.parseDouble(parts[2]));
			   }else if(parts[0].equals("RM")) {
				   p.removeProduct(parts[1]);
			   }else if(parts[0].equals("get")){
				   p.getPattern(parts[1]);
			   }
		   }
		   
	   }

}
