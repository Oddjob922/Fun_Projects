import java.util.Scanner;

public class Calc {
	
	public static float add(float num1, float num2) {
		float sum = num1 + num2;
		return sum;
	}
	
	public static float subtract(float num1, float num2) {
		float diff = num1 - num2;
		return diff;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("type an operation");
		Scanner operation = new Scanner (System.in);
		String operation_ = operation.next();
		System.out.println("Enter the first number");
		Scanner num1 = new Scanner(System.in);
		float num1_ = num1.nextFloat();
		System.out.println("Enter the second number");
		Scanner num2 = new Scanner(System.in);
		float num2_ = num2.nextFloat();
		if (operation_ == "add") {
			float sum = add(num1_, num2_);
			
		}
	}

}
