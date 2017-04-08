package subject;

import java.util.ArrayList;

import interf.Observer;
import interf.Subject;

//具体的主题对象
public class LimitVehicleSubject implements Subject {

	private ArrayList<Observer> observers; //定义观察者集合
	private int day;                       //定义周几的变量信息day
	
	//构造函数，初始化观察者集合
	public LimitVehicleSubject(){
		observers=new ArrayList<Observer>();
	}
	
	//更新主题状态数据的方法
	public void setDate(int day){
		//设置日期
		if(day<1||day>7){
			throw new IllegalArgumentException("Please input day between 1 and 7.");
		}
		this.day=day;
		//通知观察者，使他们能够更新自己的数据
		notifyObservers();
	}
	
	//注册观察者
	@Override
	public void registerObserver(Observer observer) {
		//判断传入的observer是否为空
		if(observer==null){
			throw new IllegalArgumentException("The observer is null");
		}
		//持有锁observers的线程才可以在该同步代码块中执行，此处主线程持有observers
		synchronized(observers){
			
			if(observers.contains(observer)){
				throw new IllegalArgumentException("Observer"+observer+"is already registered.");
			}
			observers.add(observer);
		}
	}

	//注销观察者
	@Override
	public void unRegisterObserver(Observer observer) {
		//判断传入的observer是否为空
		if(observer==null){
			throw new IllegalArgumentException("The observer is null");
		}
		//持有锁observers的线程才可以在该同步代码块中执行，此处主线程持有observers
		synchronized(observers){
			int index=observers.indexOf(observer);
			if(index==-1){
				throw new IllegalArgumentException("Observer"+observer+"was not registered.");
			}
			observers.remove(index);
		}
	}

	//通知观察者更新
	@Override
	public void notifyObservers() {
		// 通知所有注册的观察者
		synchronized(observers){
			for(int i=observers.size()-1;i>=0;i--){
				observers.get(i).update(day);
			}
		}
	}

}
