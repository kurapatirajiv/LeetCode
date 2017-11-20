import java.util.*;

public class LongCommonPrefix {
	
    public static void main(String args[]){
        String arr[] = {"gek","ge", "geks",
                    "gezer"};

        // System.out.println(arr[1].indexOf(arr[0]));            
    	String result = longestCommonPrefix(arr);
    	System.out.println(result);

    }


    public static String longestCommonPrefix(String[] strs) {
    if(strs == null || strs.length == 0)    return "";
    String pre = strs[0];
    System.out.println(pre);
    int i = 1;
    while(i < strs.length){
        while(strs[i].indexOf(pre) != 0)
            {
            pre = pre.substring(0,pre.length()-1);
            System.out.println("Prefix is: "+pre+"::"+strs[i]);
             }
        System.out.println("Looping thru External loop");
        i++;

        }
    return pre;
    }

}