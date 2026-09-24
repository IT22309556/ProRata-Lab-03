import java.util.Scanner;
  public class IT22309556Lab3Q1A{
	
    public static void main(String[] args){
	
	 //defining the scanner object
	
	    Scanner input = new Scanner(System.in);
	
	    System.out.println("Enter the price of 1kg: ");
	    double price = input.nextDouble();
	
	    System.out.println("Enter the number of kilograms you need to buy: ");
	    double howManyKgs = input.nextDouble();
	
	    double amount = price * howManyKgs ;
	
	    System.out.println("The total amount is : "+amount);
	
	}//end of main method
  }