import java.util.Scanner;

public class IT22309556Lab3Q2 {
	
	public static void main(String[] args){
		
	Scanner input = new Scanner(System.in);

	System.out.println("Enter the monthly salary : ");
	double salary = input.nextDouble();
	
	System.out.println("Enter the ot hours : ");
	double otHours = input.nextDouble();
	
	System.out.println("Enter the ot rate : ");
	double otRate = input.nextDouble();
	
	double otAmount = otHours * otRate;
	double totalAmount = salary + otAmount;
	
	System.out.println("Total salary is = " + totalAmount );
	
	}
	
}