package week1Day2;

public class StringLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "luff is still joyboy";
		int len =0;
		for (int i=s.length()-1; i >=0; i--) {
			if (s.charAt(i)!= ' ') {
				len++;
				
			}
			else if (len > 0) {
				break;
			}
		}
System.out.println("Joyboy length is" + "  " +len);
	}

}
