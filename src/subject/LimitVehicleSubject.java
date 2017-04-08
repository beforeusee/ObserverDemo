package subject;

import java.util.ArrayList;

import interf.Observer;
import interf.Subject;

//������������
public class LimitVehicleSubject implements Subject {

	private ArrayList<Observer> observers; //����۲��߼���
	private int day;                       //�����ܼ��ı�����Ϣday
	
	//���캯������ʼ���۲��߼���
	public LimitVehicleSubject(){
		observers=new ArrayList<Observer>();
	}
	
	//��������״̬���ݵķ���
	public void setDate(int day){
		//��������
		if(day<1||day>7){
			throw new IllegalArgumentException("Please input day between 1 and 7.");
		}
		this.day=day;
		//֪ͨ�۲��ߣ�ʹ�����ܹ������Լ�������
		notifyObservers();
	}
	
	//ע��۲���
	@Override
	public void registerObserver(Observer observer) {
		//�жϴ����observer�Ƿ�Ϊ��
		if(observer==null){
			throw new IllegalArgumentException("The observer is null");
		}
		//������observers���̲߳ſ����ڸ�ͬ���������ִ�У��˴����̳߳���observers
		synchronized(observers){
			
			if(observers.contains(observer)){
				throw new IllegalArgumentException("Observer"+observer+"is already registered.");
			}
			observers.add(observer);
		}
	}

	//ע���۲���
	@Override
	public void unRegisterObserver(Observer observer) {
		//�жϴ����observer�Ƿ�Ϊ��
		if(observer==null){
			throw new IllegalArgumentException("The observer is null");
		}
		//������observers���̲߳ſ����ڸ�ͬ���������ִ�У��˴����̳߳���observers
		synchronized(observers){
			int index=observers.indexOf(observer);
			if(index==-1){
				throw new IllegalArgumentException("Observer"+observer+"was not registered.");
			}
			observers.remove(index);
		}
	}

	//֪ͨ�۲��߸���
	@Override
	public void notifyObservers() {
		// ֪ͨ����ע��Ĺ۲���
		synchronized(observers){
			for(int i=observers.size()-1;i>=0;i--){
				observers.get(i).update(day);
			}
		}
	}

}
