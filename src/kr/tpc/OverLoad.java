package kr.tpc;

public class OverLoad {
	//동작(메소드)으로만 이루어진 객체
	public void hap(int a, int b) /*컴퓨터 내부에는 hap_int_int라고 써있음*/ {
		System.out.println(a+b);
	}
	
	public void hap(float a, int b)/*컴퓨터 내부에는 hap_float_int라고 써있음*/ {
		System.out.println(a+b);
	}
	
	public void hap(float a, float b)/*컴퓨터 내부에는 hap_float_float라고 써있음*/{
		System.out.println(a+b);
	}

}
