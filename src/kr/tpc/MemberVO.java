package kr.tpc;

public class MemberVO {
	
	private String name;
	private int age;
	private String tel;
	private String addr;
	
	// ^ 1. 모든 멤버는 정보 은닉한다.
	
	
	
	public MemberVO() {  }
	
	// ^ 2. 디폴트 생성자는 가급적 명시적으로 만들어 준다.
	//제거하면 디폴트생성자를 사용하는 것들이 오류가 난다.
	
	public MemberVO(String name, int age, String tel, String addr) /*호출할때는 이렇게써야함*/{
		this.name = name;
		this.age = age;
		this.tel = tel;
		this.addr = addr;
	}
	// ^ 3. 초기화 생성자를 이용해서 오버로딩을 적절하게 해준다. 


	//setter, getter method
	public void setName(String name) {
		
		this.name = name;	
	}
	public String getName() {
		return name;
	}
	//데이터를 넣고 빼려면 setter, getter 한 쌍이 필요하다.
	public int getAge() {
		if (age <1 || age>100)
			return 0;
			
		return age;
		
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}

	// ^ 4. setter - getter 메소드 한 쌍을 만들어 준다. (만드는 이유 private 접근 제한에 다가갈 수 있게 하기 위해)
	
	
	@Override
	public String toString() {
		return "MemberVO [name=" + name + ", age=" + age + ", tel=" + tel + ", addr=" + addr + "]";
	//하나의 문자열로 class 안의 멤버변수들을 엮어서 만들어 놓을 수 있다.
		
		
		// ^ 5. 객체가 가지고 있는 모든 값을 문자열 to String 메소드를 만들어서 전체를 출력하게 한다.
	}
	
}
