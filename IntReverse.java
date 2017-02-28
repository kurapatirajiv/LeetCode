public class IntReverse {
    public int reverse(int x) {
        
       int strlength = String.valueOf(x).length();        
       String num = x >= 0 ? (new StringBuilder(Integer.toString(x))).reverse().toString() : "-"+ (new StringBuilder(Integer.toString(x))).reverse().substring(0,strlength-1);;     
        
        if(Long.parseLong(num)>Integer.MAX_VALUE || Long.parseLong(num) < Integer.MIN_VALUE){
            return 0;
        }
        return Integer.parseInt(num);
    }
}