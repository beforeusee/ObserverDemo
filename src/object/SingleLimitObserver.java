package object;

import interf.DisplayElement;
import interf.Observer;

public class SingleLimitObserver implements Observer, DisplayElement {

	private int day;
	
	@Override
	public void display() {
		// 求余判断是不是单号
		if(day%2==1&&day!=7){
			System.out.println("Today is "+day+",single limit.");
		}
	}

	@Override
	public void update(int day) {
		// 更新
		this.day=day;
		display();
	}

}
