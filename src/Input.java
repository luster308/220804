import java.util.Scanner;

public class Input {
	void input(Student student) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Name: ");
		String name = sc.nextLine();
		
		System.out.print("Hakbun: ");
		String hakbun = sc.nextLine();
		
		System.out.print("Korean: ");
		int kor = sc.nextInt();
		
		System.out.print("English: ");
		int eng = sc.nextInt();
		
		System.out.print("Math: ");
		int mat = sc.nextInt();
		
		Student jimin = new Student(hakbun, name, kor, eng, mat);
	}
}
