package object;

import interf.DisplayElement;
import interf.Observer;

public class DoubleLimitObserver implements Observer, DisplayElement {

	private int day;
	@Override
	public void display() {
		//求余判断是不是双号
		if(day%2==0&&day!=6){
			System.out.println("Today is "+day+",double limit");
		}
	}

	@Override
	public void update(int day) {
		//更新数据并展示
		this.day=day;
		display();
	}
	
}
