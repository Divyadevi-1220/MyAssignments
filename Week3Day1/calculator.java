package Week3Day1;

public class calculator {
	
	public void add(int a, int b) {
		System.out.println(a+b);
	}
	public void add(int a, int b, int c) {
		System.out.println(a+b+c);
	}
	public void mul(double a1, double b1) {
		System.out.println(a1*b1);
	}
	
	public void mul(float a1, float b1) {
		System.out.println(a1*b1);
	}
	
	public static void main(String[] args) {
		calculator c1 = new calculator();
		c1.add(3, 3);
		c1.add(3, 3, 3);
		c1.mul(3.123, 3.123);
		c1.mul(2.3, 2.4);
	}
}
