package object;

import interf.DisplayElement;
import interf.Observer;

public class DoubleLimitObserver implements Observer, DisplayElement {

	private int day;
	@Override
	public void display() {
		//�����ж��ǲ���˫��
		if(day%2==0&&day!=6){
			System.out.println("Today is "+day+",double limit");
		}
	}

	@Override
	public void update(int day) {
		//�������ݲ�չʾ
		this.day=day;
		display();
	}
	
}
