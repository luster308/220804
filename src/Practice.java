import java.util.Scanner;

// n = (n-1) + (n-2)
// 1 1 2 3 5 8 13 ... 
//1. 7개의 피보나치 수열을 출력하시오.
public class Practice {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("몇 개의 피보나치 수열을 출력할까요??(7개씩 1줄에 출력됩니다.) ");
		int su = sc.nextInt();
		int a, b, c, count;
		a = 0;
		b = 1;
		c = 1;
		count = 0;

		for (int i = 0; i < su; i++) {
			System.out.print(c + "\t");
			c = a + b;
			a = b;
			b = c;
			count++;
			if (count % 7 == 0)
				System.out.println();
		}
	}// main

}// class