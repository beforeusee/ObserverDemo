package interf;

//����ӿ�Subject
public interface Subject {

	//ע��۲���
	public void registerObserver(Observer observer);
	
	//ע���۲���
	public void unRegisterObserver(Observer observer);
	
	//֪ͨ�۲���
	public void notifyObservers();
}
