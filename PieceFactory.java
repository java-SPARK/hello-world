package xiangyuanmoshi;

import java.util.HashMap;

public class PieceFactory {
	private HashMap piecepool=new HashMap();
	public Apiece GetPiece(String key) {
		if(!piecepool.containsKey(key)) {
				Apiece p=new Onepiece(key);
				piecepool.put(key, p);
				return p;
		}
		return (Apiece)piecepool.get(key);
	}
	public int GetPieceCount() {
		return piecepool.size();
	}
}
