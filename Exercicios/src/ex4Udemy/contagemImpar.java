package ex4Udemy;

import java.util.Scanner;

public class contagemImpar {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		
		for(int i = 1; i <= 100; i++) {
			if(x % 2 != 0) {
				System.out.println(i);
			}
		}
		
		sc.close();

	}

}
