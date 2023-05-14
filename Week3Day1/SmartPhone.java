package Week3Day1;

public class SmartPhone extends AndroidPhone {
	public void takeVideo() {
		System.out.println("Taking video from Smartphone");
	}
	public static void main(String[] args) {
		SmartPhone ph1 = new SmartPhone();
		ph1.takeVideo();
	}
	

}
