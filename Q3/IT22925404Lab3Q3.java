import java.util.Scanner;

public class IT22925404Lab3Q3{
	public static void main(String[]args){
		int amount, note5000, note1000, note500, note200, note100, note50, note20, note10, note5, note2, note1;
		
		System.out.print("Enter the Rupee amount: ");
		Scanner input = new Scanner(System.in);
		amount = input.nextInt();
		System.out.println("");
		
		note5000 = amount/5000;
		amount = amount%5000;
		System.out.println("5000 Notes - "+note5000);
		
		note1000 = amount/1000;
		amount = amount%1000;
		System.out.println("1000 Notes - "+note1000);
		
		note500 = amount/500;
		amount = amount%500;
		System.out.println("500 Notes - "+note500);
		
		note200 = amount / 200;
        amount = amount % 200;
		System.out.println("200 Notes - "+note200);

        note100 = amount / 100;
        amount = amount % 100;
		System.out.println("100 Notes - "+note100);

        note50 = amount / 50;
        amount = amount % 50;
		System.out.println("50 Notes - "+note50);

        note20 = amount / 20;
        amount = amount % 20;
		System.out.println("20 Notes - "+note20);

        note10 = amount / 10;
        amount = amount % 10;
		System.out.println("10 Coins - "+note10);

        note5 = amount / 5;
        amount = amount % 5;
		System.out.println("05 Coins - "+note5);

        note2 = amount / 2;
        amount = amount % 2;
		System.out.println("02 Coins - "+note2);

        note1 = amount / 1;
		System.out.println("01 Coins - "+note1);
	}
}