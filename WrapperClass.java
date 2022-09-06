package day4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class WrapperClass implements Runnable{
	
	List<Integer> st = new ArrayList<Integer>();
	
//	List<Integer> st = new ArrayList<Integer>();

	
	
	
	@Override
	public void run() {
		synchronized(st) {
			this.st.addAll(Arrays.asList(1,2,3,4,5,6));
			System.out.println(this.st);
		}
		
		
		
	}


	
	public static void main(String[] args) throws InterruptedException  {
		
		
		WrapperClass wcl = new  WrapperClass();

		
		Thread t1=new Thread(wcl);
		
		Thread t2=new Thread(wcl);
		
		t1.start();
		
		t2.start();
		
		
		
		wcl.unmodifiable();
		
	}

	

public void  unmodifiable() {
	

	List<String> lst=new ArrayList<String>();
	
	
	
	lst.add("a");
	lst.add("b");
	lst.add("c");
	lst.add("d");
	lst.add("e");
	
	System.out.println(lst);
	
//	List<String> lst1=Collections.unmodifiableList(lst);
	
	lst=Collections.unmodifiableList(lst);
	
	lst.add("aa");
//	
//	System.out.println(lst);
	
}
	

}










