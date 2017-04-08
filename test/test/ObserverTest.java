package test;
import object.*;
import subject.LimitVehicleSubject;

public class ObserverTest {

	public static void main(String[] args) {
		
		// 创建主题，被观察者，通常是一个自身状态属性可变的类
		LimitVehicleSubject limitVehicleSubject=new LimitVehicleSubject();
		
		//创建三个观察者实例
		DoubleLimitObserver doubleLimitObserver=new DoubleLimitObserver();
		SingleLimitObserver singleLimitObserver=new SingleLimitObserver();
		NoLimitObserver noLimitObserver=new NoLimitObserver();
		
		//向主题limitVehicleSubject注册三个观察者，监听变化
		limitVehicleSubject.registerObserver(doubleLimitObserver);
		limitVehicleSubject.registerObserver(singleLimitObserver);
		limitVehicleSubject.registerObserver(noLimitObserver);
		
		//手动的改变限行日期
		limitVehicleSubject.setDate(1);
		limitVehicleSubject.setDate(4);
		limitVehicleSubject.setDate(7);
	}

}
