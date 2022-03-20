package week1.day2;

public class NewCalculator {
	
	public int getAdd(int num1, int num2, int num3)
	{
		return num1 + num2 +num3;
	}

	public int getSub(int num1, int num2)
	{
		return num1 - num2;
	}
	

	public double getMul(double num1, double  num2)
	{
		return num1 * num2;
	}
	
	public double getDiv(double num1, double num2)
	{
		return num1 / num2;
	}
	
	
	public static void main(String[] args) {
		
		NewCalculator myCal = new NewCalculator();
		
		System.out.println(myCal.getAdd(1,2,3));
		System.out.println(myCal.getSub(10,5));
		System.out.println(myCal.getMul(2,3));
		System.out.println(myCal.getDiv(8,2));

	}

}
