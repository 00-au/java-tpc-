package tpc;

public class tpc09 {

	public static void main(String[] args) {
		int a=56;
		int b=40;
		//a+b;
		tpc09 tpc =new tpc09(); //heap Area(힙)
		int v=tpc.sum(a,b);
		System.out.println(v);
	}
	
	public int sum(int a, int b) {
		int v= a+b;
		return v;
	}

}
