package interf;

//主题接口Subject
public interface Subject {

	//注册观察者
	public void registerObserver(Observer observer);
	
	//注销观察者
	public void unRegisterObserver(Observer observer);
	
	//通知观察者
	public void notifyObservers();
}
