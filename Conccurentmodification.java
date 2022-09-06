package day4;

import java.util.HashSet;
import java.util.Set;

public class Conccurentmodification {

	public static void main(String[] args) {
		
		Set<Integer> st=new HashSet<Integer>() ;
		
		st.add(1);
		st.add(2);
		st.add(3);
		st.add(4);
		
		for(int i:st) {
			System.out.println(i);
			
			if(i==3)
				st.remove(i);
		}
		
		System.out.println(st);
	}

}
