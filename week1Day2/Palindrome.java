package week1Day2;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String new1= "MADAM";
		String reverse = "";
		 int length = new1.length();   
	      for ( int i = new1.length() - 1; i >= 0; i-- ) 
	    	    reverse = reverse + new1.charAt(i);  
	      //if (new1.equalsIgnoreCase(reverse)) {
	    //  if (new1.toLowerCase().equalsIgnoreCase(reverse)) { 
	      if(new1.toLowerCase().equals(reverse.toLowerCase())) {
	    	  System.out.println(new1 + " " + " is palindrome"  );
	      }
	       else  {
	    	   System.out.println(new1 + " " + " is not palindrome" );   
	       }

	}

}
