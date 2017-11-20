import java.util.*;

public class RomanToInt {
	
    public static void main(String args[]){

    	int result = romanToInt("MMMCCCLXXXVIII");
    	System.out.println(result);

    }
    public static int romanToInt(String s) {
     HashMap<String,Integer> hm = new HashMap<String,Integer>();
     hm.put("M",1000);
     hm.put("D",500);
     hm.put("C",100);
     hm.put("L",50);
     hm.put("X",10);
     hm.put("V",5);
     hm.put("I",1);
     
     String[] splitInput = s.split("");
     int preval = 0;
     int result = 0;
     for(int i=splitInput.length-1; i>=0;i--){
         String key = splitInput[i];
         if(hm.containsKey(key)){
            if(hm.get(key) >= preval){
                result = result + hm.get(key);
                preval = hm.get(key);
            } 
            else{
                result = result - hm.get(key);
            }
         }
         else{
             System.out.println("Symbol not valid"+key);
         }
     }
     return result;
    }
}