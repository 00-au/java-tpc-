package kr.tpc;
	//책 (객체) -> 클래스로 설계 -> 제목, 가격, 출판사, 페이지 수..
public class BookVO {
	
	public String title;
	public int price;
	public String company;
	public int page;
	// 디폴트 생성자라는 메소드가 (여기에 있지만, 생략이 되어 있다.)
	public BookVO() {
		//초기화 작업 (생성자 메소드를 이용해 값을 넣는 작업)
		this.title="자바";
		this.price=14000;
		this.company="이지스";
		this.page=700;
	}
	// 생성자 메서드의 중복 정의 (가장 이상적이다.)
	public BookVO(String title,int price,String company,int page) {
		this.title=title;
		this.price=price;
		this.company=company;
		this.page=page;
	}
	
	
	//어떤 클래스에 생성자 메소드가 없으면, 만들어지는 것은 디폴트 생성자 메소드이다
	//하나라도 생성자가 있으면 디폴트생성자가 만들어지지 않는다.
	//에러가 안나게하려면 명시적으로 하나 만들어야 한다.
}

