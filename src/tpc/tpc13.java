package tpc;

import kr.tpc.Inflearn;

public class tpc13 {

	public static void main(String[] args) {
		//Inflearn inf = new Inflearn(); //private니까 객체 생성 불가능 오류가 난다.
		//생성자를 private로 하게 되면은 아예 누군가가 객체 생성을 못하게 막을 수 있다.
		Inflearn.tpc();
		//inf.tpc();
		//inf.java();
		Inflearn.java(); //static은 조금 기울어졌음
	
		//객체를 생성하지 않고도, 바로 호출이 가능 static 존에 자동 로딩
	}

}
