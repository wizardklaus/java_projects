package Practice;
class Orange
{
	int sugarContent;	// 당분 함량
	public Orange(int sugar) { sugarContent=sugar; }
	public void showSugarContent()
	{ 
		System.out.println("오렌지의 당도 "+sugarContent);
	}
}

class Apple
{
	int weight;	// 사과의 무게
	public Apple(int weight) { this.weight=weight; }
	public void showAppleWeight()
	{ 
		System.out.println("사과의 무게 "+weight);
	}	
}

class FruitBox<T>
{
	T item;
	public FruitBox(T item) { this.item=item; }
	public void store(T item) { this.item=item; }
	public T pullOut() { return item; }
}

class GenericConstructor
{	
	public static void main(String[] args)
	{
		FruitBox<Orange> orBox=new FruitBox<Orange>(new Orange(10));
		Orange org=orBox.pullOut();
		org.showSugarContent();
		
		FruitBox<Apple> apBox=new FruitBox<Apple>(new Apple(20));
		Apple app=apBox.pullOut();
		app.showAppleWeight();
	}
}