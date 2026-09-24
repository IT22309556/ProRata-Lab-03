import java.util.Scanner;


public class IT22309556Lab3Q3{
	
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the rupee amount : ");
		int amount = input.nextInt();
		
		int notes5000 =0 ,notes1000 =0 ,notes500 =0 ,notes200 =0 ,notes100 =0;
		int notes50 =0 ,notes20 =0 ,coins10 =0 ,coins5 =0 ,coins2 =0 ,coins1 =0;
		
		int reminder = amount;
		
		if(reminder > 5000){
			
			notes5000 = reminder/5000;
			reminder = reminder%5000;
			
		}
		if(reminder > 1000){
			
			notes1000 = reminder/1000;
			reminder = reminder%1000;
			
		}
		if(reminder > 500){
			
			notes500 = reminder/500;
			reminder = reminder%500;
			
		}
		if(reminder > 200){
			
			notes200 = reminder/200;
			reminder = reminder%200;
			
		}
	    if(reminder > 100){
			
			notes100 = reminder/100;
			reminder = reminder%100;
			
		}
		if(reminder > 50){
			
			notes50 = reminder/50;
			reminder = reminder%50;
			
		}
		if(reminder > 20){
			
			notes20 = reminder/20;
			reminder = reminder%20;
			
		}
		if(reminder > 10){
			
			coins10 = reminder/10;
			reminder = reminder%10;
			
		}
		if(reminder > 5){
			
			coins5 = reminder/5;
			reminder = reminder%5;
			
		}
		if(reminder > 2){
			
			coins2 = reminder/2;
			reminder = reminder%2;
			
		}
		if(reminder > 1){
			
			coins1 = reminder/1;
			reminder = reminder%1;
			
		}
		System.out.println("5000 notes : " + notes5000);
		System.out.println("1000 notes : " + notes1000);
		System.out.println("500 notes : " + notes500);
		System.out.println("200 notes : " + notes200);
		System.out.println("100 notes : " + notes100);
		System.out.println("50 notes : " + notes50);
		System.out.println("20 notes : " + notes20);
		System.out.println("10 coins : " + coins10);
		System.out.println("5 coins : " + coins5);
		System.out.println("2 coins : " + coins2);
		System.out.println("1 coins : " + coins1);
		
    }
		
		
}