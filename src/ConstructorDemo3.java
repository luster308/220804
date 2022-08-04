/*
 * this(): new 없이 생성자를 호출하기 위한 메소드
 * 1. 반드시 생성자 메소드에서만 사용해야 하고
 * 2. 생성자 메소드 내의 반드시 첫 번째 줄에 와야 한다.
 */
public class ConstructorDemo3 {
	public static void main(String[] args) {
		Sawon jimin = new Sawon();
		System.out.println(jimin.name);
		System.out.println(jimin.salary);
	}
}
class Sawon{
	String name;
	int salary;
	public Sawon(String name, int salary) {   // 생성자로 초기화
		this.name = name;
		this.salary = salary;
	}
	public Sawon(String name) {
		this(name, 50000);
//		this.name = name;
//		new Sawon(name, 50000);
	}
	public Sawon(int salary) {
		this("Unknown", salary);
//		this.salary = salary;
//		new Sawon("Unknown", salary);
	}
	public Sawon() {
		this("Unknown", 50000);
//		new Sawon("Unknown", 50000);
		}
	
}
