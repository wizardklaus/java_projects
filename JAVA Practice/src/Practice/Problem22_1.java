package Practice;
import java.util.*;

public class Problem22_1 {
	public static void main(String[] args){
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.ensureCapacity(500);
		for(int i=1;i<600;i++)
			list.add(new Integer(i));
		System.out.println(list.size());
		
		list.ensureCapacity(list.size()*2);
		for(int i=1;i<1100;i++)
			list.add(new Integer(i));
		System.out.println(list.size());
	}
}
