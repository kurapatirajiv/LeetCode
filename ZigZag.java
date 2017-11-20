public class ZigZag{


    public static void main (String args[]){

        String result = ComputeZigZag("AB", 1);
        System.out.println(result);

    }


    public static String ComputeZigZag(String str, int numofRows){

        if(numofRows<=1) return str;
        
        // Create a Strbuilder based on the number of Rows
        StringBuilder[] sb = new StringBuilder[numofRows];

        for (int i = 0;i<numofRows ; i++){
             sb[i] = new StringBuilder("");
        }

        int index = 0;
        int inc = 1;
        for (int i = 0;i < str.length(); i++){
            sb[index].append(str.charAt(i));

            // The following will form the zig zagged index. So that the char can be appended
            if(index==0){inc = 1;}
            if(index==numofRows-1) {inc = -1;}

            index = index + inc;    

        }

        // forms the string by reading all the indexes

        String result = "";
        for (int i = 0;i<numofRows;i++){
            result+= sb[i];
        }

        return result;        
    }


}