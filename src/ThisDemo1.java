
public class ThisDemo1 {
	public static void main(String[] args) {
		Lion lion = new Lion();
		Lion another = lion.getLion();   // 주소 복사
		System.out.println(another.name);
		System.out.println(another.age);
	}
	
}
class Lion{
	String name = "한지민";
	int age =26;
	Lion getLion() {
		return this;   // this란 자기 자신, return this는 자기 주소째로 넘겨준다.
	}
}
