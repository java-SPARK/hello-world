package xiangyuanmoshi;

import java.util.Random;

public class Client {
	public static void main(String[] args) {
		Random rm=new Random();
		PieceFactory pfactory=new PieceFactory();
		for(int i=0;i<19;i++)
			for(int j=0;j<19;j++) {
				Apiece p=null;
				if(rm.nextInt()%2==0) {
					p=pfactory.GetPiece("����");
				}else {
					p= pfactory.GetPiece("����");
				}
				p.play(rm.nextInt(19), rm.nextInt(19));
			}
		System.out.println("�������Ӷ��������:"+pfactory.GetPieceCount());
	}
}
