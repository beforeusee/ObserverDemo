package test;
import object.*;
import subject.LimitVehicleSubject;

public class ObserverTest {

	public static void main(String[] args) {
		
		// �������⣬���۲��ߣ�ͨ����һ������״̬���Կɱ����
		LimitVehicleSubject limitVehicleSubject=new LimitVehicleSubject();
		
		//���������۲���ʵ��
		DoubleLimitObserver doubleLimitObserver=new DoubleLimitObserver();
		SingleLimitObserver singleLimitObserver=new SingleLimitObserver();
		NoLimitObserver noLimitObserver=new NoLimitObserver();
		
		//������limitVehicleSubjectע�������۲��ߣ������仯
		limitVehicleSubject.registerObserver(doubleLimitObserver);
		limitVehicleSubject.registerObserver(singleLimitObserver);
		limitVehicleSubject.registerObserver(noLimitObserver);
		
		//�ֶ��ĸı���������
		limitVehicleSubject.setDate(1);
		limitVehicleSubject.setDate(4);
		limitVehicleSubject.setDate(7);
	}

}
