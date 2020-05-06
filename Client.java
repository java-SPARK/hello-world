package zhizelianmoshi;

import java.util.Random;

public class Client {
	public static void main(String[] args) {
		Absort bs,ms,ss;
		bs=new Bigsorting(6);
		ms=new Midsorting(4);
		ss=new Smallsorting(2);
		bs.setnextsort(ms);
		ms.setnextsort(ss);
		Random rm=new Random();
		for(int i=0;i<1000;i++) {
			int weight=rm.nextInt(10);
			bs.sendfruit(weight,"Æ»¹û");
		}
		bs.getfruitbox();
		ms.getfruitbox();
		ss.getfruitbox();
	}
	
}
