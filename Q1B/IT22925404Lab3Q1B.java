import java.util.Scanner;

public class IT22925404Lab3Q1B{
	public static void main(String[]args){
		double price,quantity,total,discount,finalamount;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the price of 1kg of rice: ");
		price = input.nextDouble();
		
		System.out.print("Enter the number of kilograms you want to buy: ");
		quantity = input.nextDouble();
		
		total = price * quantity;
		discount = total * 10/100;
		finalamount = total - discount;
		
		System.out.println("");
		System.out.println("The total amount with 10% discount is: "+finalamount);
		
	}
}