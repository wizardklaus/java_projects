package okjava0707.interface0;

public abstract class Car implements Airplain {
	int curSpeed;
	
	void go(int curSpeed){
		this.curSpeed=curSpeed;
		increaseSpeed();
		System.out.println("����ӵ��� : "+this.curSpeed);
	}
	
	abstract void increaseSpeed();

	@Override
	public void fly() {
		System.out.println("������ ���Դϴ�.");
	}
}
