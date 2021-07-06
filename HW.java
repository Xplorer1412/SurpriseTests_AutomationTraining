import java.util.*;
  
public class HW {
  
    static String getAlphaNumericString(int n)
    {
        int lowerLimit = 97;
        int upperLimit = 122;
  
        Random random = new Random();
        StringBuffer r = new StringBuffer(n);
  
        for (int i = 0; i < n; i++) {
            int nextRandomChar = lowerLimit + (int)(random.nextFloat() * (upperLimit - lowerLimit + 1));
            r.append((char)nextRandomChar);
        }
        return r.toString();
    }
  
    public static void main(String[] args){
        int n = 5;
        for (int j=0; j< 10 ; j++ ){
            System.out.println(getAlphaNumericString(n));
        }
        
    }
}