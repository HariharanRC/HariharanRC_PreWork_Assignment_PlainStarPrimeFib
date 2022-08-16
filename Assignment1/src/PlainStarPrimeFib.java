import java.util.Scanner;

public class PlainStarPrimeFib {

//To get input
//	Scanner in = new Scanner(System.in);
			
//Palindrome
	public void checkPalindrome() {

		int palinTemp1, reverse = 0, balance; 

		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter a series of number to check if it is a palindrome: ");
		
		palinTemp1 = in.nextInt();
		
		int palinTemp2 = palinTemp1;
		
		while (palinTemp1 > 0) {
			balance = palinTemp1 % 10;
			reverse = (reverse * 10) + balance;
			palinTemp1 = palinTemp1 / 10;
		}
		if (palinTemp2 == reverse) {
			System.out.println("The number " + palinTemp2 + " is a palindrome");
		}
		else {
			System.out.println("The number " + palinTemp2 + " is not a palindrome");
		}	
	}
//Star Pattern
	public void printStar() {
		int count;
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter a number to print stars: ");
			
		count = in.nextInt();			
			
		for (int innerIndex = count-1; innerIndex >=0; innerIndex --) {
		
			for (int outerIndex = 0; outerIndex <=innerIndex; outerIndex ++ ) {
					System.out.print("*");
				}	
			System.out.println();
			}
	}
//Prime number
	public void primenumber() {
		int num;
		boolean isaPrime;
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter a number to find it is Prime or not ");
		num = in.nextInt();
		
		if (num < 2)
			isaPrime = false;
		else
			isaPrime = true;
		
		for (int i=2;i<= num / i;i++) {
		if (num % i == 0) {
			 isaPrime = false;
             break;
			}
		}
		if (isaPrime) {
			System.out.println("Number " + num + " is a Prime");
		}
		else { 
			System.out.println("Number " + num + " is not a Prime");
		}
	}
//Fibonacci series
	public void Fibonacci() {
		
		int n1 = 0, n2 = 1, n3, count, i;
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter a number to print its Fibonacci series: ");
		
		count = in.nextInt();
	
		System.out.print(n1 + " " + n2);
		
		for(i=2;i<count;i++) {
			n3 = n1 + n2;
			System.out.print(" " + n3);
			n1=n2;
			n2=n3;
		}
		System.out.println();
	}
	
public static void main(String[] args) {
		PlainStarPrimeFib Palindrome   = new PlainStarPrimeFib();
		PlainStarPrimeFib Star 		   = new PlainStarPrimeFib();
		PlainStarPrimeFib Prime		   = new PlainStarPrimeFib();
		PlainStarPrimeFib Fibonaccinum = new PlainStarPrimeFib();
		
		int choice;
		
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("===================================");
			System.out.println("Enter your choice from below list:");
			System.out.println("===================================");
			System.out.println("1 To find Palindrome of given number");
			System.out.println("2 To print Star pattern for a given number");
			System.out.println("3 To check whether the number is Prime or not");
			System.out.println("4 To print Fibonacci series for a given number");
			System.out.println("0 To Exit");
			
			choice = sc.nextInt();
			
			switch (choice){
			case 0:
			break;
			
			case 1:{
				Palindrome.checkPalindrome();
			}
				break;
			case 2:{
				Star.printStar();
			}
				break;
			case 3:{
				Prime.primenumber();
			}
				break;
			case 4:{
				Fibonaccinum.Fibonacci();
			}
				break;
			default:
				System.out.println("Enter a valid number");
				System.out.println("---------------------");
					
			}
		}	
		while (choice != 0);
		System.out.println("Exited Successfully!!!");
		sc.close();
	}	
}