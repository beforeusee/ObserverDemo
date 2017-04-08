package object;

import interf.DisplayElement;
import interf.Observer;

public class NoLimitObserver implements Observer, DisplayElement {

	private int day;
	
	@Override
	public void display() {
		// 判断是不是周六日
		if(day==6||day==7){
			System.out.println("Today is "+day+",no limit.");
		}
	}

	@Override
	public void update(int day) {
		// 更新数据
		this.day=day;
		display();
	}

}
