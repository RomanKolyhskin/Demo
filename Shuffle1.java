import java.util.Scanner;

public class Shuffle1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner ( System.in );

		System.out.print("ввод числа строк ___ ");		

		int len = sc.nextInt();

		for (int i = 0; i<len; ++i) {
			for (int j = 0; j<i; ++j) 
		System.out.print("*");	
		System.out.println();
		}
		for (int c=0; c<len; ++c) {
			for (int h = len; h>c; --h)
				System.out.print("*");	
			System.out.println();
		}
	}
}

