import java.util.*;
public class palindrome {

	public static void main(String[] args) {
		
		int palinTemp1, reverse = 0, balance;
		
		try (Scanner in = new Scanner(System.in)) {
			System.out.println("Enter a series of number to check the palindrome: ");
			
			palinTemp1 = in.nextInt();
		}
		
		int palinTemp2 = palinTemp1;
		
		while(palinTemp1 > 0) {
			balance = palinTemp1 % 10;
			System.out.println("balance " + balance);
			reverse = (reverse * 10)+balance;
			System.out.println("reverse " + reverse);
			palinTemp1 = palinTemp1 / 10;
			System.out.println("palinTemp1 " + palinTemp1);
		}
		if (palinTemp2 == reverse) {
			System.out.println("The number " + palinTemp2 + " is a palindrome");
		}
		else {
			System.out.println("The number " + palinTemp2 + " is not a palindrome");
		}
		

	}

}
