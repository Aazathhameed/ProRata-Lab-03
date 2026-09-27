import java.util.Scanner;

public class IT22925404Lab3Q2{
	public static void main(String[]args){
		Scanner input =  new Scanner(System.in);
		
		double salary,OThours,OTrate,total;
		
		System.out.print("Enter the monthly salary: ");
		salary = input.nextDouble();
		
		System.out.print("Enter the number of OT hours: ");
		OThours = input.nextDouble();
		
		System.out.print("Enter the OT hourly rate: ");
		OTrate = input.nextDouble();
		
		total = salary + OThours * OTrate;
		
		System.out.println("");
		System.out.println("The total salary including OT is:"+total);
	
	}
}