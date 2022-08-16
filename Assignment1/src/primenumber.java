import java.util.*;
public class primenumber {

	public static void main(String[] args) {
		
		int num;
		boolean isaPrime;
		
		try (Scanner in = new Scanner (System.in)) {
			System.out.println("Enter a number ");
			num = in.nextInt();
		}
		
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
		if (isaPrime)
			System.out.println("Number " + num + " is a Prime");
		else 
			System.out.println("Number " + num + " is not a Prime");
	}

}
