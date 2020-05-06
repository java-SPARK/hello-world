package fangwenzhemoshi;

import java.util.ArrayList;

import diedaiqi.Iterator;

public class BuyBasket {
	private ArrayList list=new ArrayList();
	public void accpet(AVsivitor visitor) {
		Iterator i=list.iterator();
		while(i.hasNext()) {
			((IProduct)i.next()).accpet(vistor);
		}
	}
	public void addProduct(IProduct product) {
		list.add(product);
	}
	public void removeProduct(IProduct product) {
		list.remove(product);
	}
}
