import java.util.Scanner;

public class Calc {
	
	public static float add(float num1, float num2) {
		return num1 + num2;
	}
	
	public static float subtract(float num1, float num2) {
		return num1 - num2;
	}

	public static float multiply(float num1, float num2) {
		return num1 * num2;
	}

	public static float divide(float num1, float num2) {
		return num1 / num2;
	}

	public static float modulo(float num1, float num2) {
		return num1 % num2;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("type an operation");
		Scanner operation = new Scanner(System.in);
		String operation_ = operation.next();
		System.out.println("Enter the first number");
		Scanner num1 = new Scanner(System.in);
		float num1_ = num1.nextFloat();
		System.out.println("Enter the second number");
		Scanner num2 = new Scanner(System.in);
		float num2_ = num2.nextFloat();
		if (operation_.equals("add")) {
			float sum = add(num1_, num2_);
			System.out.println("sum is " + sum);
		}
		else if (operation_.equals("subtract")) {
			float diff = subtract(num1_,num2_);
			System.out.println(diff);
		}
		else if (operation_.equals("multiply")) {
			float product = multiply(num1_,num2_);
			System.out.println(product);
		}
		else if (operation_.equals("divide")) {
			float quotient = divide(num1_,num2_);
			System.out.println(quotient);
		}
		else if (operation_.equals("modulo")) {
			float remainder = modulo(num1_,num2_);
			System.out.println(remainder);
		}
	}

}