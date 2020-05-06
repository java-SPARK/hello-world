package qiaojiemoshi;

public class Client {
	public static void main(String[] args) {
		 SamsungTVcontrol ssg=new SamsungTVcontrol();
		 LgTVcontrol lg=new LgTVcontrol();
		 ssg.Onoff();
		 ssg.nextChannel();
		 ssg.preChannel();
		 ssg.Onoff();
		 lg.Onoff();
		 lg.nextChannel();
		 lg.preChannel();
		 lg.Onoff();
	}
}
