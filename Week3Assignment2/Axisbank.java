package Week3Assignment2;

public class Axisbank extends Bankinfo {
	
	public static void main(String[] args) {
		Axisbank ax = new Axisbank();
		ax.fixed();
		ax.savings();
		ax.deposit();
	}
	
	public void deposit()
	{
		System.out.println("Axisbank class -- Deposit method");
	}

	
}
