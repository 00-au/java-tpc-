package tpc;

import com.google.gson.Gson;

import kr.tpc.BookVO;
import kr.tpc.MyUtil;

//import java.lang.*; //디폴트 패키지(생략)
public class tpc19 {

	public static void main(String[] args) {
		
		//1. java에서 제공해주는 class들... API
		// 문자열(String) 
		String str = new String("APPLE"); 
		System.out.println(str.toLowerCase()); //소문자 apple
		//java.lang 패키지 이름을 기술헤주지 않아도 됨 디폴트로 이미 넣어놨음

		//2. 직접 만들어서 사용하는 class들... DTO, VO, DAO, Utility ... API
		MyUtil my = new MyUtil();
		int sum =my.hap();
		System.out.println(sum);
		
		//3. 다른 회사에서 만들어놓은 class들... API
		// Gson -> json 데이터
		Gson g = new Gson();
		BookVO vo = new BookVO("자바",12000,"영진",900);
		String json=g.toJson(vo);
		//객체를 {"title":"자바","price":12000,"company":"영진","page":900} 이러한 구조로 이러한 포멧으로 만들어 줌 객체를 문자열의 포멧으로 만들어서 사용해줌
		//json으로 만들어서 다른 곳으로 넘어가게 할 때 많이 사용함.
		System.out.println(json);
	
	}

}
