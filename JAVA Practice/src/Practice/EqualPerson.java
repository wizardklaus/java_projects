package Practice;
import java.util.*;

class Person{
	String name;
	int age;
	
	public Person(String name, int age){
		this.name=name;
		this.age=age;
	}
	
	public int hashCode(){
		return name.hashCode()+age%3;
	}
	
	public String toString(){
		return name+"("+age+"��)";
	}
	
	public boolean equals(Object obj){
		Person person=(Person)obj;
		if(person.age==age&&person.name==name)
			return true;
		else
			return false;
	}
}

public class EqualPerson {
	public static void main(String[] args){
		HashSet<Person> hSet=new HashSet<Person>();
		hSet.add(new Person("����ȣ",10));
		hSet.add(new Person("����ȣ",20));
		hSet.add(new Person("���ȣ",20));
		hSet.add(new Person("���ȣ",15));
		hSet.add(new Person("����ȣ",20));
		hSet.add(new Person("���ȣ",20));
		
		System.out.println("����� �������� �� : "+hSet.size());
		
		Iterator<Person> itr=hSet.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
	}
}
