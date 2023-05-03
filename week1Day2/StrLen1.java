package week1Day2;

public class StrLen1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Fly me to the moon";
		int len =0;
		for (int i=s.length()-1; i >=0; i--) {
			if (s.charAt(i)!= ' ') {
				len++;
				
			}
			else if (len > 0) {
				break;
			}
		}
System.out.println("Moon length is" + "  " +len);
	}

}
