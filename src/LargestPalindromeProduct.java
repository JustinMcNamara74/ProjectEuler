/* A palindromic number reads the same both ways. The largest 
 * palindrome made from the product of two 2-digit numbers is 
 * 9009 = 91 × 99.

 * Find the largest palindrome made from the product of two 
 * 3-digit numbers.
*/
public class LargestPalindromeProduct {
    
    
    public static void main(String[] args){
        // checking 3 digit numbers... range is 100*100 999*999 
        String poop = "poop";
        int start = 100;
        int end = 999;
        int max = 0;

        for(int i = start; i <= end; i++){
            for(int j = start; j <= end; j++){
                String str = Integer.toString(i*j);   
                
                if(isPalindrome(str) == true){
                    int temp = Integer.parseInt(str);
                    if(temp > max){
                         max = temp;
                    }     
                }    
            }    
        } 
       System.out.println("Max is " + max);
        
    }
 
    //check if the str is the same as the reverse of itself
    //  poop is the smame as poop
    public static boolean isPalindrome(String str){
        return str.equals(new StringBuilder(str).reverse().toString());
    }
}
