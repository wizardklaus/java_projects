package okjava0707.interface0;

public class CarRun {
	public static void main(String[] args){
		//Car car=xx.getInstance();
		Car car=new NormalCar();
		car.go(30);
		car.fly();
	}
}