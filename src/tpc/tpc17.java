package tpc;

import kr.tpc.OverLoad;

public class tpc17 {
	
	public static void main(String[] args) {
		//1+1=? 23.4+56=?, 56.7+78.9=?
		OverLoad ov = new OverLoad();
		ov.hap(3, 24); //ov.hap_int_int(20,50);
		ov.hap(45.5f, 56); //ov.hap_float_int(45.5f, 56);
		ov.hap(56.7f,78.9f);//ov.hap_float_float(56.7f,78.9f);
	}
	
}
