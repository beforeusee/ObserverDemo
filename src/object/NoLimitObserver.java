package object;

import interf.DisplayElement;
import interf.Observer;

public class NoLimitObserver implements Observer, DisplayElement {

	private int day;
	
	@Override
	public void display() {
		// �ж��ǲ���������
		if(day==6||day==7){
			System.out.println("Today is "+day+",no limit.");
		}
	}

	@Override
	public void update(int day) {
		// ��������
		this.day=day;
		display();
	}

}
