public class palindrome {
 
    public static boolean is_palindrome(String str, int n)
    {
        int x = 0 ;
        
        while(x < n){
            
            if(str.charAt(x) != str.charAt(n-x-1))
                return false;
                
            x++;
        }
        
                return true;
    }
 
    public static String main(String[] args,String str)
    {
        String largest_palindrome = "";
        
         for (int i = 0; i < str.length(); i++) {
         
       		 for (int j = i + 1; j <= str.length(); j++) {
       		 
          		  String temp = str.substring(i,j);
          		  
            		if(is_palindrome( temp , temp.length() ) ){
            		
                		if( largest_palindrome.length() < temp.length()){

                   		    	 largest_palindrome = temp;
                   		 }
           			}
        	}
   		 }
   		 
        System.out.println("The largest palindrome is:"+largest_palindrome);
        return largest_palindrome;
    }
}
