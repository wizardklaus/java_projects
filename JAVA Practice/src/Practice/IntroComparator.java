package Practice;
import java.util.*;

class StrLenComparator implements Comparator<String>{
	public int compare(String str1, String str2){
		if(str1.length()>str2.length())
			return 1;
		else if(str1.length()<str2.length())
			return -1;
		else
			return 0;
	}
}

public class IntroComparator {
	public static void main(String[] args){
		TreeSet<String> tSet=new TreeSet<String>(new StrLenComparator());
		tSet.add("Orange");
		tSet.add("Apple");
		tSet.add("Dog");
		tSet.add("Individual");
		
		Iterator<String> rItr=tSet.descendingIterator();
		while(rItr.hasNext())
			System.out.println(rItr.next());
	}
}