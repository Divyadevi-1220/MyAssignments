package Week3Assignment1;

public class Desktop extends Computer {
	public void desktopSize() {
		System.out.println("The size of the desktop -- Desktop Class");
		
	}
	public static void main(String[] args) {
		Desktop d1 = new Desktop();
		d1.ComputerModel();
		d1.desktopSize();

}
}
