package object;

import interf.DisplayElement;
import interf.Observer;

public class SingleLimitObserver implements Observer, DisplayElement {

	private int day;
	
	@Override
	public void display() {
		// �����ж��ǲ��ǵ���
		if(day%2==1&&day!=7){
			System.out.println("Today is "+day+",single limit.");
		}
	}

	@Override
	public void update(int day) {
		// ����
		this.day=day;
		display();
	}

}
