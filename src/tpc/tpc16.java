package tpc;

import kr.tpc.MemberVO;

public class tpc16 {

	public static void main(String[] args) {
		MemberVO m = new MemberVO("홍길동",40,"010-1111-1111","서울");
		//setter method 가 필요가 없다 -> 생성자 메소드에서 값을 받아서 저장했기 때문에
		//private 생성자이지도 않음 그냥. 저장 가능하다.
		System.out.println(m.getName());
		//getName만 되는 이유, name 멤버변수가 private 라서 생성자
		//메소드에서 값을 받아서 저장했어도 get으로 출력해야함. 안그러면 출력이 안됨
		
		System.out.println(m.toString());
		
		MemberVO m1=new MemberVO();
		//이거는 그냥 기본 생성자이기 때문에 getter와 setter method를 이용해야함
		//안그러면 저장할 때도 private 멤버변수에서 저장도 못하게 되어있다.
		m1.setName("나길동");
		m1.setAge(32);
		m1.setTel("010-222-2222");
		m1.setAddr("광주");
		
		System.out.print(m1.getName()+"\t");
		System.out.print(m1.getAge()+"\t");
		System.out.print(m1.getTel()+"\t");
		System.out.println(m1.getAddr()+"\t");
		
		System.out.println(m1.toString());
		System.out.println(m1);
		//m1은 toString이 생략되어 있는데 m1은 memberVO의 클래스인데
		//클래스 안에는 private 멤버변수들이 등록되어 있다. 딱히
//		막 출력할 것이 없고 추상적이라면, 멤버 변수들이 다 들어있는
//		toString을 출력하는 것이다.

		
	}

}
