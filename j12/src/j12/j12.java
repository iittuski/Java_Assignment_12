package j12;

import java.util.Scanner;

public class j12 {

	public static void main(String args[]){
		System.out.println("Enter First Number");
		Scanner s = new Scanner(System.in);
		int i = s.nextInt();
		int j = s.nextInt();
		System.out.println("Enter Your Operation");
		System.out.println("1-Add \n 2-Sub \n 3-Mul \n 4-Div");
		int choice = s.nextInt();
		switch(choice){
		case 1:
			int Add = i+j;
			System.out.println(Add);
			break;
		case 2:
			int sub = i-j;
			System.out.println(sub);
			break;
		case 3:
			int mul = i*j;
			System.out.println(mul);
			break;
		case 4:
			int div = i/j;
			System.out.println(div);
			break;
		}
		
	}
}
