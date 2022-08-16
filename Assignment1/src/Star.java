import java.util.*;
public class Star {

	public static void main(String[] args) {
		
		int count;
		
		try (Scanner in = new Scanner(System.in)) {
			System.out.println("Enter a number: ");
			
		count = in.nextInt();			
			
		for (int innerIndex = count-1; innerIndex >=0; innerIndex --) {
		
			for (int outerIndex = 0; outerIndex <=innerIndex; outerIndex ++ ) {
					System.out.print("*");
				}	
			System.out.println();
			}
		}
	}
}


//4--
